package typings.creditcardutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("creditcardutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatCardExpiry(expiration: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatCardExpiry")(expiration.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatCardNumber(unformatted: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatCardNumber")(unformatted.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseCardExpiry(expiration: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCardExpiry")(expiration.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def parseCardType(cardNumber: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCardType")(cardNumber.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validateCardCVC(cvc: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCardCVC")(cvc.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validateCardCVC(cvc: String, `type`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCardCVC")(cvc.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validateCardExpiry(month: String, year: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCardExpiry")(month.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validateCardNumber(cardNumber: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCardNumber")(cardNumber.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
