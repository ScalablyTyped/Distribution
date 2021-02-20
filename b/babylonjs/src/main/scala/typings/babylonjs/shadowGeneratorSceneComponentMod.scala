package typings.babylonjs

import typings.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowGeneratorSceneComponentMod {
  
  @JSImport("babylonjs/Lights/Shadows/shadowGeneratorSceneComponent", "ShadowGeneratorSceneComponent")
  @js.native
  class ShadowGeneratorSceneComponent protected () extends ISceneSerializableComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _gatherRenderTargets: js.Any = js.native
  }
}
