package typings.bip38.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip38", "encryptRaw")
@js.native
object encryptRaw extends js.Object {
  def apply(buffer: Buffer, compressed: Boolean, passphrase: String): Buffer = js.native
  def apply(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.UndefOr[scala.Nothing],
    scryptParams: ScryptParams
  ): Buffer = js.native
  def apply(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Buffer = js.native
  def apply(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Buffer = js.native
}

