package typings.cannon.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContactMaterialOptions extends js.Object {
  var contactEquationRelaxation: js.UndefOr[Double] = js.undefined
  var contactEquationStiffness: js.UndefOr[Double] = js.undefined
  var friction: js.UndefOr[Double] = js.undefined
  var frictionEquationRelaxation: js.UndefOr[Double] = js.undefined
  var frictionEquationStiffness: js.UndefOr[Double] = js.undefined
  var restitution: js.UndefOr[Double] = js.undefined
}

object IContactMaterialOptions {
  @scala.inline
  def apply(
    contactEquationRelaxation: Int | Double = null,
    contactEquationStiffness: Int | Double = null,
    friction: Int | Double = null,
    frictionEquationRelaxation: Int | Double = null,
    frictionEquationStiffness: Int | Double = null,
    restitution: Int | Double = null
  ): IContactMaterialOptions = {
    val __obj = js.Dynamic.literal()
    if (contactEquationRelaxation != null) __obj.updateDynamic("contactEquationRelaxation")(contactEquationRelaxation.asInstanceOf[js.Any])
    if (contactEquationStiffness != null) __obj.updateDynamic("contactEquationStiffness")(contactEquationStiffness.asInstanceOf[js.Any])
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (frictionEquationRelaxation != null) __obj.updateDynamic("frictionEquationRelaxation")(frictionEquationRelaxation.asInstanceOf[js.Any])
    if (frictionEquationStiffness != null) __obj.updateDynamic("frictionEquationStiffness")(frictionEquationStiffness.asInstanceOf[js.Any])
    if (restitution != null) __obj.updateDynamic("restitution")(restitution.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactMaterialOptions]
  }
}

