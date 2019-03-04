package typings
package cliDashBoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: scala.Double
  var lines: js.Array[Anon_Offset]
  var marks: Marks
  var width: scala.Double
}

object Anon_Height {
  @scala.inline
  def apply(height: scala.Double, lines: js.Array[Anon_Offset], marks: Marks, width: scala.Double): Anon_Height = {
    val __obj = js.Dynamic.literal(height = height, lines = lines, marks = marks, width = width)
  
    __obj.asInstanceOf[Anon_Height]
  }
}

