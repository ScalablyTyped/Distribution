package typings.babylonjs

import typings.babylonjs.lensFlareSystemMod.LensFlareSystem
import typings.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lensFlareSystemSceneComponentMod {
  
  @JSImport("babylonjs/LensFlares/lensFlareSystemSceneComponent", "LensFlareSystemSceneComponent")
  @js.native
  class LensFlareSystemSceneComponent protected () extends ISceneSerializableComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    var _draw: js.Any = js.native
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    @js.native
    trait AbstractScene extends StObject {
      
      /**
        * Adds the given lens flare system to this scene
        * @param newLensFlareSystem The lens flare system to add
        */
      def addLensFlareSystem(newLensFlareSystem: LensFlareSystem): Unit = js.native
      
      /**
        * Gets a lens flare system using its id
        * @param id defines the id to look for
        * @returns the lens flare system or null if not found
        */
      def getLensFlareSystemByID(id: String): Nullable[LensFlareSystem] = js.native
      
      /**
        * Gets a lens flare system using its name
        * @param name defines the name to look for
        * @returns the lens flare system or null if not found
        */
      def getLensFlareSystemByName(name: String): Nullable[LensFlareSystem] = js.native
      
      /**
        * The list of lens flare system added to the scene
        * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
        */
      var lensFlareSystems: js.Array[LensFlareSystem] = js.native
      
      /**
        * Removes the given lens flare system from this scene.
        * @param toRemove The lens flare system to remove
        * @returns The index of the removed lens flare system
        */
      def removeLensFlareSystem(toRemove: LensFlareSystem): Double = js.native
    }
    object AbstractScene {
      
      @scala.inline
      def apply(
        addLensFlareSystem: LensFlareSystem => Unit,
        getLensFlareSystemByID: String => Nullable[LensFlareSystem],
        getLensFlareSystemByName: String => Nullable[LensFlareSystem],
        lensFlareSystems: js.Array[LensFlareSystem],
        removeLensFlareSystem: LensFlareSystem => Double
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(addLensFlareSystem = js.Any.fromFunction1(addLensFlareSystem), getLensFlareSystemByID = js.Any.fromFunction1(getLensFlareSystemByID), getLensFlareSystemByName = js.Any.fromFunction1(getLensFlareSystemByName), lensFlareSystems = lensFlareSystems.asInstanceOf[js.Any], removeLensFlareSystem = js.Any.fromFunction1(removeLensFlareSystem))
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit class AbstractSceneMutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddLensFlareSystem(value: LensFlareSystem => Unit): Self = StObject.set(x, "addLensFlareSystem", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetLensFlareSystemByID(value: String => Nullable[LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByID", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetLensFlareSystemByName(value: String => Nullable[LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByName", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLensFlareSystems(value: js.Array[LensFlareSystem]): Self = StObject.set(x, "lensFlareSystems", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLensFlareSystemsVarargs(value: LensFlareSystem*): Self = StObject.set(x, "lensFlareSystems", js.Array(value :_*))
        
        @scala.inline
        def setRemoveLensFlareSystem(value: LensFlareSystem => Double): Self = StObject.set(x, "removeLensFlareSystem", js.Any.fromFunction1(value))
      }
    }
  }
}
