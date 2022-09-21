package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkottieAnimation
  extends StObject
     with EmbindObject[SkottieAnimation] {
  
  /**
    * Returns the animation duration in seconds.
    */
  def duration(): Double = js.native
  
  /**
    * Returns the animation frame rate (frames / second).
    */
  def fps(): Double = js.native
  
  /**
    * Draws current animation frame. Must call seek or seekFrame first.
    * @param canvas
    * @param dstRect
    */
  def render(canvas: Canvas): Unit = js.native
  def render(canvas: Canvas, dstRect: InputRect): Unit = js.native
  
  /**
    * [deprecated] - use seekFrame
    * @param t - value from [0.0, 1.0]; 0 is first frame, 1 is final frame.
    * @param damageRect - will copy damage frame into this if provided.
    */
  def seek(t: Double): js.typedarray.Float32Array = js.native
  def seek(t: Double, damageRect: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  /**
    * Update the animation state to match |t|, specified as a frame index
    * i.e. relative to duration() * fps().
    *
    * Returns the rectangle that was affected by this animation.
    *
    * @param frame - Fractional values are allowed and meaningful - e.g.
    *                0.0 -> first frame
    *                1.0 -> second frame
    *                0.5 -> halfway between first and second frame
    * @param damageRect - will copy damage frame into this if provided.
    */
  def seekFrame(frame: Double): js.typedarray.Float32Array = js.native
  def seekFrame(frame: Double, damageRect: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  /**
    * Return the size of this animation.
    * @param outputSize - If provided, the size will be copied into here as width, height.
    */
  def size(): js.typedarray.Float32Array = js.native
  def size(outputSize: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  def version(): String = js.native
}
