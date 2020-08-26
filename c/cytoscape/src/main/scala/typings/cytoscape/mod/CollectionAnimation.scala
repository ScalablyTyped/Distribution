package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionAnimation extends js.Object {
  /**
    * Animate the elements.
    * @param options An object containing the details of the animation.
    * http://js.cytoscape.org/#eles.animate
    */
  def animate(options: ElementAnimateOptionPos): this.type = js.native
  def animate(options: ElementAnimateOptionPos, params: ElementAnimateOptionsBase): this.type = js.native
  def animate(options: ElementAnimateOptionRen): this.type = js.native
  def animate(options: ElementAnimateOptionRen, params: ElementAnimateOptionsBase): this.type = js.native
  /**
    * Remove all queued animations for the elements.
    * http://js.cytoscape.org/#eles.clearQueue
    */
  def clearQueue(): this.type = js.native
  /**
    * Add a delay between animations for the elements.
    * @param duration How long the delay should be in milliseconds.
    * @param complete A function to call when the delay is complete.
    * http://js.cytoscape.org/#eles.delay
    */
  def delay(duration: Double): this.type = js.native
  def delay(duration: Double, complete: js.Function0[Unit]): this.type = js.native
  /**
    * Stop all animations that are currently running.
    * @param clearQueue A boolean, indicating whether the queue of animations should be emptied.
    * @param jumpToEnd A boolean, indicating whether the currently-running animations should jump to their ends rather than just stopping midway.
    * http://js.cytoscape.org/#eles.stop
    */
  def stop(): this.type = js.native
  def stop(clearQueue: js.UndefOr[scala.Nothing], jumpToEnd: Boolean): this.type = js.native
  def stop(clearQueue: Boolean): this.type = js.native
  def stop(clearQueue: Boolean, jumpToEnd: Boolean): this.type = js.native
}

