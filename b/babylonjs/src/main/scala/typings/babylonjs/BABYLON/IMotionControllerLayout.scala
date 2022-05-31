package typings.babylonjs.BABYLON

import typings.babylonjs.anon.TouchPointNodeName
import typings.babylonjs.babylonjsStrings._empty
import typings.babylonjs.babylonjsStrings.`xr-standard`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMotionControllerLayout extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: IMotionControllerLayout](x: Self) {
    
    inline def setAssetPath(value: String): Self = StObject.set(x, "assetPath", value.asInstanceOf[js.Any])
    
    inline def setComponents(
      value: /**
      * A map of component Ids
      */
    org.scalablytyped.runtime.StringDictionary[TouchPointNodeName]
    ): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setGamepadMapping(value: _empty | `xr-standard`): Self = StObject.set(x, "gamepadMapping", value.asInstanceOf[js.Any])
    
    inline def setRootNodeName(value: String): Self = StObject.set(x, "rootNodeName", value.asInstanceOf[js.Any])
    
    inline def setSelectComponentId(value: String): Self = StObject.set(x, "selectComponentId", value.asInstanceOf[js.Any])
  }
}
