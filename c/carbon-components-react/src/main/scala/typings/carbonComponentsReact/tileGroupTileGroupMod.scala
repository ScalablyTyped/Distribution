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
    
    @scala.inline
    def apply(name: String): TileGroupProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileGroupProps]
    }
    
    @scala.inline
    implicit class TileGroupPropsMutableBuilder[Self <: TileGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultSelected(value: String | Double): Self = StObject.set(x, "defaultSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedUndefined: Self = StObject.set(x, "defaultSelected", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(
        value: (/* value */ NonNullable[js.UndefOr[String | Double]], /* name */ NonNullable[String], /* event */ RadioTileChangeEvent) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setValueSelected(value: String | Double): Self = StObject.set(x, "valueSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSelectedUndefined: Self = StObject.set(x, "valueSelected", js.undefined)
    }
  }
}
