package typings.bip38.bip38Mod

import typings.bip38.Anon_Compressed
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip38", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decrypt(string: String, passphrase: String): Anon_Compressed = js.native
  def decrypt(
    string: String,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Anon_Compressed = js.native
  def decrypt(
    string: String,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Anon_Compressed = js.native
  def decryptECMult(buffer: Buffer, passphrase: String): Anon_Compressed = js.native
  def decryptECMult(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Anon_Compressed = js.native
  def decryptECMult(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Anon_Compressed = js.native
  def decryptRaw(buffer: Buffer, passphrase: String): Anon_Compressed = js.native
  def decryptRaw(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Anon_Compressed = js.native
  def decryptRaw(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Anon_Compressed = js.native
  def encrypt(buffer: Buffer, compressed: Boolean, passphrase: String): String = js.native
  def encrypt(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): String = js.native
  def encrypt(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): String = js.native
  def encryptRaw(buffer: Buffer, compressed: Boolean, passphrase: String): Buffer = js.native
  def encryptRaw(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Buffer = js.native
  def encryptRaw(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Buffer = js.native
  def verify(string: String): Boolean = js.native
}

