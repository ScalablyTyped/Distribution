package typings.d3Graphviz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeOptions extends js.Object {
  var shortening: Double
}

object EdgeOptions {
  @scala.inline
  def apply(shortening: Double): EdgeOptions = {
    val __obj = js.Dynamic.literal(shortening = shortening.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EdgeOptions]
  }
}

