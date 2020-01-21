package typings.canvaskitWasm.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkFontMgrFactory extends js.Object {
  def FromData(buffer: js.Array[ArrayBuffer]): SkFontManager = js.native
  def FromData(buffer: ArrayBuffer): SkFontManager = js.native
  def RefDefault(): SkFontManager = js.native
}

