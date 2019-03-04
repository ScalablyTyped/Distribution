package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay extends js.Object {
  var hide: scala.Double
  var show: scala.Double
}

object Delay {
  @scala.inline
  def apply(hide: scala.Double, show: scala.Double): Delay = {
    val __obj = js.Dynamic.literal(hide = hide, show = show)
  
    __obj.asInstanceOf[Delay]
  }
}

