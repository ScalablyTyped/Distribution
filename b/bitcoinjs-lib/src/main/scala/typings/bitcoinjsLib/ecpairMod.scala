package typings.bitcoinjsLib

import typings.bitcoinjsLib.networksMod.Network
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecpairMod {
  
  @JSImport("bitcoinjs-lib/types/ecpair", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromPrivateKey(buffer: Buffer): ECPair = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(buffer.asInstanceOf[js.Any]).asInstanceOf[ECPair]
  inline def fromPrivateKey(buffer: Buffer, options: ECPairOptions): ECPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ECPair]
  
  inline def fromPublicKey(buffer: Buffer): ECPair = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKey")(buffer.asInstanceOf[js.Any]).asInstanceOf[ECPair]
  inline def fromPublicKey(buffer: Buffer, options: ECPairOptions): ECPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPublicKey")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ECPair]
  
  inline def fromWIF(wifString: String): ECPair = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWIF")(wifString.asInstanceOf[js.Any]).asInstanceOf[ECPair]
  inline def fromWIF(wifString: String, network: js.Array[Network]): ECPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWIF")(wifString.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[ECPair]
  inline def fromWIF(wifString: String, network: Network): ECPair = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWIF")(wifString.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[ECPair]
  
  inline def makeRandom(): ECPair = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRandom")().asInstanceOf[ECPair]
  inline def makeRandom(options: ECPairOptions): ECPair = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRandom")(options.asInstanceOf[js.Any]).asInstanceOf[ECPair]
  
  @js.native
  trait ECPair
    extends StObject
       with ECPairInterface {
    
    /* private */ var __D: js.Any = js.native
    
    /* private */ var __Q: js.Any = js.native
  }
  
  @js.native
  trait ECPairInterface
    extends StObject
       with Signer {
    
    var compressed: Boolean = js.native
    
    var lowR: Boolean = js.native
    
    @JSName("network")
    var network_ECPairInterface: Network = js.native
    
    var privateKey: js.UndefOr[Buffer] = js.native
    
    def toWIF(): String = js.native
    
    def verify(hash: Buffer, signature: Buffer): Boolean = js.native
  }
  
  trait ECPairOptions extends StObject {
    
    var compressed: js.UndefOr[Boolean] = js.undefined
    
    var network: js.UndefOr[Network] = js.undefined
    
    var rng: js.UndefOr[js.Function1[/* arg0 */ Double, Buffer]] = js.undefined
  }
  object ECPairOptions {
    
    inline def apply(): ECPairOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ECPairOptions]
    }
    
    extension [Self <: ECPairOptions](x: Self) {
      
      inline def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      inline def setRng(value: /* arg0 */ Double => Buffer): Self = StObject.set(x, "rng", js.Any.fromFunction1(value))
      
      inline def setRngUndefined: Self = StObject.set(x, "rng", js.undefined)
    }
  }
  
  @js.native
  trait Signer extends StObject {
    
    var getPublicKey: js.UndefOr[js.Function0[Buffer]] = js.native
    
    var network: js.UndefOr[js.Any] = js.native
    
    var publicKey: Buffer = js.native
    
    def sign(hash: Buffer): Buffer = js.native
    def sign(hash: Buffer, lowR: Boolean): Buffer = js.native
  }
  
  @js.native
  trait SignerAsync extends StObject {
    
    var getPublicKey: js.UndefOr[js.Function0[Buffer]] = js.native
    
    var network: js.UndefOr[js.Any] = js.native
    
    var publicKey: Buffer = js.native
    
    def sign(hash: Buffer): js.Promise[Buffer] = js.native
    def sign(hash: Buffer, lowR: Boolean): js.Promise[Buffer] = js.native
  }
}
