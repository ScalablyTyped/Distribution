package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents the range of an animation
     */
@JSGlobal("BABYLON.AnimationRange")
@js.native
class AnimationRange protected () extends js.Object {
  /**
           * Initializes the range of an animation
           * @param name The name of the animation range
           * @param from The starting frame of the animation
           * @param to The ending frame of the animation
           */
  def this(/**The name of the animation range**/
  name: java.lang.String, /**The starting frame of the animation */
  from: scala.Double, /**The ending frame of the animation*/
  to: scala.Double) = this()
  /**The starting frame of the animation */
  var from: scala.Double = js.native
  /**The name of the animation range**/
  var name: java.lang.String = js.native
  /**The ending frame of the animation*/
  var to: scala.Double = js.native
}

