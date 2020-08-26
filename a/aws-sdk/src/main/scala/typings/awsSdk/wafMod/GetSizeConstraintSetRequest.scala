package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSizeConstraintSetRequest extends js.Object {
  /**
    * The SizeConstraintSetId of the SizeConstraintSet that you want to get. SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId = js.native
}

object GetSizeConstraintSetRequest {
  @scala.inline
  def apply(SizeConstraintSetId: ResourceId): GetSizeConstraintSetRequest = {
    val __obj = js.Dynamic.literal(SizeConstraintSetId = SizeConstraintSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSizeConstraintSetRequest]
  }
  @scala.inline
  implicit class GetSizeConstraintSetRequestOps[Self <: GetSizeConstraintSetRequest] (val x: Self) extends AnyVal {
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
  }
  
}

