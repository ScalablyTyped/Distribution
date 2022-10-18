package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.libEsmCommonPropsMod.OptionProps
import typings.react.mod.FormEvent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsFormsRadioGroupMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/forms/radioGroup", "RadioGroup")
  @js.native
  open class RadioGroup protected ()
    extends AbstractPureComponent2[RadioGroupProps, js.Object, js.Object] {
    def this(props: RadioGroupProps) = this()
    def this(props: RadioGroupProps, context: Any) = this()
    
    /* private */ var autoGroupName: Any = js.native
    
    /* private */ var getRadioProps: Any = js.native
    
    /* private */ var renderChildren: Any = js.native
    
    /* private */ var renderOptions: Any = js.native
    
    /* protected */ def validateProps(): Unit = js.native
  }
  /* static members */
  object RadioGroup {
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/radioGroup", "RadioGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/forms/radioGroup", "RadioGroup.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IRadioGroupProps
    extends StObject
       with IProps {
    
    /**
      * Radio elements. This prop is mutually exclusive with `options`.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Whether the group and _all_ its radios are disabled.
      * Individual radios can be disabled using their `disabled` prop.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the radio buttons are to be displayed inline horizontally.
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /** Optional label text to display above the radio buttons. */
    var label: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Name of the group, used to link radio buttons together in HTML.
      * If omitted, a unique name will be generated internally.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Callback invoked when the currently selected radio changes.
      * Use `event.currentTarget.value` to read the currently selected value.
      * This prop is required because this component only supports controlled usage.
      */
    def onChange(event: FormEvent[HTMLInputElement]): Unit
    
    /**
      * Array of options to render in the group. This prop is mutually exclusive
      * with `children`: either provide an array of `OptionProps` objects or
      * provide `<Radio>` children elements.
      */
    var options: js.UndefOr[js.Array[OptionProps]] = js.undefined
    
    /** Value of the selected radio. The child with this value will be `:checked`. */
    var selectedValue: js.UndefOr[String | Double] = js.undefined
  }
  object IRadioGroupProps {
    
    inline def apply(onChange: FormEvent[HTMLInputElement] => Unit): IRadioGroupProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[IRadioGroupProps]
    }
    
    extension [Self <: IRadioGroupProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOptions(value: js.Array[OptionProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: OptionProps*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSelectedValue(value: String | Double): Self = StObject.set(x, "selectedValue", value.asInstanceOf[js.Any])
      
      inline def setSelectedValueUndefined: Self = StObject.set(x, "selectedValue", js.undefined)
    }
  }
  
  type RadioGroupProps = IRadioGroupProps
}
