package typings.babylonjs.renderingIndexMod

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
      * Disables the prepass associated with the scene
      */
    def disablePrePassRenderer(): Unit
    
    /**
      * Disables the subsurface effect for prepass
      */
    def disableSubSurfaceForPrePass(): Unit
    
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
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var prePassRenderer: Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer]
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
  }
  object AbstractScene {
    
    inline def apply(
      disablePrePassRenderer: () => Unit,
      disableSubSurfaceForPrePass: () => Unit,
      enablePrePassRenderer: () => Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer],
      enableSubSurfaceForPrePass: () => Nullable[SubSurfaceConfiguration]
    ): AbstractScene = {
      val __obj = js.Dynamic.literal(disablePrePassRenderer = js.Any.fromFunction0(disablePrePassRenderer), disableSubSurfaceForPrePass = js.Any.fromFunction0(disableSubSurfaceForPrePass), enablePrePassRenderer = js.Any.fromFunction0(enablePrePassRenderer), enableSubSurfaceForPrePass = js.Any.fromFunction0(enableSubSurfaceForPrePass), _prePassRenderer = null, _subSurfaceConfiguration = null, prePassRenderer = null, subSurfaceConfiguration = null)
      __obj.asInstanceOf[AbstractScene]
    }
    
    extension [Self <: AbstractScene](x: Self) {
      
      inline def setDisablePrePassRenderer(value: () => Unit): Self = StObject.set(x, "disablePrePassRenderer", js.Any.fromFunction0(value))
      
      inline def setDisableSubSurfaceForPrePass(value: () => Unit): Self = StObject.set(x, "disableSubSurfaceForPrePass", js.Any.fromFunction0(value))
      
      inline def setEnablePrePassRenderer(value: () => Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "enablePrePassRenderer", js.Any.fromFunction0(value))
      
      inline def setEnableSubSurfaceForPrePass(value: () => Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "enableSubSurfaceForPrePass", js.Any.fromFunction0(value))
      
      inline def setPrePassRenderer(value: Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "prePassRenderer", value.asInstanceOf[js.Any])
      
      inline def setPrePassRendererNull: Self = StObject.set(x, "prePassRenderer", null)
      
      inline def setSubSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      inline def setSubSurfaceConfigurationNull: Self = StObject.set(x, "subSurfaceConfiguration", null)
      
      inline def set_prePassRenderer(value: Nullable[typings.babylonjs.prePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "_prePassRenderer", value.asInstanceOf[js.Any])
      
      inline def set_prePassRendererNull: Self = StObject.set(x, "_prePassRenderer", null)
      
      inline def set_subSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "_subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      inline def set_subSurfaceConfigurationNull: Self = StObject.set(x, "_subSurfaceConfiguration", null)
    }
  }
}
