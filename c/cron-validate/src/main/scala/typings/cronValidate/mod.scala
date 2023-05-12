package typings.cronValidate

import typings.cronValidate.libResultMod.Err_
import typings.cronValidate.libResultMod.Valid_
import typings.cronValidate.libTypesMod.InputOptions
import typings.cronValidate.libTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cron-validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(cronString: String): (Err_[Options | CronData, js.Array[String]]) | (Valid_[CronData, js.Array[String]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cronString.asInstanceOf[js.Any]).asInstanceOf[(Err_[Options | CronData, js.Array[String]]) | (Valid_[CronData, js.Array[String]])]
  inline def default(cronString: String, inputOptions: InputOptions): (Err_[Options | CronData, js.Array[String]]) | (Valid_[CronData, js.Array[String]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cronString.asInstanceOf[js.Any], inputOptions.asInstanceOf[js.Any])).asInstanceOf[(Err_[Options | CronData, js.Array[String]]) | (Valid_[CronData, js.Array[String]])]
  
  trait CronData extends StObject {
    
    var daysOfMonth: String
    
    var daysOfWeek: String
    
    var hours: String
    
    var minutes: String
    
    var months: String
    
    var seconds: js.UndefOr[String] = js.undefined
    
    var years: js.UndefOr[String] = js.undefined
  }
  object CronData {
    
    inline def apply(daysOfMonth: String, daysOfWeek: String, hours: String, minutes: String, months: String): CronData = {
      val __obj = js.Dynamic.literal(daysOfMonth = daysOfMonth.asInstanceOf[js.Any], daysOfWeek = daysOfWeek.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any])
      __obj.asInstanceOf[CronData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CronData] (val x: Self) extends AnyVal {
      
      inline def setDaysOfMonth(value: String): Self = StObject.set(x, "daysOfMonth", value.asInstanceOf[js.Any])
      
      inline def setDaysOfWeek(value: String): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
      
      inline def setHours(value: String): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: String): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: String): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      inline def setYears(value: String): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cronValidate.cronValidateStrings.seconds
    - typings.cronValidate.cronValidateStrings.minutes
    - typings.cronValidate.cronValidateStrings.hours
    - typings.cronValidate.cronValidateStrings.daysOfMonth
    - typings.cronValidate.cronValidateStrings.months
    - typings.cronValidate.cronValidateStrings.daysOfWeek
    - typings.cronValidate.cronValidateStrings.years
  */
  trait CronFieldType extends StObject
  object CronFieldType {
    
    inline def daysOfMonth: typings.cronValidate.cronValidateStrings.daysOfMonth = "daysOfMonth".asInstanceOf[typings.cronValidate.cronValidateStrings.daysOfMonth]
    
    inline def daysOfWeek: typings.cronValidate.cronValidateStrings.daysOfWeek = "daysOfWeek".asInstanceOf[typings.cronValidate.cronValidateStrings.daysOfWeek]
    
    inline def hours: typings.cronValidate.cronValidateStrings.hours = "hours".asInstanceOf[typings.cronValidate.cronValidateStrings.hours]
    
    inline def minutes: typings.cronValidate.cronValidateStrings.minutes = "minutes".asInstanceOf[typings.cronValidate.cronValidateStrings.minutes]
    
    inline def months: typings.cronValidate.cronValidateStrings.months = "months".asInstanceOf[typings.cronValidate.cronValidateStrings.months]
    
    inline def seconds: typings.cronValidate.cronValidateStrings.seconds = "seconds".asInstanceOf[typings.cronValidate.cronValidateStrings.seconds]
    
    inline def years: typings.cronValidate.cronValidateStrings.years = "years".asInstanceOf[typings.cronValidate.cronValidateStrings.years]
  }
}
