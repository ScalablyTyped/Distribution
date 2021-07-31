package typings.carbonComponentsReact.dataTableDataTableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Extract
import typings.std.HTMLElement
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCustomSelectionProps[R /* <: DataTableRow[String] */] extends StObject {
  
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  var checked: (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: R['isSelected'] */ js.Any
  ]) | Boolean
  
  var disabled: /* import warning: importer.ImportType#apply Failed type conversion: R['disabled'] */ js.Any
  
  var id: String
  
  var indeterminate: Boolean
  
  var name: String
  
  def onSelect(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
  
  var radio: js.UndefOr[Extract[js.UndefOr[Boolean], Boolean]] = js.undefined
}
object DataTableCustomSelectionProps {
  
  @scala.inline
  def apply[R /* <: DataTableRow[String] */](
    checked: (NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: R['isSelected'] */ js.Any
    ]) | Boolean,
    disabled: /* import warning: importer.ImportType#apply Failed type conversion: R['disabled'] */ js.Any,
    id: String,
    indeterminate: Boolean,
    name: String,
    onSelect: MouseEvent[HTMLElement, NativeMouseEvent] => Unit
  ): DataTableCustomSelectionProps[R] = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[DataTableCustomSelectionProps[R]]
  }
  
  @scala.inline
  implicit class DataTableCustomSelectionPropsMutableBuilder[Self <: DataTableCustomSelectionProps[?], R /* <: DataTableRow[String] */] (val x: Self & DataTableCustomSelectionProps[R]) extends AnyVal {
    
    @scala.inline
    def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    @scala.inline
    def setChecked(
      value: (NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: R['isSelected'] */ js.Any
        ]) | Boolean
    ): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(
      value: /* import warning: importer.ImportType#apply Failed type conversion: R['disabled'] */ js.Any
    ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelect(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRadio(value: Extract[js.UndefOr[Boolean], Boolean]): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
  }
}
