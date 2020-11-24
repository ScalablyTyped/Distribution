package typings.bip174.typeFieldsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputTypes extends js.Object
@JSImport("bip174/src/lib/typeFields", "InputTypes")
@js.native
object InputTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputTypes with Double] = js.native
  
  @js.native
  sealed trait BIP32_DERIVATION extends InputTypes
  /* 6 */ @js.native
  object BIP32_DERIVATION extends TopLevel[BIP32_DERIVATION with Double]
  
  @js.native
  sealed trait FINAL_SCRIPTSIG extends InputTypes
  /* 7 */ @js.native
  object FINAL_SCRIPTSIG extends TopLevel[FINAL_SCRIPTSIG with Double]
  
  @js.native
  sealed trait FINAL_SCRIPTWITNESS extends InputTypes
  /* 8 */ @js.native
  object FINAL_SCRIPTWITNESS extends TopLevel[FINAL_SCRIPTWITNESS with Double]
  
  @js.native
  sealed trait NON_WITNESS_UTXO extends InputTypes
  /* 0 */ @js.native
  object NON_WITNESS_UTXO extends TopLevel[NON_WITNESS_UTXO with Double]
  
  @js.native
  sealed trait PARTIAL_SIG extends InputTypes
  /* 2 */ @js.native
  object PARTIAL_SIG extends TopLevel[PARTIAL_SIG with Double]
  
  @js.native
  sealed trait POR_COMMITMENT extends InputTypes
  /* 9 */ @js.native
  object POR_COMMITMENT extends TopLevel[POR_COMMITMENT with Double]
  
  @js.native
  sealed trait REDEEM_SCRIPT extends InputTypes
  /* 4 */ @js.native
  object REDEEM_SCRIPT extends TopLevel[REDEEM_SCRIPT with Double]
  
  @js.native
  sealed trait SIGHASH_TYPE extends InputTypes
  /* 3 */ @js.native
  object SIGHASH_TYPE extends TopLevel[SIGHASH_TYPE with Double]
  
  @js.native
  sealed trait WITNESS_SCRIPT extends InputTypes
  /* 5 */ @js.native
  object WITNESS_SCRIPT extends TopLevel[WITNESS_SCRIPT with Double]
  
  @js.native
  sealed trait WITNESS_UTXO extends InputTypes
  /* 1 */ @js.native
  object WITNESS_UTXO extends TopLevel[WITNESS_UTXO with Double]
}
