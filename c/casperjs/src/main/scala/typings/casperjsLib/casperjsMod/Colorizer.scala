package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colorizer extends js.Object {
  def colorize(text: java.lang.String, styleName: java.lang.String): scala.Unit
  def format(text: java.lang.String, style: js.Any): scala.Unit
}

object Colorizer {
  @scala.inline
  def apply(
    colorize: (java.lang.String, java.lang.String) => scala.Unit,
    format: (java.lang.String, js.Any) => scala.Unit
  ): Colorizer = {
    val __obj = js.Dynamic.literal(colorize = js.Any.fromFunction2(colorize), format = js.Any.fromFunction2(format))
  
    __obj.asInstanceOf[Colorizer]
  }
}

