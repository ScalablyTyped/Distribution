package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  var column: scala.Double
  var row: scala.Double
  var text: java.lang.String
  var `type`: java.lang.String
}

object Annotation {
  @scala.inline
  def apply(column: scala.Double, row: scala.Double, text: java.lang.String, `type`: java.lang.String): Annotation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("row")(row)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Annotation]
  }
}

