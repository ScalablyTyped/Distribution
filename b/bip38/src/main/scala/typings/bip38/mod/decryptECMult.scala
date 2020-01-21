package typings.bip38.mod

import typings.bip38.AnonCompressed
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip38", "decryptECMult")
@js.native
object decryptECMult extends js.Object {
  def apply(buffer: Buffer, passphrase: String): AnonCompressed = js.native
  def apply(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): AnonCompressed = js.native
  def apply(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): AnonCompressed = js.native
}

