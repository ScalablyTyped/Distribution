package typings.babylonjs

import typings.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subSurfaceConfigurationMod.SubSurfaceConfiguration
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subSurfaceSceneComponentMod {
  
  @JSImport("babylonjs/Rendering/subSurfaceSceneComponent", "SubSurfaceSceneComponent")
  @js.native
  class SubSurfaceSceneComponent protected ()
    extends StObject
       with ISceneSerializableComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
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
      
      /** @hidden (Backing field) */
      var _subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
      
      /**
        * Disables the subsurface effect for prepass
        */
      def disableSubSurfaceForPrePass(): Unit
      
      /**
        * Enables the subsurface effect for prepass
        * @returns the SubSurfaceConfiguration
        */
      def enableSubSurfaceForPrePass(): Nullable[SubSurfaceConfiguration]
      
      /**
        * Gets or Sets the current prepass renderer associated to the scene.
        */
      var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
    }
    object AbstractScene {
      
      inline def apply(
        disableSubSurfaceForPrePass: () => Unit,
        enableSubSurfaceForPrePass: () => Nullable[SubSurfaceConfiguration]
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(disableSubSurfaceForPrePass = js.Any.fromFunction0(disableSubSurfaceForPrePass), enableSubSurfaceForPrePass = js.Any.fromFunction0(enableSubSurfaceForPrePass), _subSurfaceConfiguration = null, subSurfaceConfiguration = null)
        __obj.asInstanceOf[AbstractScene]
      }
      
      extension [Self <: AbstractScene](x: Self) {
        
        inline def setDisableSubSurfaceForPrePass(value: () => Unit): Self = StObject.set(x, "disableSubSurfaceForPrePass", js.Any.fromFunction0(value))
        
        inline def setEnableSubSurfaceForPrePass(value: () => Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "enableSubSurfaceForPrePass", js.Any.fromFunction0(value))
        
        inline def setSubSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "subSurfaceConfiguration", value.asInstanceOf[js.Any])
        
        inline def setSubSurfaceConfigurationNull: Self = StObject.set(x, "subSurfaceConfiguration", null)
        
        inline def set_subSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "_subSurfaceConfiguration", value.asInstanceOf[js.Any])
        
        inline def set_subSurfaceConfigurationNull: Self = StObject.set(x, "_subSurfaceConfiguration", null)
      }
    }
  }
}
