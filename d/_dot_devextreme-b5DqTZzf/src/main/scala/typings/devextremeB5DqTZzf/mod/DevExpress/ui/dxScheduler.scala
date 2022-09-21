package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.data.DataSource
import typings.devextremeB5DqTZzf.mod.DevExpress.events.Cancelable
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.DxEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.std.Element
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxScheduler
  extends StObject
     with Widget[dxSchedulerOptions] {
  
  /**
    * Adds an appointment.
    */
  def addAppointment(appointment: dxSchedulerAppointment): Unit = js.native
  
  /**
    * Deletes an appointment from the timetable and its object from the data source.
    */
  def deleteAppointment(appointment: dxSchedulerAppointment): Unit = js.native
  
  def getDataSource(): DataSource[Any, Any] = js.native
  
  /**
    * Gets the current view&apos;s end date.
    */
  def getEndViewDate(): js.Date = js.native
  
  /**
    * Gets the current view&apos;s start date.
    */
  def getStartViewDate(): js.Date = js.native
  
  /**
    * Hides an appointment details form.
    */
  def hideAppointmentPopup(): Unit = js.native
  def hideAppointmentPopup(saveChanges: Boolean): Unit = js.native
  
  /**
    * Hides an appointment&apos;s or cell overflow indicator&apos;s tooltip.
    */
  def hideAppointmentTooltip(): Unit = js.native
  
  /**
    * Scrolls the current view to a specified position. Available for all views except &apos;agenda&apos;. You should specify the height property to use this method.
    */
  def scrollTo(date: js.Date): Unit = js.native
  def scrollTo(date: js.Date, group: js.Object): Unit = js.native
  def scrollTo(date: js.Date, group: js.Object, allDay: Boolean): Unit = js.native
  def scrollTo(date: js.Date, group: Unit, allDay: Boolean): Unit = js.native
  
  /**
    * Scrolls the current view to a specific day and time.
    * @deprecated Use scrollTo instead.
    */
  def scrollToTime(hours: Double, minutes: Double): Unit = js.native
  def scrollToTime(hours: Double, minutes: Double, date: js.Date): Unit = js.native
  
  /**
    * Shows the appointment details form.
    */
  def showAppointmentPopup(): Unit = js.native
  def showAppointmentPopup(appointmentData: Unit, createNewAppointment: Boolean): Unit = js.native
  def showAppointmentPopup(
    appointmentData: Unit,
    createNewAppointment: Boolean,
    currentAppointmentData: dxSchedulerAppointment
  ): Unit = js.native
  def showAppointmentPopup(appointmentData: Unit, createNewAppointment: Unit, currentAppointmentData: dxSchedulerAppointment): Unit = js.native
  def showAppointmentPopup(appointmentData: dxSchedulerAppointment): Unit = js.native
  def showAppointmentPopup(appointmentData: dxSchedulerAppointment, createNewAppointment: Boolean): Unit = js.native
  def showAppointmentPopup(
    appointmentData: dxSchedulerAppointment,
    createNewAppointment: Boolean,
    currentAppointmentData: dxSchedulerAppointment
  ): Unit = js.native
  def showAppointmentPopup(
    appointmentData: dxSchedulerAppointment,
    createNewAppointment: Unit,
    currentAppointmentData: dxSchedulerAppointment
  ): Unit = js.native
  
  /**
    * Shows a tooltip for a target element.
    */
  def showAppointmentTooltip(appointmentData: dxSchedulerAppointment, target: String): Unit = js.native
  def showAppointmentTooltip(
    appointmentData: dxSchedulerAppointment,
    target: String,
    currentAppointmentData: dxSchedulerAppointment
  ): Unit = js.native
  def showAppointmentTooltip(appointmentData: dxSchedulerAppointment, target: UserDefinedElement[Element]): Unit = js.native
  def showAppointmentTooltip(
    appointmentData: dxSchedulerAppointment,
    target: UserDefinedElement[Element],
    currentAppointmentData: dxSchedulerAppointment
  ): Unit = js.native
  
  /**
    * Updates an appointment.
    */
  def updateAppointment(target: dxSchedulerAppointment, appointment: dxSchedulerAppointment): Unit = js.native
}
object dxScheduler {
  
  type Appointment = dxSchedulerAppointment
  
  trait AppointmentAddedEvent
    extends StObject
       with EventInfo[dxScheduler] {
    
    val appointmentData: dxSchedulerAppointment
    
    val error: js.UndefOr[js.Error] = js.undefined
  }
  object AppointmentAddedEvent {
    
