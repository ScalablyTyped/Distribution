package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLInputElement
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSelectAllMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableSelectAll", JSImport.Default)
  @js.native
  val default: FC[TableSelectAllProps] = js.native
  
  trait TableSelectAllProps extends StObject {
    
    var ariaLabel: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: carbon-components-react.carbon-components-react/typings/shared.ReactInputAttr<std.HTMLInputElement>['aria-label'] */ js.Any
      ] = js.undefined
    
    // required but has default value
    var checked: NonNullable[js.UndefOr[Boolean]]
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: NonNullable[
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: carbon-components-react.carbon-components-react/typings/shared.ReactAttr<std.HTMLElement>['id'] */ js.Any
        ]
      ]
    
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    var name: NonNullable[js.UndefOr[String]]
    
    var onSelect: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
  }
  object TableSelectAllProps {
    
    inline def apply(
      checked: NonNullable[js.UndefOr[Boolean]],
      id: NonNullable[
          NonNullable[
            /* import warning: importer.ImportType#apply Failed type conversion: carbon-components-react.carbon-components-react/typings/shared.ReactAttr<std.HTMLElement>['id'] */ js.Any
          ]
        ],
      name: NonNullable[js.UndefOr[String]]
    ): TableSelectAllProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableSelectAllProps]
    }
    
    extension [Self <: TableSelectAllProps](x: Self) {
      
      inline def setAriaLabel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: carbon-components-react.carbon-components-react/typings/shared.ReactInputAttr<std.HTMLInputElement>['aria-label'] */ js.Any
      ): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setChecked(value: NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(
        value: NonNullable[
              NonNullable[
                /* import warning: importer.ImportType#apply Failed type conversion: carbon-components-react.carbon-components-react/typings/shared.ReactAttr<std.HTMLElement>['id'] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setName(value: NonNullable[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    }
  }
  
  type _To = FC[TableSelectAllProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableSelectAllMod.foo` */
  override def _to: FC[TableSelectAllProps] = default
}
