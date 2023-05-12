package typings.cesium.mod

import typings.cesium.anon.ClearColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PostProcessStage")
@js.native
open class PostProcessStage protected () extends StObject {
  def this(options: ClearColor) = this()
  
  /**
    * The color to clear the output texture to.
    */
  val clearColor: Color = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <p>
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * </p>
    */
  def destroy(): Unit = js.native
  
  /**
    * Whether or not to execute this post-process stage when ready.
    */
  var enabled: Boolean = js.native
  
  /**
    * Whether or not to force the output texture dimensions to be both equal powers of two. The power of two will be the next power of two of the minimum of the dimensions.
    */
  val forcePowerOfTwo: Double = js.native
  
  /**
    * The fragment shader to use when execute this post-process stage.
    * <p>
    * The shader must contain a sampler uniform declaration for <code>colorTexture</code>, <code>depthTexture</code>,
    * or both.
    * </p>
    * <p>
    * The shader must contain a <code>vec2</code> varying declaration for <code>v_textureCoordinates</code> for sampling
    * the texture uniforms.
    * </p>
    */
  val fragmentShader: String = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <p>
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * </p>
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * The unique name of this post-process stage for reference by other stages in a {@link PostProcessStageComposite}.
    */
  val name: String = js.native
  
  /**
    * The pixel data type of the output texture.
    */
  val pixelDatatype: PixelDatatype = js.native
  
  /**
    * The color pixel format of the output texture.
    */
  val pixelFormat: PixelFormat = js.native
  
  /**
    * Determines if this post-process stage is ready to be executed. A stage is only executed when both <code>ready</code>
    * and {@link PostProcessStage#enabled} are <code>true</code>. A stage will not be ready while it is waiting on textures
    * to load.
    */
  val ready: Boolean = js.native
  
  /**
    * How to sample the input color texture.
    */
  val sampleMode: PostProcessStageSampleMode = js.native
  
  /**
    * The {@link BoundingRectangle} to use for the scissor test. A default bounding rectangle will disable the scissor test.
    */
  val scissorRectangle: BoundingRectangle = js.native
  
  /**
    * The features selected for applying the post-process.
    * <p>
    * In the fragment shader, use <code>czm_selected</code> to determine whether or not to apply the post-process
    * stage to that fragment. For example:
    * <code>
    * if (czm_selected(v_textureCoordinates)) {
    *     // apply post-process stage
    * } else {
    *     out_FragColor = texture(colorTexture, v_textureCoordinates);
    * }
    * </code>
    * </p>
    */
  var selected: js.Array[Any] = js.native
  
  /**
    * A number in the range (0.0, 1.0] used to scale the output texture dimensions. A scale of 1.0 will render this post-process stage to a texture the size of the viewport.
    */
  val textureScale: Double = js.native
  
  /**
    * An object whose properties are used to set the uniforms of the fragment shader.
    * <p>
    * The object property values can be either a constant or a function. The function will be called
    * each frame before the post-process stage is executed.
    * </p>
    * <p>
    * A constant value can also be a URI to an image, a data URI, or an HTML element that can be used as a texture, such as HTMLImageElement or HTMLCanvasElement.
    * </p>
    * <p>
    * If this post-process stage is part of a {@link PostProcessStageComposite} that does not execute in series, the constant value can also be
    * the name of another stage in a composite. This will set the uniform to the output texture the stage with that name.
    * </p>
    */
  val uniforms: Any = js.native
}
