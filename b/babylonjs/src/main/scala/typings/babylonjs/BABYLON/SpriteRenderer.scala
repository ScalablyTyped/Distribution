package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpriteRenderer extends StObject {
  
  /* private */ var _appendSpriteVertex: js.Any = js.native
  
  /* private */ var _buffer: js.Any = js.native
  
  /* private */ val _capacity: js.Any = js.native
  
  /* private */ var _effectBase: js.Any = js.native
  
  /* private */ var _effectFog: js.Any = js.native
  
  /* private */ val _engine: js.Any = js.native
  
  /* private */ val _epsilon: js.Any = js.native
  
  /* private */ var _indexBuffer: js.Any = js.native
  
  /* private */ val _scene: js.Any = js.native
  
  /* private */ var _spriteBuffer: js.Any = js.native
  
  /* private */ val _useInstancing: js.Any = js.native
  
  /* private */ val _useVAO: js.Any = js.native
  
  /* private */ var _vertexArrayObject: js.Any = js.native
  
  /* private */ var _vertexBufferSize: js.Any = js.native
  
  /* private */ var _vertexBuffers: js.Any = js.native
  
  /* private */ var _vertexData: js.Any = js.native
  
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
