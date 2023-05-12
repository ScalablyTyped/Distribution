package typings.babylonjs

import typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesProceduralsProceduralTextureSceneComponentMod {
  
  @JSImport("babylonjs/Materials/Textures/Procedurals/proceduralTextureSceneComponent", "ProceduralTextureSceneComponent")
  @js.native
  open class ProceduralTextureSceneComponent protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    /* private */ var _beforeClear: Any = js.native
    
    /**
      * Disposes the component and the associated ressources.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The name of the component. Each component must have a unique name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    /* CompleteClass */
    override def rebuild(): Unit = js.native
    
    /**
      * Register the component to one instance of a scene.
      */
    /* CompleteClass */
    override def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    trait AbstractScene extends StObject {
      
      /**
        * The list of procedural textures added to the scene
        * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/proceduralTextures
        */
      var proceduralTextures: js.Array[ProceduralTexture]
    }
    object AbstractScene {
      
      inline def apply(proceduralTextures: js.Array[ProceduralTexture]): AbstractScene = {
        val __obj = js.Dynamic.literal(proceduralTextures = proceduralTextures.asInstanceOf[js.Any])
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        inline def setProceduralTextures(value: js.Array[ProceduralTexture]): Self = StObject.set(x, "proceduralTextures", value.asInstanceOf[js.Any])
        
        inline def setProceduralTexturesVarargs(value: ProceduralTexture*): Self = StObject.set(x, "proceduralTextures", js.Array(value*))
      }
    }
  }
}
