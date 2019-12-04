package typings.bip174.srcLibTypeFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutputTypes extends js.Object

@JSImport("bip174/src/lib/typeFields", "OutputTypes")
@js.native
object OutputTypes extends js.Object {
  @js.native
  sealed trait BIP32_DERIVATION extends OutputTypes
  
  @js.native
  sealed trait REDEEM_SCRIPT extends OutputTypes
  
  @js.native
  sealed trait WITNESS_SCRIPT extends OutputTypes
  
  /* 2 */ val BIP32_DERIVATION: typings.bip174.srcLibTypeFieldsMod.OutputTypes.BIP32_DERIVATION with Double = js.native
  /* 0 */ val REDEEM_SCRIPT: typings.bip174.srcLibTypeFieldsMod.OutputTypes.REDEEM_SCRIPT with Double = js.native
  /* 1 */ val WITNESS_SCRIPT: typings.bip174.srcLibTypeFieldsMod.OutputTypes.WITNESS_SCRIPT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputTypes with Double] = js.native
}

