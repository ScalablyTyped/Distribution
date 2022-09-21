package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SpriteManager")
@js.native
open class SpriteManager protected ()
  extends typings.babylonjs.spritesIndexMod.SpriteManager {
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
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    /** defines the manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    cellSize: Any,
    scene: typings.babylonjs.sceneMod.Scene,
    epsilon: Double
  ) = this()
  def this(
    /** defines the manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    cellSize: Any,
    scene: typings.babylonjs.sceneMod.Scene,
    epsilon: Double,
    samplingMode: Double
  ) = this()
  def this(
    /** defines the manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    cellSize: Any,
    scene: typings.babylonjs.sceneMod.Scene,
    epsilon: Unit,
    samplingMode: Double
  ) = this()
  def this(
    /** defines the manager's name */
  name: String,
    imgUrl: String,
    capacity: Double,
    cellSize: Any,
    scene: typings.babylonjs.sceneMod.Scene,
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
    scene: typings.babylonjs.sceneMod.Scene,
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
    scene: typings.babylonjs.sceneMod.Scene,
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
    scene: typings.babylonjs.sceneMod.Scene,
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
    scene: typings.babylonjs.sceneMod.Scene,
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
    scene: typings.babylonjs.sceneMod.Scene,
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
    scene: typings.babylonjs.sceneMod.Scene,
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
    scene: typings.babylonjs.sceneMod.Scene,
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
    scene: typings.babylonjs.sceneMod.Scene,
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
    scene: typings.babylonjs.sceneMod.Scene,
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
    scene: typings.babylonjs.sceneMod.Scene,
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
    scene: typings.babylonjs.sceneMod.Scene,
    epsilon: Unit,
    samplingMode: Unit,
    fromPacked: Unit,
    spriteJSON: Any
  ) = this()
}
/* static members */
object SpriteManager {
  
  @JSImport("babylonjs/index", "SpriteManager")
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
  @JSImport("babylonjs/index", "SpriteManager.CreateFromSnippetAsync")
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
  inline def Parse(parsedManager: Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.spriteManagerMod.SpriteManager = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedManager.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.spriteManagerMod.SpriteManager]
  
  /**
    * Creates a sprite manager from a snippet saved in a remote file
    * @param name defines the name of the sprite manager to create (can be null or empty to use the one from the json data)
    * @param url defines the url to load from
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a promise that will resolve to the new sprite manager
    */
  inline def ParseFromFileAsync(name: Nullable[String], url: String, scene: typings.babylonjs.sceneMod.Scene): js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager]]
  inline def ParseFromFileAsync(name: Nullable[String], url: String, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager]]
  
  /**
    * Creates a sprite manager from a snippet saved by the sprite editor
    * @param snippetId defines the snippet to load (can be set to _BLANK to create a default one)
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a promise that will resolve to the new sprite manager
    */
  inline def ParseFromSnippetAsync(snippetId: String, scene: typings.babylonjs.sceneMod.Scene): js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager]]
  inline def ParseFromSnippetAsync(snippetId: String, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.spriteManagerMod.SpriteManager]]
  
  /** Define the Url to load snippets */
  @JSImport("babylonjs/index", "SpriteManager.SnippetUrl")
  @js.native
  def SnippetUrl: String = js.native
  inline def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
}
