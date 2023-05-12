package typings.cronValidate

import typings.cronValidate.libTypesMod.FieldOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<cron-validate.cron-validate/lib/types.Fields<cron-validate.cron-validate/lib/types.FieldOption>> & std.Partial<cron-validate.cron-validate/lib/types.ExtendFields> & std.Partial<cron-validate.cron-validate/lib/types.ExtendWildcards> */
  trait PartialFieldsFieldOptionP extends StObject {
    
    var allowOnlyOneBlankDayField: js.UndefOr[Boolean] = js.undefined
    
    var daysOfMonth: js.UndefOr[FieldOption] = js.undefined
    
    var daysOfWeek: js.UndefOr[FieldOption] = js.undefined
    
    var hours: js.UndefOr[FieldOption] = js.undefined
    
    var minutes: js.UndefOr[FieldOption] = js.undefined
    
    var months: js.UndefOr[FieldOption] = js.undefined
    
    var mustHaveBlankDayField: js.UndefOr[Boolean] = js.undefined
    
    var seconds: js.UndefOr[FieldOption] = js.undefined
    
    var useAliases: js.UndefOr[Boolean] = js.undefined
    
    var useBlankDay: js.UndefOr[Boolean] = js.undefined
    
    var useLastDayOfMonth: js.UndefOr[Boolean] = js.undefined
    
    var useLastDayOfWeek: js.UndefOr[Boolean] = js.undefined
    
    var useNearestWeekday: js.UndefOr[Boolean] = js.undefined
    
    var useNthWeekdayOfMonth: js.UndefOr[Boolean] = js.undefined
    
    var useSeconds: js.UndefOr[Boolean] = js.undefined
    
    var useYears: js.UndefOr[Boolean] = js.undefined
    
    var years: js.UndefOr[FieldOption] = js.undefined
  }
  object PartialFieldsFieldOptionP {
    
    inline def apply(): PartialFieldsFieldOptionP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFieldsFieldOptionP]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFieldsFieldOptionP] (val x: Self) extends AnyVal {
      
      inline def setAllowOnlyOneBlankDayField(value: Boolean): Self = StObject.set(x, "allowOnlyOneBlankDayField", value.asInstanceOf[js.Any])
      
      inline def setAllowOnlyOneBlankDayFieldUndefined: Self = StObject.set(x, "allowOnlyOneBlankDayField", js.undefined)
      
      inline def setDaysOfMonth(value: FieldOption): Self = StObject.set(x, "daysOfMonth", value.asInstanceOf[js.Any])
      
      inline def setDaysOfMonthUndefined: Self = StObject.set(x, "daysOfMonth", js.undefined)
      
      inline def setDaysOfWeek(value: FieldOption): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
      
      inline def setHours(value: FieldOption): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      inline def setMinutes(value: FieldOption): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setMonths(value: FieldOption): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setMustHaveBlankDayField(value: Boolean): Self = StObject.set(x, "mustHaveBlankDayField", value.asInstanceOf[js.Any])
      
      inline def setMustHaveBlankDayFieldUndefined: Self = StObject.set(x, "mustHaveBlankDayField", js.undefined)
      
      inline def setSeconds(value: FieldOption): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      inline def setUseAliases(value: Boolean): Self = StObject.set(x, "useAliases", value.asInstanceOf[js.Any])
      
      inline def setUseAliasesUndefined: Self = StObject.set(x, "useAliases", js.undefined)
      
      inline def setUseBlankDay(value: Boolean): Self = StObject.set(x, "useBlankDay", value.asInstanceOf[js.Any])
      
      inline def setUseBlankDayUndefined: Self = StObject.set(x, "useBlankDay", js.undefined)
      
      inline def setUseLastDayOfMonth(value: Boolean): Self = StObject.set(x, "useLastDayOfMonth", value.asInstanceOf[js.Any])
      
      inline def setUseLastDayOfMonthUndefined: Self = StObject.set(x, "useLastDayOfMonth", js.undefined)
      
      inline def setUseLastDayOfWeek(value: Boolean): Self = StObject.set(x, "useLastDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setUseLastDayOfWeekUndefined: Self = StObject.set(x, "useLastDayOfWeek", js.undefined)
      
      inline def setUseNearestWeekday(value: Boolean): Self = StObject.set(x, "useNearestWeekday", value.asInstanceOf[js.Any])
      
      inline def setUseNearestWeekdayUndefined: Self = StObject.set(x, "useNearestWeekday", js.undefined)
      
      inline def setUseNthWeekdayOfMonth(value: Boolean): Self = StObject.set(x, "useNthWeekdayOfMonth", value.asInstanceOf[js.Any])
      
      inline def setUseNthWeekdayOfMonthUndefined: Self = StObject.set(x, "useNthWeekdayOfMonth", js.undefined)
      
      inline def setUseSeconds(value: Boolean): Self = StObject.set(x, "useSeconds", value.asInstanceOf[js.Any])
      
      inline def setUseSecondsUndefined: Self = StObject.set(x, "useSeconds", js.undefined)
      
      inline def setUseYears(value: Boolean): Self = StObject.set(x, "useYears", value.asInstanceOf[js.Any])
      
      inline def setUseYearsUndefined: Self = StObject.set(x, "useYears", js.undefined)
      
      inline def setYears(value: FieldOption): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
    }
  }
}
