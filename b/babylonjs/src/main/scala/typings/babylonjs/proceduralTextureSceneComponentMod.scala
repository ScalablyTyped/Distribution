package typings.babylonjs

import typings.babylonjs.proceduralTextureMod.ProceduralTexture
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proceduralTextureSceneComponentMod {
  
  @JSImport("babylonjs/Materials/Textures/Procedurals/proceduralTextureSceneComponent", "ProceduralTextureSceneComponent")
  @js.native
  class ProceduralTextureSceneComponent protected () extends ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _beforeClear: js.Any = js.native
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    @js.native
    trait AbstractScene extends StObject {
      
      /**
        * The list of procedural textures added to the scene
        * @see https://doc.babylonjs.com/how_to/how_to_use_procedural_textures
        */
      var proceduralTextures: js.Array[ProceduralTexture] = js.native
    }
    object AbstractScene {
      
      @scala.inline
      def apply(proceduralTextures: js.Array[ProceduralTexture]): AbstractScene = {
        val __obj = js.Dynamic.literal(proceduralTextures = proceduralTextures.asInstanceOf[js.Any])
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit class AbstractSceneMutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProceduralTextures(value: js.Array[ProceduralTexture]): Self = StObject.set(x, "proceduralTextures", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProceduralTexturesVarargs(value: ProceduralTexture*): Self = StObject.set(x, "proceduralTextures", js.Array(value :_*))
      }
    }
  }
}
