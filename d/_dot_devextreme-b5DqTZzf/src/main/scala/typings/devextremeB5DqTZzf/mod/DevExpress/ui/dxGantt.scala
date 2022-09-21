package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import typings.devextremeB5DqTZzf.mod.DevExpress.events.Cancelable
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.DxEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Number
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxGantt
  extends StObject
     with Widget[dxGanttOptions] {
  
  /**
    * Assigns a resource to a task.
    */
  def assignResourceToTask(resourceKey: Any, taskKey: Any): Unit = js.native
  
  /**
    * Collapses all tasks.
    */
  def collapseAll(): Unit = js.native
  
  /**
    * Collapses a task.
    */
  def collapseTask(key: Any): Unit = js.native
  
  /**
    * Deletes a dependency.
    */
  def deleteDependency(key: Any): Unit = js.native
  
  /**
    * Deletes a resource.
    */
  def deleteResource(key: Any): Unit = js.native
  
  /**
    * Deletes a task.
    */
  def deleteTask(key: Any): Unit = js.native
  
  /**
    * Expands all tasks.
    */
  def expandAll(): Unit = js.native
  
  /**
    * Expands all tasks down to the specified hierarchical level.
    */
  def expandAllToLevel(level: Number): Unit = js.native
  
  /**
    * Expands a task.
    */
  def expandTask(key: Any): Unit = js.native
  
  /**
    * Expands a task&apos;s parent tasks.
    */
  def expandToTask(key: Any): Unit = js.native
  
  /**
    * Gets the dependency data.
    */
  def getDependencyData(key: Any): Any = js.native
  
  /**
    * Gets the resource assignment data.
    */
  def getResourceAssignmentData(key: Any): Any = js.native
  
  /**
    * Gets the resource data.
    */
  def getResourceData(key: Any): Any = js.native
  
  /**
    * Gets the task data.
    */
  def getTaskData(key: Any): Any = js.native
  
  /**
    * Gets resources assigned to a task.
    */
  def getTaskResources(key: Any): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible dependencies.
    */
  def getVisibleDependencyKeys(): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible resource assignments.
    */
  def getVisibleResourceAssignmentKeys(): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible resources.
    */
  def getVisibleResourceKeys(): js.Array[Any] = js.native
  
  /**
    * Gets the keys of the visible tasks.
    */
  def getVisibleTaskKeys(): js.Array[Any] = js.native
  
  /**
    * Inserts a new dependency.
    */
  def insertDependency(data: Any): Unit = js.native
  
  /**
    * Inserts a new resource.
    */
  def insertResource(data: Any): Unit = js.native
  def insertResource(data: Any, taskKeys: js.Array[Any]): Unit = js.native
  
  /**
    * Inserts a new task.
    */
  def insertTask(data: Any): Unit = js.native
  
  /**
    * Reloads data and repaints the Gantt component.
    */
  def refresh(): DxPromise[Unit] = js.native
  
  def scrollToDate(date: String): Unit = js.native
  /**
    * Scrolls the Gantt chart to the specified date.
    */
  def scrollToDate(date: js.Date): Unit = js.native
  def scrollToDate(date: Number): Unit = js.native
  
  /**
    * Shows or hides dependencies between tasks.
    */
  def showDependencies(value: Boolean): Unit = js.native
  
  /**
    * Invokes the &apos;Resource Manager&apos; dialog.
    */
  def showResourceManagerDialog(): Unit = js.native
  
  /**
    * Shows or hides task resources.
    */
  def showResources(value: Boolean): Unit = js.native
  
  /**
    * Invokes the &apos;Task Details&apos; dialog.
    */
  def showTaskDetailsDialog(taskKey: Any): Unit = js.native
  
  /**
    * Removes all resources from the task.
    */
  def unassignAllResourcesFromTask(taskKey: Any): Unit = js.native
  
  /**
    * Removes a resource from the task.
    */
  def unassignResourceFromTask(resourceKey: Any, taskKey: Any): Unit = js.native
  
  /**
    * Updates the dimensions of the UI component contents.
    */
  def updateDimensions(): Unit = js.native
  
  /**
    * Updates the task data.
    */
  def updateTask(key: Any, data: Any): Unit = js.native
  
  /**
    * Zooms in the Gantt chart.
    */
  def zoomIn(): Unit = js.native
  
  /**
    * Zooms out the Gantt chart.
    */
  def zoomOut(): Unit = js.native
}
object dxGantt {
  
  type ContentReadyEvent = EventInfo[dxGantt]
  
  type ContextMenuItem = dxGanttContextMenuItem
  
  trait ContextMenuPreparingEvent
    extends StObject
       with Cancelable {
    
    val component: js.UndefOr[dxGantt] = js.undefined
    
    val data: js.UndefOr[Any] = js.undefined
    
    val element: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val event: js.UndefOr[DxEvent[PointerEvent | MouseEvent | TouchEvent]] = js.undefined
    
    val items: js.UndefOr[js.Array[Any]] = js.undefined
    
    val targetKey: js.UndefOr[Any] = js.undefined
    
    val targetType: js.UndefOr[String] = js.undefined
  }
  object ContextMenuPreparingEvent {
    
