package typings.babylonjs

import typings.babylonjs.abstractSceneMod.AbstractScene
import typings.babylonjs.layerMod.Layer
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerSceneComponentMod {
  
  @JSImport("babylonjs/Layers/layerSceneComponent", "LayerSceneComponent")
  @js.native
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  open class LayerSceneComponent ()
    extends StObject
       with ISceneComponent {
    def this(scene: Scene) = this()
    
    /* private */ var _draw: Any = js.native
    
    /* private */ var _drawCameraBackground: Any = js.native
    
    /* private */ var _drawCameraForeground: Any = js.native
    
    /* private */ var _drawCameraPredicate: Any = js.native
    
    /* private */ var _drawRenderTargetBackground: Any = js.native
    
    /* private */ var _drawRenderTargetForeground: Any = js.native
    
    /* private */ var _drawRenderTargetPredicate: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /**
      * Adds all the elements from the container to the scene
      * @param container the container holding the elements
      */
    def addFromContainer(container: AbstractScene): Unit = js.native
    
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
      * Removes all the elements in the container from the scene
      * @param container contains the elements to remove
      * @param dispose if the removed element should be disposed (default: false)
      */
    def removeFromContainer(container: AbstractScene): Unit = js.native
    def removeFromContainer(container: AbstractScene, dispose: Boolean): Unit = js.native
    
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
        * The list of layers (background and foreground) of the scene
        */
      var layers: js.Array[Layer]
    }
    object AbstractScene {
      
      inline def apply(layers: js.Array[Layer]): typings.babylonjs.layerSceneComponentMod.babylonjsAbstractSceneAugmentingMod.AbstractScene = {
        val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.layerSceneComponentMod.babylonjsAbstractSceneAugmentingMod.AbstractScene]
      }
      
      extension [Self <: typings.babylonjs.layerSceneComponentMod.babylonjsAbstractSceneAugmentingMod.AbstractScene](x: Self) {
        
        inline def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
        
        inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
      }
    }
  }
}
