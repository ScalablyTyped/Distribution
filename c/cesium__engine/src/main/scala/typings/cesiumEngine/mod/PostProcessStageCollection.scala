package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "PostProcessStageCollection")
@js.native
open class PostProcessStageCollection () extends StObject {
  
  /**
    * Adds the post-process stage to the collection.
    * @param stage - The post-process stage to add to the collection.
    * @returns The post-process stage that was added to the collection.
    */
  def add(stage: PostProcessStage): PostProcessStage | PostProcessStageComposite = js.native
  def add(stage: PostProcessStageComposite): PostProcessStage | PostProcessStageComposite = js.native
  
  /**
    * A post-process stage that applies Horizon-based Ambient Occlusion (HBAO) to the input texture.
    * <p>
    * Ambient occlusion simulates shadows from ambient light. These shadows would always be present when the
    * surface receives light and regardless of the light's position.
    * </p>
    * <p>
    * The uniforms have the following properties: <code>intensity</code>, <code>bias</code>, <code>lengthCap</code>,
    * <code>stepSize</code>, <code>frustumLength</code>, <code>ambientOcclusionOnly</code>,
    * <code>delta</code>, <code>sigma</code>, and <code>blurStepSize</code>.
    * </p>
    * <ul>
    * <li><code>intensity</code> is a scalar value used to lighten or darken the shadows exponentially. Higher values make the shadows darker. The default value is <code>3.0</code>.</li>
    *
    * <li><code>bias</code> is a scalar value representing an angle in radians. If the dot product between the normal of the sample and the vector to the camera is less than this value,
    * sampling stops in the current direction. This is used to remove shadows from near planar edges. The default value is <code>0.1</code>.</li>
    *
    * <li><code>lengthCap</code> is a scalar value representing a length in meters. If the distance from the current sample to first sample is greater than this value,
    * sampling stops in the current direction. The default value is <code>0.26</code>.</li>
    *
    * <li><code>stepSize</code> is a scalar value indicating the distance to the next texel sample in the current direction. The default value is <code>1.95</code>.</li>
    *
    * <li><code>frustumLength</code> is a scalar value in meters. If the current fragment has a distance from the camera greater than this value, ambient occlusion is not computed for the fragment.
    * The default value is <code>1000.0</code>.</li>
    *
    * <li><code>ambientOcclusionOnly</code> is a boolean value. When <code>true</code>, only the shadows generated are written to the output. When <code>false</code>, the input texture is modulated
    * with the ambient occlusion. This is a useful debug option for seeing the effects of changing the uniform values. The default value is <code>false</code>.</li>
    * </ul>
    * <p>
    * <code>delta</code>, <code>sigma</code>, and <code>blurStepSize</code> are the same properties as {@link PostProcessStageLibrary#createBlurStage}.
    * The blur is applied to the shadows generated from the image to make them smoother.
    * </p>
    * <p>
    * When enabled, this stage will execute before all others.
    * </p>
    */
  val ambientOcclusion: PostProcessStageComposite = js.native
  
  /**
    * A post-process stage for a bloom effect.
    * <p>
    * A bloom effect adds glow effect, makes bright areas brighter, and dark areas darker.
    * </p>
    * <p>
    * This stage has the following uniforms: <code>contrast</code>, <code>brightness</code>, <code>glowOnly</code>,
    * <code>delta</code>, <code>sigma</code>, and <code>stepSize</code>.
    * </p>
    * <ul>
    * <li><code>contrast</code> is a scalar value in the range [-255.0, 255.0] and affects the contract of the effect. The default value is <code>128.0</code>.</li>
    *
    * <li><code>brightness</code> is a scalar value. The input texture RGB value is converted to hue, saturation, and brightness (HSB) then this value is
    * added to the brightness. The default value is <code>-0.3</code>.</li>
    *
    * <li><code>glowOnly</code> is a boolean value. When <code>true</code>, only the glow effect will be shown. When <code>false</code>, the glow will be added to the input texture.
    * The default value is <code>false</code>. This is a debug option for viewing the effects when changing the other uniform values.</li>
    * </ul>
    * <p>
    * <code>delta</code>, <code>sigma</code>, and <code>stepSize</code> are the same properties as {@link PostProcessStageLibrary#createBlurStage}.
    * The blur is applied to the shadows generated from the image to make them smoother.
    * </p>
    * <p>
    * When enabled, this stage will execute before all others.
    * </p>
    */
  val bloom: PostProcessStageComposite = js.native
  
  /**
    * Returns whether the collection contains a post-process stage.
    * @param stage - The post-process stage.
    * @returns Whether the collection contains the post-process stage.
    */
  def contains(stage: PostProcessStage): Boolean = js.native
  def contains(stage: PostProcessStageComposite): Boolean = js.native
  
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
    * A post-process stage for Fast Approximate Anti-aliasing.
    * <p>
    * When enabled, this stage will execute after all others.
    * </p>
    */
  val fxaa: PostProcessStage = js.native
  
  /**
    * Gets the post-process stage at <code>index</code>.
    * @param index - The index of the post-process stage.
    * @returns The post-process stage at index.
    */
  def get(index: Double): PostProcessStage | PostProcessStageComposite = js.native
  
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
    * The number of post-process stages in this collection.
    */
  val length: Double = js.native
  
  /**
    * Determines if all of the post-process stages in the collection are ready to be executed.
    */
  val ready: Boolean = js.native
  
  /**
    * Removes a post-process stage from the collection and destroys it.
    * @param stage - The post-process stage to remove from the collection.
    * @returns Whether the post-process stage was removed.
    */
  def remove(stage: PostProcessStage): Boolean = js.native
  def remove(stage: PostProcessStageComposite): Boolean = js.native
  
  /**
    * Removes all post-process stages from the collection and destroys them.
    */
  def removeAll(): Unit = js.native
}
