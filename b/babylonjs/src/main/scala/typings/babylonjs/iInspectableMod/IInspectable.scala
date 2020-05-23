package typings.babylonjs.iInspectableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInspectable extends js.Object {
  /**
    * Gets the label to display
    */
  var label: String
  /**
    * Gets the maximum value of the property when using in "slider" mode
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Gets the minimum value of the property when using in "slider" mode
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Gets the name of the property to edit
    */
  var propertyName: String
  /**
    * Gets the setp to use when using in "slider" mode
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * Gets the type of the editor to use
    */
  var `type`: InspectableType
}

object IInspectable {
  @scala.inline
  def apply(
    label: String,
    propertyName: String,
    `type`: InspectableType,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined
  ): IInspectable = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectable]
  }
}

