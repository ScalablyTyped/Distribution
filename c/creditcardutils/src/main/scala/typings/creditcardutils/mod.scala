package typings.creditcardutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("creditcardutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatCardExpiry(expiration: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatCardExpiry")(expiration.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def formatCardNumber(unformatted: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatCardNumber")(unformatted.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parseCardExpiry(expiration: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCardExpiry")(expiration.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @scala.inline
  def parseCardType(cardNumber: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCardType")(cardNumber.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def validateCardCVC(cvc: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCardCVC")(cvc.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def validateCardCVC(cvc: String, `type`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCardCVC")(cvc.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def validateCardExpiry(month: String, year: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCardExpiry")(month.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def validateCardNumber(cardNumber: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCardNumber")(cardNumber.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
