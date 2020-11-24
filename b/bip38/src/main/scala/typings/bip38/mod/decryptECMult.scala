package typings.bip38.mod

import typings.bip38.anon.Compressed
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bip38", "decryptECMult")
@js.native
object decryptECMult extends js.Object {
  
  def apply(buffer: Buffer, passphrase: String): Compressed = js.native
  def apply(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.UndefOr[scala.Nothing],
    scryptParams: ScryptParams
  ): Compressed = js.native
  def apply(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Compressed = js.native
  def apply(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Compressed = js.native
}
