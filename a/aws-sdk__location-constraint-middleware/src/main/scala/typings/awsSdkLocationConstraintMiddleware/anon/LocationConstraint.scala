package typings.awsSdkLocationConstraintMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationConstraint extends js.Object {
  var LocationConstraint: js.UndefOr[String] = js.undefined
}

object LocationConstraint {
  @scala.inline
  def apply(LocationConstraint: String = null): LocationConstraint = {
    val __obj = js.Dynamic.literal()
    if (LocationConstraint != null) __obj.updateDynamic("LocationConstraint")(LocationConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationConstraint]
  }
}

