package typings.carbonComponentsReact

import typings.carbonComponentsReact.carbonComponentsReactStrings.horizontal
import typings.carbonComponentsReact.carbonComponentsReactStrings.left
import typings.carbonComponentsReact.carbonComponentsReactStrings.right
import typings.carbonComponentsReact.carbonComponentsReactStrings.vertical
import typings.carbonComponentsReact.radioButtonRadioButtonMod.RadioButtonValue
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonGroupRadioButtonGroupMod {
  
  @JSImport("carbon-components-react/lib/components/RadioButtonGroup/RadioButtonGroup", JSImport.Default)
  @js.native
  class default ()
    extends Component[RadioButtonGroupProps, js.Object, js.Any]
  
  type RadioButtonGroup = Component[RadioButtonGroupProps, js.Object, js.Any]
  
  trait RadioButtonGroupProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultSelected: js.UndefOr[RadioButtonValue] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var labelPosition: js.UndefOr[left | right] = js.undefined
    
    var name: String
    
    var onChange: js.UndefOr[
        js.Function3[
          /* newSelection */ RadioButtonValue, 
          /* name */ String, 
          /* event */ ChangeEvent[HTMLInputElement], 
          Unit
        ]
      ] = js.undefined
    
    // required but has default value
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var valueSelected: js.UndefOr[RadioButtonValue] = js.undefined
  }
  object RadioButtonGroupProps {
    
    @scala.inline
    def apply(name: String): RadioButtonGroupProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonGroupProps]
    }
    
    @scala.inline
    implicit class RadioButtonGroupPropsMutableBuilder[Self <: RadioButtonGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultSelected(value: RadioButtonValue): Self = StObject.set(x, "defaultSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedUndefined: Self = StObject.set(x, "defaultSelected", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabelPosition(value: left | right): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(
        value: (/* newSelection */ RadioButtonValue, /* name */ String, /* event */ ChangeEvent[HTMLInputElement]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setValueSelected(value: RadioButtonValue): Self = StObject.set(x, "valueSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueSelectedUndefined: Self = StObject.set(x, "valueSelected", js.undefined)
    }
  }
}
