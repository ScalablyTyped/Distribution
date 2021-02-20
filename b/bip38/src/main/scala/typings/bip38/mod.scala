package typings.bip38

import typings.bip38.anon.Compressed
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bip38", "decrypt")
  @js.native
  def decrypt(string: String, passphrase: String): Compressed = js.native
  @JSImport("bip38", "decrypt")
  @js.native
  def decrypt(
    string: String,
    passphrase: String,
    progressCallback: js.UndefOr[scala.Nothing],
    scryptParams: ScryptParams
  ): Compressed = js.native
  @JSImport("bip38", "decrypt")
  @js.native
  def decrypt(
    string: String,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Compressed = js.native
  @JSImport("bip38", "decrypt")
  @js.native
  def decrypt(
    string: String,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Compressed = js.native
  
  @JSImport("bip38", "decryptECMult")
  @js.native
  def decryptECMult(buffer: Buffer, passphrase: String): Compressed = js.native
  @JSImport("bip38", "decryptECMult")
  @js.native
  def decryptECMult(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.UndefOr[scala.Nothing],
    scryptParams: ScryptParams
  ): Compressed = js.native
  @JSImport("bip38", "decryptECMult")
  @js.native
  def decryptECMult(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Compressed = js.native
  @JSImport("bip38", "decryptECMult")
  @js.native
  def decryptECMult(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Compressed = js.native
  
  @JSImport("bip38", "decryptRaw")
  @js.native
  def decryptRaw(buffer: Buffer, passphrase: String): Compressed = js.native
  @JSImport("bip38", "decryptRaw")
  @js.native
  def decryptRaw(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.UndefOr[scala.Nothing],
    scryptParams: ScryptParams
  ): Compressed = js.native
  @JSImport("bip38", "decryptRaw")
  @js.native
  def decryptRaw(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Compressed = js.native
  @JSImport("bip38", "decryptRaw")
  @js.native
  def decryptRaw(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Compressed = js.native
  
  @JSImport("bip38", "encrypt")
  @js.native
  def encrypt(buffer: Buffer, compressed: Boolean, passphrase: String): String = js.native
  @JSImport("bip38", "encrypt")
  @js.native
  def encrypt(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.UndefOr[scala.Nothing],
    scryptParams: ScryptParams
  ): String = js.native
  @JSImport("bip38", "encrypt")
  @js.native
  def encrypt(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): String = js.native
  @JSImport("bip38", "encrypt")
  @js.native
  def encrypt(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): String = js.native
  
  @JSImport("bip38", "encryptRaw")
  @js.native
  def encryptRaw(buffer: Buffer, compressed: Boolean, passphrase: String): Buffer = js.native
  @JSImport("bip38", "encryptRaw")
  @js.native
  def encryptRaw(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.UndefOr[scala.Nothing],
    scryptParams: ScryptParams
  ): Buffer = js.native
  @JSImport("bip38", "encryptRaw")
  @js.native
  def encryptRaw(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Buffer = js.native
  @JSImport("bip38", "encryptRaw")
  @js.native
  def encryptRaw(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Buffer = js.native
  
  @JSImport("bip38", "verify")
  @js.native
  def verify(string: String): Boolean = js.native
  
  @js.native
  trait ProgressStatus extends StObject {
    
    var current: Double = js.native
    
    var percent: Double = js.native
    
    var total: Double = js.native
  }
  object ProgressStatus {
    
    @scala.inline
    def apply(current: Double, percent: Double, total: Double): ProgressStatus = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressStatus]
    }
    
    @scala.inline
    implicit class ProgressStatusMutableBuilder[Self <: ProgressStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScryptParams extends StObject {
    
    var N: Double = js.native
    
    var p: Double = js.native
    
    var r: Double = js.native
  }
  object ScryptParams {
    
    @scala.inline
    def apply(N: Double, p: Double, r: Double): ScryptParams = {
      val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScryptParams]
    }
    
    @scala.inline
    implicit class ScryptParamsMutableBuilder[Self <: ScryptParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
