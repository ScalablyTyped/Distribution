package typings.babylonjs

import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lensFlaresIndexMod {
  
  @JSImport("babylonjs/LensFlares/index", "LensFlare")
  @js.native
  open class LensFlare protected ()
    extends typings.babylonjs.lensFlaresLensFlareMod.LensFlare {
    /**
      * Instantiates a new Lens Flare.
      * This represents one of the lens effect in a `lensFlareSystem`.
      * It controls one of the individual texture used in the effect.
      * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
      * @param size Define the size of the lens flare in the system (a floating value between 0 and 1)
      * @param position Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
      * @param color Define the lens color
      * @param imgUrl Define the lens texture url
      * @param system Define the `lensFlareSystem` this flare is part of
      */
    def this(
      /**
      * Define the size of the lens flare in the system (a floating value between 0 and 1)
      */
    size: Double,
      /**
      * Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
      */
    position: Double,
      color: Color3,
      imgUrl: String,
      system: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem
    ) = this()
  }
  /* static members */
  object LensFlare {
    
    @JSImport("babylonjs/LensFlares/index", "LensFlare")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Lens Flare.
      * This represents one of the lens effect in a `lensFlareSystem`.
      * It controls one of the individual texture used in the effect.
      * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
      * @param size Define the size of the lens flare (a floating value between 0 and 1)
      * @param position Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
      * @param color Define the lens color
      * @param imgUrl Define the lens texture url
      * @param system Define the `lensFlareSystem` this flare is part of
      * @returns The newly created Lens Flare
      */
    inline def AddFlare(
      size: Double,
      position: Double,
      color: Color3,
      imgUrl: String,
      system: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem
    ): typings.babylonjs.lensFlaresLensFlareMod.LensFlare = (^.asInstanceOf[js.Dynamic].applyDynamic("AddFlare")(size.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], imgUrl.asInstanceOf[js.Any], system.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.lensFlaresLensFlareMod.LensFlare]
  }
  
  @JSImport("babylonjs/LensFlares/index", "LensFlareSystem")
  @js.native
  open class LensFlareSystem protected ()
    extends typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem {
    /**
      * Instantiates a lens flare system.
      * This represents a Lens Flare System or the shiny effect created by the light reflection on the  camera lenses.
      * It is usually composed of several `lensFlare`.
      * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
      * @param name Define the name of the lens flare system in the scene
      * @param emitter Define the source (the emitter) of the lens flares (it can be a camera, a light or a mesh).
      * @param scene Define the scene the lens flare system belongs to
      */
    def this(/**
      * Define the name of the lens flare system
      */
    name: String, emitter: Any, scene: Scene) = this()
  }
  /* static members */
  object LensFlareSystem {
    
    @JSImport("babylonjs/LensFlares/index", "LensFlareSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse a lens flare system from a JSON representation
      * @param parsedLensFlareSystem Define the JSON to parse
      * @param scene Define the scene the parsed system should be instantiated in
      * @param rootUrl Define the rootUrl of the load sequence to easily find a load relative dependencies such as textures
      * @returns the parsed system
      */
    inline def Parse(parsedLensFlareSystem: Any, scene: Scene, rootUrl: String): typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedLensFlareSystem.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]
    
    /**
      * @internal
      */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/LensFlares/index", "LensFlareSystemSceneComponent")
  @js.native
  open class LensFlareSystemSceneComponent protected ()
    extends typings.babylonjs.lensFlaresLensFlareSystemSceneComponentMod.LensFlareSystemSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    trait AbstractScene extends StObject {
      
      /**
        * Adds the given lens flare system to this scene
        * @param newLensFlareSystem The lens flare system to add
        */
      def addLensFlareSystem(newLensFlareSystem: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem): Unit
      
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
        * The list of lens flare system added to the scene
        * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
        */
      var lensFlareSystems: js.Array[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]
      
      /**
        * Removes the given lens flare system from this scene.
        * @param toRemove The lens flare system to remove
        * @returns The index of the removed lens flare system
        */
      def removeLensFlareSystem(toRemove: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem): Double
    }
    object AbstractScene {
      
      inline def apply(
        addLensFlareSystem: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem => Unit,
        getLensFlareSystemByID: String => Nullable[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem],
        getLensFlareSystemById: String => Nullable[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem],
        getLensFlareSystemByName: String => Nullable[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem],
        lensFlareSystems: js.Array[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem],
        removeLensFlareSystem: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem => Double
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(addLensFlareSystem = js.Any.fromFunction1(addLensFlareSystem), getLensFlareSystemByID = js.Any.fromFunction1(getLensFlareSystemByID), getLensFlareSystemById = js.Any.fromFunction1(getLensFlareSystemById), getLensFlareSystemByName = js.Any.fromFunction1(getLensFlareSystemByName), lensFlareSystems = lensFlareSystems.asInstanceOf[js.Any], removeLensFlareSystem = js.Any.fromFunction1(removeLensFlareSystem))
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        inline def setAddLensFlareSystem(value: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem => Unit): Self = StObject.set(x, "addLensFlareSystem", js.Any.fromFunction1(value))
        
        inline def setGetLensFlareSystemByID(value: String => Nullable[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByID", js.Any.fromFunction1(value))
        
        inline def setGetLensFlareSystemByName(value: String => Nullable[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByName", js.Any.fromFunction1(value))
        
        inline def setLensFlareSystems(value: js.Array[typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "lensFlareSystems", value.asInstanceOf[js.Any])
        
        inline def setLensFlareSystemsVarargs(value: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem*): Self = StObject.set(x, "lensFlareSystems", js.Array(value*))
        
        inline def setRemoveLensFlareSystem(value: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem => Double): Self = StObject.set(x, "removeLensFlareSystem", js.Any.fromFunction1(value))
      }
    }
  }
}
