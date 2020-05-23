package typings.cannon.CANNON

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
    contactEquationRelaxation: js.UndefOr[Double] = js.undefined,
    contactEquationStiffness: js.UndefOr[Double] = js.undefined,
    friction: js.UndefOr[Double] = js.undefined,
    frictionEquationRelaxation: js.UndefOr[Double] = js.undefined,
    frictionEquationStiffness: js.UndefOr[Double] = js.undefined,
    restitution: js.UndefOr[Double] = js.undefined
  ): IContactMaterialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contactEquationRelaxation)) __obj.updateDynamic("contactEquationRelaxation")(contactEquationRelaxation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(contactEquationStiffness)) __obj.updateDynamic("contactEquationStiffness")(contactEquationStiffness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frictionEquationRelaxation)) __obj.updateDynamic("frictionEquationRelaxation")(frictionEquationRelaxation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frictionEquationStiffness)) __obj.updateDynamic("frictionEquationStiffness")(frictionEquationStiffness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restitution)) __obj.updateDynamic("restitution")(restitution.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactMaterialOptions]
  }
}

