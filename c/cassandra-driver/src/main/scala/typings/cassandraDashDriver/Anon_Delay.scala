package typings.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay extends js.Object {
  var delay: Double
  var done: Boolean
}

object Anon_Delay {
  @scala.inline
  def apply(delay: Double, done: Boolean): Anon_Delay = {
    val __obj = js.Dynamic.literal(delay = delay, done = done)
  
    __obj.asInstanceOf[Anon_Delay]
  }
}

