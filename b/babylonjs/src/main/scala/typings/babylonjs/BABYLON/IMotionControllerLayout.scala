package typings.babylonjs.BABYLON

import typings.babylonjs.anon.TouchPointNodeName
import typings.babylonjs.babylonjsStrings._empty
import typings.babylonjs.babylonjsStrings.`xr-standard`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMotionControllerLayout extends js.Object {
  
  /**
    * Path to load the assets. Usually relative to the base path
    */
  var assetPath: String = js.native
  
  /**
    * Available components (unsorted)
    */
  var components: /**
    * A map of component Ids
    */
  org.scalablytyped.runtime.StringDictionary[TouchPointNodeName] = js.native
  
  /**
    * Is it xr standard mapping or not
    */
  var gamepadMapping: _empty | `xr-standard` = js.native
  
  /**
    * Base root node of this entire model
    */
  var rootNodeName: String = js.native
  
  /**
    * Defines the main button component id
    */
  var selectComponentId: String = js.native
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
  
  @scala.inline
  implicit class IMotionControllerLayoutOps[Self <: IMotionControllerLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssetPath(value: String): Self = this.set("assetPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponents(
      value: /**
      * A map of component Ids
      */
    org.scalablytyped.runtime.StringDictionary[TouchPointNodeName]
    ): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamepadMapping(value: _empty | `xr-standard`): Self = this.set("gamepadMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNodeName(value: String): Self = this.set("rootNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectComponentId(value: String): Self = this.set("selectComponentId", value.asInstanceOf[js.Any])
  }
}
