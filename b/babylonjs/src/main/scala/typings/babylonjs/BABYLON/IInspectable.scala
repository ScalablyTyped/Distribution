package typings.babylonjs.BABYLON

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
    max: Int | Double = null,
    min: Int | Double = null,
    step: Int | Double = null
  ): IInspectable = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectable]
  }
}

