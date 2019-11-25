package typings.atAwsDashSdkLocationDashConstraintDashMiddleware.atAwsDashSdkLocationDashConstraintDashMiddlewareMod

import typings.atAwsDashSdkLocationDashConstraintDashMiddleware.Anon_LocationConstraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationConstraintAwareInput extends js.Object {
  var CreateBucketConfiguration: js.UndefOr[Anon_LocationConstraint] = js.undefined
}

object LocationConstraintAwareInput {
  @scala.inline
  def apply(CreateBucketConfiguration: Anon_LocationConstraint = null): LocationConstraintAwareInput = {
    val __obj = js.Dynamic.literal()
    if (CreateBucketConfiguration != null) __obj.updateDynamic("CreateBucketConfiguration")(CreateBucketConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationConstraintAwareInput]
  }
}

