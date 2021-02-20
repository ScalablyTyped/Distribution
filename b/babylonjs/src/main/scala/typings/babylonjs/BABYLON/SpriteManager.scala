package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpriteManager extends ISpriteManager {
  
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
