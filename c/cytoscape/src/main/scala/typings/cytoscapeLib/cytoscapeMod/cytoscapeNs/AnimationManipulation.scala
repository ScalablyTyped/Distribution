package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An animation represents a visible change in state over
     * a duration of time for a single element.
     * Animations can be generated via cy.animation()
     * (for animations on the viewport) and ele.animation()
     * (for animations on graph elements).
     * http://js.cytoscape.org/#animations
     */

/**
     * http://js.cytoscape.org/#animations/animation-manipulation
     */
@js.native
trait AnimationManipulation extends js.Object {
  /**
           * Apply the animation at its current progress.
           * http://js.cytoscape.org/#ani.apply
           */
  @JSName("apply")
  def apply(): AnimationManipulation = js.native
  /**
           * Get whether the animation is currently applying.
           * http://js.cytoscape.org/#ani.applying
           */
  def applying(): AnimationManipulation = js.native
  def complete(): AnimationManipulation = js.native
  /**
           * Get whether the animation has progressed to the end.
           * http://js.cytoscape.org/#ani.completed
           */
  def completed(): AnimationManipulation = js.native
  /**
           * Fastforward the animation to the end.
           */
  def fastforward(): AnimationManipulation = js.native
  /**
           * Pause the animation, maintaining the current progress.
           * http://js.cytoscape.org/#ani.pause
           */
  def pause(): AnimationManipulation = js.native
  /**
           * Requests that the animation be played, starting on the next frame.
           * If the animation is complete, it restarts from the beginning.
           * http://js.cytoscape.org/#ani.play
           */
  def play(): this.type = js.native
  /**
           * Get whether the animation is currently playing.
           * http://js.cytoscape.org/#ani.playing
           */
  def playing(): scala.Boolean = js.native
  /**
           * Get or set how far along the animation has progressed.
           * http://js.cytoscape.org/#ani.progress
           */
  /**
           * Get the progress of the animation in percent.
           */
  def progress(): scala.Double = js.native
  /**
           * Set the progress of the animation in percent.
           * @param progress The progress in percent (i.e. between 0 and 1 inclusive) to set to the animation.
           */
  def progress(progress: scala.Double): AnimationManipulation = js.native
  /**
           * Get a promise that is fulfilled with the specified animation event.
           * @param animationEvent A string for the event name; completed or complete for
           * completing the animation or frame for the next frame of the animation.
           * http://js.cytoscape.org/#ani.promise
           */
  def promise(): stdLib.Promise[EventObject] = js.native
  /**
           * Get a promise that is fulfilled with the specified animation event.
           * @param animationEvent A string for the event name; completed or complete for
           * completing the animation or frame for the next frame of the animation.
           * http://js.cytoscape.org/#ani.promise
           */
  @JSName("promise")
  def promise_complete(animationEvent: cytoscapeLib.cytoscapeLibStrings.complete): stdLib.Promise[EventObject] = js.native
  /**
           * Get a promise that is fulfilled with the specified animation event.
           * @param animationEvent A string for the event name; completed or complete for
           * completing the animation or frame for the next frame of the animation.
           * http://js.cytoscape.org/#ani.promise
           */
  @JSName("promise")
  def promise_completed(animationEvent: cytoscapeLib.cytoscapeLibStrings.completed): stdLib.Promise[EventObject] = js.native
  /**
           * Get a promise that is fulfilled with the specified animation event.
           * @param animationEvent A string for the event name; completed or complete for
           * completing the animation or frame for the next frame of the animation.
           * http://js.cytoscape.org/#ani.promise
           */
  @JSName("promise")
  def promise_frame(animationEvent: cytoscapeLib.cytoscapeLibStrings.frame): stdLib.Promise[EventObject] = js.native
  /**
           * Reverse the animation such that its starting
           * conditions and ending conditions are reversed.
           * http://js.cytoscape.org/#ani.reverse
           */
  def reverse(): AnimationManipulation = js.native
  /**
           * Rewind the animation to the beginning.
           */
  def rewind(): AnimationManipulation = js.native
  /**
           * Stop the animation, maintaining the current progress
           * and removing the animation from any associated queues.
           * http://js.cytoscape.org/#ani.stop
           */
  def stop(): AnimationManipulation = js.native
  /**
           * Get the progress of the animation in milliseconds.
           */
  def time(): scala.Double = js.native
  /**
           * Set the progress of the animation in milliseconds.
           * @param time The progress in milliseconds
           * (i.e. between 0 and the duration inclusive) to set to the animation.
           */
  def time(time: scala.Double): AnimationManipulation = js.native
}

