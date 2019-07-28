package typings.brace.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: Double
  var row: Double
}

object Position {
  @scala.inline
  def apply(column: Double, row: Double): Position = {
    val __obj = js.Dynamic.literal(column = column, row = row)
  
    __obj.asInstanceOf[Position]
  }
}

