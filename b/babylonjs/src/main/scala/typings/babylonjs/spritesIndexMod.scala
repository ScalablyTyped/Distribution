package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.ispritesMod.ISpriteJSONAtlas
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.spriteManagerMod.ISpriteManager
import typings.babylonjs.spriteMapMod.ISpriteMapOptions
import typings.babylonjs.textureMod.Texture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spritesIndexMod {
  
  @JSImport("babylonjs/Sprites/index", "Sprite")
  @js.native
  open class Sprite protected ()
    extends typings.babylonjs.spriteMod.Sprite {
    /**
      * Creates a new Sprite
      * @param name defines the name
      * @param manager defines the manager
      */
    def this(/** defines the name */
    name: String, manager: ISpriteManager) = this()
  }
  /* static members */
  object Sprite {
    
    @JSImport("babylonjs/Sprites/index", "Sprite")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parses a JSON object to create a new sprite
      * @param parsedSprite The JSON object to parse
      * @param manager defines the hosting manager
      * @returns the new sprite
      */
    inline def Parse(parsedSprite: Any, manager: typings.babylonjs.spriteManagerMod.SpriteManager): typings.babylonjs.spriteMod.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedSprite.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.spriteMod.Sprite]
  }
  
  @JSImport("babylonjs/Sprites/index", "SpriteManager")
  @js.native
  open class SpriteManager protected ()
    extends typings.babylonjs.spriteManagerMod.SpriteManager {
    /**
      * Creates a new sprite manager
      * @param name defines the manager's name
      * @param imgUrl defines the sprite sheet url
      * @param capacity defines the maximum allowed number of sprites
      * @param cellSize defines the size of a sprite cell
      * @param scene defines the hosting scene
      * @param epsilon defines the epsilon value to align texture (0.01 by default)
      * @param samplingMode defines the sampling mode to use with spritesheet
      * @param fromPacked set to false; do not alter
      * @param spriteJSON null otherwise a JSON object defining sprite sheet data; do not alter
      */
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Double
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Double,
      samplingMode: Double
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Unit,
      samplingMode: Double
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Double,
      samplingMode: Double,
      fromPacked: Boolean
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Double,
      samplingMode: Unit,
      fromPacked: Boolean
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Unit,
      samplingMode: Double,
      fromPacked: Boolean
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Unit,
      samplingMode: Unit,
      fromPacked: Boolean
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Double,
      samplingMode: Double,
      fromPacked: Boolean,
      spriteJSON: Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Double,
      samplingMode: Double,
      fromPacked: Unit,
      spriteJSON: Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Double,
      samplingMode: Unit,
      fromPacked: Boolean,
      spriteJSON: Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Double,
      samplingMode: Unit,
      fromPacked: Unit,
      spriteJSON: Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Unit,
      samplingMode: Double,
      fromPacked: Boolean,
      spriteJSON: Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Unit,
      samplingMode: Double,
      fromPacked: Unit,
      spriteJSON: Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Unit,
      samplingMode: Unit,
      fromPacked: Boolean,
      spriteJSON: Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: Any,
      scene: Scene,
      epsilon: Unit,
      samplingMode: Unit,
      fromPacked: Unit,
      spriteJSON: Any
    ) = this()
  }
  /* static members */
  object SpriteManager {
    
    @JSImport("babylonjs/Sprites/index", "SpriteManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a sprite manager from a snippet saved by the sprite editor
      * @deprecated Please use ParseFromSnippetAsync instead
      * @param snippetId defines the snippet to load (can be set to _BLANK to create a default one)
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a promise that will resolve to the new sprite manager
      */
    @JSImport("babylonjs/Sprites/index", "SpriteManager.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpriteManager.ParseFromSnippetAsync */ Any = js.native
    inline def CreateFromSnippetAsync_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpriteManager.ParseFromSnippetAsync */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateFromSnippetAsync")(x.asInstanceOf[js.Any])
    
    /**
      * Parses a JSON object to create a new sprite manager.
      * @param parsedManager The JSON object to parse
      * @param scene The scene to create the sprite manager
      * @param rootUrl The root url to use to load external dependencies like texture
      * @returns the new sprite manager
      */
    inline def Parse(parsedManager: Any, scene: Scene, rootUrl: String): typings.babylonjs.spriteManagerMod.SpriteManager = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedManager.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.spriteManagerMod.SpriteManager]
    
    /**
      * Creates a sprite manager from a snippet saved in a remote file
      * @param name defines the name of the sprite manager to create (can be null or empty to use the one from the json data)
      * @param url defines the url to load from
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a promise that will resolve to the new sprite manager
      */
    inline def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene): js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager]]
    inline def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene, rootUrl: String): js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager]]
    
    /**
      * Creates a sprite manager from a snippet saved by the sprite editor
      * @param snippetId defines the snippet to load (can be set to _BLANK to create a default one)
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a promise that will resolve to the new sprite manager
      */
    inline def ParseFromSnippetAsync(snippetId: String, scene: Scene): js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager]]
    inline def ParseFromSnippetAsync(snippetId: String, scene: Scene, rootUrl: String): js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager]]
    
    /** Define the Url to load snippets */
    @JSImport("babylonjs/Sprites/index", "SpriteManager.SnippetUrl")
    @js.native
    def SnippetUrl: String = js.native
    inline def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Sprites/index", "SpriteMap")
  @js.native
  open class SpriteMap protected ()
    extends typings.babylonjs.spriteMapMod.SpriteMap {
    /**
      * Creates a new SpriteMap
      * @param name defines the SpriteMaps Name
      * @param atlasJSON is the JSON file that controls the Sprites Frames and Meta
      * @param spriteSheet is the Texture that the Sprites are on.
      * @param options a basic deployment configuration
      * @param scene The Scene that the map is deployed on
      */
    def this(
      name: String,
      atlasJSON: ISpriteJSONAtlas,
      spriteSheet: Texture,
      options: ISpriteMapOptions,
      scene: Scene
    ) = this()
  }
  
  @JSImport("babylonjs/Sprites/index", "SpritePackedManager")
  @js.native
  open class SpritePackedManager protected ()
    extends typings.babylonjs.spritePackedManagerMod.SpritePackedManager {
    /**
      * Creates a new sprite manager from a packed sprite sheet
      * @param name defines the manager's name
      * @param imgUrl defines the sprite sheet url
      * @param capacity defines the maximum allowed number of sprites
      * @param scene defines the hosting scene
      * @param spriteJSON null otherwise a JSON object defining sprite sheet data
      * @param epsilon defines the epsilon value to align texture (0.01 by default)
      * @param samplingMode defines the sampling mode to use with spritesheet
      * @param fromPacked set to true; do not alter
      */
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: String
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: String,
      epsilon: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: Null,
      epsilon: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: Unit,
      epsilon: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: String,
      epsilon: Double,
      samplingMode: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: String,
      epsilon: Unit,
      samplingMode: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: Null,
      epsilon: Double,
      samplingMode: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: Null,
      epsilon: Unit,
      samplingMode: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: Unit,
      epsilon: Double,
      samplingMode: Double
    ) = this()
    def this(
      /** defines the packed manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      scene: Scene,
      spriteJSON: Unit,
      epsilon: Unit,
      samplingMode: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Sprites/index", "SpriteSceneComponent")
  @js.native
  open class SpriteSceneComponent protected ()
    extends typings.babylonjs.spriteSceneComponentMod.SpriteSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @internal */
      def _internalMultiPickSprites(ray: Ray): Nullable[js.Array[PickingInfo]] = js.native
      def _internalMultiPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
      def _internalMultiPickSprites(
        ray: Ray,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
        camera: Camera
      ): Nullable[js.Array[PickingInfo]] = js.native
      def _internalMultiPickSprites(ray: Ray, predicate: Unit, camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      
      /** @internal */
      def _internalPickSprites(ray: Ray): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean]): Nullable[PickingInfo] = js.native
      def _internalPickSprites(
        ray: Ray,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
        fastCheck: Boolean
      ): Nullable[PickingInfo] = js.native
      def _internalPickSprites(
        ray: Ray,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
        fastCheck: Boolean,
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def _internalPickSprites(
        ray: Ray,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
        fastCheck: Unit,
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: Unit, fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: Unit, fastCheck: Boolean, camera: Camera): Nullable[PickingInfo] = js.native
      def _internalPickSprites(ray: Ray, predicate: Unit, fastCheck: Unit, camera: Camera): Nullable[PickingInfo] = js.native
      
      /** @internal */
      var _pickedDownSprite: Nullable[typings.babylonjs.spriteMod.Sprite] = js.native
      
      /** @internal */
      var _pointerOverSprite: Nullable[typings.babylonjs.spriteMod.Sprite] = js.native
      
      /** @internal */
      var _tempSpritePickingRay: Nullable[Ray] = js.native
      
      /**
        * Gets the sprite under the pointer
        * @returns a Sprite or null if no sprite is under the pointer
        */
      def getPointerOverSprite(): Nullable[typings.babylonjs.spriteMod.Sprite] = js.native
      
      /** Launch a ray to try to pick sprites in the scene
        * @param x position on screen
        * @param y position on screen
        * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
        * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
        * @returns a PickingInfo array
        */
      def multiPickSprite(x: Double, y: Double): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSprite(
        x: Double,
        y: Double,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean]
      ): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSprite(
        x: Double,
        y: Double,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
        camera: Camera
      ): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSprite(x: Double, y: Double, predicate: Unit, camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      
      /** Use the given ray to pick sprites in the scene
        * @param ray The ray (in world space) to use to pick meshes
        * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
        * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
        * @returns a PickingInfo array
        */
      def multiPickSpriteWithRay(ray: Ray): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSpriteWithRay(
        ray: Ray,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
        camera: Camera
      ): Nullable[js.Array[PickingInfo]] = js.native
      def multiPickSpriteWithRay(ray: Ray, predicate: Unit, camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
      
      /**
        * An event triggered when sprites rendering is done
        * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
        */
      var onAfterSpritesRenderingObservable: Observable[typings.babylonjs.spriteSceneComponentMod.babylonjsSceneAugmentingMod.Scene] = js.native
      
      /**
        * An event triggered when sprites rendering is about to start
        * Note: This event can be trigger more than once per frame (because sprites can be rendered by render target textures as well)
        */
      var onBeforeSpritesRenderingObservable: Observable[typings.babylonjs.spriteSceneComponentMod.babylonjsSceneAugmentingMod.Scene] = js.native
      
      /** Launch a ray to try to pick a sprite in the scene
        * @param x position on screen
        * @param y position on screen
        * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
        * @param fastCheck defines if the first intersection will be used (and not the closest)
        * @param camera camera to use for computing the picking ray. Can be set to null. In this case, the scene.activeCamera will be used
        * @returns a PickingInfo
        */
      def pickSprite(x: Double, y: Double): Nullable[PickingInfo] = js.native
      def pickSprite(
        x: Double,
        y: Double,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean]
      ): Nullable[PickingInfo] = js.native
      def pickSprite(
        x: Double,
        y: Double,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
        fastCheck: Boolean
      ): Nullable[PickingInfo] = js.native
      def pickSprite(
        x: Double,
        y: Double,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
        fastCheck: Boolean,
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def pickSprite(
        x: Double,
        y: Double,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
        fastCheck: Unit,
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def pickSprite(x: Double, y: Double, predicate: Unit, fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def pickSprite(x: Double, y: Double, predicate: Unit, fastCheck: Boolean, camera: Camera): Nullable[PickingInfo] = js.native
      def pickSprite(x: Double, y: Double, predicate: Unit, fastCheck: Unit, camera: Camera): Nullable[PickingInfo] = js.native
      
      /** Use the given ray to pick a sprite in the scene
        * @param ray The ray (in world space) to use to pick meshes
        * @param predicate Predicate function used to determine eligible sprites. Can be set to null. In this case, a sprite must have isPickable set to true
        * @param fastCheck defines if the first intersection will be used (and not the closest)
        * @param camera camera to use. Can be set to null. In this case, the scene.activeCamera will be used
        * @returns a PickingInfo
        */
      def pickSpriteWithRay(ray: Ray): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean]): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(
        ray: Ray,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
        fastCheck: Boolean
      ): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(
        ray: Ray,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
        fastCheck: Boolean,
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(
        ray: Ray,
        predicate: js.Function1[/* sprite */ typings.babylonjs.spriteMod.Sprite, Boolean],
        fastCheck: Unit,
        camera: Camera
      ): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: Unit, fastCheck: Boolean): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: Unit, fastCheck: Boolean, camera: Camera): Nullable[PickingInfo] = js.native
      def pickSpriteWithRay(ray: Ray, predicate: Unit, fastCheck: Unit, camera: Camera): Nullable[PickingInfo] = js.native
      
      /**
        * Force the sprite under the pointer
        * @param sprite defines the sprite to use
        */
      def setPointerOverSprite(sprite: Nullable[typings.babylonjs.spriteMod.Sprite]): Unit = js.native
      
      /**
        * All of the sprite managers added to this scene
        * @see https://doc.babylonjs.com/babylon101/sprites
        */
      var spriteManagers: js.Array[ISpriteManager] = js.native
    }
  }
}
