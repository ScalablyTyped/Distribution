package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.AgendaDuration
import typings.devextremeB5DqTZzf.anon.AllowAdding
import typings.devextremeB5DqTZzf.anon.AllowMultiple
import typings.devextremeB5DqTZzf.anon.AutoScroll
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`0`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`1`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`2`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`3`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`4`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`5`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`6`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.agenda
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.auto
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.day
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.dialog
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.month
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.occurrence
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.series
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.timelineDay
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.timelineMonth
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.timelineWeek
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.timelineWorkWeek
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.unlimited
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.week
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.workWeek
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.Appointment
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.AppointmentAddedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.AppointmentAddingEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.AppointmentClickEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.AppointmentCollectorTemplateData
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.AppointmentContextMenuEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.AppointmentDblClickEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.AppointmentDeletedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.AppointmentDeletingEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.AppointmentFormOpeningEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.AppointmentRenderedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.AppointmentTemplateData
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.AppointmentUpdatedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.AppointmentUpdatingEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.CellClickEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.CellContextMenuEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxScheduler.DateNavigatorTextInfo
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSchedulerOptions
  extends StObject
     with WidgetOptions[dxScheduler] {
  
  /**
    * Specifies whether the UI component adapts to small screens.
    */
  var adaptivityEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name of the data source item field whose value defines whether or not the corresponding appointment is an all-day appointment.
    */
  var allDayExpr: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a custom template for cell overflow indicators.
    */
  var appointmentCollectorTemplate: js.UndefOr[
    template | (js.Function2[
      /* data */ AppointmentCollectorTemplateData, 
      /* collectorElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Configures appointment reordering using drag and drop gestures.
    */
  var appointmentDragging: js.UndefOr[AutoScroll] = js.undefined
  
  /**
    * Specifies a custom template for appointments.
    */
  var appointmentTemplate: js.UndefOr[
    template | (js.Function3[
      /* model */ AppointmentTemplateData, 
      /* itemIndex */ Double, 
      /* contentElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies a custom template for tooltips displayed when users click an appointment or cell overflow indicator.
    */
  var appointmentTooltipTemplate: js.UndefOr[
    template | (js.Function3[
      /* model */ AppointmentTemplateData, 
      /* itemIndex */ Double, 
      /* contentElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies cell duration in minutes. This property&apos;s value should divide the interval between startDayHour and endDayHour into even parts.
    */
  var cellDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether or not an end-user can scroll the view in both directions at the same time.
    */
  var crossScrollingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the current date.
    */
  var currentDate: js.UndefOr[js.Date | Double | String] = js.undefined
  
  /**
    * Specifies the displayed view. Accepts name or type of a view available in the views array.
    */
  var currentView: js.UndefOr[
    agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
  ] = js.undefined
  
  /**
    * Customizes the date navigator&apos;s text.
    */
  var customizeDateNavigatorText: js.UndefOr[js.Function1[/* info */ DateNavigatorTextInfo, String]] = js.undefined
  
  /**
    * Specifies a custom template for table cells.
    */
  var dataCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Binds the UI component to data.
    */
  var dataSource: js.UndefOr[DataSourceLike[Appointment, Any]] = js.undefined
  
  /**
    * Specifies a custom template for day scale items.
    */
  var dateCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies the format in which date-time values should be sent to the server.
    */
  var dateSerializationFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the data source item field whose value holds the description of the corresponding appointment.
    */
  var descriptionExpr: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a custom template for tooltips displayed when users click a cell overflow indicator.
    * @deprecated Use the appointmentTooltipTemplate option instead.
    */
  var dropDownAppointmentTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* contentElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies which editing operations a user can perform on appointments.
    */
  var editing: js.UndefOr[Boolean | AllowAdding] = js.undefined
  
  /**
    * Specifies the name of the data source item field that defines the ending of an appointment.
    */
  var endDateExpr: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the data source item field that defines the timezone of the appointment end date.
    */
  var endDateTimeZoneExpr: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the last hour on the time scale. Accepts integer values from 0 to 24.
    */
  var endDayHour: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the first day of a week. Does not apply to the agenda view.
    */
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  
  /**
    * If true, appointments are grouped by date first and then by resource; opposite if false. Applies only if appointments are grouped and groupOrientation is &apos;horizontal&apos;.
    */
  var groupByDate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the resource kinds by which the scheduler&apos;s appointments are grouped in a timetable.
    */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies the time interval between when the date-time indicator changes its position, in milliseconds.
    */
  var indicatorUpdateInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * The latest date the UI component allows you to select.
    */
  var max: js.UndefOr[js.Date | Double | String] = js.undefined
  
  /**
    * Specifies the limit of full-sized appointments displayed per cell. Applies to all views except &apos;agenda&apos;.
    */
  var maxAppointmentsPerCell: js.UndefOr[Double | auto | unlimited] = js.undefined
  
  /**
    * The earliest date the UI component allows you to select.
    */
  var min: js.UndefOr[js.Date | Double | String] = js.undefined
  
  /**
    * Specifies the text or HTML markup displayed by the UI component if the item collection is empty. Available for the Agenda view only.
    */
  var noDataText: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is executed after an appointment is added to the data source.
    */
  var onAppointmentAdded: js.UndefOr[js.Function1[/* e */ AppointmentAddedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before an appointment is added to the data source.
    */
  var onAppointmentAdding: js.UndefOr[js.Function1[/* e */ AppointmentAddingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when an appointment is clicked or tapped.
    */
  var onAppointmentClick: js.UndefOr[(js.Function1[/* e */ AppointmentClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a user attempts to open the browser&apos;s context menu for an appointment. Allows you to replace this context menu with a custom context menu.
    */
  var onAppointmentContextMenu: js.UndefOr[(js.Function1[/* e */ AppointmentContextMenuEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when an appointment is double-clicked or double-tapped.
    */
  var onAppointmentDblClick: js.UndefOr[(js.Function1[/* e */ AppointmentDblClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed after an appointment is deleted from the data source.
    */
  var onAppointmentDeleted: js.UndefOr[js.Function1[/* e */ AppointmentDeletedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before an appointment is deleted from the data source.
    */
  var onAppointmentDeleting: js.UndefOr[js.Function1[/* e */ AppointmentDeletingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before an appointment details form appears. Use this function to customize the form.
    */
  var onAppointmentFormOpening: js.UndefOr[js.Function1[/* e */ AppointmentFormOpeningEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when an appointment is rendered.
    */
  var onAppointmentRendered: js.UndefOr[js.Function1[/* e */ AppointmentRenderedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed after an appointment is updated in the data source.
    */
  var onAppointmentUpdated: js.UndefOr[js.Function1[/* e */ AppointmentUpdatedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before an appointment is updated in the data source.
    */
  var onAppointmentUpdating: js.UndefOr[js.Function1[/* e */ AppointmentUpdatingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a view cell is clicked.
    */
  var onCellClick: js.UndefOr[(js.Function1[/* e */ CellClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a user attempts to open the browser&apos;s context menu for a cell. Allows you to replace this context menu with a custom context menu.
    */
  var onCellContextMenu: js.UndefOr[(js.Function1[/* e */ CellContextMenuEvent, Unit]) | String] = js.undefined
  
  /**
    * Specifies the edit mode for recurring appointments.
    */
  var recurrenceEditMode: js.UndefOr[dialog | occurrence | series] = js.undefined
  
  /**
    * Specifies the name of the data source item field that defines exceptions for the current recurring appointment.
    */
  var recurrenceExceptionExpr: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the data source item field that defines a recurrence rule for generating recurring appointments.
    */
  var recurrenceRuleExpr: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether filtering is performed on the server or client side.
    */
  var remoteFiltering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a custom template for resource headers.
    */
  var resourceCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies an array of resources available in the scheduler.
    */
  var resources: js.UndefOr[js.Array[AllowMultiple]] = js.undefined
  
  /**
    * Configures scrolling.
    */
  var scrolling: js.UndefOr[dxSchedulerScrolling] = js.undefined
  
  /**
    * Currently selected cells&apos; data.
    */
  var selectedCellData: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Specifies whether to apply shading to cover the timetable up to the current time.
    */
  var shadeUntilCurrentTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the &apos;All-day&apos; panel&apos;s visibility. Setting this property to false hides the panel along with the all-day appointments.
    */
  var showAllDayPanel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the current date-time indicator&apos;s visibility.
    */
  var showCurrentTimeIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name of the data source item field that defines the start of an appointment.
    */
  var startDateExpr: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the data source item field that defines the timezone of the appointment start date.
    */
  var startDateTimeZoneExpr: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the first hour on the time scale. Accepts integer values from 0 to 24.
    */
  var startDayHour: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the name of the data source item field that holds the subject of an appointment.
    */
  var textExpr: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a custom template for time scale items.
    */
  var timeCellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ Any, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies the time zone for the Scheduler&apos;s grid. Accepts values from the IANA time zone database.
    */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether a user can switch views using tabs or a drop-down menu.
    */
  var useDropDownViewSwitcher: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies and configures the views to be available in the view switcher.
    */
  var views: js.UndefOr[
    js.Array[
      day | week | workWeek | month | timelineDay | timelineWeek | timelineWorkWeek | timelineMonth | agenda | AgendaDuration
    ]
  ] = js.undefined
}
object dxSchedulerOptions {
  
  inline def apply(): dxSchedulerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSchedulerOptions]
  }
  
  extension [Self <: dxSchedulerOptions](x: Self) {
    
    inline def setAdaptivityEnabled(value: Boolean): Self = StObject.set(x, "adaptivityEnabled", value.asInstanceOf[js.Any])
    
    inline def setAdaptivityEnabledUndefined: Self = StObject.set(x, "adaptivityEnabled", js.undefined)
    
    inline def setAllDayExpr(value: String): Self = StObject.set(x, "allDayExpr", value.asInstanceOf[js.Any])
    
    inline def setAllDayExprUndefined: Self = StObject.set(x, "allDayExpr", js.undefined)
    
    inline def setAppointmentCollectorTemplate(
      value: template | (js.Function2[
          /* data */ AppointmentCollectorTemplateData, 
          /* collectorElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "appointmentCollectorTemplate", value.asInstanceOf[js.Any])
    
    inline def setAppointmentCollectorTemplateFunction2(
      value: (/* data */ AppointmentCollectorTemplateData, /* collectorElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "appointmentCollectorTemplate", js.Any.fromFunction2(value))
    
    inline def setAppointmentCollectorTemplateUndefined: Self = StObject.set(x, "appointmentCollectorTemplate", js.undefined)
    
    inline def setAppointmentDragging(value: AutoScroll): Self = StObject.set(x, "appointmentDragging", value.asInstanceOf[js.Any])
    
    inline def setAppointmentDraggingUndefined: Self = StObject.set(x, "appointmentDragging", js.undefined)
    
    inline def setAppointmentTemplate(
      value: template | (js.Function3[
          /* model */ AppointmentTemplateData, 
          /* itemIndex */ Double, 
          /* contentElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "appointmentTemplate", value.asInstanceOf[js.Any])
    
    inline def setAppointmentTemplateFunction3(
      value: (/* model */ AppointmentTemplateData, /* itemIndex */ Double, /* contentElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "appointmentTemplate", js.Any.fromFunction3(value))
    
    inline def setAppointmentTemplateUndefined: Self = StObject.set(x, "appointmentTemplate", js.undefined)
    
    inline def setAppointmentTooltipTemplate(
      value: template | (js.Function3[
          /* model */ AppointmentTemplateData, 
          /* itemIndex */ Double, 
          /* contentElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "appointmentTooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setAppointmentTooltipTemplateFunction3(
      value: (/* model */ AppointmentTemplateData, /* itemIndex */ Double, /* contentElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "appointmentTooltipTemplate", js.Any.fromFunction3(value))
    
    inline def setAppointmentTooltipTemplateUndefined: Self = StObject.set(x, "appointmentTooltipTemplate", js.undefined)
    
    inline def setCellDuration(value: Double): Self = StObject.set(x, "cellDuration", value.asInstanceOf[js.Any])
    
    inline def setCellDurationUndefined: Self = StObject.set(x, "cellDuration", js.undefined)
    
    inline def setCrossScrollingEnabled(value: Boolean): Self = StObject.set(x, "crossScrollingEnabled", value.asInstanceOf[js.Any])
    
    inline def setCrossScrollingEnabledUndefined: Self = StObject.set(x, "crossScrollingEnabled", js.undefined)
    
    inline def setCurrentDate(value: js.Date | Double | String): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
    
    inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
    
    inline def setCurrentView(
      value: agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
    ): Self = StObject.set(x, "currentView", value.asInstanceOf[js.Any])
    
    inline def setCurrentViewUndefined: Self = StObject.set(x, "currentView", js.undefined)
    
    inline def setCustomizeDateNavigatorText(value: /* info */ DateNavigatorTextInfo => String): Self = StObject.set(x, "customizeDateNavigatorText", js.Any.fromFunction1(value))
    
    inline def setCustomizeDateNavigatorTextUndefined: Self = StObject.set(x, "customizeDateNavigatorText", js.undefined)
    
    inline def setDataCellTemplate(
      value: template | (js.Function3[
          /* itemData */ Any, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "dataCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setDataCellTemplateFunction3(
      value: (/* itemData */ Any, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "dataCellTemplate", js.Any.fromFunction3(value))
    
    inline def setDataCellTemplateUndefined: Self = StObject.set(x, "dataCellTemplate", js.undefined)
    
    inline def setDataSource(value: DataSourceLike[Appointment, Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: Appointment*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDateCellTemplate(
      value: template | (js.Function3[
          /* itemData */ Any, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "dateCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setDateCellTemplateFunction3(
      value: (/* itemData */ Any, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "dateCellTemplate", js.Any.fromFunction3(value))
    
    inline def setDateCellTemplateUndefined: Self = StObject.set(x, "dateCellTemplate", js.undefined)
    
    inline def setDateSerializationFormat(value: String): Self = StObject.set(x, "dateSerializationFormat", value.asInstanceOf[js.Any])
    
    inline def setDateSerializationFormatUndefined: Self = StObject.set(x, "dateSerializationFormat", js.undefined)
    
    inline def setDescriptionExpr(value: String): Self = StObject.set(x, "descriptionExpr", value.asInstanceOf[js.Any])
    
    inline def setDescriptionExprUndefined: Self = StObject.set(x, "descriptionExpr", js.undefined)
    
    inline def setDropDownAppointmentTemplate(
      value: template | (js.Function3[
          /* itemData */ Any, 
          /* itemIndex */ Double, 
          /* contentElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "dropDownAppointmentTemplate", value.asInstanceOf[js.Any])
    
    inline def setDropDownAppointmentTemplateFunction3(
      value: (/* itemData */ Any, /* itemIndex */ Double, /* contentElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "dropDownAppointmentTemplate", js.Any.fromFunction3(value))
    
    inline def setDropDownAppointmentTemplateUndefined: Self = StObject.set(x, "dropDownAppointmentTemplate", js.undefined)
    
    inline def setEditing(value: Boolean | AllowAdding): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    inline def setEndDateExpr(value: String): Self = StObject.set(x, "endDateExpr", value.asInstanceOf[js.Any])
    
    inline def setEndDateExprUndefined: Self = StObject.set(x, "endDateExpr", js.undefined)
    
    inline def setEndDateTimeZoneExpr(value: String): Self = StObject.set(x, "endDateTimeZoneExpr", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeZoneExprUndefined: Self = StObject.set(x, "endDateTimeZoneExpr", js.undefined)
    
    inline def setEndDayHour(value: Double): Self = StObject.set(x, "endDayHour", value.asInstanceOf[js.Any])
    
    inline def setEndDayHourUndefined: Self = StObject.set(x, "endDayHour", js.undefined)
    
    inline def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    inline def setGroupByDate(value: Boolean): Self = StObject.set(x, "groupByDate", value.asInstanceOf[js.Any])
    
    inline def setGroupByDateUndefined: Self = StObject.set(x, "groupByDate", js.undefined)
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setIndicatorUpdateInterval(value: Double): Self = StObject.set(x, "indicatorUpdateInterval", value.asInstanceOf[js.Any])
    
    inline def setIndicatorUpdateIntervalUndefined: Self = StObject.set(x, "indicatorUpdateInterval", js.undefined)
    
    inline def setMax(value: js.Date | Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxAppointmentsPerCell(value: Double | auto | unlimited): Self = StObject.set(x, "maxAppointmentsPerCell", value.asInstanceOf[js.Any])
    
    inline def setMaxAppointmentsPerCellUndefined: Self = StObject.set(x, "maxAppointmentsPerCell", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: js.Date | Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setNoDataText(value: String): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
    
    inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
    
    inline def setOnAppointmentAdded(value: /* e */ AppointmentAddedEvent => Unit): Self = StObject.set(x, "onAppointmentAdded", js.Any.fromFunction1(value))
    
    inline def setOnAppointmentAddedUndefined: Self = StObject.set(x, "onAppointmentAdded", js.undefined)
    
    inline def setOnAppointmentAdding(value: /* e */ AppointmentAddingEvent => Unit): Self = StObject.set(x, "onAppointmentAdding", js.Any.fromFunction1(value))
    
    inline def setOnAppointmentAddingUndefined: Self = StObject.set(x, "onAppointmentAdding", js.undefined)
    
    inline def setOnAppointmentClick(value: (js.Function1[/* e */ AppointmentClickEvent, Unit]) | String): Self = StObject.set(x, "onAppointmentClick", value.asInstanceOf[js.Any])
    
    inline def setOnAppointmentClickFunction1(value: /* e */ AppointmentClickEvent => Unit): Self = StObject.set(x, "onAppointmentClick", js.Any.fromFunction1(value))
    
    inline def setOnAppointmentClickUndefined: Self = StObject.set(x, "onAppointmentClick", js.undefined)
    
    inline def setOnAppointmentContextMenu(value: (js.Function1[/* e */ AppointmentContextMenuEvent, Unit]) | String): Self = StObject.set(x, "onAppointmentContextMenu", value.asInstanceOf[js.Any])
    
    inline def setOnAppointmentContextMenuFunction1(value: /* e */ AppointmentContextMenuEvent => Unit): Self = StObject.set(x, "onAppointmentContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnAppointmentContextMenuUndefined: Self = StObject.set(x, "onAppointmentContextMenu", js.undefined)
    
    inline def setOnAppointmentDblClick(value: (js.Function1[/* e */ AppointmentDblClickEvent, Unit]) | String): Self = StObject.set(x, "onAppointmentDblClick", value.asInstanceOf[js.Any])
    
    inline def setOnAppointmentDblClickFunction1(value: /* e */ AppointmentDblClickEvent => Unit): Self = StObject.set(x, "onAppointmentDblClick", js.Any.fromFunction1(value))
    
    inline def setOnAppointmentDblClickUndefined: Self = StObject.set(x, "onAppointmentDblClick", js.undefined)
    
    inline def setOnAppointmentDeleted(value: /* e */ AppointmentDeletedEvent => Unit): Self = StObject.set(x, "onAppointmentDeleted", js.Any.fromFunction1(value))
    
    inline def setOnAppointmentDeletedUndefined: Self = StObject.set(x, "onAppointmentDeleted", js.undefined)
    
    inline def setOnAppointmentDeleting(value: /* e */ AppointmentDeletingEvent => Unit): Self = StObject.set(x, "onAppointmentDeleting", js.Any.fromFunction1(value))
    
    inline def setOnAppointmentDeletingUndefined: Self = StObject.set(x, "onAppointmentDeleting", js.undefined)
    
    inline def setOnAppointmentFormOpening(value: /* e */ AppointmentFormOpeningEvent => Unit): Self = StObject.set(x, "onAppointmentFormOpening", js.Any.fromFunction1(value))
    
    inline def setOnAppointmentFormOpeningUndefined: Self = StObject.set(x, "onAppointmentFormOpening", js.undefined)
    
    inline def setOnAppointmentRendered(value: /* e */ AppointmentRenderedEvent => Unit): Self = StObject.set(x, "onAppointmentRendered", js.Any.fromFunction1(value))
    
    inline def setOnAppointmentRenderedUndefined: Self = StObject.set(x, "onAppointmentRendered", js.undefined)
    
    inline def setOnAppointmentUpdated(value: /* e */ AppointmentUpdatedEvent => Unit): Self = StObject.set(x, "onAppointmentUpdated", js.Any.fromFunction1(value))
    
    inline def setOnAppointmentUpdatedUndefined: Self = StObject.set(x, "onAppointmentUpdated", js.undefined)
    
    inline def setOnAppointmentUpdating(value: /* e */ AppointmentUpdatingEvent => Unit): Self = StObject.set(x, "onAppointmentUpdating", js.Any.fromFunction1(value))
    
    inline def setOnAppointmentUpdatingUndefined: Self = StObject.set(x, "onAppointmentUpdating", js.undefined)
    
    inline def setOnCellClick(value: (js.Function1[/* e */ CellClickEvent, Unit]) | String): Self = StObject.set(x, "onCellClick", value.asInstanceOf[js.Any])
    
    inline def setOnCellClickFunction1(value: /* e */ CellClickEvent => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction1(value))
    
    inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
    
    inline def setOnCellContextMenu(value: (js.Function1[/* e */ CellContextMenuEvent, Unit]) | String): Self = StObject.set(x, "onCellContextMenu", value.asInstanceOf[js.Any])
    
    inline def setOnCellContextMenuFunction1(value: /* e */ CellContextMenuEvent => Unit): Self = StObject.set(x, "onCellContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnCellContextMenuUndefined: Self = StObject.set(x, "onCellContextMenu", js.undefined)
    
    inline def setRecurrenceEditMode(value: dialog | occurrence | series): Self = StObject.set(x, "recurrenceEditMode", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceEditModeUndefined: Self = StObject.set(x, "recurrenceEditMode", js.undefined)
    
    inline def setRecurrenceExceptionExpr(value: String): Self = StObject.set(x, "recurrenceExceptionExpr", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceExceptionExprUndefined: Self = StObject.set(x, "recurrenceExceptionExpr", js.undefined)
    
    inline def setRecurrenceRuleExpr(value: String): Self = StObject.set(x, "recurrenceRuleExpr", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceRuleExprUndefined: Self = StObject.set(x, "recurrenceRuleExpr", js.undefined)
    
    inline def setRemoteFiltering(value: Boolean): Self = StObject.set(x, "remoteFiltering", value.asInstanceOf[js.Any])
    
    inline def setRemoteFilteringUndefined: Self = StObject.set(x, "remoteFiltering", js.undefined)
    
    inline def setResourceCellTemplate(
      value: template | (js.Function3[
          /* itemData */ Any, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "resourceCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setResourceCellTemplateFunction3(
      value: (/* itemData */ Any, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "resourceCellTemplate", js.Any.fromFunction3(value))
    
    inline def setResourceCellTemplateUndefined: Self = StObject.set(x, "resourceCellTemplate", js.undefined)
    
    inline def setResources(value: js.Array[AllowMultiple]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: AllowMultiple*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setScrolling(value: dxSchedulerScrolling): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setSelectedCellData(value: js.Array[Any]): Self = StObject.set(x, "selectedCellData", value.asInstanceOf[js.Any])
    
    inline def setSelectedCellDataUndefined: Self = StObject.set(x, "selectedCellData", js.undefined)
    
    inline def setSelectedCellDataVarargs(value: Any*): Self = StObject.set(x, "selectedCellData", js.Array(value*))
    
    inline def setShadeUntilCurrentTime(value: Boolean): Self = StObject.set(x, "shadeUntilCurrentTime", value.asInstanceOf[js.Any])
    
    inline def setShadeUntilCurrentTimeUndefined: Self = StObject.set(x, "shadeUntilCurrentTime", js.undefined)
    
    inline def setShowAllDayPanel(value: Boolean): Self = StObject.set(x, "showAllDayPanel", value.asInstanceOf[js.Any])
    
    inline def setShowAllDayPanelUndefined: Self = StObject.set(x, "showAllDayPanel", js.undefined)
    
    inline def setShowCurrentTimeIndicator(value: Boolean): Self = StObject.set(x, "showCurrentTimeIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowCurrentTimeIndicatorUndefined: Self = StObject.set(x, "showCurrentTimeIndicator", js.undefined)
    
    inline def setStartDateExpr(value: String): Self = StObject.set(x, "startDateExpr", value.asInstanceOf[js.Any])
    
    inline def setStartDateExprUndefined: Self = StObject.set(x, "startDateExpr", js.undefined)
    
    inline def setStartDateTimeZoneExpr(value: String): Self = StObject.set(x, "startDateTimeZoneExpr", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeZoneExprUndefined: Self = StObject.set(x, "startDateTimeZoneExpr", js.undefined)
    
    inline def setStartDayHour(value: Double): Self = StObject.set(x, "startDayHour", value.asInstanceOf[js.Any])
    
    inline def setStartDayHourUndefined: Self = StObject.set(x, "startDayHour", js.undefined)
    
    inline def setTextExpr(value: String): Self = StObject.set(x, "textExpr", value.asInstanceOf[js.Any])
    
    inline def setTextExprUndefined: Self = StObject.set(x, "textExpr", js.undefined)
    
    inline def setTimeCellTemplate(
      value: template | (js.Function3[
          /* itemData */ Any, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "timeCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setTimeCellTemplateFunction3(
      value: (/* itemData */ Any, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "timeCellTemplate", js.Any.fromFunction3(value))
    
    inline def setTimeCellTemplateUndefined: Self = StObject.set(x, "timeCellTemplate", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUseDropDownViewSwitcher(value: Boolean): Self = StObject.set(x, "useDropDownViewSwitcher", value.asInstanceOf[js.Any])
    
    inline def setUseDropDownViewSwitcherUndefined: Self = StObject.set(x, "useDropDownViewSwitcher", js.undefined)
    
    inline def setViews(
      value: js.Array[
          day | week | workWeek | month | timelineDay | timelineWeek | timelineWorkWeek | timelineMonth | agenda | AgendaDuration
        ]
    ): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setViewsVarargs(
      value: (day | week | workWeek | month | timelineDay | timelineWeek | timelineWorkWeek | timelineMonth | agenda | AgendaDuration)*
    ): Self = StObject.set(x, "views", js.Array(value*))
  }
}