    inline def apply(): ContextMenuPreparingEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuPreparingEvent]
    }
    
    extension [Self <: ContextMenuPreparingEvent](x: Self) {
      
      inline def setComponent(value: dxGantt): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTargetKey(value: Any): Self = StObject.set(x, "targetKey", value.asInstanceOf[js.Any])
      
      inline def setTargetKeyUndefined: Self = StObject.set(x, "targetKey", js.undefined)
      
      inline def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    }
  }
  
  trait CustomCommandEvent extends StObject {
    
    val component: js.UndefOr[dxGantt] = js.undefined
    
    val element: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
    
    val name: String
  }
  object CustomCommandEvent {
    
    inline def apply(name: String): CustomCommandEvent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomCommandEvent]
    }
    
    extension [Self <: CustomCommandEvent](x: Self) {
      
      inline def setComponent(value: dxGantt): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependencyDeletedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object DependencyDeletedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): DependencyDeletedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyDeletedEvent]
    }
    
    extension [Self <: DependencyDeletedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependencyDeletingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object DependencyDeletingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): DependencyDeletingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyDeletingEvent]
    }
    
    extension [Self <: DependencyDeletingEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependencyInsertedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object DependencyInsertedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): DependencyInsertedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyInsertedEvent]
    }
    
    extension [Self <: DependencyInsertedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait DependencyInsertingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val values: Any
  }
  object DependencyInsertingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], values: Any): DependencyInsertingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyInsertingEvent]
    }
    
    extension [Self <: DependencyInsertingEvent](x: Self) {
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  type DisposingEvent = EventInfo[dxGantt]
  
  type InitializedEvent = InitializedEventInfo[dxGantt]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxGantt]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  trait ProgressTooltipTemplateData extends StObject {
    
    val progress: Double
  }
  object ProgressTooltipTemplateData {
    
    inline def apply(progress: Double): ProgressTooltipTemplateData = {
      val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressTooltipTemplateData]
    }
    
    extension [Self <: ProgressTooltipTemplateData](x: Self) {
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
  
  type Properties = dxGanttOptions
  
  trait ResourceAssignedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object ResourceAssignedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): ResourceAssignedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceAssignedEvent]
    }
    
    extension [Self <: ResourceAssignedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceAssigningEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val values: Any
  }
  object ResourceAssigningEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], values: Any): ResourceAssigningEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceAssigningEvent]
    }
    
    extension [Self <: ResourceAssigningEvent](x: Self) {
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceDeletedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object ResourceDeletedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): ResourceDeletedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceDeletedEvent]
    }
    
    extension [Self <: ResourceDeletedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceDeletingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object ResourceDeletingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): ResourceDeletingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceDeletingEvent]
    }
    
    extension [Self <: ResourceDeletingEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceInsertedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object ResourceInsertedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): ResourceInsertedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceInsertedEvent]
    }
    
    extension [Self <: ResourceInsertedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceInsertingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val values: Any
  }
  object ResourceInsertingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], values: Any): ResourceInsertingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceInsertingEvent]
    }
    
    extension [Self <: ResourceInsertingEvent](x: Self) {
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceManagerDialogShowingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val values: js.Array[Any]
  }
  object ResourceManagerDialogShowingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], values: js.Array[Any]): ResourceManagerDialogShowingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceManagerDialogShowingEvent]
    }
    
    extension [Self <: ResourceManagerDialogShowingEvent](x: Self) {
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait ResourceUnassignedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object ResourceUnassignedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): ResourceUnassignedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceUnassignedEvent]
    }
    
    extension [Self <: ResourceUnassignedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceUnassigningEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object ResourceUnassigningEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): ResourceUnassigningEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceUnassigningEvent]
    }
    
    extension [Self <: ResourceUnassigningEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionChangedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val selectedRowKey: js.UndefOr[Any] = js.undefined
  }
  object SelectionChangedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement]): SelectionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent]
    }
    
    extension [Self <: SelectionChangedEvent](x: Self) {
      
      inline def setSelectedRowKey(value: Any): Self = StObject.set(x, "selectedRowKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowKeyUndefined: Self = StObject.set(x, "selectedRowKey", js.undefined)
    }
  }
  
  trait TaskClickEvent
    extends StObject
       with NativeEventInfo[dxGantt, PointerEvent | MouseEvent] {
    
    val data: js.UndefOr[Any] = js.undefined
    
    val key: js.UndefOr[Any] = js.undefined
  }
  object TaskClickEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement]): TaskClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskClickEvent]
    }
    
    extension [Self <: TaskClickEvent](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait TaskContentTemplateData extends StObject {
    
    val cellSize: Any
    
    val isMilestone: Boolean
    
    val taskData: Any
    
    val taskHTML: Any
    
    val taskPosition: Any
    
    val taskResources: js.Array[Any]
    
    val taskSize: Any
  }
  object TaskContentTemplateData {
    
    inline def apply(
      cellSize: Any,
      isMilestone: Boolean,
      taskData: Any,
      taskHTML: Any,
      taskPosition: Any,
      taskResources: js.Array[Any],
      taskSize: Any
    ): TaskContentTemplateData = {
      val __obj = js.Dynamic.literal(cellSize = cellSize.asInstanceOf[js.Any], isMilestone = isMilestone.asInstanceOf[js.Any], taskData = taskData.asInstanceOf[js.Any], taskHTML = taskHTML.asInstanceOf[js.Any], taskPosition = taskPosition.asInstanceOf[js.Any], taskResources = taskResources.asInstanceOf[js.Any], taskSize = taskSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskContentTemplateData]
    }
    
    extension [Self <: TaskContentTemplateData](x: Self) {
      
      inline def setCellSize(value: Any): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
      
      inline def setIsMilestone(value: Boolean): Self = StObject.set(x, "isMilestone", value.asInstanceOf[js.Any])
      
      inline def setTaskData(value: Any): Self = StObject.set(x, "taskData", value.asInstanceOf[js.Any])
      
      inline def setTaskHTML(value: Any): Self = StObject.set(x, "taskHTML", value.asInstanceOf[js.Any])
      
      inline def setTaskPosition(value: Any): Self = StObject.set(x, "taskPosition", value.asInstanceOf[js.Any])
      
      inline def setTaskResources(value: js.Array[Any]): Self = StObject.set(x, "taskResources", value.asInstanceOf[js.Any])
      
      inline def setTaskResourcesVarargs(value: Any*): Self = StObject.set(x, "taskResources", js.Array(value*))
      
      inline def setTaskSize(value: Any): Self = StObject.set(x, "taskSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskDblClickEvent
    extends StObject
       with Cancelable
       with NativeEventInfo[dxGantt, PointerEvent | MouseEvent] {
    
    val data: js.UndefOr[Any] = js.undefined
    
    val key: js.UndefOr[Any] = js.undefined
  }
  object TaskDblClickEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement]): TaskDblClickEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskDblClickEvent]
    }
    
    extension [Self <: TaskDblClickEvent](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait TaskDeletedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object TaskDeletedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): TaskDeletedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskDeletedEvent]
    }
    
    extension [Self <: TaskDeletedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskDeletingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object TaskDeletingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): TaskDeletingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskDeletingEvent]
    }
    
    extension [Self <: TaskDeletingEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskEditDialogShowingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val hiddenFields: js.UndefOr[js.Array[String]] = js.undefined
    
    val key: Any
    
    val readOnlyFields: js.UndefOr[js.Array[String]] = js.undefined
    
    val values: Any
  }
  object TaskEditDialogShowingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): TaskEditDialogShowingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskEditDialogShowingEvent]
    }
    
    extension [Self <: TaskEditDialogShowingEvent](x: Self) {
      
      inline def setHiddenFields(value: js.Array[String]): Self = StObject.set(x, "hiddenFields", value.asInstanceOf[js.Any])
      
      inline def setHiddenFieldsUndefined: Self = StObject.set(x, "hiddenFields", js.undefined)
      
      inline def setHiddenFieldsVarargs(value: String*): Self = StObject.set(x, "hiddenFields", js.Array(value*))
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyFields(value: js.Array[String]): Self = StObject.set(x, "readOnlyFields", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyFieldsUndefined: Self = StObject.set(x, "readOnlyFields", js.undefined)
      
      inline def setReadOnlyFieldsVarargs(value: String*): Self = StObject.set(x, "readOnlyFields", js.Array(value*))
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskInsertedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object TaskInsertedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any): TaskInsertedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskInsertedEvent]
    }
    
    extension [Self <: TaskInsertedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TaskInsertingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val values: Any
  }
  object TaskInsertingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], values: Any): TaskInsertingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskInsertingEvent]
    }
    
    extension [Self <: TaskInsertingEvent](x: Self) {
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskMovingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val newValues: Any
    
    val values: Any
  }
  object TaskMovingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, newValues: Any, values: Any): TaskMovingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newValues = newValues.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskMovingEvent]
    }
    
    extension [Self <: TaskMovingEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNewValues(value: Any): Self = StObject.set(x, "newValues", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskUpdatedEvent
    extends StObject
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val values: Any
  }
  object TaskUpdatedEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, values: Any): TaskUpdatedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskUpdatedEvent]
    }
    
    extension [Self <: TaskUpdatedEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskUpdatingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxGantt] {
    
    val key: Any
    
    val newValues: Any
    
    val values: Any
  }
  object TaskUpdatingEvent {
    
    inline def apply(component: dxGantt, element: DxElement_[HTMLElement], key: Any, newValues: Any, values: Any): TaskUpdatingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newValues = newValues.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskUpdatingEvent]
    }
    
    extension [Self <: TaskUpdatingEvent](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNewValues(value: Any): Self = StObject.set(x, "newValues", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeTooltipTemplateData extends StObject {
    
    val end: js.Date
    
    val start: js.Date
  }
  object TimeTooltipTemplateData {
    
    inline def apply(end: js.Date, start: js.Date): TimeTooltipTemplateData = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeTooltipTemplateData]
    }
    
    extension [Self <: TimeTooltipTemplateData](x: Self) {
      
      inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  type ToolbarItem = dxGanttToolbarItem
}
