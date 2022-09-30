package typings.babylonjs.legacyMod

import typings.babylonjs.subSurfaceConfigurationMod.SubSurfaceConfiguration
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsAbstractSceneAugmentingMod {
  
  trait AbstractScene extends StObject {
    
    /** @internal (Backing field) */
    var _prePassRenderer: Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer]
    
    /** @internal (Backing field) */
    var _subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
    
    /**
      * Adds the given effect layer to this scene
      * @param newEffectLayer defines the effect layer to add
      */
    def addEffectLayer(newEffectLayer: typings.babylonjs.effectLayerMod.EffectLayer): Unit
    
    /**
      * Adds the given lens flare system to this scene
      * @param newLensFlareSystem The lens flare system to add
      */
    def addLensFlareSystem(newLensFlareSystem: typings.babylonjs.lensFlareSystemMod.LensFlareSystem): Unit
    
    /**
      * Adds the given reflection probe to this scene.
      * @param newReflectionProbe The reflection probe to add
      */
    def addReflectionProbe(newReflectionProbe: typings.babylonjs.reflectionProbeMod.ReflectionProbe): Unit
    
    /**
      * Disables the prepass associated with the scene
      */
    def disablePrePassRenderer(): Unit
    
    /**
      * Disables the subsurface effect for prepass
      */
    def disableSubSurfaceForPrePass(): Unit
    
    /**
      * The list of effect layers (highlights/glow) added to the scene
      * @see https://doc.babylonjs.com/how_to/highlight_layer
      * @see https://doc.babylonjs.com/how_to/glow_layer
      */
    var effectLayers: js.Array[typings.babylonjs.effectLayerMod.EffectLayer]
    
    /**
      * Enables the prepass and associates it with the scene
      * @returns the PrePassRenderer
      */
    def enablePrePassRenderer(): Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer]
    
    /**
      * Enables the subsurface effect for prepass
      * @returns the SubSurfaceConfiguration
      */
    def enableSubSurfaceForPrePass(): Nullable[SubSurfaceConfiguration]
    
    /**
      * Return a the first highlight layer of the scene with a given name.
      * @param name The name of the highlight layer to look for.
      * @returns The highlight layer if found otherwise null.
      */
    def getGlowLayerByName(name: String): Nullable[typings.babylonjs.glowLayerMod.GlowLayer]
    
    /**
      * Return a the first highlight layer of the scene with a given name.
      * @param name The name of the highlight layer to look for.
      * @returns The highlight layer if found otherwise null.
      */
    def getHighlightLayerByName(name: String): Nullable[typings.babylonjs.highlightLayerMod.HighlightLayer]
    
    /**
      * Gets a lens flare system using its Id
      * @param id defines the Id to look for
      * @returns the lens flare system or null if not found
      * @deprecated Please use getLensFlareSystemById instead
      */
    def getLensFlareSystemByID(id: String): Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem]
    
    /**
      * Gets a lens flare system using its Id
      * @param id defines the Id to look for
      * @returns the lens flare system or null if not found
      */
    def getLensFlareSystemById(id: String): Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem]
    
    /**
      * Gets a lens flare system using its name
      * @param name defines the name to look for
      * @returns the lens flare system or null if not found
      */
    def getLensFlareSystemByName(name: String): Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem]
    
    /**
      * The list of layers (background and foreground) of the scene
      */
    var layers: js.Array[typings.babylonjs.layerMod.Layer]
    
    /**
      * The list of lens flare system added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
      */
    var lensFlareSystems: js.Array[typings.babylonjs.lensFlareSystemMod.LensFlareSystem]
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var prePassRenderer: Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer]
    
    /**
      * The list of procedural textures added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_procedural_textures
      */
    var proceduralTextures: js.Array[typings.babylonjs.proceduralTextureMod.ProceduralTexture]
    
    /**
      * The list of reflection probes added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_reflection_probes
      */
    var reflectionProbes: js.Array[typings.babylonjs.reflectionProbeMod.ReflectionProbe]
    
    /**
      * Removes the given effect layer from this scene.
      * @param toRemove defines the effect layer to remove
      * @returns the index of the removed effect layer
      */
    def removeEffectLayer(toRemove: typings.babylonjs.effectLayerMod.EffectLayer): Double
    
    /**
      * Removes the given lens flare system from this scene.
      * @param toRemove The lens flare system to remove
      * @returns The index of the removed lens flare system
      */
    def removeLensFlareSystem(toRemove: typings.babylonjs.lensFlareSystemMod.LensFlareSystem): Double
    
    /**
      * Removes the given reflection probe from this scene.
      * @param toRemove The reflection probe to remove
      * @returns The index of the removed reflection probe
      */
    def removeReflectionProbe(toRemove: typings.babylonjs.reflectionProbeMod.ReflectionProbe): Double
    
    /**
      * The list of sounds used in the scene.
      */
    var sounds: Nullable[js.Array[typings.babylonjs.soundMod.Sound]]
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
  }
  object AbstractScene {
    
    inline def apply(
      addEffectLayer: typings.babylonjs.effectLayerMod.EffectLayer => Unit,
      addLensFlareSystem: typings.babylonjs.lensFlareSystemMod.LensFlareSystem => Unit,
      addReflectionProbe: typings.babylonjs.reflectionProbeMod.ReflectionProbe => Unit,
      disablePrePassRenderer: () => Unit,
      disableSubSurfaceForPrePass: () => Unit,
      effectLayers: js.Array[typings.babylonjs.effectLayerMod.EffectLayer],
      enablePrePassRenderer: () => Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer],
      enableSubSurfaceForPrePass: () => Nullable[SubSurfaceConfiguration],
      getGlowLayerByName: String => Nullable[typings.babylonjs.glowLayerMod.GlowLayer],
      getHighlightLayerByName: String => Nullable[typings.babylonjs.highlightLayerMod.HighlightLayer],
      getLensFlareSystemByID: String => Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem],
      getLensFlareSystemById: String => Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem],
      getLensFlareSystemByName: String => Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem],
      layers: js.Array[typings.babylonjs.layerMod.Layer],
      lensFlareSystems: js.Array[typings.babylonjs.lensFlareSystemMod.LensFlareSystem],
      proceduralTextures: js.Array[typings.babylonjs.proceduralTextureMod.ProceduralTexture],
      reflectionProbes: js.Array[typings.babylonjs.reflectionProbeMod.ReflectionProbe],
      removeEffectLayer: typings.babylonjs.effectLayerMod.EffectLayer => Double,
      removeLensFlareSystem: typings.babylonjs.lensFlareSystemMod.LensFlareSystem => Double,
      removeReflectionProbe: typings.babylonjs.reflectionProbeMod.ReflectionProbe => Double
    ): typings.babylonjs.legacyMod.babylonjsAbstractSceneAugmentingMod.AbstractScene = {
      val __obj = js.Dynamic.literal(addEffectLayer = js.Any.fromFunction1(addEffectLayer), addLensFlareSystem = js.Any.fromFunction1(addLensFlareSystem), addReflectionProbe = js.Any.fromFunction1(addReflectionProbe), disablePrePassRenderer = js.Any.fromFunction0(disablePrePassRenderer), disableSubSurfaceForPrePass = js.Any.fromFunction0(disableSubSurfaceForPrePass), effectLayers = effectLayers.asInstanceOf[js.Any], enablePrePassRenderer = js.Any.fromFunction0(enablePrePassRenderer), enableSubSurfaceForPrePass = js.Any.fromFunction0(enableSubSurfaceForPrePass), getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName), getHighlightLayerByName = js.Any.fromFunction1(getHighlightLayerByName), getLensFlareSystemByID = js.Any.fromFunction1(getLensFlareSystemByID), getLensFlareSystemById = js.Any.fromFunction1(getLensFlareSystemById), getLensFlareSystemByName = js.Any.fromFunction1(getLensFlareSystemByName), layers = layers.asInstanceOf[js.Any], lensFlareSystems = lensFlareSystems.asInstanceOf[js.Any], proceduralTextures = proceduralTextures.asInstanceOf[js.Any], reflectionProbes = reflectionProbes.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer), removeLensFlareSystem = js.Any.fromFunction1(removeLensFlareSystem), removeReflectionProbe = js.Any.fromFunction1(removeReflectionProbe), _prePassRenderer = null, _subSurfaceConfiguration = null, prePassRenderer = null, sounds = null, subSurfaceConfiguration = null)
      __obj.asInstanceOf[typings.babylonjs.legacyMod.babylonjsAbstractSceneAugmentingMod.AbstractScene]
    }
    
    extension [Self <: typings.babylonjs.legacyMod.babylonjsAbstractSceneAugmentingMod.AbstractScene](x: Self) {
      
      inline def setAddEffectLayer(value: typings.babylonjs.effectLayerMod.EffectLayer => Unit): Self = StObject.set(x, "addEffectLayer", js.Any.fromFunction1(value))
      
      inline def setAddLensFlareSystem(value: typings.babylonjs.lensFlareSystemMod.LensFlareSystem => Unit): Self = StObject.set(x, "addLensFlareSystem", js.Any.fromFunction1(value))
      
      inline def setAddReflectionProbe(value: typings.babylonjs.reflectionProbeMod.ReflectionProbe => Unit): Self = StObject.set(x, "addReflectionProbe", js.Any.fromFunction1(value))
      
      inline def setDisablePrePassRenderer(value: () => Unit): Self = StObject.set(x, "disablePrePassRenderer", js.Any.fromFunction0(value))
      
      inline def setDisableSubSurfaceForPrePass(value: () => Unit): Self = StObject.set(x, "disableSubSurfaceForPrePass", js.Any.fromFunction0(value))
      
      inline def setEffectLayers(value: js.Array[typings.babylonjs.effectLayerMod.EffectLayer]): Self = StObject.set(x, "effectLayers", value.asInstanceOf[js.Any])
      
      inline def setEffectLayersVarargs(value: typings.babylonjs.effectLayerMod.EffectLayer*): Self = StObject.set(x, "effectLayers", js.Array(value*))
      
      inline def setEnablePrePassRenderer(value: () => Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "enablePrePassRenderer", js.Any.fromFunction0(value))
      
      inline def setEnableSubSurfaceForPrePass(value: () => Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "enableSubSurfaceForPrePass", js.Any.fromFunction0(value))
      
      inline def setGetGlowLayerByName(value: String => Nullable[typings.babylonjs.glowLayerMod.GlowLayer]): Self = StObject.set(x, "getGlowLayerByName", js.Any.fromFunction1(value))
      
      inline def setGetHighlightLayerByName(value: String => Nullable[typings.babylonjs.highlightLayerMod.HighlightLayer]): Self = StObject.set(x, "getHighlightLayerByName", js.Any.fromFunction1(value))
      
      inline def setGetLensFlareSystemByID(value: String => Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByID", js.Any.fromFunction1(value))
      
      inline def setGetLensFlareSystemByName(value: String => Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByName", js.Any.fromFunction1(value))
      
      inline def setLayers(value: js.Array[typings.babylonjs.layerMod.Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: typings.babylonjs.layerMod.Layer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLensFlareSystems(value: js.Array[typings.babylonjs.lensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "lensFlareSystems", value.asInstanceOf[js.Any])
      
      inline def setLensFlareSystemsVarargs(value: typings.babylonjs.lensFlareSystemMod.LensFlareSystem*): Self = StObject.set(x, "lensFlareSystems", js.Array(value*))
      
      inline def setPrePassRenderer(value: Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "prePassRenderer", value.asInstanceOf[js.Any])
      
      inline def setPrePassRendererNull: Self = StObject.set(x, "prePassRenderer", null)
      
      inline def setProceduralTextures(value: js.Array[typings.babylonjs.proceduralTextureMod.ProceduralTexture]): Self = StObject.set(x, "proceduralTextures", value.asInstanceOf[js.Any])
      
      inline def setProceduralTexturesVarargs(value: typings.babylonjs.proceduralTextureMod.ProceduralTexture*): Self = StObject.set(x, "proceduralTextures", js.Array(value*))
      
      inline def setReflectionProbes(value: js.Array[typings.babylonjs.reflectionProbeMod.ReflectionProbe]): Self = StObject.set(x, "reflectionProbes", value.asInstanceOf[js.Any])
      
      inline def setReflectionProbesVarargs(value: typings.babylonjs.reflectionProbeMod.ReflectionProbe*): Self = StObject.set(x, "reflectionProbes", js.Array(value*))
      
      inline def setRemoveEffectLayer(value: typings.babylonjs.effectLayerMod.EffectLayer => Double): Self = StObject.set(x, "removeEffectLayer", js.Any.fromFunction1(value))
      
      inline def setRemoveLensFlareSystem(value: typings.babylonjs.lensFlareSystemMod.LensFlareSystem => Double): Self = StObject.set(x, "removeLensFlareSystem", js.Any.fromFunction1(value))
      
      inline def setRemoveReflectionProbe(value: typings.babylonjs.reflectionProbeMod.ReflectionProbe => Double): Self = StObject.set(x, "removeReflectionProbe", js.Any.fromFunction1(value))
      
      inline def setSounds(value: Nullable[js.Array[typings.babylonjs.soundMod.Sound]]): Self = StObject.set(x, "sounds", value.asInstanceOf[js.Any])
      
      inline def setSoundsNull: Self = StObject.set(x, "sounds", null)
      
      inline def setSoundsVarargs(value: typings.babylonjs.soundMod.Sound*): Self = StObject.set(x, "sounds", js.Array(value*))
      
      inline def setSubSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      inline def setSubSurfaceConfigurationNull: Self = StObject.set(x, "subSurfaceConfiguration", null)
      
      inline def set_prePassRenderer(value: Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "_prePassRenderer", value.asInstanceOf[js.Any])
      
      inline def set_prePassRendererNull: Self = StObject.set(x, "_prePassRenderer", null)
      
      inline def set_subSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "_subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      inline def set_subSurfaceConfigurationNull: Self = StObject.set(x, "_subSurfaceConfiguration", null)
    }
  }
}
