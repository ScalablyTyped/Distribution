package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XssMatchSet extends js.Object {
  /**
    * The name, if any, of the XssMatchSet.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * A unique identifier for an XssMatchSet. You use XssMatchSetId to get information about an XssMatchSet (see GetXssMatchSet), update an XssMatchSet (see UpdateXssMatchSet), insert an XssMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete an XssMatchSet from AWS WAF (see DeleteXssMatchSet).  XssMatchSetId is returned by CreateXssMatchSet and by ListXssMatchSets.
    */
  var XssMatchSetId: ResourceId = js.native
  /**
    * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
    */
  var XssMatchTuples: typings.awsSdk.wafregionalMod.XssMatchTuples = js.native
}

object XssMatchSet {
  @scala.inline
  def apply(XssMatchSetId: ResourceId, XssMatchTuples: XssMatchTuples): XssMatchSet = {
    val __obj = js.Dynamic.literal(XssMatchSetId = XssMatchSetId.asInstanceOf[js.Any], XssMatchTuples = XssMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[XssMatchSet]
  }
  @scala.inline
  implicit class XssMatchSetOps[Self <: XssMatchSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setXssMatchSetId(value: ResourceId): Self = this.set("XssMatchSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setXssMatchTuplesVarargs(value: XssMatchTuple*): Self = this.set("XssMatchTuples", js.Array(value :_*))
    @scala.inline
    def setXssMatchTuples(value: XssMatchTuples): Self = this.set("XssMatchTuples", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

