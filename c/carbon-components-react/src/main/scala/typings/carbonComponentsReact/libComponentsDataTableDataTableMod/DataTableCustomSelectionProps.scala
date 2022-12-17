package typings.carbonComponentsReact.libComponentsDataTableDataTableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCustomSelectionProps[R /* <: DataTableRow[String] */] extends StObject {
  
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  var checked: /* import warning: importer.ImportType#apply Failed type conversion: R extends never ? boolean : std.NonNullable<R['isSelected']> */ js.Any
  
  var disabled: /* import warning: importer.ImportType#apply Failed type conversion: R extends never ? never : R['disabled'] */ js.Any
  
  var id: String
  
  var indeterminate: /* import warning: importer.ImportType#apply Failed type conversion: R extends never ? boolean : never */ js.Any
  
  var name: String
  
  def onSelect(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
  
  var radio: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: R extends never ? never : std.Extract<boolean | undefined, boolean> | undefined */ js.Any
  ] = js.undefined
}
object DataTableCustomSelectionProps {
  
  inline def apply[R /* <: DataTableRow[String] */](
    checked: /* import warning: importer.ImportType#apply Failed type conversion: R extends never ? boolean : std.NonNullable<R['isSelected']> */ js.Any,
    disabled: /* import warning: importer.ImportType#apply Failed type conversion: R extends never ? never : R['disabled'] */ js.Any,
    id: String,
    indeterminate: /* import warning: importer.ImportType#apply Failed type conversion: R extends never ? boolean : never */ js.Any,
    name: String,
    onSelect: MouseEvent[HTMLElement, NativeMouseEvent] => Unit
  ): DataTableCustomSelectionProps[R] = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[DataTableCustomSelectionProps[R]]
  }
  
  extension [Self <: DataTableCustomSelectionProps[?], R /* <: DataTableRow[String] */](x: Self & DataTableCustomSelectionProps[R]) {
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setChecked(
      value: /* import warning: importer.ImportType#apply Failed type conversion: R extends never ? boolean : std.NonNullable<R['isSelected']> */ js.Any
    ): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setDisabled(
      value: /* import warning: importer.ImportType#apply Failed type conversion: R extends never ? never : R['disabled'] */ js.Any
    ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndeterminate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: R extends never ? boolean : never */ js.Any
    ): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    inline def setRadio(
      value: /* import warning: importer.ImportType#apply Failed type conversion: R extends never ? never : std.Extract<boolean | undefined, boolean> | undefined */ js.Any
    ): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    inline def setRadioUndefined: Self = StObject.set(x, "radio", js.undefined)
  }
}
