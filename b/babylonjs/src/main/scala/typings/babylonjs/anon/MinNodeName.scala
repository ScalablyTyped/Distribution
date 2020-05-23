package typings.babylonjs.anon

import typings.babylonjs.BABYLON.MotionControllerComponentStateType
import typings.babylonjs.babylonjsStrings.button
import typings.babylonjs.babylonjsStrings.state
import typings.babylonjs.babylonjsStrings.transform
import typings.babylonjs.babylonjsStrings.visibility
import typings.babylonjs.babylonjsStrings.xAxis
import typings.babylonjs.babylonjsStrings.yAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinNodeName extends js.Object {
  /**
    * What property will be animated
    */
  var componentProperty: xAxis | yAxis | button | state
  /**
    * Max movement node
    */
  var maxNodeName: js.UndefOr[String] = js.undefined
  /**
    * Minimum movement node
    */
  var minNodeName: js.UndefOr[String] = js.undefined
  /**
    * What states influence this visual response
    */
  var states: js.Array[MotionControllerComponentStateType]
  /**
    * Base node name to move. Its position will be calculated according to the min and max nodes
    */
  var valueNodeName: js.UndefOr[String] = js.undefined
  /**
    * Type of animation - movement or visibility
    */
  var valueNodeProperty: transform | visibility
}

object MinNodeName {
  @scala.inline
  def apply(
    componentProperty: xAxis | yAxis | button | state,
    states: js.Array[MotionControllerComponentStateType],
    valueNodeProperty: transform | visibility,
    maxNodeName: String = null,
    minNodeName: String = null,
    valueNodeName: String = null
  ): MinNodeName = {
    val __obj = js.Dynamic.literal(componentProperty = componentProperty.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], valueNodeProperty = valueNodeProperty.asInstanceOf[js.Any])
    if (maxNodeName != null) __obj.updateDynamic("maxNodeName")(maxNodeName.asInstanceOf[js.Any])
    if (minNodeName != null) __obj.updateDynamic("minNodeName")(minNodeName.asInstanceOf[js.Any])
    if (valueNodeName != null) __obj.updateDynamic("valueNodeName")(valueNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinNodeName]
  }
}

