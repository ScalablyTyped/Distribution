package typings.babylonjs

import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.spriteMod.Sprite
import typings.babylonjs.textureMod.Texture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spriteManagerMod {
  
  @JSImport("babylonjs/Sprites/spriteManager", "SpriteManager")
  @js.native
  class SpriteManager protected () extends ISpriteManager {
    /**
      * Creates a new sprite manager
      * @param name defines the manager's name
      * @param imgUrl defines the sprite sheet url
      * @param capacity defines the maximum allowed number of sprites
      * @param cellSize defines the size of a sprite cell
      * @param scene defines the hosting scene
      * @param epsilon defines the epsilon value to align texture (0.01 by default)
      * @param samplingMode defines the smapling mode to use with spritesheet
      * @param fromPacked set to false; do not alter
      * @param spriteJSON null otherwise a JSON object defining sprite sheet data; do not alter
      */
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene,
      epsilon: Double
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene,
      epsilon: js.UndefOr[scala.Nothing],
      samplingMode: Double
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene,
      epsilon: Double,
      samplingMode: Double
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene,
      epsilon: js.UndefOr[scala.Nothing],
      samplingMode: js.UndefOr[scala.Nothing],
      fromPacked: Boolean
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene,
      epsilon: js.UndefOr[scala.Nothing],
      samplingMode: Double,
      fromPacked: Boolean
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene,
      epsilon: Double,
      samplingMode: js.UndefOr[scala.Nothing],
      fromPacked: Boolean
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
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
      cellSize: js.Any,
      scene: Scene,
      epsilon: js.UndefOr[scala.Nothing],
      samplingMode: js.UndefOr[scala.Nothing],
      fromPacked: js.UndefOr[scala.Nothing],
      spriteJSON: js.Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene,
      epsilon: js.UndefOr[scala.Nothing],
      samplingMode: js.UndefOr[scala.Nothing],
      fromPacked: Boolean,
      spriteJSON: js.Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene,
      epsilon: js.UndefOr[scala.Nothing],
      samplingMode: Double,
      fromPacked: js.UndefOr[scala.Nothing],
      spriteJSON: js.Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene,
      epsilon: js.UndefOr[scala.Nothing],
      samplingMode: Double,
      fromPacked: Boolean,
      spriteJSON: js.Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene,
      epsilon: Double,
      samplingMode: js.UndefOr[scala.Nothing],
      fromPacked: js.UndefOr[scala.Nothing],
      spriteJSON: js.Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene,
      epsilon: Double,
      samplingMode: js.UndefOr[scala.Nothing],
      fromPacked: Boolean,
      spriteJSON: js.Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene,
      epsilon: Double,
      samplingMode: Double,
      fromPacked: js.UndefOr[scala.Nothing],
      spriteJSON: js.Any
    ) = this()
    def this(
      /** defines the manager's name */
    name: String,
      imgUrl: String,
      capacity: Double,
      cellSize: js.Any,
      scene: Scene,
      epsilon: Double,
      samplingMode: Double,
      fromPacked: Boolean,
      spriteJSON: js.Any
    ) = this()
    
    /** Associative array from JSON sprite data file */
    var _cellData: js.Any = js.native
    
    var _checkTextureAlpha: js.Any = js.native
    
    var _customUpdate: js.Any = js.native
    
    var _fromPacked: js.Any = js.native
    
    var _makePacked: js.Any = js.native
    
    var _onDisposeObserver: js.Any = js.native
    
    /** True when packed cell data from JSON file is ready*/
    var _packedAndReady: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    /** Array of sprite names from JSON sprite data file */
    var _spriteMap: js.Any = js.native
    
    var _spriteRenderer: js.Any = js.native
    
    var _textureContent: js.Any = js.native
    
    /**
      * Blend mode use to render the particle, it can be any of
      * the static Constants.ALPHA_x properties provided in this class.
      * Default value is Constants.ALPHA_COMBINE
      */
    def blendMode: Double = js.native
    def blendMode_=(blendMode: Double): Unit = js.native
    
    /**
      * Gets the capacity of the manager
      */
    def capacity: Double = js.native
    
    /** Defines the default height of a cell in the spritesheet */
    @JSName("cellHeight")
    def cellHeight_MSpriteManager: Double = js.native
    
    /** Defines the default width of a cell in the spritesheet */
    @JSName("cellWidth")
    def cellWidth_MSpriteManager: Double = js.native
    
    /**
      * Gets the array of sprites
      */
    def children: js.Array[Sprite] = js.native
    
    /** Disables writing to the depth buffer when rendering the sprites.
      *  It can be handy to disable depth writing when using textures without alpha channel
      *  and setting some specific blend modes.
      */
    var disableDepthWrite: Boolean = js.native
    
    /** Gets or sets a boolean indicating if the manager must consider scene fog when rendering */
    def fogEnabled: Boolean = js.native
    def fogEnabled_=(value: Boolean): Unit = js.native
    
    /**
      * Returns the string "SpriteManager"
      * @returns "SpriteManager"
      */
    def getClassName(): String = js.native
    
    /**
      * An event triggered when the manager is disposed.
      */
    var onDisposeObservable: Observable[SpriteManager] = js.native
    
    /**
      * Callback called when the manager is disposed
      */
    def onDispose_=(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Gets the hosting scene
      */
    @JSName("scene")
    def scene_MSpriteManager: Scene = js.native
    
    /**
      * Serializes the sprite manager to a JSON object
      * @param serializeTexture defines if the texture must be serialized as well
      * @returns the JSON object
      */
    def serialize(): js.Any = js.native
    def serialize(serializeTexture: Boolean): js.Any = js.native
    
    /** Snippet ID if the manager was created from the snippet server */
    var snippetId: String = js.native
    
    /**
      * Gets or sets the spritesheet texture
      */
    @JSName("texture")
    def texture_MSpriteManager: Texture = js.native
    
    /**
      * Gets or sets the unique id of the sprite
      */
    var uniqueId: Double = js.native
  }
  /* static members */
  object SpriteManager {
    
    @JSImport("babylonjs/Sprites/spriteManager", "SpriteManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a sprite manager from a snippet saved by the sprite editor
      * @param snippetId defines the snippet to load (can be set to _BLANK to create a default one)
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a promise that will resolve to the new sprite manager
      */
    @JSImport("babylonjs/Sprites/spriteManager", "SpriteManager.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync(snippetId: String, scene: Scene): js.Promise[SpriteManager] = js.native
    @JSImport("babylonjs/Sprites/spriteManager", "SpriteManager.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync(snippetId: String, scene: Scene, rootUrl: String): js.Promise[SpriteManager] = js.native
    
    /**
      * Parses a JSON object to create a new sprite manager.
      * @param parsedManager The JSON object to parse
      * @param scene The scene to create the sprite managerin
      * @param rootUrl The root url to use to load external dependencies like texture
      * @returns the new sprite manager
      */
    @JSImport("babylonjs/Sprites/spriteManager", "SpriteManager.Parse")
    @js.native
    def Parse(parsedManager: js.Any, scene: Scene, rootUrl: String): SpriteManager = js.native
    
    /**
      * Creates a sprite manager from a snippet saved in a remote file
      * @param name defines the name of the sprite manager to create (can be null or empty to use the one from the json data)
      * @param url defines the url to load from
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a promise that will resolve to the new sprite manager
      */
    @JSImport("babylonjs/Sprites/spriteManager", "SpriteManager.ParseFromFileAsync")
    @js.native
    def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene): js.Promise[SpriteManager] = js.native
    @JSImport("babylonjs/Sprites/spriteManager", "SpriteManager.ParseFromFileAsync")
    @js.native
    def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene, rootUrl: String): js.Promise[SpriteManager] = js.native
    
    /** Define the Url to load snippets */
    @JSImport("babylonjs/Sprites/spriteManager", "SpriteManager.SnippetUrl")
    @js.native
    def SnippetUrl: String = js.native
    @scala.inline
    def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ISpriteManager extends IDisposable {
    
    /** Defines the default height of a cell in the spritesheet */
    var cellHeight: Double = js.native
    
    /** Defines the default width of a cell in the spritesheet */
    var cellWidth: Double = js.native
    
    /**
      * Tests the intersection of a sprite with a specific ray.
      * @param ray The ray we are sending to test the collision
      * @param camera The camera space we are sending rays in
      * @param predicate A predicate allowing excluding sprites from the list of object to test
      * @param fastCheck defines if the first intersection will be used (and not the closest)
      * @returns picking info or null.
      */
    def intersects(ray: Ray, camera: Camera): Nullable[PickingInfo] = js.native
    def intersects(ray: Ray, camera: Camera, predicate: js.UndefOr[scala.Nothing], fastCheck: Boolean): Nullable[PickingInfo] = js.native
    def intersects(ray: Ray, camera: Camera, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[PickingInfo] = js.native
    def intersects(
      ray: Ray,
      camera: Camera,
      predicate: js.Function1[/* sprite */ Sprite, Boolean],
      fastCheck: Boolean
    ): Nullable[PickingInfo] = js.native
    
    /**
      * Gets or sets a boolean indicating if the mesh can be picked (by scene.pick for instance or through actions). Default is true
      */
    var isPickable: Boolean = js.native
    
    /**
      * Restricts the camera to viewing objects with the same layerMask.
      * A camera with a layerMask of 1 will render spriteManager.layerMask & camera.layerMask!== 0
      */
    var layerMask: Double = js.native
    
    /**
      * Intersects the sprites with a ray
      * @param ray defines the ray to intersect with
      * @param camera defines the current active camera
      * @param predicate defines a predicate used to select candidate sprites
      * @returns null if no hit or a PickingInfo array
      */
    def multiIntersects(ray: Ray, camera: Camera): Nullable[js.Array[PickingInfo]] = js.native
    def multiIntersects(ray: Ray, camera: Camera, predicate: js.Function1[/* sprite */ Sprite, Boolean]): Nullable[js.Array[PickingInfo]] = js.native
    
    /**
      * Gets manager's name
      */
    var name: String = js.native
    
    /**
      * Renders the list of sprites on screen.
      */
    def render(): Unit = js.native
    
    /**
      * Specifies the rendering group id for this mesh (0 by default)
      * @see https://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered#rendering-groups
      */
    var renderingGroupId: Double = js.native
    
    /**
      * Gets the hosting scene
      */
    var scene: Scene = js.native
    
    /**
      * Defines the list of sprites managed by the manager.
      */
    var sprites: js.Array[Sprite] = js.native
    
    /**
      * Gets or sets the spritesheet texture
      */
    var texture: Texture = js.native
  }
}
