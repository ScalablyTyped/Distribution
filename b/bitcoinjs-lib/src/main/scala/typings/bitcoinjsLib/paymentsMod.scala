package typings.bitcoinjsLib

import typings.bitcoinjsLib.networksMod.Network
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paymentsMod {
  
  @JSImport("bitcoinjs-lib/types/payments", "embed")
  @js.native
  def embed(a: Payment): Payment = js.native
  @JSImport("bitcoinjs-lib/types/payments", "embed")
  @js.native
  def embed(a: Payment, opts: PaymentOpts): Payment = js.native
  
  @JSImport("bitcoinjs-lib/types/payments", "p2ms")
  @js.native
  def p2ms(a: Payment): Payment = js.native
  @JSImport("bitcoinjs-lib/types/payments", "p2ms")
  @js.native
  def p2ms(a: Payment, opts: PaymentOpts): Payment = js.native
  
  @JSImport("bitcoinjs-lib/types/payments", "p2pk")
  @js.native
  def p2pk(a: Payment): Payment = js.native
  @JSImport("bitcoinjs-lib/types/payments", "p2pk")
  @js.native
  def p2pk(a: Payment, opts: PaymentOpts): Payment = js.native
  
  @JSImport("bitcoinjs-lib/types/payments", "p2pkh")
  @js.native
  def p2pkh(a: Payment): Payment = js.native
  @JSImport("bitcoinjs-lib/types/payments", "p2pkh")
  @js.native
  def p2pkh(a: Payment, opts: PaymentOpts): Payment = js.native
  
  @JSImport("bitcoinjs-lib/types/payments", "p2sh")
  @js.native
  def p2sh(a: Payment): Payment = js.native
  @JSImport("bitcoinjs-lib/types/payments", "p2sh")
  @js.native
  def p2sh(a: Payment, opts: PaymentOpts): Payment = js.native
  
  @JSImport("bitcoinjs-lib/types/payments", "p2wpkh")
  @js.native
  def p2wpkh(a: Payment): Payment = js.native
  @JSImport("bitcoinjs-lib/types/payments", "p2wpkh")
  @js.native
  def p2wpkh(a: Payment, opts: PaymentOpts): Payment = js.native
  
  @JSImport("bitcoinjs-lib/types/payments", "p2wsh")
  @js.native
  def p2wsh(a: Payment): Payment = js.native
  @JSImport("bitcoinjs-lib/types/payments", "p2wsh")
  @js.native
  def p2wsh(a: Payment, opts: PaymentOpts): Payment = js.native
  
  @js.native
  trait Payment extends StObject {
    
    var address: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[js.Array[Buffer]] = js.native
    
    var hash: js.UndefOr[Buffer] = js.native
    
    var input: js.UndefOr[Buffer] = js.native
    
    var m: js.UndefOr[Double] = js.native
    
    var n: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var network: js.UndefOr[Network] = js.native
    
    var output: js.UndefOr[Buffer] = js.native
    
    var pubkey: js.UndefOr[Buffer] = js.native
    
    var pubkeys: js.UndefOr[js.Array[Buffer]] = js.native
    
    var redeem: js.UndefOr[Payment] = js.native
    
    var signature: js.UndefOr[Buffer] = js.native
    
    var signatures: js.UndefOr[js.Array[Buffer]] = js.native
    
    var witness: js.UndefOr[js.Array[Buffer]] = js.native
  }
  object Payment {
    
    @scala.inline
    def apply(): Payment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Payment]
    }
    
    @scala.inline
    implicit class PaymentMutableBuilder[Self <: Payment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[Buffer]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: Buffer*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setInput(value: Buffer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      @scala.inline
      def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      @scala.inline
      def setOutput(value: Buffer): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setPubkey(value: Buffer): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubkeyUndefined: Self = StObject.set(x, "pubkey", js.undefined)
      
      @scala.inline
      def setPubkeys(value: js.Array[Buffer]): Self = StObject.set(x, "pubkeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubkeysUndefined: Self = StObject.set(x, "pubkeys", js.undefined)
      
      @scala.inline
      def setPubkeysVarargs(value: Buffer*): Self = StObject.set(x, "pubkeys", js.Array(value :_*))
      
      @scala.inline
      def setRedeem(value: Payment): Self = StObject.set(x, "redeem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedeemUndefined: Self = StObject.set(x, "redeem", js.undefined)
      
      @scala.inline
      def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      @scala.inline
      def setSignatures(value: js.Array[Buffer]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
      
      @scala.inline
      def setSignaturesVarargs(value: Buffer*): Self = StObject.set(x, "signatures", js.Array(value :_*))
      
      @scala.inline
      def setWitness(value: js.Array[Buffer]): Self = StObject.set(x, "witness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWitnessUndefined: Self = StObject.set(x, "witness", js.undefined)
      
      @scala.inline
      def setWitnessVarargs(value: Buffer*): Self = StObject.set(x, "witness", js.Array(value :_*))
    }
  }
  
  type PaymentCreator = js.Function2[/* a */ Payment, /* opts */ js.UndefOr[PaymentOpts], Payment]
  
  type PaymentFunction = js.Function0[Payment]
  
  @js.native
  trait PaymentOpts extends StObject {
    
    var allowIncomplete: js.UndefOr[Boolean] = js.native
    
    var validate: js.UndefOr[Boolean] = js.native
  }
  object PaymentOpts {
    
    @scala.inline
    def apply(): PaymentOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentOpts]
    }
    
    @scala.inline
    implicit class PaymentOptsMutableBuilder[Self <: PaymentOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowIncomplete(value: Boolean): Self = StObject.set(x, "allowIncomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowIncompleteUndefined: Self = StObject.set(x, "allowIncomplete", js.undefined)
      
      @scala.inline
      def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  type Stack = js.Array[StackElement]
  
  type StackElement = Buffer | Double
  
  type StackFunction = js.Function0[Stack]
}
