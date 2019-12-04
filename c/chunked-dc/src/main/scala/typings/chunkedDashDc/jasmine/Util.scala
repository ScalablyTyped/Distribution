package typings.chunkedDashDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Util extends js.Object {
  def argsToArray(args: js.Any): js.Any
  def extend(destination: js.Any, source: js.Any): js.Any
  def formatException(e: js.Any): js.Any
  def htmlEscape(str: String): String
  def inherit(childClass: js.Function, parentClass: js.Function): js.Any
}

object Util {
  @scala.inline
  def apply(
    argsToArray: js.Any => js.Any,
    extend: (js.Any, js.Any) => js.Any,
    formatException: js.Any => js.Any,
    htmlEscape: String => String,
    inherit: (js.Function, js.Function) => js.Any
  ): Util = {
    val __obj = js.Dynamic.literal(argsToArray = js.Any.fromFunction1(argsToArray), extend = js.Any.fromFunction2(extend), formatException = js.Any.fromFunction1(formatException), htmlEscape = js.Any.fromFunction1(htmlEscape), inherit = js.Any.fromFunction2(inherit))
  
    __obj.asInstanceOf[Util]
  }
}

