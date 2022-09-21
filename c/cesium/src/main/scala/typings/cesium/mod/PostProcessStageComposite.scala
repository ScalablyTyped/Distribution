package typings.cesium.mod

import typings.cesium.anon.InputPreviousStageTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PostProcessStageComposite")
@js.native
open class PostProcessStageComposite protected () extends StObject {
  def this(options: InputPreviousStageTexture) = this()
  
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
    * Gets the post-process stage at <code>index</code>
    * @param index - The index of the post-process stage or composite.
    * @returns The post-process stage or composite at index.
    */
  def get(index: Double): PostProcessStage | PostProcessStageComposite = js.native
  
  /**
    * All post-process stages are executed in the order of the array. The input texture changes based on the value of <code>inputPreviousStageTexture</code>.
    * If <code>inputPreviousStageTexture</code> is <code>true</code>, the input to each stage is the output texture rendered to by the scene or of the stage that executed before it.
    * If <code>inputPreviousStageTexture</code> is <code>false</code>, the input texture is the same for each stage in the composite. The input texture is the texture rendered to by the scene
    * or the output texture of the previous stage.
    */
  val inputPreviousStageTexture: Boolean = js.native
  
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
    * The number of post-process stages in this composite.
    */
  val length: Double = js.native
  
  /**
    * The unique name of this post-process stage for reference by other stages in a PostProcessStageComposite.
    */
  val name: String = js.native
  
  /**
    * Determines if this post-process stage is ready to be executed.
    */
  val ready: Boolean = js.native
  
  /**
    * The features selected for applying the post-process.
    */
  var selected: js.Array[Any] = js.native
  
  /**
    * An alias to the uniform values of the post-process stages. May be <code>undefined</code>; in which case, get each stage to set uniform values.
    */
  var uniforms: Any = js.native
}
