package typings.babylonjs.renderingIndexMod

import typings.babylonjs.renderingSubSurfaceConfigurationMod.SubSurfaceConfiguration
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsAbstractSceneAugmentingMod {
  
  trait AbstractScene extends StObject {
    
    /** @internal (Backing field) */
    var _fluidRenderer: Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer]
    
    /** @internal (Backing field) */
    var _prePassRenderer: Nullable[typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer]
    
    /** @internal (Backing field) */
    var _subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
    
    /**
      * Disables the fluid renderer associated with the scene
      */
    def disableFluidRenderer(): Unit
    
    /**
      * Disables the prepass associated with the scene
      */
    def disablePrePassRenderer(): Unit
    
    /**
      * Disables the subsurface effect for prepass
      */
    def disableSubSurfaceForPrePass(): Unit
    
    /**
      * Enables the fluid renderer and associates it with the scene
      * @returns the FluidRenderer
      */
    def enableFluidRenderer(): Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer]
    
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
      * Gets or Sets the fluid renderer associated to the scene.
      */
    var fluidRenderer: Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer]
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var prePassRenderer: Nullable[typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer]
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
  }
  object AbstractScene {
    
    inline def apply(
      disableFluidRenderer: () => Unit,
      disablePrePassRenderer: () => Unit,
      disableSubSurfaceForPrePass: () => Unit,
      enableFluidRenderer: () => Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer],
      enablePrePassRenderer: () => Nullable[typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer],
      enableSubSurfaceForPrePass: () => Nullable[SubSurfaceConfiguration]
    ): AbstractScene = {
      val __obj = js.Dynamic.literal(disableFluidRenderer = js.Any.fromFunction0(disableFluidRenderer), disablePrePassRenderer = js.Any.fromFunction0(disablePrePassRenderer), disableSubSurfaceForPrePass = js.Any.fromFunction0(disableSubSurfaceForPrePass), enableFluidRenderer = js.Any.fromFunction0(enableFluidRenderer), enablePrePassRenderer = js.Any.fromFunction0(enablePrePassRenderer), enableSubSurfaceForPrePass = js.Any.fromFunction0(enableSubSurfaceForPrePass), _fluidRenderer = null, _prePassRenderer = null, _subSurfaceConfiguration = null, fluidRenderer = null, prePassRenderer = null, subSurfaceConfiguration = null)
      __obj.asInstanceOf[AbstractScene]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
      
      inline def setDisableFluidRenderer(value: () => Unit): Self = StObject.set(x, "disableFluidRenderer", js.Any.fromFunction0(value))
      
      inline def setDisablePrePassRenderer(value: () => Unit): Self = StObject.set(x, "disablePrePassRenderer", js.Any.fromFunction0(value))
      
      inline def setDisableSubSurfaceForPrePass(value: () => Unit): Self = StObject.set(x, "disableSubSurfaceForPrePass", js.Any.fromFunction0(value))
      
      inline def setEnableFluidRenderer(value: () => Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer]): Self = StObject.set(x, "enableFluidRenderer", js.Any.fromFunction0(value))
      
      inline def setEnablePrePassRenderer(value: () => Nullable[typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "enablePrePassRenderer", js.Any.fromFunction0(value))
      
      inline def setEnableSubSurfaceForPrePass(value: () => Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "enableSubSurfaceForPrePass", js.Any.fromFunction0(value))
      
      inline def setFluidRenderer(value: Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer]): Self = StObject.set(x, "fluidRenderer", value.asInstanceOf[js.Any])
      
      inline def setFluidRendererNull: Self = StObject.set(x, "fluidRenderer", null)
      
      inline def setPrePassRenderer(value: Nullable[typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "prePassRenderer", value.asInstanceOf[js.Any])
      
      inline def setPrePassRendererNull: Self = StObject.set(x, "prePassRenderer", null)
      
      inline def setSubSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      inline def setSubSurfaceConfigurationNull: Self = StObject.set(x, "subSurfaceConfiguration", null)
      
      inline def set_fluidRenderer(value: Nullable[typings.babylonjs.renderingFluidRendererFluidRendererMod.FluidRenderer]): Self = StObject.set(x, "_fluidRenderer", value.asInstanceOf[js.Any])
      
      inline def set_fluidRendererNull: Self = StObject.set(x, "_fluidRenderer", null)
      
      inline def set_prePassRenderer(value: Nullable[typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "_prePassRenderer", value.asInstanceOf[js.Any])
      
      inline def set_prePassRendererNull: Self = StObject.set(x, "_prePassRenderer", null)
      
      inline def set_subSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "_subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      inline def set_subSurfaceConfigurationNull: Self = StObject.set(x, "_subSurfaceConfiguration", null)
    }
  }
}
