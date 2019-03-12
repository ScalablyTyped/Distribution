package typings
package bip38Lib.bip38Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip38", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decrypt(string: java.lang.String, passphrase: java.lang.String): bip38Lib.Anon_Compressed = js.native
  def decrypt(
    string: java.lang.String,
    passphrase: java.lang.String,
    progressCallback: js.Function1[/* status */ ProgressStatus, scala.Unit]
  ): bip38Lib.Anon_Compressed = js.native
  def decrypt(
    string: java.lang.String,
    passphrase: java.lang.String,
    progressCallback: js.Function1[/* status */ ProgressStatus, scala.Unit],
    scryptParams: ScryptParams
  ): bip38Lib.Anon_Compressed = js.native
  def decryptECMult(buffer: nodeLib.Buffer, passphrase: java.lang.String): bip38Lib.Anon_Compressed = js.native
  def decryptECMult(
    buffer: nodeLib.Buffer,
    passphrase: java.lang.String,
    progressCallback: js.Function1[/* status */ ProgressStatus, scala.Unit]
  ): bip38Lib.Anon_Compressed = js.native
  def decryptECMult(
    buffer: nodeLib.Buffer,
    passphrase: java.lang.String,
    progressCallback: js.Function1[/* status */ ProgressStatus, scala.Unit],
    scryptParams: ScryptParams
  ): bip38Lib.Anon_Compressed = js.native
  def decryptRaw(buffer: nodeLib.Buffer, passphrase: java.lang.String): bip38Lib.Anon_Compressed = js.native
  def decryptRaw(
    buffer: nodeLib.Buffer,
    passphrase: java.lang.String,
    progressCallback: js.Function1[/* status */ ProgressStatus, scala.Unit]
  ): bip38Lib.Anon_Compressed = js.native
  def decryptRaw(
    buffer: nodeLib.Buffer,
    passphrase: java.lang.String,
    progressCallback: js.Function1[/* status */ ProgressStatus, scala.Unit],
    scryptParams: ScryptParams
  ): bip38Lib.Anon_Compressed = js.native
  def encrypt(buffer: nodeLib.Buffer, compressed: scala.Boolean, passphrase: java.lang.String): java.lang.String = js.native
  def encrypt(
    buffer: nodeLib.Buffer,
    compressed: scala.Boolean,
    passphrase: java.lang.String,
    progressCallback: js.Function1[/* status */ ProgressStatus, scala.Unit]
  ): java.lang.String = js.native
  def encrypt(
    buffer: nodeLib.Buffer,
    compressed: scala.Boolean,
    passphrase: java.lang.String,
    progressCallback: js.Function1[/* status */ ProgressStatus, scala.Unit],
    scryptParams: ScryptParams
  ): java.lang.String = js.native
  def encryptRaw(buffer: nodeLib.Buffer, compressed: scala.Boolean, passphrase: java.lang.String): nodeLib.Buffer = js.native
  def encryptRaw(
    buffer: nodeLib.Buffer,
    compressed: scala.Boolean,
    passphrase: java.lang.String,
    progressCallback: js.Function1[/* status */ ProgressStatus, scala.Unit]
  ): nodeLib.Buffer = js.native
  def encryptRaw(
    buffer: nodeLib.Buffer,
    compressed: scala.Boolean,
    passphrase: java.lang.String,
    progressCallback: js.Function1[/* status */ ProgressStatus, scala.Unit],
    scryptParams: ScryptParams
  ): nodeLib.Buffer = js.native
  def verify(string: java.lang.String): scala.Boolean = js.native
}

