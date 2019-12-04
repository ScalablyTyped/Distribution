package typings.bip174.srcLibTypeFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputTypes extends js.Object

@JSImport("bip174/src/lib/typeFields", "InputTypes")
@js.native
object InputTypes extends js.Object {
  @js.native
  sealed trait BIP32_DERIVATION extends InputTypes
  
  @js.native
  sealed trait FINAL_SCRIPTSIG extends InputTypes
  
  @js.native
  sealed trait FINAL_SCRIPTWITNESS extends InputTypes
  
  @js.native
  sealed trait NON_WITNESS_UTXO extends InputTypes
  
  @js.native
  sealed trait PARTIAL_SIG extends InputTypes
  
  @js.native
  sealed trait POR_COMMITMENT extends InputTypes
  
  @js.native
  sealed trait REDEEM_SCRIPT extends InputTypes
  
  @js.native
  sealed trait SIGHASH_TYPE extends InputTypes
  
  @js.native
  sealed trait WITNESS_SCRIPT extends InputTypes
  
  @js.native
  sealed trait WITNESS_UTXO extends InputTypes
  
  /* 6 */ val BIP32_DERIVATION: typings.bip174.srcLibTypeFieldsMod.InputTypes.BIP32_DERIVATION with Double = js.native
  /* 7 */ val FINAL_SCRIPTSIG: typings.bip174.srcLibTypeFieldsMod.InputTypes.FINAL_SCRIPTSIG with Double = js.native
  /* 8 */ val FINAL_SCRIPTWITNESS: typings.bip174.srcLibTypeFieldsMod.InputTypes.FINAL_SCRIPTWITNESS with Double = js.native
  /* 0 */ val NON_WITNESS_UTXO: typings.bip174.srcLibTypeFieldsMod.InputTypes.NON_WITNESS_UTXO with Double = js.native
  /* 2 */ val PARTIAL_SIG: typings.bip174.srcLibTypeFieldsMod.InputTypes.PARTIAL_SIG with Double = js.native
  /* 9 */ val POR_COMMITMENT: typings.bip174.srcLibTypeFieldsMod.InputTypes.POR_COMMITMENT with Double = js.native
  /* 4 */ val REDEEM_SCRIPT: typings.bip174.srcLibTypeFieldsMod.InputTypes.REDEEM_SCRIPT with Double = js.native
  /* 3 */ val SIGHASH_TYPE: typings.bip174.srcLibTypeFieldsMod.InputTypes.SIGHASH_TYPE with Double = js.native
  /* 5 */ val WITNESS_SCRIPT: typings.bip174.srcLibTypeFieldsMod.InputTypes.WITNESS_SCRIPT with Double = js.native
  /* 1 */ val WITNESS_UTXO: typings.bip174.srcLibTypeFieldsMod.InputTypes.WITNESS_UTXO with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputTypes with Double] = js.native
}