    inline def apply(appointmentData: dxSchedulerAppointment, component: dxScheduler, element: DxElement_[HTMLElement]): AppointmentAddedEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentAddedEvent]
    }
    
    extension [Self <: AppointmentAddedEvent](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait AppointmentAddingEvent
    extends StObject
       with EventInfo[dxScheduler] {
    
    val appointmentData: dxSchedulerAppointment
    
    var cancel: Boolean | js.Thenable[Boolean]
  }
  object AppointmentAddingEvent {
    
    inline def apply(
      appointmentData: dxSchedulerAppointment,
      cancel: Boolean | js.Thenable[Boolean],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): AppointmentAddingEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentAddingEvent]
    }
    
    extension [Self <: AppointmentAddingEvent](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: Boolean | js.Thenable[Boolean]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxScheduler, KeyboardEvent | MouseEvent | PointerEvent]
       with TargetedAppointmentInfo {
    
    val appointmentElement: DxElement_[HTMLElement]
  }
  object AppointmentClickEvent {
    
    inline def apply(
      appointmentData: dxSchedulerAppointment,
      appointmentElement: DxElement_[HTMLElement],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): AppointmentClickEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], appointmentElement = appointmentElement.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentClickEvent]
    }
    
    extension [Self <: AppointmentClickEvent](x: Self) {
      
      inline def setAppointmentElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "appointmentElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentCollectorTemplateData extends StObject {
    
    val appointmentCount: Double
    
    val isCompact: Boolean
  }
  object AppointmentCollectorTemplateData {
    
    inline def apply(appointmentCount: Double, isCompact: Boolean): AppointmentCollectorTemplateData = {
      val __obj = js.Dynamic.literal(appointmentCount = appointmentCount.asInstanceOf[js.Any], isCompact = isCompact.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentCollectorTemplateData]
    }
    
    extension [Self <: AppointmentCollectorTemplateData](x: Self) {
      
      inline def setAppointmentCount(value: Double): Self = StObject.set(x, "appointmentCount", value.asInstanceOf[js.Any])
      
      inline def setIsCompact(value: Boolean): Self = StObject.set(x, "isCompact", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentContextMenuEvent
    extends StObject
       with NativeEventInfo[dxScheduler, MouseEvent | PointerEvent | TouchEvent]
       with TargetedAppointmentInfo {
    
    val appointmentElement: DxElement_[HTMLElement]
  }
  object AppointmentContextMenuEvent {
    
    inline def apply(
      appointmentData: dxSchedulerAppointment,
      appointmentElement: DxElement_[HTMLElement],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): AppointmentContextMenuEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], appointmentElement = appointmentElement.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentContextMenuEvent]
    }
    
    extension [Self <: AppointmentContextMenuEvent](x: Self) {
      
      inline def setAppointmentElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "appointmentElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentDblClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxScheduler, MouseEvent | PointerEvent]
       with TargetedAppointmentInfo {
    
    val appointmentElement: DxElement_[HTMLElement]
  }
  object AppointmentDblClickEvent {
    
    inline def apply(
      appointmentData: dxSchedulerAppointment,
      appointmentElement: DxElement_[HTMLElement],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): AppointmentDblClickEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], appointmentElement = appointmentElement.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDblClickEvent]
    }
    
    extension [Self <: AppointmentDblClickEvent](x: Self) {
      
      inline def setAppointmentElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "appointmentElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentDeletedEvent
    extends StObject
       with EventInfo[dxScheduler] {
    
    val appointmentData: dxSchedulerAppointment
    
    val error: js.UndefOr[js.Error] = js.undefined
  }
  object AppointmentDeletedEvent {
    
    inline def apply(appointmentData: dxSchedulerAppointment, component: dxScheduler, element: DxElement_[HTMLElement]): AppointmentDeletedEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDeletedEvent]
    }
    
    extension [Self <: AppointmentDeletedEvent](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait AppointmentDeletingEvent
    extends StObject
       with EventInfo[dxScheduler] {
    
    val appointmentData: dxSchedulerAppointment
    
    var cancel: Boolean | js.Thenable[Boolean]
  }
  object AppointmentDeletingEvent {
    
    inline def apply(
      appointmentData: dxSchedulerAppointment,
      cancel: Boolean | js.Thenable[Boolean],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): AppointmentDeletingEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDeletingEvent]
    }
    
    extension [Self <: AppointmentDeletingEvent](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: Boolean | js.Thenable[Boolean]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentDraggingAddEvent
    extends StObject
       with AppointmentDraggingEvent {
    
    val fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toData: js.UndefOr[Any] = js.undefined
  }
  object AppointmentDraggingAddEvent {
    
    inline def apply(component: dxScheduler): AppointmentDraggingAddEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDraggingAddEvent]
    }
    
    extension [Self <: AppointmentDraggingAddEvent](x: Self) {
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromComponentUndefined: Self = StObject.set(x, "fromComponent", js.undefined)
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToComponentUndefined: Self = StObject.set(x, "toComponent", js.undefined)
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
    }
  }
  
  trait AppointmentDraggingEndEvent
    extends StObject
       with Cancelable
       with AppointmentDraggingEvent {
    
    val fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toData: js.UndefOr[Any] = js.undefined
  }
  object AppointmentDraggingEndEvent {
    
    inline def apply(component: dxScheduler): AppointmentDraggingEndEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDraggingEndEvent]
    }
    
    extension [Self <: AppointmentDraggingEndEvent](x: Self) {
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromComponentUndefined: Self = StObject.set(x, "fromComponent", js.undefined)
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToComponentUndefined: Self = StObject.set(x, "toComponent", js.undefined)
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  trait AppointmentDraggingEvent extends StObject {
    
    val component: dxScheduler
    
    val event: js.UndefOr[DxEvent[MouseEvent | TouchEvent]] = js.undefined
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val itemData: js.UndefOr[Any] = js.undefined
    
    val itemElement: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  }
  object AppointmentDraggingEvent {
    
    inline def apply(component: dxScheduler): AppointmentDraggingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDraggingEvent]
    }
    
    extension [Self <: AppointmentDraggingEvent](x: Self) {
      
      inline def setComponent(value: dxScheduler): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setItemData(value: Any): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setItemElementUndefined: Self = StObject.set(x, "itemElement", js.undefined)
    }
  }
  
  trait AppointmentDraggingMoveEvent
    extends StObject
       with Cancelable
       with AppointmentDraggingEvent {
    
    val fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toData: js.UndefOr[Any] = js.undefined
  }
  object AppointmentDraggingMoveEvent {
    
    inline def apply(component: dxScheduler): AppointmentDraggingMoveEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDraggingMoveEvent]
    }
    
    extension [Self <: AppointmentDraggingMoveEvent](x: Self) {
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromComponentUndefined: Self = StObject.set(x, "fromComponent", js.undefined)
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToComponentUndefined: Self = StObject.set(x, "toComponent", js.undefined)
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
    }
  }
  
  trait AppointmentDraggingRemoveEvent
    extends StObject
       with AppointmentDraggingEvent {
    
    val fromComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
    
    val toComponent: js.UndefOr[dxSortable | dxDraggable] = js.undefined
  }
  object AppointmentDraggingRemoveEvent {
    
    inline def apply(component: dxScheduler): AppointmentDraggingRemoveEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDraggingRemoveEvent]
    }
    
    extension [Self <: AppointmentDraggingRemoveEvent](x: Self) {
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromComponentUndefined: Self = StObject.set(x, "fromComponent", js.undefined)
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToComponentUndefined: Self = StObject.set(x, "toComponent", js.undefined)
    }
  }
  
  trait AppointmentDraggingStartEvent
    extends StObject
       with Cancelable
       with AppointmentDraggingEvent
  object AppointmentDraggingStartEvent {
    
    inline def apply(component: dxScheduler): AppointmentDraggingStartEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentDraggingStartEvent]
    }
  }
  
  trait AppointmentFormOpeningEvent
    extends StObject
       with Cancelable
       with EventInfo[dxScheduler] {
    
    val appointmentData: js.UndefOr[dxSchedulerAppointment] = js.undefined
    
    val form: dxForm
    
    val popup: dxPopup[typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxPopup.Properties]
  }
  object AppointmentFormOpeningEvent {
    
    inline def apply(
      component: dxScheduler,
      element: DxElement_[HTMLElement],
      form: dxForm,
      popup: dxPopup[typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxPopup.Properties]
    ): AppointmentFormOpeningEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentFormOpeningEvent]
    }
    
    extension [Self <: AppointmentFormOpeningEvent](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setAppointmentDataUndefined: Self = StObject.set(x, "appointmentData", js.undefined)
      
      inline def setForm(value: dxForm): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setPopup(value: dxPopup[typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxPopup.Properties]): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppointmentRenderedEvent
    extends StObject
       with EventInfo[dxScheduler]
       with TargetedAppointmentInfo {
    
    val appointmentElement: DxElement_[HTMLElement]
  }
  object AppointmentRenderedEvent {
    
    inline def apply(
      appointmentData: dxSchedulerAppointment,
      appointmentElement: DxElement_[HTMLElement],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): AppointmentRenderedEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], appointmentElement = appointmentElement.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentRenderedEvent]
    }
    
    extension [Self <: AppointmentRenderedEvent](x: Self) {
      
      inline def setAppointmentElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "appointmentElement", value.asInstanceOf[js.Any])
    }
  }
  
  type AppointmentTemplateData = TargetedAppointmentInfo
  
  type AppointmentTooltipTemplateData = TargetedAppointmentInfo
  
  trait AppointmentUpdatedEvent
    extends StObject
       with EventInfo[dxScheduler] {
    
    val appointmentData: dxSchedulerAppointment
    
    val error: js.UndefOr[js.Error] = js.undefined
  }
  object AppointmentUpdatedEvent {
    
    inline def apply(appointmentData: dxSchedulerAppointment, component: dxScheduler, element: DxElement_[HTMLElement]): AppointmentUpdatedEvent = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentUpdatedEvent]
    }
    
    extension [Self <: AppointmentUpdatedEvent](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait AppointmentUpdatingEvent
    extends StObject
       with EventInfo[dxScheduler] {
    
    var cancel: js.UndefOr[Boolean | js.Thenable[Boolean]] = js.undefined
    
    val newData: Any
    
    val oldData: Any
  }
  object AppointmentUpdatingEvent {
    
    inline def apply(component: dxScheduler, element: DxElement_[HTMLElement], newData: Any, oldData: Any): AppointmentUpdatingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppointmentUpdatingEvent]
    }
    
    extension [Self <: AppointmentUpdatingEvent](x: Self) {
      
      inline def setCancel(value: Boolean | js.Thenable[Boolean]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setNewData(value: Any): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
      
      inline def setOldData(value: Any): Self = StObject.set(x, "oldData", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxScheduler, KeyboardEvent | MouseEvent | PointerEvent] {
    
    val cellData: Any
    
    val cellElement: DxElement_[HTMLElement]
  }
  object CellClickEvent {
    
    inline def apply(
      cellData: Any,
      cellElement: DxElement_[HTMLElement],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): CellClickEvent = {
      val __obj = js.Dynamic.literal(cellData = cellData.asInstanceOf[js.Any], cellElement = cellElement.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellClickEvent]
    }
    
    extension [Self <: CellClickEvent](x: Self) {
      
      inline def setCellData(value: Any): Self = StObject.set(x, "cellData", value.asInstanceOf[js.Any])
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellContextMenuEvent
    extends StObject
       with NativeEventInfo[dxScheduler, MouseEvent | PointerEvent | TouchEvent] {
    
    val cellData: Any
    
    val cellElement: DxElement_[HTMLElement]
  }
  object CellContextMenuEvent {
    
    inline def apply(
      cellData: Any,
      cellElement: DxElement_[HTMLElement],
      component: dxScheduler,
      element: DxElement_[HTMLElement]
    ): CellContextMenuEvent = {
      val __obj = js.Dynamic.literal(cellData = cellData.asInstanceOf[js.Any], cellElement = cellElement.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellContextMenuEvent]
    }
    
    extension [Self <: CellContextMenuEvent](x: Self) {
      
      inline def setCellData(value: Any): Self = StObject.set(x, "cellData", value.asInstanceOf[js.Any])
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
    }
  }
  
  type ContentReadyEvent = EventInfo[dxScheduler]
  
  trait DateNavigatorTextInfo extends StObject {
    
    val endDate: js.Date
    
    val startDate: js.Date
    
    val text: String
  }
  object DateNavigatorTextInfo {
    
    inline def apply(endDate: js.Date, startDate: js.Date, text: String): DateNavigatorTextInfo = {
      val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateNavigatorTextInfo]
    }
    
    extension [Self <: DateNavigatorTextInfo](x: Self) {
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type DisposingEvent = EventInfo[dxScheduler]
  
  type InitializedEvent = InitializedEventInfo[dxScheduler]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxScheduler]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxScheduler, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxSchedulerOptions
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  trait TargetedAppointmentInfo extends StObject {
    
    val appointmentData: dxSchedulerAppointment
    
    val targetedAppointmentData: js.UndefOr[dxSchedulerAppointment] = js.undefined
  }
  object TargetedAppointmentInfo {
    
    inline def apply(appointmentData: dxSchedulerAppointment): TargetedAppointmentInfo = {
      val __obj = js.Dynamic.literal(appointmentData = appointmentData.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetedAppointmentInfo]
    }
    
    extension [Self <: TargetedAppointmentInfo](x: Self) {
      
      inline def setAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "appointmentData", value.asInstanceOf[js.Any])
      
      inline def setTargetedAppointmentData(value: dxSchedulerAppointment): Self = StObject.set(x, "targetedAppointmentData", value.asInstanceOf[js.Any])
      
      inline def setTargetedAppointmentDataUndefined: Self = StObject.set(x, "targetedAppointmentData", js.undefined)
    }
  }
}
