package typings
package braceLib.braceMod

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
    val __obj = js.Dynamic.literal(column = column, row = row, text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Annotation]
  }
}

