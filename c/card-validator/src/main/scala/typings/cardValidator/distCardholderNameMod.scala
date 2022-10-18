package typings.cardValidator

import typings.cardValidator.distTypesMod.Verification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCardholderNameMod {
  
  @JSImport("card-validator/dist/cardholder-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cardholderName(value: String): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cardholderName")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
  inline def cardholderName(value: Any): Verification = ^.asInstanceOf[js.Dynamic].applyDynamic("cardholderName")(value.asInstanceOf[js.Any]).asInstanceOf[Verification]
}
