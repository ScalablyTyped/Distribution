package typings.bip38.bip38Mod

import typings.bip38.Anon_Compressed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip38", "decrypt")
@js.native
object decrypt extends js.Object {
  def apply(string: String, passphrase: String): Anon_Compressed = js.native
  def apply(
    string: String,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Anon_Compressed = js.native
  def apply(
    string: String,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Anon_Compressed = js.native
}

