package typings.cssDashTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: Double
  var line: Double
  var offset: Double
}

object Anon_Column {
  @scala.inline
  def apply(column: Double, line: Double, offset: Double): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column, line = line, offset = offset)
  
    __obj.asInstanceOf[Anon_Column]
  }
}

