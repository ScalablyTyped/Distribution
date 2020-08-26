package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSizeConstraintSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken = js.native
  /**
    * The SizeConstraintSetId of the SizeConstraintSet that you want to delete. SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId = js.native
}

object DeleteSizeConstraintSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, SizeConstraintSetId: ResourceId): DeleteSizeConstraintSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], SizeConstraintSetId = SizeConstraintSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSizeConstraintSetRequest]
  }
  @scala.inline
  implicit class DeleteSizeConstraintSetRequestOps[Self <: DeleteSizeConstraintSetRequest] (val x: Self) extends AnyVal {
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
    def setChangeToken(value: ChangeToken): Self = this.set("ChangeToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeConstraintSetId(value: ResourceId): Self = this.set("SizeConstraintSetId", value.asInstanceOf[js.Any])
  }
  
}

