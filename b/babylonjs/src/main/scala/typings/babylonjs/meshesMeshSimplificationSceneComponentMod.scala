package typings.babylonjs

import typings.babylonjs.meshesMeshSimplificationMod.ISimplificationSettings
import typings.babylonjs.meshesMeshSimplificationMod.SimplificationQueue
import typings.babylonjs.meshesMeshSimplificationMod.SimplificationType
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesMeshSimplificationSceneComponentMod {
  
  @JSImport("babylonjs/Meshes/meshSimplificationSceneComponent", "SimplicationQueueSceneComponent")
  @js.native
  open class SimplicationQueueSceneComponent protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    /* private */ var _beforeCameraUpdate: Any = js.native
    
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
      def simplify(settings: js.Array[ISimplificationSettings], parallelProcessing: Boolean): Mesh = js.native
      def simplify(
        settings: js.Array[ISimplificationSettings],
        parallelProcessing: Boolean,
        simplificationType: Unit,
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
      def simplify(
        settings: js.Array[ISimplificationSettings],
        parallelProcessing: Unit,
        simplificationType: Unit,
        successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
      ): Mesh = js.native
      def simplify(
        settings: js.Array[ISimplificationSettings],
        parallelProcessing: Unit,
        simplificationType: SimplificationType
      ): Mesh = js.native
      def simplify(
        settings: js.Array[ISimplificationSettings],
        parallelProcessing: Unit,
        simplificationType: SimplificationType,
        successCallback: js.Function2[/* mesh */ js.UndefOr[this.type], /* submeshIndex */ js.UndefOr[Double], Unit]
      ): Mesh = js.native
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /** @internal (Backing field) */
      var _simplificationQueue: SimplificationQueue
      
      /**
        * Gets or sets the simplification queue attached to the scene
        * @see https://doc.babylonjs.com/how_to/in-browser_mesh_simplification
        */
      var simplificationQueue: SimplificationQueue
    }
    object Scene {
      
      inline def apply(_simplificationQueue: SimplificationQueue, simplificationQueue: SimplificationQueue): typings.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_simplificationQueue = _simplificationQueue.asInstanceOf[js.Any], simplificationQueue = simplificationQueue.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.meshesMeshSimplificationSceneComponentMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        inline def setSimplificationQueue(value: SimplificationQueue): Self = StObject.set(x, "simplificationQueue", value.asInstanceOf[js.Any])
        
        inline def set_simplificationQueue(value: SimplificationQueue): Self = StObject.set(x, "_simplificationQueue", value.asInstanceOf[js.Any])
      }
    }
  }
}
