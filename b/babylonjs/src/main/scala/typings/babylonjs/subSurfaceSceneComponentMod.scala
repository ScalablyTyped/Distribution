package typings.babylonjs

import typings.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subSurfaceConfigurationMod.SubSurfaceConfiguration
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subSurfaceSceneComponentMod {
  
  @JSImport("babylonjs/Rendering/subSurfaceSceneComponent", "SubSurfaceSceneComponent")
  @js.native
  class SubSurfaceSceneComponent protected () extends ISceneSerializableComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    @js.native
    trait AbstractScene extends StObject {
      
      /** @hidden (Backing field) */
      var _subSurfaceConfiguration: Nullable[SubSurfaceConfiguration] = js.native
      
      /**
        * Disables the subsurface effect for prepass
        */
      def disableSubSurfaceForPrePass(): Unit = js.native
      
      /**
        * Enables the subsurface effect for prepass
        * @returns the SubSurfaceConfiguration
        */
      def enableSubSurfaceForPrePass(): Nullable[SubSurfaceConfiguration] = js.native
      
      /**
        * Gets or Sets the current prepass renderer associated to the scene.
        */
      var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration] = js.native
    }
    object AbstractScene {
      
      @scala.inline
      def apply(
        disableSubSurfaceForPrePass: () => Unit,
        enableSubSurfaceForPrePass: () => Nullable[SubSurfaceConfiguration]
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(disableSubSurfaceForPrePass = js.Any.fromFunction0(disableSubSurfaceForPrePass), enableSubSurfaceForPrePass = js.Any.fromFunction0(enableSubSurfaceForPrePass))
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit class AbstractSceneMutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisableSubSurfaceForPrePass(value: () => Unit): Self = StObject.set(x, "disableSubSurfaceForPrePass", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEnableSubSurfaceForPrePass(value: () => Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "enableSubSurfaceForPrePass", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSubSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "subSurfaceConfiguration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubSurfaceConfigurationNull: Self = StObject.set(x, "subSurfaceConfiguration", null)
        
        @scala.inline
        def set_subSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "_subSurfaceConfiguration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_subSurfaceConfigurationNull: Self = StObject.set(x, "_subSurfaceConfiguration", null)
      }
    }
  }
}
