package typings.cssFontLoadingModule.mod._Global_

import typings.cssFontLoadingModule.mod.FontFaceSetLoadEventInit
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FontFaceSetLoadEvent")
@js.native
class FontFaceSetLoadEvent protected () extends Event_ {
  def this(`type`: String) = this()
  def this(`type`: String, eventInitDict: FontFaceSetLoadEventInit) = this()
  val fontfaces: js.Array[FontFace] = js.native
}

