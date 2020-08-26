package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeConstraintSet extends js.Object {
  /**
    * The name, if any, of the SizeConstraintSet.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * A unique identifier for a SizeConstraintSet. You use SizeConstraintSetId to get information about a SizeConstraintSet (see GetSizeConstraintSet), update a SizeConstraintSet (see UpdateSizeConstraintSet), insert a SizeConstraintSet into a Rule or delete one from a Rule (see UpdateRule), and delete a SizeConstraintSet from AWS WAF (see DeleteSizeConstraintSet).  SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId = js.native
  /**
    * Specifies the parts of web requests that you want to inspect the size of.
    */
  var SizeConstraints: typings.awsSdk.wafregionalMod.SizeConstraints = js.native
}

object SizeConstraintSet {
  @scala.inline
  def apply(SizeConstraintSetId: ResourceId, SizeConstraints: SizeConstraints): SizeConstraintSet = {
    val __obj = js.Dynamic.literal(SizeConstraintSetId = SizeConstraintSetId.asInstanceOf[js.Any], SizeConstraints = SizeConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeConstraintSet]
  }
  @scala.inline
  implicit class SizeConstraintSetOps[Self <: SizeConstraintSet] (val x: Self) extends AnyVal {
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
    def setSizeConstraintSetId(value: ResourceId): Self = this.set("SizeConstraintSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeConstraintsVarargs(value: SizeConstraint*): Self = this.set("SizeConstraints", js.Array(value :_*))
    @scala.inline
    def setSizeConstraints(value: SizeConstraints): Self = this.set("SizeConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

