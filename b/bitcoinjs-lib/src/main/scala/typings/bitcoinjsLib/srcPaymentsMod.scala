package typings.bitcoinjsLib

import typings.bitcoinjsLib.srcNetworksMod.Network
import typings.bitcoinjsLib.srcTypesMod.Taptree
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPaymentsMod {
  
  @JSImport("bitcoinjs-lib/src/payments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def embed(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("embed")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
  inline def embed(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("embed")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
  
  inline def p2ms(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2ms")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
  inline def p2ms(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2ms")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
  
  inline def p2pk(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2pk")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
  inline def p2pk(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2pk")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
  
  inline def p2pkh(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2pkh")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
  inline def p2pkh(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2pkh")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
  
  inline def p2sh(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2sh")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
  inline def p2sh(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2sh")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
  
  inline def p2tr(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2tr")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
  inline def p2tr(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2tr")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
  
  inline def p2wpkh(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2wpkh")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
  inline def p2wpkh(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2wpkh")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
  
  inline def p2wsh(a: Payment): Payment = ^.asInstanceOf[js.Dynamic].applyDynamic("p2wsh")(a.asInstanceOf[js.Any]).asInstanceOf[Payment]
  inline def p2wsh(a: Payment, opts: PaymentOpts): Payment = (^.asInstanceOf[js.Dynamic].applyDynamic("p2wsh")(a.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Payment]
  
  trait Payment extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Array[Buffer]] = js.undefined
    
    var hash: js.UndefOr[Buffer] = js.undefined
    
    var input: js.UndefOr[Buffer] = js.undefined
    
    var internalPubkey: js.UndefOr[Buffer] = js.undefined
    
    var m: js.UndefOr[Double] = js.undefined
    
    var n: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var network: js.UndefOr[Network] = js.undefined
    
    var output: js.UndefOr[Buffer] = js.undefined
    
    var pubkey: js.UndefOr[Buffer] = js.undefined
    
    var pubkeys: js.UndefOr[js.Array[Buffer]] = js.undefined
    
    var redeem: js.UndefOr[Payment] = js.undefined
    
    var redeemVersion: js.UndefOr[Double] = js.undefined
    
    var scriptTree: js.UndefOr[Taptree] = js.undefined
    
    var signature: js.UndefOr[Buffer] = js.undefined
    
    var signatures: js.UndefOr[js.Array[Buffer]] = js.undefined
    
    var witness: js.UndefOr[js.Array[Buffer]] = js.undefined
  }
  object Payment {
    
    inline def apply(): Payment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Payment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Payment] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setData(value: js.Array[Buffer]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Buffer*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setInput(value: Buffer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setInternalPubkey(value: Buffer): Self = StObject.set(x, "internalPubkey", value.asInstanceOf[js.Any])
      
      inline def setInternalPubkeyUndefined: Self = StObject.set(x, "internalPubkey", js.undefined)
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      inline def setOutput(value: Buffer): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPubkey(value: Buffer): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
      
      inline def setPubkeyUndefined: Self = StObject.set(x, "pubkey", js.undefined)
      
      inline def setPubkeys(value: js.Array[Buffer]): Self = StObject.set(x, "pubkeys", value.asInstanceOf[js.Any])
      
      inline def setPubkeysUndefined: Self = StObject.set(x, "pubkeys", js.undefined)
      
      inline def setPubkeysVarargs(value: Buffer*): Self = StObject.set(x, "pubkeys", js.Array(value*))
      
      inline def setRedeem(value: Payment): Self = StObject.set(x, "redeem", value.asInstanceOf[js.Any])
      
      inline def setRedeemUndefined: Self = StObject.set(x, "redeem", js.undefined)
      
      inline def setRedeemVersion(value: Double): Self = StObject.set(x, "redeemVersion", value.asInstanceOf[js.Any])
      
      inline def setRedeemVersionUndefined: Self = StObject.set(x, "redeemVersion", js.undefined)
      
      inline def setScriptTree(value: Taptree): Self = StObject.set(x, "scriptTree", value.asInstanceOf[js.Any])
      
      inline def setScriptTreeUndefined: Self = StObject.set(x, "scriptTree", js.undefined)
      
      inline def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setSignatures(value: js.Array[Buffer]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      inline def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
      
      inline def setSignaturesVarargs(value: Buffer*): Self = StObject.set(x, "signatures", js.Array(value*))
      
      inline def setWitness(value: js.Array[Buffer]): Self = StObject.set(x, "witness", value.asInstanceOf[js.Any])
      
      inline def setWitnessUndefined: Self = StObject.set(x, "witness", js.undefined)
      
      inline def setWitnessVarargs(value: Buffer*): Self = StObject.set(x, "witness", js.Array(value*))
    }
  }
  
  type PaymentCreator = js.Function2[/* a */ Payment, /* opts */ js.UndefOr[PaymentOpts], Payment]
  
  type PaymentFunction = js.Function0[Payment]
  
  trait PaymentOpts extends StObject {
    
    var allowIncomplete: js.UndefOr[Boolean] = js.undefined
    
    var validate: js.UndefOr[Boolean] = js.undefined
  }
  object PaymentOpts {
    
    inline def apply(): PaymentOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaymentOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaymentOpts] (val x: Self) extends AnyVal {
      
      inline def setAllowIncomplete(value: Boolean): Self = StObject.set(x, "allowIncomplete", value.asInstanceOf[js.Any])
      
      inline def setAllowIncompleteUndefined: Self = StObject.set(x, "allowIncomplete", js.undefined)
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  type Stack = js.Array[StackElement]
  
  type StackElement = Buffer | Double
  
  type StackFunction = js.Function0[Stack]
}
