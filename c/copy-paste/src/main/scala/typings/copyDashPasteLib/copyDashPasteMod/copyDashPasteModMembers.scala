package typings
package copyDashPasteLib.copyDashPasteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("copy-paste", JSImport.Namespace)
@js.native
object copyDashPasteModMembers extends js.Object {
  def copy[T](content: T): T = js.native
  def copy[T](content: T, callback: CopyCallback): T = js.native
  def paste(): java.lang.String = js.native
  def paste(callback: PasteCallback): scala.Unit = js.native
}

