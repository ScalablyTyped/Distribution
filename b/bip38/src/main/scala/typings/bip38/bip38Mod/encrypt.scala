package typings.bip38.bip38Mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip38", "encrypt")
@js.native
object encrypt extends js.Object {
  def apply(buffer: Buffer, compressed: Boolean, passphrase: String): String = js.native
  def apply(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): String = js.native
  def apply(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): String = js.native
}

