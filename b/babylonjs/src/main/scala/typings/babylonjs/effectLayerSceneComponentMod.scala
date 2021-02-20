package typings.babylonjs

import typings.babylonjs.effectLayerMod.EffectLayer
import typings.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effectLayerSceneComponentMod {
  
  @JSImport("babylonjs/Layers/effectLayerSceneComponent", "EffectLayerSceneComponent")
  @js.native
  class EffectLayerSceneComponent protected () extends ISceneSerializableComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _draw: js.Any = js.native
    
    var _drawCamera: js.Any = js.native
    
    var _drawRenderingGroup: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _isReadyForMesh: js.Any = js.native
    
    var _needStencil: js.Any = js.native
    
    var _previousStencilState: js.Any = js.native
    
    var _renderEffects: js.Any = js.native
    
    var _renderMainTexture: js.Any = js.native
    
    var _setStencil: js.Any = js.native
    
    var _setStencilBack: js.Any = js.native
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    @js.native
    trait AbstractScene extends StObject {
      
      /**
        * Adds the given effect layer to this scene
        * @param newEffectLayer defines the effect layer to add
        */
      def addEffectLayer(newEffectLayer: EffectLayer): Unit = js.native
      
      /**
        * The list of effect layers (highlights/glow) added to the scene
        * @see https://doc.babylonjs.com/how_to/highlight_layer
        * @see https://doc.babylonjs.com/how_to/glow_layer
        */
      var effectLayers: js.Array[EffectLayer] = js.native
      
      /**
        * Removes the given effect layer from this scene.
        * @param toRemove defines the effect layer to remove
        * @returns the index of the removed effect layer
        */
      def removeEffectLayer(toRemove: EffectLayer): Double = js.native
    }
    object AbstractScene {
      
      @scala.inline
      def apply(
        addEffectLayer: EffectLayer => Unit,
        effectLayers: js.Array[EffectLayer],
        removeEffectLayer: EffectLayer => Double
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(addEffectLayer = js.Any.fromFunction1(addEffectLayer), effectLayers = effectLayers.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer))
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit class AbstractSceneMutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddEffectLayer(value: EffectLayer => Unit): Self = StObject.set(x, "addEffectLayer", js.Any.fromFunction1(value))
        
        @scala.inline
        def setEffectLayers(value: js.Array[EffectLayer]): Self = StObject.set(x, "effectLayers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEffectLayersVarargs(value: EffectLayer*): Self = StObject.set(x, "effectLayers", js.Array(value :_*))
        
        @scala.inline
        def setRemoveEffectLayer(value: EffectLayer => Double): Self = StObject.set(x, "removeEffectLayer", js.Any.fromFunction1(value))
      }
    }
  }
}
