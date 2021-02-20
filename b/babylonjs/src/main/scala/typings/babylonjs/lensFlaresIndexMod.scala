package typings.babylonjs

import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lensFlaresIndexMod {
  
  @JSImport("babylonjs/LensFlares/index", "LensFlare")
  @js.native
  class LensFlare protected ()
    extends typings.babylonjs.lensFlareMod.LensFlare {
    /**
      * Instantiates a new Lens Flare.
      * This represents one of the lens effect in a `lensFlareSystem`.
      * It controls one of the indiviual texture used in the effect.
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
      system: typings.babylonjs.lensFlareSystemMod.LensFlareSystem
    ) = this()
  }
  /* static members */
  object LensFlare {
    
    /**
      * Creates a new Lens Flare.
      * This represents one of the lens effect in a `lensFlareSystem`.
      * It controls one of the indiviual texture used in the effect.
      * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
      * @param size Define the size of the lens flare (a floating value between 0 and 1)
      * @param position Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
      * @param color Define the lens color
      * @param imgUrl Define the lens texture url
      * @param system Define the `lensFlareSystem` this flare is part of
      * @returns The newly created Lens Flare
      */
    @JSImport("babylonjs/LensFlares/index", "LensFlare.AddFlare")
    @js.native
    def AddFlare(
      size: Double,
      position: Double,
      color: Color3,
      imgUrl: String,
      system: typings.babylonjs.lensFlareSystemMod.LensFlareSystem
    ): typings.babylonjs.lensFlareMod.LensFlare = js.native
  }
  
  @JSImport("babylonjs/LensFlares/index", "LensFlareSystem")
  @js.native
  class LensFlareSystem protected ()
    extends typings.babylonjs.lensFlareSystemMod.LensFlareSystem {
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
    name: String, emitter: js.Any, scene: Scene) = this()
  }
  /* static members */
  object LensFlareSystem {
    
    /**
      * Parse a lens flare system from a JSON repressentation
      * @param parsedLensFlareSystem Define the JSON to parse
      * @param scene Define the scene the parsed system should be instantiated in
      * @param rootUrl Define the rootUrl of the load sequence to easily find a load relative dependencies such as textures
      * @returns the parsed system
      */
    @JSImport("babylonjs/LensFlares/index", "LensFlareSystem.Parse")
    @js.native
    def Parse(parsedLensFlareSystem: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.lensFlareSystemMod.LensFlareSystem = js.native
    
    /** @hidden */
    @JSImport("babylonjs/LensFlares/index", "LensFlareSystem._SceneComponentInitialization")
    @js.native
    def _SceneComponentInitialization(scene: Scene): Unit = js.native
  }
  
  @JSImport("babylonjs/LensFlares/index", "LensFlareSystemSceneComponent")
  @js.native
  class LensFlareSystemSceneComponent protected ()
    extends typings.babylonjs.lensFlareSystemSceneComponentMod.LensFlareSystemSceneComponent {
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
      
      /**
        * Adds the given lens flare system to this scene
        * @param newLensFlareSystem The lens flare system to add
        */
      def addLensFlareSystem(newLensFlareSystem: typings.babylonjs.lensFlareSystemMod.LensFlareSystem): Unit = js.native
      
      /**
        * Gets a lens flare system using its id
        * @param id defines the id to look for
        * @returns the lens flare system or null if not found
        */
      def getLensFlareSystemByID(id: String): Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem] = js.native
      
      /**
        * Gets a lens flare system using its name
        * @param name defines the name to look for
        * @returns the lens flare system or null if not found
        */
      def getLensFlareSystemByName(name: String): Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem] = js.native
      
      /**
        * The list of lens flare system added to the scene
        * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
        */
      var lensFlareSystems: js.Array[typings.babylonjs.lensFlareSystemMod.LensFlareSystem] = js.native
      
      /**
        * Removes the given lens flare system from this scene.
        * @param toRemove The lens flare system to remove
        * @returns The index of the removed lens flare system
        */
      def removeLensFlareSystem(toRemove: typings.babylonjs.lensFlareSystemMod.LensFlareSystem): Double = js.native
    }
    object AbstractScene {
      
      @scala.inline
      def apply(
        addLensFlareSystem: typings.babylonjs.lensFlareSystemMod.LensFlareSystem => Unit,
        getLensFlareSystemByID: String => Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem],
        getLensFlareSystemByName: String => Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem],
        lensFlareSystems: js.Array[typings.babylonjs.lensFlareSystemMod.LensFlareSystem],
        removeLensFlareSystem: typings.babylonjs.lensFlareSystemMod.LensFlareSystem => Double
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(addLensFlareSystem = js.Any.fromFunction1(addLensFlareSystem), getLensFlareSystemByID = js.Any.fromFunction1(getLensFlareSystemByID), getLensFlareSystemByName = js.Any.fromFunction1(getLensFlareSystemByName), lensFlareSystems = lensFlareSystems.asInstanceOf[js.Any], removeLensFlareSystem = js.Any.fromFunction1(removeLensFlareSystem))
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit class AbstractSceneMutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddLensFlareSystem(value: typings.babylonjs.lensFlareSystemMod.LensFlareSystem => Unit): Self = StObject.set(x, "addLensFlareSystem", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetLensFlareSystemByID(value: String => Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByID", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetLensFlareSystemByName(value: String => Nullable[typings.babylonjs.lensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByName", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLensFlareSystems(value: js.Array[typings.babylonjs.lensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "lensFlareSystems", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLensFlareSystemsVarargs(value: typings.babylonjs.lensFlareSystemMod.LensFlareSystem*): Self = StObject.set(x, "lensFlareSystems", js.Array(value :_*))
        
        @scala.inline
        def setRemoveLensFlareSystem(value: typings.babylonjs.lensFlareSystemMod.LensFlareSystem => Double): Self = StObject.set(x, "removeLensFlareSystem", js.Any.fromFunction1(value))
      }
    }
  }
}
