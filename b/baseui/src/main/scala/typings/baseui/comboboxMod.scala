package typings.baseui

import typings.baseui.anon.CloseListbox
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comboboxMod {
  
  @JSImport("baseui/combobox", "Combobox")
  @js.native
  val Combobox: FC[PropsT[js.Any]] = js.native
  
  trait SIZE extends StObject {
    
    var default: default_
    
    var compact: typings.baseui.baseuiStrings.compact
    
    var large: large_
    
    var mini: typings.baseui.baseuiStrings.mini
  }
  object SIZE {
    
    @JSImport("baseui/combobox", "SIZE")
    @js.native
    val ^ : SIZE = js.native
    
    @scala.inline
    implicit class SIZEMutableBuilder[Self <: SIZE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: compact): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLarge(value: large_): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMini(value: mini): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComboboxOverrides extends StObject {
    
    var Input: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var InputContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var ListBox: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var ListItem: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Popover: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object ComboboxOverrides {
    
    @scala.inline
    def apply(): ComboboxOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboboxOverrides]
    }
    
    @scala.inline
    implicit class ComboboxOverridesMutableBuilder[Self <: ComboboxOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "InputContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputContainerUndefined: Self = StObject.set(x, "InputContainer", js.undefined)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
      
      @scala.inline
      def setListBox(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ListBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListBoxUndefined: Self = StObject.set(x, "ListBox", js.undefined)
      
      @scala.inline
      def setListItem(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ListItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemUndefined: Self = StObject.set(x, "ListItem", js.undefined)
      
      @scala.inline
      def setPopover(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Popover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverUndefined: Self = StObject.set(x, "Popover", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait PropsT[OptionT] extends StObject {
    
    var autocomplete: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var mapOptionToNode: js.UndefOr[js.Function1[/* hasBooleanOptionT */ js.Any, ReactNode]] = js.undefined
    
    def mapOptionToString(OptionT: js.Any): String
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement], js.Any]] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* value */ String, /* option */ OptionT | Null, js.Any]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLInputElement], js.Any]] = js.undefined
    
    var onSubmit: js.UndefOr[js.Function1[/* params */ CloseListbox, js.Any]] = js.undefined
    
    var options: OptionT
    
    var overrides: js.UndefOr[ComboboxOverrides] = js.undefined
    
    var size: js.UndefOr[compact | default_ | large_ | mini] = js.undefined
    
    var value: String
  }
  object PropsT {
    
    @scala.inline
    def apply[OptionT](mapOptionToString: js.Any => String, options: OptionT, value: String): PropsT[OptionT] = {
      val __obj = js.Dynamic.literal(mapOptionToString = js.Any.fromFunction1(mapOptionToString), options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsT[OptionT]]
    }
    
    @scala.inline
    implicit class PropsTMutableBuilder[Self <: PropsT[?], OptionT] (val x: Self & PropsT[OptionT]) extends AnyVal {
      
      @scala.inline
      def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMapOptionToNode(value: /* hasBooleanOptionT */ js.Any => ReactNode): Self = StObject.set(x, "mapOptionToNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapOptionToNodeUndefined: Self = StObject.set(x, "mapOptionToNode", js.undefined)
      
      @scala.inline
      def setMapOptionToString(value: js.Any => String): Self = StObject.set(x, "mapOptionToString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* event */ FocusEvent[HTMLInputElement] => js.Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ String, /* option */ OptionT | Null) => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* event */ FocusEvent[HTMLInputElement] => js.Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: /* params */ CloseListbox => js.Any): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOptions(value: OptionT): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrides(value: ComboboxOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSize(value: compact | default_ | large_ | mini): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
