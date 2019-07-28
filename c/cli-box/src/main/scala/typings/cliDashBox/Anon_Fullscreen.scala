package typings.cliDashBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fullscreen extends js.Object {
  var fullscreen: Boolean
  var height: Double
  var marks: Marks
  var stringify: Boolean
  var width: Double
}

object Anon_Fullscreen {
  @scala.inline
  def apply(fullscreen: Boolean, height: Double, marks: Marks, stringify: Boolean, width: Double): Anon_Fullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen, height = height, marks = marks, stringify = stringify, width = width)
  
    __obj.asInstanceOf[Anon_Fullscreen]
  }
}

