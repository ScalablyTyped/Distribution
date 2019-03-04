package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageRange extends js.Object {
  var end: scala.Double
  var start: scala.Double
}

object PageRange {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double): PageRange = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[PageRange]
  }
}

