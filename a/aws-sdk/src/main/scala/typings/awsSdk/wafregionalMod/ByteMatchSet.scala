package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteMatchSet extends js.Object {
  /**
    * The ByteMatchSetId for a ByteMatchSet. You use ByteMatchSetId to get information about a ByteMatchSet (see GetByteMatchSet), update a ByteMatchSet (see UpdateByteMatchSet), insert a ByteMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a ByteMatchSet from AWS WAF (see DeleteByteMatchSet).  ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
    */
  var ByteMatchSetId: ResourceId = js.native
  /**
    * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings.
    */
  var ByteMatchTuples: typings.awsSdk.wafregionalMod.ByteMatchTuples = js.native
  /**
    * A friendly name or description of the ByteMatchSet. You can't change Name after you create a ByteMatchSet.
    */
  var Name: js.UndefOr[ResourceName] = js.native
}

object ByteMatchSet {
  @scala.inline
  def apply(ByteMatchSetId: ResourceId, ByteMatchTuples: ByteMatchTuples): ByteMatchSet = {
    val __obj = js.Dynamic.literal(ByteMatchSetId = ByteMatchSetId.asInstanceOf[js.Any], ByteMatchTuples = ByteMatchTuples.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteMatchSet]
  }
  @scala.inline
  implicit class ByteMatchSetOps[Self <: ByteMatchSet] (val x: Self) extends AnyVal {
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
    def setByteMatchSetId(value: ResourceId): Self = this.set("ByteMatchSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setByteMatchTuplesVarargs(value: ByteMatchTuple*): Self = this.set("ByteMatchTuples", js.Array(value :_*))
    @scala.inline
    def setByteMatchTuples(value: ByteMatchTuples): Self = this.set("ByteMatchTuples", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

