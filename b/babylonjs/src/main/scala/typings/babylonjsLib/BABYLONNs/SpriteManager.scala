package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to manage multiple sprites on the same spritesheet
     * @see http://doc.babylonjs.com/babylon101/sprites
     */
@JSGlobal("BABYLON.SpriteManager")
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
           */
  def this(/** defines the manager's name */
  name: java.lang.String, imgUrl: java.lang.String, capacity: scala.Double, cellSize: js.Any, scene: Scene) = this()
  /**
           * Creates a new sprite manager
           * @param name defines the manager's name
           * @param imgUrl defines the sprite sheet url
           * @param capacity defines the maximum allowed number of sprites
           * @param cellSize defines the size of a sprite cell
           * @param scene defines the hosting scene
           * @param epsilon defines the epsilon value to align texture (0.01 by default)
           * @param samplingMode defines the smapling mode to use with spritesheet
           */
  def this(/** defines the manager's name */
  name: java.lang.String, imgUrl: java.lang.String, capacity: scala.Double, cellSize: js.Any, scene: Scene, epsilon: scala.Double) = this()
  /**
           * Creates a new sprite manager
           * @param name defines the manager's name
           * @param imgUrl defines the sprite sheet url
           * @param capacity defines the maximum allowed number of sprites
           * @param cellSize defines the size of a sprite cell
           * @param scene defines the hosting scene
           * @param epsilon defines the epsilon value to align texture (0.01 by default)
           * @param samplingMode defines the smapling mode to use with spritesheet
           */
  def this(/** defines the manager's name */
  name: java.lang.String, imgUrl: java.lang.String, capacity: scala.Double, cellSize: js.Any, scene: Scene, epsilon: scala.Double, samplingMode: scala.Double) = this()
  var _appendSpriteVertex: js.Any = js.native
  var _buffer: js.Any = js.native
  var _capacity: js.Any = js.native
  var _effectBase: js.Any = js.native
  var _effectFog: js.Any = js.native
  var _epsilon: js.Any = js.native
  var _indexBuffer: js.Any = js.native
  var _onDisposeObserver: js.Any = js.native
  var _scene: js.Any = js.native
  var _spriteTexture: js.Any = js.native
  var _vertexBuffers: js.Any = js.native
  var _vertexData: js.Any = js.native
  /** Defines the default height of a cell in the spritesheet */
  var cellHeight: scala.Double = js.native
  /** Defines the default width of a cell in the spritesheet */
  var cellWidth: scala.Double = js.native
  /** Gets or sets a boolean indicating if the manager must consider scene fog when rendering */
  var fogEnabled: scala.Boolean = js.native
  /** defines the manager's name */
  var name: java.lang.String = js.native
  /**
          * An event triggered when the manager is disposed.
          */
  var onDisposeObservable: Observable[SpriteManager] = js.native
  /**
           * Gets or sets the spritesheet texture
           */
  var texture: Texture = js.native
  /**
           * Releases all held resources
           */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
           * Callback called when the manager is disposed
           */
  def onDispose(): scala.Unit = js.native
}

