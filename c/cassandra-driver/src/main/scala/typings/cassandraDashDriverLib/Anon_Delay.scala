package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: scala.Double
  var done: scala.Boolean
}

object Anon_Delay {
  @scala.inline
  def apply(delay: scala.Double, done: scala.Boolean): Anon_Delay = {
    val __obj = js.Dynamic.literal(delay = delay, done = done)
  
    __obj.asInstanceOf[Anon_Delay]
  }
}

