package typings.bip174.typeFieldsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutputTypes extends js.Object
@JSImport("bip174/src/lib/typeFields", "OutputTypes")
@js.native
object OutputTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OutputTypes with Double] = js.native
  
  @js.native
  sealed trait BIP32_DERIVATION extends OutputTypes
  /* 2 */ @js.native
  object BIP32_DERIVATION extends TopLevel[BIP32_DERIVATION with Double]
  
  @js.native
  sealed trait REDEEM_SCRIPT extends OutputTypes
  /* 0 */ @js.native
  object REDEEM_SCRIPT extends TopLevel[REDEEM_SCRIPT with Double]
  
  @js.native
  sealed trait WITNESS_SCRIPT extends OutputTypes
  /* 1 */ @js.native
  object WITNESS_SCRIPT extends TopLevel[WITNESS_SCRIPT with Double]
}
