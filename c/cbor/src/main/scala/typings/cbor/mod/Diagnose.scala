package typings.cbor.mod

import typings.node.Buffer
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

