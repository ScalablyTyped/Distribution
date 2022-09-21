package typings.bitcoreLibCash.mod

import typings.bitcoreLibCash.bitcoreLibCashStrings.little
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crypto {
  
  @JSImport("bitcore-lib-cash", "crypto.BN")
  @js.native
  open class BN protected () extends StObject {
    def this(n: Double) = this()
    
    def toNumber(): Double = js.native
  }
  object BN {
    
    @JSImport("bitcore-lib-cash", "crypto.BN")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromNumber(n: Double): BN = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(n.asInstanceOf[js.Any]).asInstanceOf[BN]
  }
  
  object ECDSA {
    
    @JSImport("bitcore-lib-cash", "crypto.ECDSA")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sign(message: Buffer, key: PrivateKey): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Signature]
    
    inline def verify(hashbuf: Buffer, sig: Signature, pubkey: PublicKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(hashbuf.asInstanceOf[js.Any], sig.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def verify_little(hashbuf: Buffer, sig: Signature, pubkey: PublicKey, endian: little): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(hashbuf.asInstanceOf[js.Any], sig.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], endian.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object Hash {
    
    @JSImport("bitcore-lib-cash", "crypto.Hash")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ripemd160(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def sha1(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def sha256(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def sha256hmac(data: Buffer, key: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256hmac")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def sha256ripemd160(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256ripemd160")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def sha256sha256(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256sha256")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def sha512(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def sha512hmac(data: Buffer, key: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512hmac")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  }
  
  object Random {
    
    @JSImport("bitcore-lib-cash", "crypto.Random")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getRandomBuffer(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomBuffer")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
  
  @JSImport("bitcore-lib-cash", "crypto.Signature")
  @js.native
  open class Signature () extends StObject
  object Signature {
    
    @JSImport("bitcore-lib-cash", "crypto.Signature")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("bitcore-lib-cash", "crypto.Signature.SIGHASH_ALL")
    @js.native
    def SIGHASH_ALL: Double = js.native
    inline def SIGHASH_ALL_=(x: Double): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGHASH_ALL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bitcore-lib-cash", "crypto.Signature.SIGHASH_FORKID")
    @js.native
    def SIGHASH_FORKID: Double = js.native
    inline def SIGHASH_FORKID_=(x: Double): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIGHASH_FORKID")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def fromDER(sig: Buffer): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDER")(sig.asInstanceOf[js.Any]).asInstanceOf[Signature]
    
    /* static member */
    inline def fromString(data: String): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(data.asInstanceOf[js.Any]).asInstanceOf[Signature]
  }
  
  @JSImport("bitcore-lib-cash", "crypto.TransactionSignature")
  @js.native
  open class TransactionSignature protected () extends Signature {
    def this(arg: String) = this()
    def this(arg: js.Object) = this()
    def this(arg: TransactionSignature) = this()
    
    def toObject(): js.Object = js.native
  }
  object TransactionSignature {
    
    @JSImport("bitcore-lib-cash", "crypto.TransactionSignature")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromObject(obj: js.Object): TransactionSignature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[TransactionSignature]
  }
}
