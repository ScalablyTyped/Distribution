package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSchedulerAppointment
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies whether the appointment lasts all day.
    */
  var allDay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a detail description of the appointment.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the ending of the appointment.
    */
  var endDate: js.UndefOr[js.Date | String] = js.undefined
  
  /**
    * Specifies the time zone for an appointment&apos;s endDate. Accepts values from the IANA time zone database.
    */
  var endDateTimeZone: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the start date and time of one or more appointments to exclude from a series. This property requires that you also set recurrenceRule.
    */
  var recurrenceException: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a recurrence rule based on which the Scheduler generates an appointment series.
    */
  var recurrenceRule: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the start of the appointment.
    */
  var startDate: js.UndefOr[js.Date | String] = js.undefined
  
  /**
    * Specifies the time zone for an appointment&apos;s startDate. Accepts values from the IANA time zone database.
    */
  var startDateTimeZone: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a template that should be used to render this appointment only.
    */
  @JSName("template")
  var template_dxSchedulerAppointment: js.UndefOr[template] = js.undefined
}
object dxSchedulerAppointment {
  
  inline def apply(): dxSchedulerAppointment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSchedulerAppointment]
  }
  
  extension [Self <: dxSchedulerAppointment](x: Self) {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndDate(value: js.Date | String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeZone(value: String): Self = StObject.set(x, "endDateTimeZone", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeZoneUndefined: Self = StObject.set(x, "endDateTimeZone", js.undefined)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setRecurrenceException(value: String): Self = StObject.set(x, "recurrenceException", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceExceptionUndefined: Self = StObject.set(x, "recurrenceException", js.undefined)
    
    inline def setRecurrenceRule(value: String): Self = StObject.set(x, "recurrenceRule", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceRuleUndefined: Self = StObject.set(x, "recurrenceRule", js.undefined)
    
    inline def setStartDate(value: js.Date | String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeZone(value: String): Self = StObject.set(x, "startDateTimeZone", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeZoneUndefined: Self = StObject.set(x, "startDateTimeZone", js.undefined)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setTemplate(value: template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
