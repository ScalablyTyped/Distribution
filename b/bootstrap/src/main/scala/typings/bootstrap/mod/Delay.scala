package typings.bootstrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay extends js.Object {
  var hide: Double
  var show: Double
}

object Delay {
  @scala.inline
  def apply(hide: Double, show: Double): Delay = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delay]
  }
}

