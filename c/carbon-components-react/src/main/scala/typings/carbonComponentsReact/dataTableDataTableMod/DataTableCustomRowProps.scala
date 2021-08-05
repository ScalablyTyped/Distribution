package typings.carbonComponentsReact.dataTableDataTableMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Exclude
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableCustomRowProps[R /* <: DataTableRow[String] */] extends StObject {
  
  var ariaLabel: String
  
  var disabled: Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: R['disabled'] */ js.Any, 
    Unit
  ]
  
  var isExpanded: Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: R['isExpanded'] */ js.Any, 
    Unit
  ]
  
  var isSelected: Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: R['isSelected'] */ js.Any, 
    Unit
  ]
  
  var key: /* import warning: importer.ImportType#apply Failed type conversion: R['id'] */ js.Any
  
  def onExpand(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
}
object DataTableCustomRowProps {
  
  inline def apply[R /* <: DataTableRow[String] */](
    ariaLabel: String,
    disabled: Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: R['disabled'] */ js.Any, 
      Unit
    ],
    isExpanded: Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: R['isExpanded'] */ js.Any, 
      Unit
    ],
    isSelected: Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: R['isSelected'] */ js.Any, 
      Unit
    ],
    key: /* import warning: importer.ImportType#apply Failed type conversion: R['id'] */ js.Any,
    onExpand: MouseEvent[HTMLElement, NativeMouseEvent] => Unit
  ): DataTableCustomRowProps[R] = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onExpand = js.Any.fromFunction1(onExpand))
    __obj.asInstanceOf[DataTableCustomRowProps[R]]
  }
  
  extension [Self <: DataTableCustomRowProps[?], R /* <: DataTableRow[String] */](x: Self & DataTableCustomRowProps[R]) {
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setDisabled(
      value: Exclude[
          /* import warning: importer.ImportType#apply Failed type conversion: R['disabled'] */ js.Any, 
          Unit
        ]
    ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setIsExpanded(
      value: Exclude[
          /* import warning: importer.ImportType#apply Failed type conversion: R['isExpanded'] */ js.Any, 
          Unit
        ]
    ): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(
      value: Exclude[
          /* import warning: importer.ImportType#apply Failed type conversion: R['isSelected'] */ js.Any, 
          Unit
        ]
    ): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setKey(value: /* import warning: importer.ImportType#apply Failed type conversion: R['id'] */ js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnExpand(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
  }
}
