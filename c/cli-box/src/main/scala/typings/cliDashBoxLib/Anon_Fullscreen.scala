package typings
package cliDashBoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fullscreen extends js.Object {
  var fullscreen: scala.Boolean
  var height: scala.Double
  var marks: Marks
  var stringify: scala.Boolean
  var width: scala.Double
}

object Anon_Fullscreen {
  @scala.inline
  def apply(
    fullscreen: scala.Boolean,
    height: scala.Double,
    marks: Marks,
    stringify: scala.Boolean,
    width: scala.Double
  ): Anon_Fullscreen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fullscreen")(fullscreen)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("marks")(marks)
    __obj.updateDynamic("stringify")(stringify)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Fullscreen]
  }
}

