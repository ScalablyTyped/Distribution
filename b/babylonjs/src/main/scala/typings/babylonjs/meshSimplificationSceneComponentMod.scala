package typings.babylonjs

import typings.babylonjs.meshSimplificationMod.ISimplificationSettings
import typings.babylonjs.meshSimplificationMod.SimplificationQueue
import typings.babylonjs.meshSimplificationMod.SimplificationType
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshSimplificationSceneComponentMod {
  
  @JSImport("babylonjs/Meshes/meshSimplificationSceneComponent", "SimplicationQueueSceneComponent")
  @js.native
  class SimplicationQueueSceneComponent protected () extends ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _beforeCameraUpdate: js.Any = js.native
  }
  
  /* augmented module */
  object babylonjsMeshesMeshAugmentingMod {
    
    @js.native
    trait Mesh extends StObject {
      
      /**
        * Simplify the mesh according to the given array of settings.
        * Function will return immediately and will simplify async
        * @param settings a collection of simplification settings
        * @param parallelProcessing should all levels calculate parallel or one after the other
        * @param simplificationType the type of simplification to run
        * @param successCallback optional success callback to be called after the simplification finished processing all settings
        * @returns the current mesh
        */
      def simplify(settings: js.Array[ISimplificationSettings]): Mesh = js.native
      def simplify(
        settings: js.Array[ISimplificationSettings],
        parallelProcessing: js.UndefOr[scala.Nothing],
        simplificationType: js.UndefOr[scala.Nothing],
        successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
      ): Mesh = js.native
      def simplify(
        settings: js.Array[ISimplificationSettings],
        parallelProcessing: js.UndefOr[scala.Nothing],
        simplificationType: SimplificationType
      ): Mesh = js.native
      def simplify(
        settings: js.Array[ISimplificationSettings],
        parallelProcessing: js.UndefOr[scala.Nothing],
        simplificationType: SimplificationType,
        successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
      ): Mesh = js.native
      def simplify(settings: js.Array[ISimplificationSettings], parallelProcessing: Boolean): Mesh = js.native
      def simplify(
        settings: js.Array[ISimplificationSettings],
        parallelProcessing: Boolean,
        simplificationType: js.UndefOr[scala.Nothing],
        successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
      ): Mesh = js.native
      def simplify(
        settings: js.Array[ISimplificationSettings],
        parallelProcessing: Boolean,
        simplificationType: SimplificationType
      ): Mesh = js.native
      def simplify(
        settings: js.Array[ISimplificationSettings],
        parallelProcessing: Boolean,
        simplificationType: SimplificationType,
        successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
      ): Mesh = js.native
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @hidden (Backing field) */
      var _simplificationQueue: SimplificationQueue = js.native
      
      /**
        * Gets or sets the simplification queue attached to the scene
        * @see https://doc.babylonjs.com/how_to/in-browser_mesh_simplification
        */
      var simplificationQueue: SimplificationQueue = js.native
    }
    object Scene {
      
      @scala.inline
      def apply(_simplificationQueue: SimplificationQueue, simplificationQueue: SimplificationQueue): typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_simplificationQueue = _simplificationQueue.asInstanceOf[js.Any], simplificationQueue = simplificationQueue.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit class SceneMutableBuilder[Self <: typings.babylonjs.meshSimplificationSceneComponentMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSimplificationQueue(value: SimplificationQueue): Self = StObject.set(x, "simplificationQueue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_simplificationQueue(value: SimplificationQueue): Self = StObject.set(x, "_simplificationQueue", value.asInstanceOf[js.Any])
      }
    }
  }
}
