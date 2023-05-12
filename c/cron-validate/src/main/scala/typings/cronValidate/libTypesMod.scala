package typings.cronValidate

import typings.cronValidate.anon.PartialFieldsFieldOptionP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait ExtendFields extends StObject {
    
    var useSeconds: Boolean
    
    var useYears: Boolean
  }
  object ExtendFields {
    
    inline def apply(useSeconds: Boolean, useYears: Boolean): ExtendFields = {
      val __obj = js.Dynamic.literal(useSeconds = useSeconds.asInstanceOf[js.Any], useYears = useYears.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendFields] (val x: Self) extends AnyVal {
      
      inline def setUseSeconds(value: Boolean): Self = StObject.set(x, "useSeconds", value.asInstanceOf[js.Any])
      
      inline def setUseYears(value: Boolean): Self = StObject.set(x, "useYears", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtendWildcards extends StObject {
    
    var allowOnlyOneBlankDayField: Boolean
    
    var mustHaveBlankDayField: js.UndefOr[Boolean] = js.undefined
    
    var useAliases: js.UndefOr[Boolean] = js.undefined
    
    var useBlankDay: Boolean
    
    var useLastDayOfMonth: js.UndefOr[Boolean] = js.undefined
    
    var useLastDayOfWeek: js.UndefOr[Boolean] = js.undefined
    
    var useNearestWeekday: js.UndefOr[Boolean] = js.undefined
    
    var useNthWeekdayOfMonth: js.UndefOr[Boolean] = js.undefined
  }
  object ExtendWildcards {
    
    inline def apply(allowOnlyOneBlankDayField: Boolean, useBlankDay: Boolean): ExtendWildcards = {
      val __obj = js.Dynamic.literal(allowOnlyOneBlankDayField = allowOnlyOneBlankDayField.asInstanceOf[js.Any], useBlankDay = useBlankDay.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendWildcards]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendWildcards] (val x: Self) extends AnyVal {
      
      inline def setAllowOnlyOneBlankDayField(value: Boolean): Self = StObject.set(x, "allowOnlyOneBlankDayField", value.asInstanceOf[js.Any])
      
      inline def setMustHaveBlankDayField(value: Boolean): Self = StObject.set(x, "mustHaveBlankDayField", value.asInstanceOf[js.Any])
      
      inline def setMustHaveBlankDayFieldUndefined: Self = StObject.set(x, "mustHaveBlankDayField", js.undefined)
      
      inline def setUseAliases(value: Boolean): Self = StObject.set(x, "useAliases", value.asInstanceOf[js.Any])
      
      inline def setUseAliasesUndefined: Self = StObject.set(x, "useAliases", js.undefined)
      
      inline def setUseBlankDay(value: Boolean): Self = StObject.set(x, "useBlankDay", value.asInstanceOf[js.Any])
      
      inline def setUseLastDayOfMonth(value: Boolean): Self = StObject.set(x, "useLastDayOfMonth", value.asInstanceOf[js.Any])
      
      inline def setUseLastDayOfMonthUndefined: Self = StObject.set(x, "useLastDayOfMonth", js.undefined)
      
      inline def setUseLastDayOfWeek(value: Boolean): Self = StObject.set(x, "useLastDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setUseLastDayOfWeekUndefined: Self = StObject.set(x, "useLastDayOfWeek", js.undefined)
      
      inline def setUseNearestWeekday(value: Boolean): Self = StObject.set(x, "useNearestWeekday", value.asInstanceOf[js.Any])
      
      inline def setUseNearestWeekdayUndefined: Self = StObject.set(x, "useNearestWeekday", js.undefined)
      
      inline def setUseNthWeekdayOfMonth(value: Boolean): Self = StObject.set(x, "useNthWeekdayOfMonth", value.asInstanceOf[js.Any])
      
      inline def setUseNthWeekdayOfMonthUndefined: Self = StObject.set(x, "useNthWeekdayOfMonth", js.undefined)
    }
  }
  
  trait FieldOption extends StObject {
    
    var lowerLimit: js.UndefOr[Double] = js.undefined
    
    var upperLimit: js.UndefOr[Double] = js.undefined
  }
  object FieldOption {
    
    inline def apply(): FieldOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldOption] (val x: Self) extends AnyVal {
      
      inline def setLowerLimit(value: Double): Self = StObject.set(x, "lowerLimit", value.asInstanceOf[js.Any])
      
      inline def setLowerLimitUndefined: Self = StObject.set(x, "lowerLimit", js.undefined)
      
      inline def setUpperLimit(value: Double): Self = StObject.set(x, "upperLimit", value.asInstanceOf[js.Any])
      
      inline def setUpperLimitUndefined: Self = StObject.set(x, "upperLimit", js.undefined)
    }
  }
  
  trait Fields[T] extends StObject {
    
    var daysOfMonth: T
    
    var daysOfWeek: T
    
    var hours: T
    
    var minutes: T
    
    var months: T
    
    var seconds: T
    
    var years: T
  }
  object Fields {
    
    inline def apply[T](daysOfMonth: T, daysOfWeek: T, hours: T, minutes: T, months: T, seconds: T, years: T): Fields[T] = {
      val __obj = js.Dynamic.literal(daysOfMonth = daysOfMonth.asInstanceOf[js.Any], daysOfWeek = daysOfWeek.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fields[?], T] (val x: Self & Fields[T]) extends AnyVal {
      
      inline def setDaysOfMonth(value: T): Self = StObject.set(x, "daysOfMonth", value.asInstanceOf[js.Any])
      
      inline def setDaysOfWeek(value: T): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
      
      inline def setHours(value: T): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: T): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: T): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: T): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setYears(value: T): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  preset :string | cron-validate.cron-validate/lib/types.OptionPreset | undefined,   override :std.Partial<cron-validate.cron-validate/lib/types.Fields<cron-validate.cron-validate/lib/types.FieldOption>> & std.Partial<cron-validate.cron-validate/lib/types.ExtendFields> & std.Partial<cron-validate.cron-validate/lib/types.ExtendWildcards> | undefined} & std.Partial<cron-validate.cron-validate/lib/types.Fields<cron-validate.cron-validate/lib/types.FieldOption>> & std.Partial<cron-validate.cron-validate/lib/types.ExtendFields> */
  trait InputOptions extends StObject {
    
    var daysOfMonth: js.UndefOr[FieldOption] = js.undefined
    
    var daysOfWeek: js.UndefOr[FieldOption] = js.undefined
    
    var hours: js.UndefOr[FieldOption] = js.undefined
    
    var minutes: js.UndefOr[FieldOption] = js.undefined
    
    var months: js.UndefOr[FieldOption] = js.undefined
    
    var `override`: js.UndefOr[PartialFieldsFieldOptionP] = js.undefined
    
    var preset: js.UndefOr[String | OptionPreset] = js.undefined
    
    var seconds: js.UndefOr[FieldOption] = js.undefined
    
    var useSeconds: js.UndefOr[Boolean] = js.undefined
    
    var useYears: js.UndefOr[Boolean] = js.undefined
    
    var years: js.UndefOr[FieldOption] = js.undefined
  }
  object InputOptions {
    
    inline def apply(): InputOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputOptions] (val x: Self) extends AnyVal {
      
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
      
      inline def setOverride(value: PartialFieldsFieldOptionP): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      inline def setPreset(value: String | OptionPreset): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setSeconds(value: FieldOption): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      inline def setUseSeconds(value: Boolean): Self = StObject.set(x, "useSeconds", value.asInstanceOf[js.Any])
      
      inline def setUseSecondsUndefined: Self = StObject.set(x, "useSeconds", js.undefined)
      
      inline def setUseYears(value: Boolean): Self = StObject.set(x, "useYears", value.asInstanceOf[js.Any])
      
      inline def setUseYearsUndefined: Self = StObject.set(x, "useYears", js.undefined)
      
      inline def setYears(value: FieldOption): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
    }
  }
  
  trait OptionPreset
    extends StObject
       with Fields[OptionPresetFieldOptions]
       with ExtendFields
       with ExtendWildcards {
    
    var presetId: String
  }
  object OptionPreset {
    
    inline def apply(
      allowOnlyOneBlankDayField: Boolean,
      daysOfMonth: OptionPresetFieldOptions,
      daysOfWeek: OptionPresetFieldOptions,
      hours: OptionPresetFieldOptions,
      minutes: OptionPresetFieldOptions,
      months: OptionPresetFieldOptions,
      presetId: String,
      seconds: OptionPresetFieldOptions,
      useBlankDay: Boolean,
      useSeconds: Boolean,
      useYears: Boolean,
      years: OptionPresetFieldOptions
    ): OptionPreset = {
      val __obj = js.Dynamic.literal(allowOnlyOneBlankDayField = allowOnlyOneBlankDayField.asInstanceOf[js.Any], daysOfMonth = daysOfMonth.asInstanceOf[js.Any], daysOfWeek = daysOfWeek.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], presetId = presetId.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], useBlankDay = useBlankDay.asInstanceOf[js.Any], useSeconds = useSeconds.asInstanceOf[js.Any], useYears = useYears.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionPreset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionPreset] (val x: Self) extends AnyVal {
      
      inline def setPresetId(value: String): Self = StObject.set(x, "presetId", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionPresetFieldOptions extends StObject {
    
    var lowerLimit: js.UndefOr[Double] = js.undefined
    
    var maxValue: Double
    
    var minValue: Double
    
    var upperLimit: js.UndefOr[Double] = js.undefined
  }
  object OptionPresetFieldOptions {
    
    inline def apply(maxValue: Double, minValue: Double): OptionPresetFieldOptions = {
      val __obj = js.Dynamic.literal(maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionPresetFieldOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionPresetFieldOptions] (val x: Self) extends AnyVal {
      
      inline def setLowerLimit(value: Double): Self = StObject.set(x, "lowerLimit", value.asInstanceOf[js.Any])
      
      inline def setLowerLimitUndefined: Self = StObject.set(x, "lowerLimit", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setUpperLimit(value: Double): Self = StObject.set(x, "upperLimit", value.asInstanceOf[js.Any])
      
      inline def setUpperLimitUndefined: Self = StObject.set(x, "upperLimit", js.undefined)
    }
  }
  
  trait Options
    extends StObject
       with Fields[FieldOption]
       with ExtendFields
       with ExtendWildcards {
    
    var preset: OptionPreset
    
    var presetId: String
  }
  object Options {
    
    inline def apply(
      allowOnlyOneBlankDayField: Boolean,
      daysOfMonth: FieldOption,
      daysOfWeek: FieldOption,
      hours: FieldOption,
      minutes: FieldOption,
      months: FieldOption,
      preset: OptionPreset,
      presetId: String,
      seconds: FieldOption,
      useBlankDay: Boolean,
      useSeconds: Boolean,
      useYears: Boolean,
      years: FieldOption
    ): Options = {
      val __obj = js.Dynamic.literal(allowOnlyOneBlankDayField = allowOnlyOneBlankDayField.asInstanceOf[js.Any], daysOfMonth = daysOfMonth.asInstanceOf[js.Any], daysOfWeek = daysOfWeek.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any], presetId = presetId.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], useBlankDay = useBlankDay.asInstanceOf[js.Any], useSeconds = useSeconds.asInstanceOf[js.Any], useYears = useYears.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPreset(value: OptionPreset): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetId(value: String): Self = StObject.set(x, "presetId", value.asInstanceOf[js.Any])
    }
  }
}
