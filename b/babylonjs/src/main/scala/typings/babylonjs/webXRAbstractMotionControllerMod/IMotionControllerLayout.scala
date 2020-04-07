package typings.babylonjs.webXRAbstractMotionControllerMod

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.AnonGamepadIndices
import typings.babylonjs.babylonjsStrings._empty
import typings.babylonjs.babylonjsStrings.`xr-standard`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMotionControllerLayout extends js.Object {
  /**
    * Path to load the assets. Usually relative to the base path
    */
  var assetPath: String
  /**
    * Available components (unsorted)
    */
  var components: /**
    * A map of component Ids
    */
  StringDictionary[AnonGamepadIndices]
  /**
    * Is it xr standard mapping or not
    */
  var gamepadMapping: _empty | `xr-standard`
  /**
    * Base root node of this entire model
    */
  var rootNodeName: String
  /**
    * Defines the main button component id
    */
  var selectComponentId: String
}

object IMotionControllerLayout {
  @scala.inline
  def apply(
    assetPath: String,
    components: /**
    * A map of component Ids
    */
  StringDictionary[AnonGamepadIndices],
    gamepadMapping: _empty | `xr-standard`,
    rootNodeName: String,
    selectComponentId: String
  ): IMotionControllerLayout = {
    val __obj = js.Dynamic.literal(assetPath = assetPath.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], gamepadMapping = gamepadMapping.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], selectComponentId = selectComponentId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMotionControllerLayout]
  }
}

