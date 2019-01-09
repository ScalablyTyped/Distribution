package typings
package chaiDashJqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Interval extends js.Object {
  /**
    * The rate (in milliseconds) at which animations fire.
    */
  var interval: scala.Double
  /**
    * Globally disable all animations.
    */
  var off: scala.Boolean
  var speeds: Anon_Fast
  var step: js.Any
  def stop(): scala.Unit
  def tick(): scala.Unit
}

