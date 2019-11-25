package typings.blazy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breakpoint extends js.Object {
  var src: String
  var width: Double
}

object Breakpoint {
  @scala.inline
  def apply(src: String, width: Double): Breakpoint = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Breakpoint]
  }
}

