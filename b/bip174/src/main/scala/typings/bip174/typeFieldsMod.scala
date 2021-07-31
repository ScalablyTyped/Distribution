package typings.bip174

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeFieldsMod {
  
  @JSImport("bip174/src/lib/typeFields", "GLOBAL_TYPE_NAMES")
  @js.native
  val GLOBAL_TYPE_NAMES: js.Array[String] = js.native
  
  @js.native
  sealed trait GlobalTypes extends StObject
  @JSImport("bip174/src/lib/typeFields", "GlobalTypes")
  @js.native
  object GlobalTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[GlobalTypes & Double] = js.native
    
    @js.native
    sealed trait GLOBAL_XPUB
      extends StObject
         with GlobalTypes
    /* 1 */ val GLOBAL_XPUB: typings.bip174.typeFieldsMod.GlobalTypes.GLOBAL_XPUB & Double = js.native
    
    @js.native
    sealed trait UNSIGNED_TX
      extends StObject
         with GlobalTypes
    /* 0 */ val UNSIGNED_TX: typings.bip174.typeFieldsMod.GlobalTypes.UNSIGNED_TX & Double = js.native
  }
  
  @JSImport("bip174/src/lib/typeFields", "INPUT_TYPE_NAMES")
  @js.native
  val INPUT_TYPE_NAMES: js.Array[String] = js.native
  
  @js.native
  sealed trait InputTypes extends StObject
  @JSImport("bip174/src/lib/typeFields", "InputTypes")
  @js.native
  object InputTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InputTypes & Double] = js.native
    
    @js.native
    sealed trait BIP32_DERIVATION
      extends StObject
         with InputTypes
    /* 6 */ val BIP32_DERIVATION: typings.bip174.typeFieldsMod.InputTypes.BIP32_DERIVATION & Double = js.native
    
    @js.native
    sealed trait FINAL_SCRIPTSIG
      extends StObject
         with InputTypes
    /* 7 */ val FINAL_SCRIPTSIG: typings.bip174.typeFieldsMod.InputTypes.FINAL_SCRIPTSIG & Double = js.native
    
    @js.native
    sealed trait FINAL_SCRIPTWITNESS
      extends StObject
         with InputTypes
    /* 8 */ val FINAL_SCRIPTWITNESS: typings.bip174.typeFieldsMod.InputTypes.FINAL_SCRIPTWITNESS & Double = js.native
    
    @js.native
    sealed trait NON_WITNESS_UTXO
      extends StObject
         with InputTypes
    /* 0 */ val NON_WITNESS_UTXO: typings.bip174.typeFieldsMod.InputTypes.NON_WITNESS_UTXO & Double = js.native
    
    @js.native
    sealed trait PARTIAL_SIG
      extends StObject
         with InputTypes
    /* 2 */ val PARTIAL_SIG: typings.bip174.typeFieldsMod.InputTypes.PARTIAL_SIG & Double = js.native
    
    @js.native
    sealed trait POR_COMMITMENT
      extends StObject
         with InputTypes
    /* 9 */ val POR_COMMITMENT: typings.bip174.typeFieldsMod.InputTypes.POR_COMMITMENT & Double = js.native
    
    @js.native
    sealed trait REDEEM_SCRIPT
      extends StObject
         with InputTypes
    /* 4 */ val REDEEM_SCRIPT: typings.bip174.typeFieldsMod.InputTypes.REDEEM_SCRIPT & Double = js.native
    
    @js.native
    sealed trait SIGHASH_TYPE
      extends StObject
         with InputTypes
    /* 3 */ val SIGHASH_TYPE: typings.bip174.typeFieldsMod.InputTypes.SIGHASH_TYPE & Double = js.native
    
    @js.native
    sealed trait WITNESS_SCRIPT
      extends StObject
         with InputTypes
    /* 5 */ val WITNESS_SCRIPT: typings.bip174.typeFieldsMod.InputTypes.WITNESS_SCRIPT & Double = js.native
    
    @js.native
    sealed trait WITNESS_UTXO
      extends StObject
         with InputTypes
    /* 1 */ val WITNESS_UTXO: typings.bip174.typeFieldsMod.InputTypes.WITNESS_UTXO & Double = js.native
  }
  
  @JSImport("bip174/src/lib/typeFields", "OUTPUT_TYPE_NAMES")
  @js.native
  val OUTPUT_TYPE_NAMES: js.Array[String] = js.native
  
  @js.native
  sealed trait OutputTypes extends StObject
  @JSImport("bip174/src/lib/typeFields", "OutputTypes")
  @js.native
  object OutputTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OutputTypes & Double] = js.native
    
    @js.native
    sealed trait BIP32_DERIVATION
      extends StObject
         with OutputTypes
    /* 2 */ val BIP32_DERIVATION: typings.bip174.typeFieldsMod.OutputTypes.BIP32_DERIVATION & Double = js.native
    
    @js.native
    sealed trait REDEEM_SCRIPT
      extends StObject
         with OutputTypes
    /* 0 */ val REDEEM_SCRIPT: typings.bip174.typeFieldsMod.OutputTypes.REDEEM_SCRIPT & Double = js.native
    
    @js.native
    sealed trait WITNESS_SCRIPT
      extends StObject
         with OutputTypes
    /* 1 */ val WITNESS_SCRIPT: typings.bip174.typeFieldsMod.OutputTypes.WITNESS_SCRIPT & Double = js.native
  }
}
