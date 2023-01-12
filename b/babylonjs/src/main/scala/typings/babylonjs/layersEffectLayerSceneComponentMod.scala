package typings.babylonjs

import typings.babylonjs.layersEffectLayerMod.EffectLayer
import typings.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layersEffectLayerSceneComponentMod {
  
  @JSImport("babylonjs/Layers/effectLayerSceneComponent", "EffectLayerSceneComponent")
  @js.native
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  open class EffectLayerSceneComponent ()
    extends StObject
       with ISceneSerializableComponent {
    def this(scene: Scene) = this()
    
    /* private */ var _draw: Any = js.native
    
    /* private */ var _drawCamera: Any = js.native
    
    /* private */ var _drawRenderingGroup: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _isReadyForMesh: Any = js.native
    
    /* private */ var _needStencil: Any = js.native
    
    /* private */ var _previousStencilState: Any = js.native
    
    /* private */ var _renderEffects: Any = js.native
    
    /* private */ var _renderMainTexture: Any = js.native
    
    /* private */ var _setStencil: Any = js.native
    
    /* private */ var _setStencilBack: Any = js.native
    
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
        * Adds the given effect layer to this scene
        * @param newEffectLayer defines the effect layer to add
        */
      def addEffectLayer(newEffectLayer: EffectLayer): Unit
      
      /**
        * The list of effect layers (highlights/glow) added to the scene
        * @see https://doc.babylonjs.com/how_to/highlight_layer
        * @see https://doc.babylonjs.com/how_to/glow_layer
        */
      var effectLayers: js.Array[EffectLayer]
      
      /**
        * Removes the given effect layer from this scene.
        * @param toRemove defines the effect layer to remove
        * @returns the index of the removed effect layer
        */
      def removeEffectLayer(toRemove: EffectLayer): Double
    }
    object AbstractScene {
      
      inline def apply(
        addEffectLayer: EffectLayer => Unit,
        effectLayers: js.Array[EffectLayer],
        removeEffectLayer: EffectLayer => Double
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(addEffectLayer = js.Any.fromFunction1(addEffectLayer), effectLayers = effectLayers.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer))
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        inline def setAddEffectLayer(value: EffectLayer => Unit): Self = StObject.set(x, "addEffectLayer", js.Any.fromFunction1(value))
        
        inline def setEffectLayers(value: js.Array[EffectLayer]): Self = StObject.set(x, "effectLayers", value.asInstanceOf[js.Any])
        
        inline def setEffectLayersVarargs(value: EffectLayer*): Self = StObject.set(x, "effectLayers", js.Array(value*))
        
        inline def setRemoveEffectLayer(value: EffectLayer => Double): Self = StObject.set(x, "removeEffectLayer", js.Any.fromFunction1(value))
      }
    }
  }
}
