package typings.cssFontLoadingModule.mod.global

import typings.cssFontLoadingModule.mod.FontFaceSetLoadEventInit
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FontFaceSetLoadEvent")
@js.native
class FontFaceSetLoadEvent protected () extends Event {
  def this(`type`: String) = this()
  def this(`type`: String, eventInitDict: FontFaceSetLoadEventInit) = this()
  val fontfaces: js.Array[FontFace] = js.native
}

