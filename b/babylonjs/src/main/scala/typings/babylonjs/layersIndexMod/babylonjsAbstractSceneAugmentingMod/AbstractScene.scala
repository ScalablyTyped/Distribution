package typings.babylonjs.layersIndexMod.babylonjsAbstractSceneAugmentingMod

import typings.babylonjs.effectLayerMod.EffectLayer
import typings.babylonjs.glowLayerMod.GlowLayer
import typings.babylonjs.highlightLayerMod.HighlightLayer
import typings.babylonjs.layerMod.Layer
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractScene extends js.Object {
  
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
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  def getGlowLayerByName(name: String): Nullable[GlowLayer] = js.native
  
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  def getHighlightLayerByName(name: String): Nullable[HighlightLayer] = js.native
  
  /**
    * The list of layers (background and foreground) of the scene
    */
  var layers: js.Array[Layer] = js.native
  
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
    getGlowLayerByName: String => Nullable[GlowLayer],
    getHighlightLayerByName: String => Nullable[HighlightLayer],
    layers: js.Array[Layer],
    removeEffectLayer: EffectLayer => Double
  ): AbstractScene = {
    val __obj = js.Dynamic.literal(addEffectLayer = js.Any.fromFunction1(addEffectLayer), effectLayers = effectLayers.asInstanceOf[js.Any], getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName), getHighlightLayerByName = js.Any.fromFunction1(getHighlightLayerByName), layers = layers.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer))
    __obj.asInstanceOf[AbstractScene]
  }
  
  @scala.inline
  implicit class AbstractSceneOps[Self <: AbstractScene] (val x: Self) extends AnyVal {
    
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
    def setAddEffectLayer(value: EffectLayer => Unit): Self = this.set("addEffectLayer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEffectLayersVarargs(value: EffectLayer*): Self = this.set("effectLayers", js.Array(value :_*))
    
    @scala.inline
    def setEffectLayers(value: js.Array[EffectLayer]): Self = this.set("effectLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGlowLayerByName(value: String => Nullable[GlowLayer]): Self = this.set("getGlowLayerByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHighlightLayerByName(value: String => Nullable[HighlightLayer]): Self = this.set("getHighlightLayerByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEffectLayer(value: EffectLayer => Double): Self = this.set("removeEffectLayer", js.Any.fromFunction1(value))
  }
}
