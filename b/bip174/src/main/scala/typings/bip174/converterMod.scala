package typings.bip174

import typings.bip174.anon.CanAdd
import typings.bip174.anon.CanAddToArray
import typings.bip174.anon.TypeoffinalScriptSig
import typings.bip174.anon.TypeoffinalScriptWitness
import typings.bip174.anon.TypeofglobalXpub
import typings.bip174.anon.TypeofnonWitnessUtxo
import typings.bip174.anon.TypeofpartialSig
import typings.bip174.anon.TypeofporCommitment
import typings.bip174.anon.TypeofsighashType
import typings.bip174.anon.TypeofunsignedTx
import typings.bip174.anon.TypeofwitnessUtxo
import typings.bip174.interfacesMod.KeyValue
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bip174/src/lib/converter", JSImport.Namespace)
@js.native
object converterMod extends js.Object {
  
  @js.native
  object globals extends js.Object {
    
    def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = js.native
    
    var globalXpub: TypeofglobalXpub = js.native
    
    var unsignedTx: TypeofunsignedTx = js.native
  }
  
  @js.native
  object inputs extends js.Object {
    
    var bip32Derivation: CanAddToArray = js.native
    
    def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = js.native
    
    var finalScriptSig: TypeoffinalScriptSig = js.native
    
    var finalScriptWitness: TypeoffinalScriptWitness = js.native
    
    var nonWitnessUtxo: TypeofnonWitnessUtxo = js.native
    
    var partialSig: TypeofpartialSig = js.native
    
    var porCommitment: TypeofporCommitment = js.native
    
    var redeemScript: CanAdd = js.native
    
    var sighashType: TypeofsighashType = js.native
    
    var witnessScript: CanAdd = js.native
    
    var witnessUtxo: TypeofwitnessUtxo = js.native
  }
  
  @js.native
  object outputs extends js.Object {
    
    var bip32Derivation: CanAddToArray = js.native
    
    def checkPubkey(keyVal: KeyValue): js.UndefOr[Buffer] = js.native
    
    var redeemScript: CanAdd = js.native
    
    var witnessScript: CanAdd = js.native
  }
}
