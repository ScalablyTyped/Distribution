package typings.copyDashPaste

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("copy-paste", JSImport.Namespace)
@js.native
object copyDashPasteMod extends js.Object {
  def copy[T](content: T): T = js.native
  def copy[T](content: T, callback: CopyCallback): T = js.native
  def paste(): String = js.native
  def paste(callback: PasteCallback): Unit = js.native
  type CopyCallback = js.Function1[/* err */ Error, Unit]
  type PasteCallback = js.Function2[/* err */ Error, /* content */ String, Unit]
}

