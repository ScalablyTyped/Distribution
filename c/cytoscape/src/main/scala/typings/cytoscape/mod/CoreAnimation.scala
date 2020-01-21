package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreAnimation extends js.Object {
  /**
    * Animate the viewport.
    * http://js.cytoscape.org/#cy.animate
    *
    * @param anis An object containing the details of the animation.
    *
    * @param options An object containing animation options.
    */
  def animate(anis: AnimateOptions): Core = js.native
  def animate(anis: AnimateOptions, options: AnimateOptions): Core = js.native
  /**
    * Get whether the viewport is currently being animated.
    * http://js.cytoscape.org/#cy.animated
    */
  def animated(): Boolean = js.native
  /**
    * Get an animation of the viewport.
    * http://js.cytoscape.org/#cy.animation
    */
  def animation(options: AnimationOptions): AnimationManipulation = js.native
  /**
    * Remove all queued animations for the viewport.
    * http://js.cytoscape.org/#cy.clearQueue
    */
  def clearQueue(): Core = js.native
  /**
    * Add a delay between animations for the viewport.
    *
    * @param duration How long the delay should be in milliseconds.
    * @param complete A function to call when the delay is complete.
    */
  def delay(duration: Double): Core = js.native
  def delay(duration: Double, complete: js.Function0[Unit]): Core = js.native
  /**
    * Get a delay animation of the viewport.
    * http://js.cytoscape.org/#cy.delayAnimation
    */
  def delayAnimation(duration: Double): AnimationManipulation = js.native
  /**
    * Stop all viewport animations that are currently running.
    * http://js.cytoscape.org/#cy.stop
    *
    * @param clearQueue A boolean, indicating whether the queue of animations should be emptied.
    * @param jumpToEnd A boolean, indicating whether the currently-running animations should jump to their ends rather than just stopping midway.
    */
  def stop(): Core = js.native
  def stop(clearQueue: Boolean): Core = js.native
  def stop(clearQueue: Boolean, jumpToEnd: Boolean): Core = js.native
}

