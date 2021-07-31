package typings.carbonComponentsReact

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.anon.SelectedItems
import typings.carbonComponentsReact.carbonComponentsReactStrings.`top-after-reopen`
import typings.carbonComponentsReact.carbonComponentsReactStrings.fixed
import typings.carbonComponentsReact.carbonComponentsReactStrings.top
import typings.carbonComponentsReact.filterableMultiSelectMod.default
import typings.carbonComponentsReact.listBoxMenuIconMod.ListBoxMenuIconTranslationKey
import typings.carbonComponentsReact.listBoxPropTypesMod.ListBoxSize
import typings.carbonComponentsReact.listBoxPropTypesMod.ListBoxType
import typings.carbonComponentsReact.listBoxSelectionMod.ListBoxSelectionTranslationKey
import typings.carbonComponentsReact.multiSelectPropTypesMod.MultiSelectSortingProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefProps
import typings.carbonComponentsReact.typingsSharedMod.InternationalProps
import typings.carbonComponentsReact.typingsSharedMod.ListBoxBaseItemType
import typings.carbonComponentsReact.typingsSharedMod.VerticalDirection
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSelectMultiSelectMod {
  
  object default extends Shortcut {
    
    @JSImport("carbon-components-react/lib/components/MultiSelect/MultiSelect", JSImport.Default)
    @js.native
    val ^ : MultiSelect[String] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("carbon-components-react/lib/components/MultiSelect/MultiSelect", "default.Filterable")
    @js.native
    class Filterable[T /* <: ListBoxBaseItemType */] ()
      extends typings.carbonComponentsReact.filterableMultiSelectMod.default[T]
    
    type _To = MultiSelect[String]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: MultiSelect[String] = ^
  }
  
  @js.native
  trait MultiSelect[T /* <: ListBoxBaseItemType */] extends StObject {
    
    def apply(props: ForwardRefProps[HTMLButtonElement, MultiSelectProps[T]]): FCReturn = js.native
    
    val Filterable: Instantiable0[default[ListBoxBaseItemType]] = js.native
  }
  
  trait MultiSelectProps[T /* <: ListBoxBaseItemType */]
    extends StObject
       with MultiSelectSortingProps[T]
       with InternationalProps[ListBoxMenuIconTranslationKey | ListBoxSelectionTranslationKey] {
    
    var direction: js.UndefOr[VerticalDirection] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var downshiftProps: js.UndefOr[js.Any] = js.undefined
    
    // TODO
    var id: String
    
    var initialSelectedItems: js.UndefOr[js.Array[T]] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var invalid: js.UndefOr[Boolean] = js.undefined
    
    var invalidText: js.UndefOr[ReactNode] = js.undefined
    
    var itemToString: js.UndefOr[js.Function1[/* item */ js.UndefOr[T | Null], String]] = js.undefined
    
    var items: js.Array[T]
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    def onChange(hasSelectedItems: SelectedItems[T]): Unit
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var selectionFeedback: js.UndefOr[fixed | top | `top-after-reopen`] = js.undefined
    
    var size: js.UndefOr[ListBoxSize] = js.undefined
    
    var titleText: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[ListBoxType] = js.undefined
    
    var useTitleInItem: js.UndefOr[Boolean] = js.undefined
    
    var warn: js.UndefOr[Boolean] = js.undefined
    
    var warnText: js.UndefOr[ReactNode] = js.undefined
  }
  object MultiSelectProps {
    
    @scala.inline
    def apply[T /* <: ListBoxBaseItemType */](id: String, items: js.Array[T], onChange: SelectedItems[T] => Unit): MultiSelectProps[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[MultiSelectProps[T]]
    }
    
    @scala.inline
    implicit class MultiSelectPropsMutableBuilder[Self <: MultiSelectProps[?], T /* <: ListBoxBaseItemType */] (val x: Self & MultiSelectProps[T]) extends AnyVal {
      
      @scala.inline
      def setDirection(value: VerticalDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownshiftProps(value: js.Any): Self = StObject.set(x, "downshiftProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownshiftPropsUndefined: Self = StObject.set(x, "downshiftProps", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSelectedItems(value: js.Array[T]): Self = StObject.set(x, "initialSelectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSelectedItemsUndefined: Self = StObject.set(x, "initialSelectedItems", js.undefined)
      
      @scala.inline
      def setInitialSelectedItemsVarargs(value: T*): Self = StObject.set(x, "initialSelectedItems", js.Array(value :_*))
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidText(value: ReactNode): Self = StObject.set(x, "invalidText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidTextUndefined: Self = StObject.set(x, "invalidText", js.undefined)
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setItemToString(value: /* item */ js.UndefOr[T | Null] => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemToStringUndefined: Self = StObject.set(x, "itemToString", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOnChange(value: SelectedItems[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setSelectionFeedback(value: fixed | top | `top-after-reopen`): Self = StObject.set(x, "selectionFeedback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionFeedbackUndefined: Self = StObject.set(x, "selectionFeedback", js.undefined)
      
      @scala.inline
      def setSize(value: ListBoxSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
      
      @scala.inline
      def setType(value: ListBoxType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUseTitleInItem(value: Boolean): Self = StObject.set(x, "useTitleInItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTitleInItemUndefined: Self = StObject.set(x, "useTitleInItem", js.undefined)
      
      @scala.inline
      def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnText(value: ReactNode): Self = StObject.set(x, "warnText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnTextUndefined: Self = StObject.set(x, "warnText", js.undefined)
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
