package typings.danishSsn

import typings.danishSsn.danishSsnStrings.Female
import typings.danishSsn.danishSsnStrings.Male
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(ssn: String): DanishSsnStatus = ^.asInstanceOf[js.Dynamic].apply(ssn.asInstanceOf[js.Any]).asInstanceOf[DanishSsnStatus]
  
  @JSImport("danish-ssn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValid(ssn: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(ssn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validForDate(date: js.Date): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("validForDate")(date.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def validate(ssn: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(ssn.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait DanishSsnStatus extends StObject {
    
    var cpr: String
    
    var date: js.Date
    
    var sex: Female | Male
    
    var valid: Boolean
  }
  object DanishSsnStatus {
    
    inline def apply(cpr: String, date: js.Date, sex: Female | Male, valid: Boolean): DanishSsnStatus = {
      val __obj = js.Dynamic.literal(cpr = cpr.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], sex = sex.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[DanishSsnStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DanishSsnStatus] (val x: Self) extends AnyVal {
      
      inline def setCpr(value: String): Self = StObject.set(x, "cpr", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setSex(value: Female | Male): Self = StObject.set(x, "sex", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
