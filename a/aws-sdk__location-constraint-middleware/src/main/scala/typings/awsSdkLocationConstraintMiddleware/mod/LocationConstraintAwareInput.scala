package typings.awsSdkLocationConstraintMiddleware.mod

import typings.awsSdkLocationConstraintMiddleware.anon.LocationConstraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationConstraintAwareInput extends js.Object {
  var CreateBucketConfiguration: js.UndefOr[LocationConstraint] = js.native
}

object LocationConstraintAwareInput {
  @scala.inline
  def apply(): LocationConstraintAwareInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationConstraintAwareInput]
  }
  @scala.inline
  implicit class LocationConstraintAwareInputOps[Self <: LocationConstraintAwareInput] (val x: Self) extends AnyVal {
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
    def setCreateBucketConfiguration(value: LocationConstraint): Self = this.set("CreateBucketConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateBucketConfiguration: Self = this.set("CreateBucketConfiguration", js.undefined)
  }
  
}

