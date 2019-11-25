package typings.blocked.blockedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var threshold: Double
}

object Options {
  @scala.inline
  def apply(threshold: Double): Options = {
    val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

