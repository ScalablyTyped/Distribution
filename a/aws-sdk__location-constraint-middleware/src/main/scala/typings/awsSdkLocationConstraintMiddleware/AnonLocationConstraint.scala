package typings.awsSdkLocationConstraintMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocationConstraint extends js.Object {
  var LocationConstraint: js.UndefOr[String] = js.undefined
}

object AnonLocationConstraint {
  @scala.inline
  def apply(LocationConstraint: String = null): AnonLocationConstraint = {
    val __obj = js.Dynamic.literal()
    if (LocationConstraint != null) __obj.updateDynamic("LocationConstraint")(LocationConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocationConstraint]
  }
}

