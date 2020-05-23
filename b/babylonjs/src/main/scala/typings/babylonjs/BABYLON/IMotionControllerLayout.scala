package typings.babylonjs.BABYLON

import typings.babylonjs.anon.TouchPointNodeName
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
  org.scalablytyped.runtime.StringDictionary[TouchPointNodeName]
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
  org.scalablytyped.runtime.StringDictionary[TouchPointNodeName],
    gamepadMapping: _empty | `xr-standard`,
    rootNodeName: String,
    selectComponentId: String
  ): IMotionControllerLayout = {
    val __obj = js.Dynamic.literal(assetPath = assetPath.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], gamepadMapping = gamepadMapping.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], selectComponentId = selectComponentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMotionControllerLayout]
  }
}

