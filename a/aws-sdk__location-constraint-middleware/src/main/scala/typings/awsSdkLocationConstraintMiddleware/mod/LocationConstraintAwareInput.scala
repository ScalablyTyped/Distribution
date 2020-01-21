package typings.awsSdkLocationConstraintMiddleware.mod

import typings.awsSdkLocationConstraintMiddleware.AnonLocationConstraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationConstraintAwareInput extends js.Object {
  var CreateBucketConfiguration: js.UndefOr[AnonLocationConstraint] = js.undefined
}

object LocationConstraintAwareInput {
  @scala.inline
  def apply(CreateBucketConfiguration: AnonLocationConstraint = null): LocationConstraintAwareInput = {
    val __obj = js.Dynamic.literal()
    if (CreateBucketConfiguration != null) __obj.updateDynamic("CreateBucketConfiguration")(CreateBucketConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationConstraintAwareInput]
  }
}

