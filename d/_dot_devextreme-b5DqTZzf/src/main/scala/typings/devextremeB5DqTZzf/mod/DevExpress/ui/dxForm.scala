package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.Editor.Properties
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxValidationGroup.ValidationResult
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxForm
  extends StObject
     with Widget[dxFormOptions] {
  
  /**
    * Gets a button&apos;s instance.
    */
  def getButton(name: String): js.UndefOr[dxButton] = js.native
  
  /**
    * Gets an editor instance. Takes effect only if the form item is visible.
    */
  def getEditor(dataField: String): js.UndefOr[Editor[Properties]] = js.native
  
  /**
    * Gets a form item&apos;s configuration.
    */
  def itemOption(id: String): Any = js.native
  /**
    * Updates the value of a single item option.
    */
  def itemOption(id: String, option: String, value: Any): Unit = js.native
  /**
    * Updates the values of several item properties.
    */
  def itemOption(id: String, options: Any): Unit = js.native
  
  /**
    * Resets the editor&apos;s value to undefined.
    */
  def resetValues(): Unit = js.native
  
  /**
    * Updates a formData field and the corresponding editor.
    */
  def updateData(dataField: String, value: Any): Unit = js.native
  /**
    * Merges the passed `data` object with formData. Matching properties in formData are overwritten and new properties added.
    */
  def updateData(data: Any): Unit = js.native
  
  /**
    * Updates the dimensions of the UI component contents.
    */
  def updateDimensions(): DxPromise[Unit] = js.native
  
  /**
    * Validates the values of all editors on the form against the list of the validation rules specified for each form item.
    */
  def validate(): ValidationResult = js.native
}
object dxForm {
  
  type ButtonItem = dxFormButtonItem
  
  type ContentReadyEvent = EventInfo[dxForm]
  
  type DisposingEvent = EventInfo[dxForm]
  
  trait EditorEnterKeyEvent
    extends StObject
       with EventInfo[dxForm] {
    
    val dataField: js.UndefOr[String] = js.undefined
  }
  object EditorEnterKeyEvent {
    
    inline def apply(component: dxForm, element: DxElement_[HTMLElement]): EditorEnterKeyEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorEnterKeyEvent]
    }
    
    extension [Self <: EditorEnterKeyEvent](x: Self) {
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    }
  }
  
  type EmptyItem = dxFormEmptyItem
  
  trait FieldDataChangedEvent
    extends StObject
       with EventInfo[dxForm] {
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object FieldDataChangedEvent {
    
    inline def apply(component: dxForm, element: DxElement_[HTMLElement]): FieldDataChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldDataChangedEvent]
    }
    
    extension [Self <: FieldDataChangedEvent](x: Self) {
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type GroupItem = dxFormGroupItem
  
  trait GroupItemTemplateData extends StObject {
    
    val component: dxForm
    
    val formData: js.UndefOr[Any] = js.undefined
  }
  object GroupItemTemplateData {
    
    inline def apply(component: dxForm): GroupItemTemplateData = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupItemTemplateData]
    }
    
    extension [Self <: GroupItemTemplateData](x: Self) {
      
      inline def setComponent(value: dxForm): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxForm]
  
  type Item = SimpleItem | GroupItem | TabbedItem | EmptyItem | ButtonItem
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxForm]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxForm, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxFormOptions
  
  type SimpleItem = dxFormSimpleItem
  
  trait SimpleItemTemplateData extends StObject {
    
    val component: dxForm
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val editorOptions: js.UndefOr[Any] = js.undefined
    
    val editorType: js.UndefOr[String] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
  }
  object SimpleItemTemplateData {
    
    inline def apply(component: dxForm): SimpleItemTemplateData = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleItemTemplateData]
    }
    
    extension [Self <: SimpleItemTemplateData](x: Self) {
      
      inline def setComponent(value: dxForm): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
      
      inline def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
      
      inline def setEditorType(value: String): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
      
      inline def setEditorTypeUndefined: Self = StObject.set(x, "editorType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type TabbedItem = dxFormTabbedItem
}
