package typings.cardValidator

import typings.cardValidator.typesMod.Verification
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expirationDateMod {
  
  @JSImport("card-validator/dist/expiration-date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def expirationDate(value: String): ExpirationDateVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationDateVerification]
  @scala.inline
  def expirationDate(value: String, maxElapsedYear: Double): ExpirationDateVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationDateVerification]
  @scala.inline
  def expirationDate(value: js.Any): ExpirationDateVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationDateVerification]
  @scala.inline
  def expirationDate(value: js.Any, maxElapsedYear: Double): ExpirationDateVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationDateVerification]
  @scala.inline
  def expirationDate(value: Record[String, String | Double]): ExpirationDateVerification = ^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any]).asInstanceOf[ExpirationDateVerification]
  @scala.inline
  def expirationDate(value: Record[String, String | Double], maxElapsedYear: Double): ExpirationDateVerification = (^.asInstanceOf[js.Dynamic].applyDynamic("expirationDate")(value.asInstanceOf[js.Any], maxElapsedYear.asInstanceOf[js.Any])).asInstanceOf[ExpirationDateVerification]
  
  trait ExpirationDateVerification
    extends StObject
       with Verification {
    
    var month: String | Null
    
    var year: String | Null
  }
  object ExpirationDateVerification {
    
    @scala.inline
    def apply(isPotentiallyValid: Boolean, isValid: Boolean): ExpirationDateVerification = {
      val __obj = js.Dynamic.literal(isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], month = null, year = null)
      __obj.asInstanceOf[ExpirationDateVerification]
    }
    
    @scala.inline
    implicit class ExpirationDateVerificationMutableBuilder[Self <: ExpirationDateVerification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNull: Self = StObject.set(x, "month", null)
      
      @scala.inline
      def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearNull: Self = StObject.set(x, "year", null)
    }
  }
}
