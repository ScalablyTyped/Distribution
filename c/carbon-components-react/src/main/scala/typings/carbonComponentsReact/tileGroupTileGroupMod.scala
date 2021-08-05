package typings.carbonComponentsReact

import typings.carbonComponentsReact.radioTileRadioTileMod.RadioTileChangeEvent
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileGroupTileGroupMod {
  
  @JSImport("carbon-components-react/lib/components/TileGroup/TileGroup", JSImport.Default)
  @js.native
  class default ()
    extends Component[TileGroupProps, js.Object, js.Any]
  
  type TileGroup = Component[TileGroupProps, js.Object, js.Any]
  
  trait TileGroupProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultSelected: js.UndefOr[String | Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var legend: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var onChange: js.UndefOr[
        js.Function3[
          /* value */ NonNullable[js.UndefOr[String | Double]], 
          /* name */ NonNullable[String], 
          /* event */ RadioTileChangeEvent, 
          Unit
        ]
      ] = js.undefined
    
    var valueSelected: js.UndefOr[String | Double] = js.undefined
  }
  object TileGroupProps {
    
    inline def apply(name: String): TileGroupProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileGroupProps]
    }
    
    extension [Self <: TileGroupProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultSelected(value: String | Double): Self = StObject.set(x, "defaultSelected", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedUndefined: Self = StObject.set(x, "defaultSelected", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnChange(
        value: (/* value */ NonNullable[js.UndefOr[String | Double]], /* name */ NonNullable[String], /* event */ RadioTileChangeEvent) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValueSelected(value: String | Double): Self = StObject.set(x, "valueSelected", value.asInstanceOf[js.Any])
      
      inline def setValueSelectedUndefined: Self = StObject.set(x, "valueSelected", js.undefined)
    }
  }
}
