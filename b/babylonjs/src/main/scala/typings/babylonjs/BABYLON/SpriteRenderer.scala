package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpriteRenderer extends StObject {
  
  /* private */ var _appendSpriteVertex: Any = js.native
  
  /* private */ var _buffer: Any = js.native
  
  /* private */ var _buildIndexBuffer: Any = js.native
  
  /* private */ val _capacity: Any = js.native
  
  /* private */ var _createEffects: Any = js.native
  
  /* private */ var _drawWrapperBase: Any = js.native
  
  /* private */ var _drawWrapperDepth: Any = js.native
  
  /* private */ var _drawWrapperFog: Any = js.native
  
  /* private */ var _drawWrapperFogDepth: Any = js.native
  
  /* private */ val _engine: Any = js.native
  
  /* private */ val _epsilon: Any = js.native
  
  /* private */ var _indexBuffer: Any = js.native
  
  /* private */ var _pixelPerfect: Any = js.native
  
  /* private */ val _scene: Any = js.native
  
  /* private */ var _spriteBuffer: Any = js.native
  
  /* private */ val _useInstancing: Any = js.native
  
  /* private */ val _useVAO: Any = js.native
  
  /* private */ var _vertexArrayObject: Any = js.native
  
  /* private */ var _vertexBufferSize: Any = js.native
  
  /* private */ var _vertexBuffers: Any = js.native
  
  /* private */ var _vertexData: Any = js.native
  
  /**
    * Gets or sets a boolean indicating if alpha mode is automatically
    * reset.
    */
  var autoResetAlpha: Boolean = js.native
  
  /**
    * Blend mode use to render the particle, it can be any of
    * the static Constants.ALPHA_x properties provided in this class.
    * Default value is Constants.ALPHA_COMBINE
    */
  var blendMode: Double = js.native
  
  /**
    * Gets the capacity of the manager
    */
  def capacity: Double = js.native
  
  /**
    * Defines the default height of a cell in the spritesheet
    */
  var cellHeight: Double = js.native
  
  /**
    * Defines the default width of a cell in the spritesheet
    */
  var cellWidth: Double = js.native
  
  /**
    * Disables writing to the depth buffer when rendering the sprites.
    * It can be handy to disable depth writing when using textures without alpha channel
    * and setting some specific blend modes.
    */
  var disableDepthWrite: Boolean = js.native
  
  /**
    * Release associated resources
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if the manager must consider scene fog when rendering
    */
  var fogEnabled: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if the renderer must render sprites with pixel perfect rendering
    * Note that pixel perfect mode is not supported in WebGL 1
    */
  def pixelPerfect: Boolean = js.native
  def pixelPerfect_=(value: Boolean): Unit = js.native
  
  /**
    * Rebuilds the renderer (after a context lost, for eg)
    */
  def rebuild(): Unit = js.native
  
  /**
    * Render all child sprites
    * @param sprites defines the list of sprites to render
    * @param deltaTime defines the time since last frame
    * @param viewMatrix defines the viewMatrix to use to render the sprites
    * @param projectionMatrix defines the projectionMatrix to use to render the sprites
    * @param customSpriteUpdate defines a custom function to update the sprites data before they render
    */
  def render(
    sprites: js.Array[ThinSprite],
    deltaTime: Double,
    viewMatrix: IMatrixLike,
    projectionMatrix: IMatrixLike
  ): Unit = js.native
  def render(
    sprites: js.Array[ThinSprite],
    deltaTime: Double,
    viewMatrix: IMatrixLike,
    projectionMatrix: IMatrixLike,
    customSpriteUpdate: Nullable[js.Function2[/* sprite */ ThinSprite, /* baseSize */ ISize, Unit]]
  ): Unit = js.native
  
  /**
    * Defines the texture of the spritesheet
    */
  var texture: Nullable[ThinTexture] = js.native
}
