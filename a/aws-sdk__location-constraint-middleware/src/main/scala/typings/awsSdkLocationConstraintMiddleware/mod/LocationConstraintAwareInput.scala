package typings.awsSdkLocationConstraintMiddleware.mod

import typings.awsSdkLocationConstraintMiddleware.anon.LocationConstraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationConstraintAwareInput extends js.Object {
  var CreateBucketConfiguration: js.UndefOr[LocationConstraint] = js.undefined
}

object LocationConstraintAwareInput {
  @scala.inline
  def apply(CreateBucketConfiguration: LocationConstraint = null): LocationConstraintAwareInput = {
    val __obj = js.Dynamic.literal()
    if (CreateBucketConfiguration != null) __obj.updateDynamic("CreateBucketConfiguration")(CreateBucketConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationConstraintAwareInput]
  }
}

