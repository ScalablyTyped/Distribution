package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpriteManager extends ISpriteManager {
  var _appendSpriteVertex: js.Any = js.native
  var _blendMode: js.Any = js.native
  var _buffer: js.Any = js.native
  var _capacity: js.Any = js.native
  /** Associative array from JSON sprite data file */
  var _cellData: js.Any = js.native
  var _effectBase: js.Any = js.native
  var _effectFog: js.Any = js.native
  var _epsilon: js.Any = js.native
  var _fromPacked: js.Any = js.native
  var _indexBuffer: js.Any = js.native
  var _makePacked: js.Any = js.native
  var _onDisposeObserver: js.Any = js.native
  /** True when packed cell data from JSON file is ready*/
  var _packedAndReady: js.Any = js.native
  var _scene: js.Any = js.native
  /** Array of sprite names from JSON sprite data file */
  var _spriteMap: js.Any = js.native
  var _spriteTexture: js.Any = js.native
  var _vertexBuffers: js.Any = js.native
  var _vertexData: js.Any = js.native
  /** Defines the default height of a cell in the spritesheet */
  var cellHeight: Double = js.native
  /** Defines the default width of a cell in the spritesheet */
  var cellWidth: Double = js.native
  /** Disables writing to the depth buffer when rendering the sprites.
    *  It can be handy to disable depth writing when using textures without alpha channel
    *  and setting some specific blend modes.
    */
  var disableDepthWrite: Boolean = js.native
  /** Gets or sets a boolean indicating if the manager must consider scene fog when rendering */
  var fogEnabled: Boolean = js.native
  /** defines the manager's name */
  var name: String = js.native
  /**
    * An event triggered when the manager is disposed.
    */
  var onDisposeObservable: Observable[SpriteManager] = js.native
  /**
    * Blend mode use to render the particle, it can be any of
    * the static Constants.ALPHA_x properties provided in this class.
    * Default value is Constants.ALPHA_COMBINE
    */
  def blendMode: Double = js.native
  def blendMode(blendMode: Double): js.Any = js.native
  /**
    * Callback called when the manager is disposed
    */
  def onDispose(callback: js.Function0[Unit]): js.Any = js.native
  /**
    * Gets or sets the spritesheet texture
    */
  def texture: Texture = js.native
  def texture(value: Texture): js.Any = js.native
}

