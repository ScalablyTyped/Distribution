package typings.bip38

import typings.bip38.anon.Compressed
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bip38", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(string: String, passphrase: String): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(string.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  inline def decrypt(
    string: String,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(string.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  inline def decrypt(
    string: String,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(string.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any], scryptParams.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  inline def decrypt(string: String, passphrase: String, progressCallback: Unit, scryptParams: ScryptParams): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(string.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any], scryptParams.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  
  inline def decryptECMult(buffer: Buffer, passphrase: String): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptECMult")(buffer.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  inline def decryptECMult(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptECMult")(buffer.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  inline def decryptECMult(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptECMult")(buffer.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any], scryptParams.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  inline def decryptECMult(buffer: Buffer, passphrase: String, progressCallback: Unit, scryptParams: ScryptParams): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptECMult")(buffer.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any], scryptParams.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  
  inline def decryptRaw(buffer: Buffer, passphrase: String): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptRaw")(buffer.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  inline def decryptRaw(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptRaw")(buffer.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  inline def decryptRaw(
    buffer: Buffer,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptRaw")(buffer.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any], scryptParams.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  inline def decryptRaw(buffer: Buffer, passphrase: String, progressCallback: Unit, scryptParams: ScryptParams): Compressed = (^.asInstanceOf[js.Dynamic].applyDynamic("decryptRaw")(buffer.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any], scryptParams.asInstanceOf[js.Any])).asInstanceOf[Compressed]
  
  inline def encrypt(buffer: Buffer, compressed: Boolean, passphrase: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(buffer.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encrypt(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(buffer.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encrypt(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(buffer.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any], scryptParams.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encrypt(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: Unit,
    scryptParams: ScryptParams
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(buffer.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any], scryptParams.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encryptRaw(buffer: Buffer, compressed: Boolean, passphrase: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptRaw")(buffer.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encryptRaw(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit]
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptRaw")(buffer.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encryptRaw(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: js.Function1[/* status */ ProgressStatus, Unit],
    scryptParams: ScryptParams
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptRaw")(buffer.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any], scryptParams.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encryptRaw(
    buffer: Buffer,
    compressed: Boolean,
    passphrase: String,
    progressCallback: Unit,
    scryptParams: ScryptParams
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encryptRaw")(buffer.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any], progressCallback.asInstanceOf[js.Any], scryptParams.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def verify(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ProgressStatus extends StObject {
    
    var current: Double
    
    var percent: Double
    
    var total: Double
  }
  object ProgressStatus {
    
    inline def apply(current: Double, percent: Double, total: Double): ProgressStatus = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressStatus]
    }
    
    extension [Self <: ProgressStatus](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScryptParams extends StObject {
    
    var N: Double
    
    var p: Double
    
    var r: Double
  }
  object ScryptParams {
    
    inline def apply(N: Double, p: Double, r: Double): ScryptParams = {
      val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScryptParams]
    }
    
    extension [Self <: ScryptParams](x: Self) {
      
      inline def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
