package typings.bitcoinComputerBitcore.mod.Bitcoin

import typings.bitcoinComputerBitcore.bitcoinComputerBitcoreStrings.big
import typings.bitcoinComputerBitcore.bitcoinComputerBitcoreStrings.hex
import typings.bitcoinComputerBitcore.bitcoinComputerBitcoreStrings.little
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crypto {
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.crypto.BN")
  @js.native
  open class BN protected () extends StObject {
    def this(args: Any*) = this()
    
    def toScriptNumBuffer(): Buffer = js.native
    
    def toString(encoding: Double): String = js.native
    @JSName("toString")
    def toString_hex(encoding: hex): String = js.native
  }
  object BN {
    
    @JSImport("bitcoin-computer-bitcore", "Bitcoin.crypto.BN")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(buf: Buffer): BN = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buf.asInstanceOf[js.Any]).asInstanceOf[BN]
    inline def fromBuffer(buf: Buffer, opts: Any): BN = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buf.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BN]
  }
  
  object ECDSA {
    
    @JSImport("bitcoin-computer-bitcore", "Bitcoin.crypto.ECDSA")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sign(message: Buffer, key: PrivateKey): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Signature]
    
    inline def sign_big(message: Buffer, key: PrivateKey, endian: big): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any], endian.asInstanceOf[js.Any])).asInstanceOf[Signature]
    
    inline def verify(hashbuf: Buffer, sig: Signature, pubkey: PublicKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(hashbuf.asInstanceOf[js.Any], sig.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def verify_little(hashbuf: Buffer, sig: Signature, pubkey: PublicKey, endian: little): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(hashbuf.asInstanceOf[js.Any], sig.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], endian.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object Hash {
    
    @JSImport("bitcoin-computer-bitcore", "Bitcoin.crypto.Hash")
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
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.crypto.Point")
  @js.native
  open class Point protected () extends StObject {
    def this(x: String, y: String, isRed: Boolean) = this()
    def this(x: String, y: BN, isRed: Boolean) = this()
    def this(x: BN, y: String, isRed: Boolean) = this()
    def this(x: BN, y: BN, isRed: Boolean) = this()
    
    def getX(): BN = js.native
  }
  object Point {
    
    @JSImport("bitcoin-computer-bitcore", "Bitcoin.crypto.Point")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromX(odd: Boolean, x: String): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromX")(odd.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Point]
    /* static member */
    inline def fromX(odd: Boolean, x: BN): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("fromX")(odd.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Point]
  }
  
  object Random {
    
    @JSImport("bitcoin-computer-bitcore", "Bitcoin.crypto.Random")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getRandomBuffer(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomBuffer")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.crypto.Signature")
  @js.native
  open class Signature () extends StObject {
    
    var SIGHASH_ALL: Double = js.native
    
    def toString(encoding: String): String = js.native
  }
  object Signature {
    
    @JSImport("bitcoin-computer-bitcore", "Bitcoin.crypto.Signature")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromDER(sig: Buffer): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDER")(sig.asInstanceOf[js.Any]).asInstanceOf[Signature]
    
    /* static member */
    inline def fromString(data: String): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(data.asInstanceOf[js.Any]).asInstanceOf[Signature]
  }
}
