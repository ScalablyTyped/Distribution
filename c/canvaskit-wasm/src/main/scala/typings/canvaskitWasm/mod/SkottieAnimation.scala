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
  def render(canvas: SkCanvas): Unit = js.native
  def render(canvas: SkCanvas, dstRect: InputRect): Unit = js.native
  
  /**
    * [deprecated] - use seekFrame
    * @param t - value from [0.0, 1.0]; 0 is first frame, 1 is final frame.
    * @param damageRect - will copy damage frame into this if provided.
    */
  def seek(t: Double): SkRect = js.native
  def seek(t: Double, damageRect: SkRect): SkRect = js.native
  
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
  def seekFrame(frame: Double): SkRect = js.native
  def seekFrame(frame: Double, damageRect: SkRect): SkRect = js.native
  
  def size(): SkPoint = js.native
  
  def version(): String = js.native
}
