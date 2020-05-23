package typings.bip38.mod

import typings.bip38.anon.Compressed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip38", "decrypt")
@js.native
object decrypt extends js.Object {
  def apply(string: String, passphrase: String): Compressed = js.native
  def apply(
    string: String,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Compressed = js.native
  def apply(
    string: String,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Compressed = js.native
}

