package typings.creditcardutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("creditcardutils", "formatCardExpiry")
  @js.native
  def formatCardExpiry(expiration: String): String = js.native
  
  @JSImport("creditcardutils", "formatCardNumber")
  @js.native
  def formatCardNumber(unformatted: String): String = js.native
  
  @JSImport("creditcardutils", "parseCardExpiry")
  @js.native
  def parseCardExpiry(expiration: String): js.Object = js.native
  
  @JSImport("creditcardutils", "parseCardType")
  @js.native
  def parseCardType(cardNumber: String): String = js.native
  
  @JSImport("creditcardutils", "validateCardCVC")
  @js.native
  def validateCardCVC(cvc: String): Boolean = js.native
  @JSImport("creditcardutils", "validateCardCVC")
  @js.native
  def validateCardCVC(cvc: String, `type`: String): Boolean = js.native
  
  @JSImport("creditcardutils", "validateCardExpiry")
  @js.native
  def validateCardExpiry(month: String, year: String): Boolean = js.native
  
  @JSImport("creditcardutils", "validateCardNumber")
  @js.native
  def validateCardNumber(cardNumber: String): Boolean = js.native
}
