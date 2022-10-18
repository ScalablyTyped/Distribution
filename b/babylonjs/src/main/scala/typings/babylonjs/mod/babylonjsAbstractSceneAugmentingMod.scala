package typings.babylonjs.mod

import typings.babylonjs.renderingSubSurfaceConfigurationMod.SubSurfaceConfiguration
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsAbstractSceneAugmentingMod {
  
  trait AbstractScene extends StObject {
    
    /** @internal (Backing field) */
    var _prePassRenderer: Nullable[typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer]
    
    /** @internal (Backing field) */
    var _subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
    
    /**
      * Adds the given effect layer to this scene
      * @param newEffectLayer defines the effect layer to add
      */
    def addEffectLayer(newEffectLayer: typings.babylonjs.layersEffectLayerMod.EffectLayer): Unit
    
    /**
      * Adds the given lens flare system to this scene
      * @param newLensFlareSystem The lens flare system to add
      */
    def addLensFlareSystem(newLensFlareSystem: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem): Unit
    
    /**
      * Adds the given reflection probe to this scene.
      * @param newReflectionProbe The reflection probe to add
      */
    def addReflectionProbe(newReflectionProbe: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe): Unit
    
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
    var effectLayers: js.Array[typings.babylonjs.layersEffectLayerMod.EffectLayer]
    
    /**
      * Enables the prepass and associates it with the scene
      * @returns the PrePassRenderer
      */
    def enablePrePassRenderer(): Nullable[typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer]
    
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
    def getGlowLayerByName(name: String): Nullable[typings.babylonjs.layersGlowLayerMod.GlowLayer]
    
    /**
      * Return a the first highlight layer of the scene with a given name.
      * @param name The name of the highlight layer to look for.
      * @returns The highlight layer if found otherwise null.
      */
    def getHighlightLayerByName(name: String): Nullable[typings.babylonjs.layersHighlightLayerMod.HighlightLayer]
    
    /**
      * Gets a lens flare system using its Id
      * @param id defines the Id to look for
      * @returns the lens flare system or null if not found
      * @deprecated Please use getLensFlareSystemById instead
      */
    def getLensFlareSystemByID(id: String): Nullable[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]
    
    /**
      * Gets a lens flare system using its Id
      * @param id defines the Id to look for
      * @returns the lens flare system or null if not found
      */
    def getLensFlareSystemById(id: String): Nullable[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]
    
    /**
      * Gets a lens flare system using its name
      * @param name defines the name to look for
      * @returns the lens flare system or null if not found
      */
    def getLensFlareSystemByName(name: String): Nullable[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]
    
    /**
      * The list of layers (background and foreground) of the scene
      */
    var layers: js.Array[typings.babylonjs.layersLayerMod.Layer]
    
    /**
      * The list of lens flare system added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
      */
    var lensFlareSystems: js.Array[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var prePassRenderer: Nullable[typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer]
    
    /**
      * The list of procedural textures added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_procedural_textures
      */
    var proceduralTextures: js.Array[
        typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
      ]
    
    /**
      * The list of reflection probes added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_reflection_probes
      */
    var reflectionProbes: js.Array[typings.babylonjs.probesReflectionProbeMod.ReflectionProbe]
    
    /**
      * Removes the given effect layer from this scene.
      * @param toRemove defines the effect layer to remove
      * @returns the index of the removed effect layer
      */
    def removeEffectLayer(toRemove: typings.babylonjs.layersEffectLayerMod.EffectLayer): Double
    
    /**
      * Removes the given lens flare system from this scene.
      * @param toRemove The lens flare system to remove
      * @returns The index of the removed lens flare system
      */
    def removeLensFlareSystem(toRemove: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem): Double
    
    /**
      * Removes the given reflection probe from this scene.
      * @param toRemove The reflection probe to remove
      * @returns The index of the removed reflection probe
      */
    def removeReflectionProbe(toRemove: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe): Double
    
    /**
      * The list of sounds used in the scene.
      */
    var sounds: Nullable[js.Array[typings.babylonjs.audioSoundMod.Sound]]
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
  }
  object AbstractScene {
    
    inline def apply(
      addEffectLayer: typings.babylonjs.layersEffectLayerMod.EffectLayer => Unit,
      addLensFlareSystem: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem => Unit,
      addReflectionProbe: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe => Unit,
      disablePrePassRenderer: () => Unit,
      disableSubSurfaceForPrePass: () => Unit,
      effectLayers: js.Array[typings.babylonjs.layersEffectLayerMod.EffectLayer],
      enablePrePassRenderer: () => Nullable[typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer],
      enableSubSurfaceForPrePass: () => Nullable[SubSurfaceConfiguration],
      getGlowLayerByName: String => Nullable[typings.babylonjs.layersGlowLayerMod.GlowLayer],
      getHighlightLayerByName: String => Nullable[typings.babylonjs.layersHighlightLayerMod.HighlightLayer],
      getLensFlareSystemByID: String => Nullable[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem],
      getLensFlareSystemById: String => Nullable[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem],
      getLensFlareSystemByName: String => Nullable[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem],
      layers: js.Array[typings.babylonjs.layersLayerMod.Layer],
      lensFlareSystems: js.Array[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem],
      proceduralTextures: js.Array[
          typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
        ],
      reflectionProbes: js.Array[typings.babylonjs.probesReflectionProbeMod.ReflectionProbe],
      removeEffectLayer: typings.babylonjs.layersEffectLayerMod.EffectLayer => Double,
      removeLensFlareSystem: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem => Double,
      removeReflectionProbe: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe => Double
    ): typings.babylonjs.mod.babylonjsAbstractSceneAugmentingMod.AbstractScene = {
      val __obj = js.Dynamic.literal(addEffectLayer = js.Any.fromFunction1(addEffectLayer), addLensFlareSystem = js.Any.fromFunction1(addLensFlareSystem), addReflectionProbe = js.Any.fromFunction1(addReflectionProbe), disablePrePassRenderer = js.Any.fromFunction0(disablePrePassRenderer), disableSubSurfaceForPrePass = js.Any.fromFunction0(disableSubSurfaceForPrePass), effectLayers = effectLayers.asInstanceOf[js.Any], enablePrePassRenderer = js.Any.fromFunction0(enablePrePassRenderer), enableSubSurfaceForPrePass = js.Any.fromFunction0(enableSubSurfaceForPrePass), getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName), getHighlightLayerByName = js.Any.fromFunction1(getHighlightLayerByName), getLensFlareSystemByID = js.Any.fromFunction1(getLensFlareSystemByID), getLensFlareSystemById = js.Any.fromFunction1(getLensFlareSystemById), getLensFlareSystemByName = js.Any.fromFunction1(getLensFlareSystemByName), layers = layers.asInstanceOf[js.Any], lensFlareSystems = lensFlareSystems.asInstanceOf[js.Any], proceduralTextures = proceduralTextures.asInstanceOf[js.Any], reflectionProbes = reflectionProbes.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer), removeLensFlareSystem = js.Any.fromFunction1(removeLensFlareSystem), removeReflectionProbe = js.Any.fromFunction1(removeReflectionProbe), _prePassRenderer = null, _subSurfaceConfiguration = null, prePassRenderer = null, sounds = null, subSurfaceConfiguration = null)
      __obj.asInstanceOf[typings.babylonjs.mod.babylonjsAbstractSceneAugmentingMod.AbstractScene]
    }
    
    extension [Self <: typings.babylonjs.mod.babylonjsAbstractSceneAugmentingMod.AbstractScene](x: Self) {
      
      inline def setAddEffectLayer(value: typings.babylonjs.layersEffectLayerMod.EffectLayer => Unit): Self = StObject.set(x, "addEffectLayer", js.Any.fromFunction1(value))
      
      inline def setAddLensFlareSystem(value: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem => Unit): Self = StObject.set(x, "addLensFlareSystem", js.Any.fromFunction1(value))
      
      inline def setAddReflectionProbe(value: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe => Unit): Self = StObject.set(x, "addReflectionProbe", js.Any.fromFunction1(value))
      
      inline def setDisablePrePassRenderer(value: () => Unit): Self = StObject.set(x, "disablePrePassRenderer", js.Any.fromFunction0(value))
      
      inline def setDisableSubSurfaceForPrePass(value: () => Unit): Self = StObject.set(x, "disableSubSurfaceForPrePass", js.Any.fromFunction0(value))
      
      inline def setEffectLayers(value: js.Array[typings.babylonjs.layersEffectLayerMod.EffectLayer]): Self = StObject.set(x, "effectLayers", value.asInstanceOf[js.Any])
      
      inline def setEffectLayersVarargs(value: typings.babylonjs.layersEffectLayerMod.EffectLayer*): Self = StObject.set(x, "effectLayers", js.Array(value*))
      
      inline def setEnablePrePassRenderer(value: () => Nullable[typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "enablePrePassRenderer", js.Any.fromFunction0(value))
      
      inline def setEnableSubSurfaceForPrePass(value: () => Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "enableSubSurfaceForPrePass", js.Any.fromFunction0(value))
      
      inline def setGetGlowLayerByName(value: String => Nullable[typings.babylonjs.layersGlowLayerMod.GlowLayer]): Self = StObject.set(x, "getGlowLayerByName", js.Any.fromFunction1(value))
      
      inline def setGetHighlightLayerByName(value: String => Nullable[typings.babylonjs.layersHighlightLayerMod.HighlightLayer]): Self = StObject.set(x, "getHighlightLayerByName", js.Any.fromFunction1(value))
      
      inline def setGetLensFlareSystemByID(value: String => Nullable[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByID", js.Any.fromFunction1(value))
      
      inline def setGetLensFlareSystemByName(value: String => Nullable[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByName", js.Any.fromFunction1(value))
      
      inline def setLayers(value: js.Array[typings.babylonjs.layersLayerMod.Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: typings.babylonjs.layersLayerMod.Layer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLensFlareSystems(value: js.Array[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "lensFlareSystems", value.asInstanceOf[js.Any])
      
      inline def setLensFlareSystemsVarargs(value: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem*): Self = StObject.set(x, "lensFlareSystems", js.Array(value*))
      
      inline def setPrePassRenderer(value: Nullable[typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "prePassRenderer", value.asInstanceOf[js.Any])
      
      inline def setPrePassRendererNull: Self = StObject.set(x, "prePassRenderer", null)
      
      inline def setProceduralTextures(
        value: js.Array[
              typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
            ]
      ): Self = StObject.set(x, "proceduralTextures", value.asInstanceOf[js.Any])
      
      inline def setProceduralTexturesVarargs(value: typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture*): Self = StObject.set(x, "proceduralTextures", js.Array(value*))
      
      inline def setReflectionProbes(value: js.Array[typings.babylonjs.probesReflectionProbeMod.ReflectionProbe]): Self = StObject.set(x, "reflectionProbes", value.asInstanceOf[js.Any])
      
      inline def setReflectionProbesVarargs(value: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe*): Self = StObject.set(x, "reflectionProbes", js.Array(value*))
      
      inline def setRemoveEffectLayer(value: typings.babylonjs.layersEffectLayerMod.EffectLayer => Double): Self = StObject.set(x, "removeEffectLayer", js.Any.fromFunction1(value))
      
      inline def setRemoveLensFlareSystem(value: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem => Double): Self = StObject.set(x, "removeLensFlareSystem", js.Any.fromFunction1(value))
      
      inline def setRemoveReflectionProbe(value: typings.babylonjs.probesReflectionProbeMod.ReflectionProbe => Double): Self = StObject.set(x, "removeReflectionProbe", js.Any.fromFunction1(value))
      
      inline def setSounds(value: Nullable[js.Array[typings.babylonjs.audioSoundMod.Sound]]): Self = StObject.set(x, "sounds", value.asInstanceOf[js.Any])
      
      inline def setSoundsNull: Self = StObject.set(x, "sounds", null)
      
      inline def setSoundsVarargs(value: typings.babylonjs.audioSoundMod.Sound*): Self = StObject.set(x, "sounds", js.Array(value*))
      
      inline def setSubSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      inline def setSubSurfaceConfigurationNull: Self = StObject.set(x, "subSurfaceConfiguration", null)
      
      inline def set_prePassRenderer(value: Nullable[typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "_prePassRenderer", value.asInstanceOf[js.Any])
      
      inline def set_prePassRendererNull: Self = StObject.set(x, "_prePassRenderer", null)
      
      inline def set_subSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "_subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      inline def set_subSurfaceConfigurationNull: Self = StObject.set(x, "_subSurfaceConfiguration", null)
    }
  }
}
