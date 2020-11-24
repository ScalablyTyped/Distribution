package typings.cbor.mod

import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cbor", "Diagnose")
@js.native
class Diagnose () extends Transform {
  def this(options: DiagnoseOptions) = this()
}
/* static members */
@JSImport("cbor", "Diagnose")
@js.native
object Diagnose extends js.Object {
  
  def diagnose(input: String): js.Promise[String] = js.native
  def diagnose(input: String, cb: diagnoseCallback): Unit = js.native
  def diagnose(input: String, encoding: String): js.Promise[String] = js.native
  def diagnose(input: Buffer): js.Promise[String] = js.native
  def diagnose(input: Buffer, cb: diagnoseCallback): Unit = js.native
  def diagnose(input: Buffer, encoding: String): js.Promise[String] = js.native
  def diagnose(input: ArrayBufferView): js.Promise[String] = js.native
  def diagnose(input: ArrayBufferView, cb: diagnoseCallback): Unit = js.native
  def diagnose(input: ArrayBufferView, encoding: String): js.Promise[String] = js.native
}
