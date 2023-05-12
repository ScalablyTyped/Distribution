package typings.babylonjs

import typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem
import typings.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lensFlaresLensFlareSystemSceneComponentMod {
  
  @JSImport("babylonjs/LensFlares/lensFlareSystemSceneComponent", "LensFlareSystemSceneComponent")
  @js.native
  open class LensFlareSystemSceneComponent protected ()
    extends StObject
       with ISceneSerializableComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    /* private */ var _draw: Any = js.native
    
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
      
      /**
        * Adds the given lens flare system to this scene
        * @param newLensFlareSystem The lens flare system to add
        */
      def addLensFlareSystem(newLensFlareSystem: LensFlareSystem): Unit
      
      /**
        * Gets a lens flare system using its Id
        * @param id defines the Id to look for
        * @returns the lens flare system or null if not found
        * @deprecated Please use getLensFlareSystemById instead
        */
      def getLensFlareSystemByID(id: String): Nullable[LensFlareSystem]
      
      /**
        * Gets a lens flare system using its Id
        * @param id defines the Id to look for
        * @returns the lens flare system or null if not found
        */
      def getLensFlareSystemById(id: String): Nullable[LensFlareSystem]
      
      /**
        * Gets a lens flare system using its name
        * @param name defines the name to look for
        * @returns the lens flare system or null if not found
        */
      def getLensFlareSystemByName(name: String): Nullable[LensFlareSystem]
      
      /**
        * The list of lens flare system added to the scene
        * @see https://doc.babylonjs.com/features/featuresDeepDive/environment/lenseFlare
        */
      var lensFlareSystems: js.Array[LensFlareSystem]
      
      /**
        * Removes the given lens flare system from this scene.
        * @param toRemove The lens flare system to remove
        * @returns The index of the removed lens flare system
        */
      def removeLensFlareSystem(toRemove: LensFlareSystem): Double
    }
    object AbstractScene {
      
      inline def apply(
        addLensFlareSystem: LensFlareSystem => Unit,
        getLensFlareSystemByID: String => Nullable[LensFlareSystem],
        getLensFlareSystemById: String => Nullable[LensFlareSystem],
        getLensFlareSystemByName: String => Nullable[LensFlareSystem],
        lensFlareSystems: js.Array[LensFlareSystem],
        removeLensFlareSystem: LensFlareSystem => Double
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(addLensFlareSystem = js.Any.fromFunction1(addLensFlareSystem), getLensFlareSystemByID = js.Any.fromFunction1(getLensFlareSystemByID), getLensFlareSystemById = js.Any.fromFunction1(getLensFlareSystemById), getLensFlareSystemByName = js.Any.fromFunction1(getLensFlareSystemByName), lensFlareSystems = lensFlareSystems.asInstanceOf[js.Any], removeLensFlareSystem = js.Any.fromFunction1(removeLensFlareSystem))
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        inline def setAddLensFlareSystem(value: LensFlareSystem => Unit): Self = StObject.set(x, "addLensFlareSystem", js.Any.fromFunction1(value))
        
        inline def setGetLensFlareSystemByID(value: String => Nullable[LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByID", js.Any.fromFunction1(value))
        
        inline def setGetLensFlareSystemByName(value: String => Nullable[LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByName", js.Any.fromFunction1(value))
        
        inline def setLensFlareSystems(value: js.Array[LensFlareSystem]): Self = StObject.set(x, "lensFlareSystems", value.asInstanceOf[js.Any])
        
        inline def setLensFlareSystemsVarargs(value: LensFlareSystem*): Self = StObject.set(x, "lensFlareSystems", js.Array(value*))
        
        inline def setRemoveLensFlareSystem(value: LensFlareSystem => Double): Self = StObject.set(x, "removeLensFlareSystem", js.Any.fromFunction1(value))
      }
    }
  }
}
