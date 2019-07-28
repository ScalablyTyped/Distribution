package typings.casperjs.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colorizer extends js.Object {
  def colorize(text: String, styleName: String): Unit
  def format(text: String, style: js.Any): Unit
}

object Colorizer {
  @scala.inline
  def apply(colorize: (String, String) => Unit, format: (String, js.Any) => Unit): Colorizer = {
    val __obj = js.Dynamic.literal(colorize = js.Any.fromFunction2(colorize), format = js.Any.fromFunction2(format))
  
    __obj.asInstanceOf[Colorizer]
  }
}

