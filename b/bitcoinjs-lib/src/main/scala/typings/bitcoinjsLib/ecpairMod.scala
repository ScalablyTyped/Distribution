package typings.bitcoinjsLib

import typings.bitcoinjsLib.networksMod.Network
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecpairMod {
  
  @JSImport("bitcoinjs-lib/types/ecpair", "fromPrivateKey")
  @js.native
  def fromPrivateKey(buffer: Buffer): ECPair = js.native
  @JSImport("bitcoinjs-lib/types/ecpair", "fromPrivateKey")
  @js.native
  def fromPrivateKey(buffer: Buffer, options: ECPairOptions): ECPair = js.native
  
  @JSImport("bitcoinjs-lib/types/ecpair", "fromPublicKey")
  @js.native
  def fromPublicKey(buffer: Buffer): ECPair = js.native
  @JSImport("bitcoinjs-lib/types/ecpair", "fromPublicKey")
  @js.native
  def fromPublicKey(buffer: Buffer, options: ECPairOptions): ECPair = js.native
  
  @JSImport("bitcoinjs-lib/types/ecpair", "fromWIF")
  @js.native
  def fromWIF(wifString: String): ECPair = js.native
  @JSImport("bitcoinjs-lib/types/ecpair", "fromWIF")
  @js.native
  def fromWIF(wifString: String, network: js.Array[Network]): ECPair = js.native
  @JSImport("bitcoinjs-lib/types/ecpair", "fromWIF")
  @js.native
  def fromWIF(wifString: String, network: Network): ECPair = js.native
  
  @JSImport("bitcoinjs-lib/types/ecpair", "makeRandom")
  @js.native
  def makeRandom(): ECPair = js.native
  @JSImport("bitcoinjs-lib/types/ecpair", "makeRandom")
  @js.native
  def makeRandom(options: ECPairOptions): ECPair = js.native
  
  @js.native
  trait ECPair extends ECPairInterface {
    
    var __D: js.Any = js.native
    
    var __Q: js.Any = js.native
  }
  
  @js.native
  trait ECPairInterface extends Signer {
    
    var compressed: Boolean = js.native
    
    var lowR: Boolean = js.native
    
    @JSName("network")
    var network_ECPairInterface: Network = js.native
    
    var privateKey: js.UndefOr[Buffer] = js.native
    
    def toWIF(): String = js.native
    
    def verify(hash: Buffer, signature: Buffer): Boolean = js.native
  }
  
  @js.native
  trait ECPairOptions extends StObject {
    
    var compressed: js.UndefOr[Boolean] = js.native
    
    var network: js.UndefOr[Network] = js.native
    
    var rng: js.UndefOr[js.Function1[/* arg0 */ Double, Buffer]] = js.native
  }
  object ECPairOptions {
    
    @scala.inline
    def apply(): ECPairOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ECPairOptions]
    }
    
    @scala.inline
    implicit class ECPairOptionsMutableBuilder[Self <: ECPairOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
      
      @scala.inline
      def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      @scala.inline
      def setRng(value: /* arg0 */ Double => Buffer): Self = StObject.set(x, "rng", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRngUndefined: Self = StObject.set(x, "rng", js.undefined)
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
