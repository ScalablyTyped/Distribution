package typings.carbonComponentsReact

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.anon.SelectedItems
import typings.carbonComponentsReact.carbonComponentsReactStrings.`top-after-reopen`
import typings.carbonComponentsReact.carbonComponentsReactStrings.fixed
import typings.carbonComponentsReact.carbonComponentsReactStrings.top
import typings.carbonComponentsReact.listBoxListBoxSelectionMod.ListBoxSelectionTranslationKey
import typings.carbonComponentsReact.listBoxMenuIconMod.ListBoxMenuIconTranslationKey
import typings.carbonComponentsReact.listBoxPropTypesMod.ListBoxSize
import typings.carbonComponentsReact.listBoxPropTypesMod.ListBoxType
import typings.carbonComponentsReact.multiSelectFilterableMultiSelectMod.default
import typings.carbonComponentsReact.multiSelectPropTypesMod.MultiSelectSortingProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefProps
import typings.carbonComponentsReact.typingsSharedMod.InternationalProps
import typings.carbonComponentsReact.typingsSharedMod.ListBoxBaseItemType
import typings.carbonComponentsReact.typingsSharedMod.VerticalDirection
import typings.react.mod.JSXElementConstructor
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSelectMultiSelectMod {
  
  object default extends Shortcut {
    
    @JSImport("carbon-components-react/lib/components/MultiSelect/MultiSelect", JSImport.Default)
    @js.native
    val ^ : MultiSelect = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("carbon-components-react/lib/components/MultiSelect/MultiSelect", "default.Filterable")
    @js.native
    open class Filterable[T /* <: ListBoxBaseItemType */] ()
      extends typings.carbonComponentsReact.multiSelectFilterableMultiSelectMod.default[T]
    
    type _To = MultiSelect
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: MultiSelect = ^
  }
  
  @js.native
  trait MultiSelect extends StObject {
    
    def apply[T /* <: ListBoxBaseItemType */](props: ForwardRefProps[HTMLButtonElement, MultiSelectProps[T]]): FCReturn = js.native
    
    val Filterable: Instantiable0[default[ListBoxBaseItemType]] = js.native
  }
  
  trait MultiSelectProps[T /* <: ListBoxBaseItemType */]
    extends StObject
       with MultiSelectSortingProps[T]
       with InternationalProps[
          ListBoxMenuIconTranslationKey | ListBoxSelectionTranslationKey, 
          Record[String, Any]
        ] {
    
    var clearSelectionDescription: js.UndefOr[String] = js.undefined
    
    var clearSelectionText: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[VerticalDirection] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var downshiftProps: js.UndefOr[Any] = js.undefined
    
    // TODO
    var helperText: js.UndefOr[ReactNode] = js.undefined
    
    var hideLabel: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var initialSelectedItems: js.UndefOr[js.Array[T]] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var invalid: js.UndefOr[Boolean] = js.undefined
    
    var invalidText: js.UndefOr[ReactNode] = js.undefined
    
    var itemToElement: js.UndefOr[JSXElementConstructor[T]] = js.undefined
    
    var itemToString: js.UndefOr[js.Function1[/* item */ T, String]] = js.undefined
    
    var items: js.Array[T]
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    def onChange(hasSelectedItems: SelectedItems[T]): Unit
    
    var onMenuChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var selectedItems: js.UndefOr[js.Array[T]] = js.undefined
    
    var selectionFeedback: js.UndefOr[fixed | top | `top-after-reopen`] = js.undefined
    
    var size: js.UndefOr[ListBoxSize] = js.undefined
    
    var titleText: js.UndefOr[ReactNode] = js.undefined
    
    var `type`: js.UndefOr[ListBoxType] = js.undefined
    
    var useTitleInItem: js.UndefOr[Boolean] = js.undefined
    
    var warn: js.UndefOr[Boolean] = js.undefined
    
    var warnText: js.UndefOr[ReactNode] = js.undefined
  }
  object MultiSelectProps {
    
    inline def apply[T /* <: ListBoxBaseItemType */](id: String, items: js.Array[T], onChange: SelectedItems[T] => Unit): MultiSelectProps[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[MultiSelectProps[T]]
    }
    
    extension [Self <: MultiSelectProps[?], T /* <: ListBoxBaseItemType */](x: Self & MultiSelectProps[T]) {
      
      inline def setClearSelectionDescription(value: String): Self = StObject.set(x, "clearSelectionDescription", value.asInstanceOf[js.Any])
      
      inline def setClearSelectionDescriptionUndefined: Self = StObject.set(x, "clearSelectionDescription", js.undefined)
      
      inline def setClearSelectionText(value: String): Self = StObject.set(x, "clearSelectionText", value.asInstanceOf[js.Any])
      
      inline def setClearSelectionTextUndefined: Self = StObject.set(x, "clearSelectionText", js.undefined)
      
      inline def setDirection(value: VerticalDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDownshiftProps(value: Any): Self = StObject.set(x, "downshiftProps", value.asInstanceOf[js.Any])
      
      inline def setDownshiftPropsUndefined: Self = StObject.set(x, "downshiftProps", js.undefined)
      
      inline def setHelperText(value: ReactNode): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
      
      inline def setHideLabel(value: Boolean): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
      
      inline def setHideLabelUndefined: Self = StObject.set(x, "hideLabel", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedItems(value: js.Array[T]): Self = StObject.set(x, "initialSelectedItems", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedItemsUndefined: Self = StObject.set(x, "initialSelectedItems", js.undefined)
      
      inline def setInitialSelectedItemsVarargs(value: T*): Self = StObject.set(x, "initialSelectedItems", js.Array(value*))
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidText(value: ReactNode): Self = StObject.set(x, "invalidText", value.asInstanceOf[js.Any])
      
      inline def setInvalidTextUndefined: Self = StObject.set(x, "invalidText", js.undefined)
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setItemToElement(value: JSXElementConstructor[T]): Self = StObject.set(x, "itemToElement", value.asInstanceOf[js.Any])
      
      inline def setItemToElementFunction1(value: T => ReactElement | Null): Self = StObject.set(x, "itemToElement", js.Any.fromFunction1(value))
      
      inline def setItemToElementUndefined: Self = StObject.set(x, "itemToElement", js.undefined)
      
      inline def setItemToString(value: /* item */ T => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
      
      inline def setItemToStringUndefined: Self = StObject.set(x, "itemToString", js.undefined)
      
      inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOnChange(value: SelectedItems[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnMenuChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onMenuChange", js.Any.fromFunction1(value))
      
      inline def setOnMenuChangeUndefined: Self = StObject.set(x, "onMenuChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setSelectedItems(value: js.Array[T]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setSelectedItemsVarargs(value: T*): Self = StObject.set(x, "selectedItems", js.Array(value*))
      
      inline def setSelectionFeedback(value: fixed | top | `top-after-reopen`): Self = StObject.set(x, "selectionFeedback", value.asInstanceOf[js.Any])
      
      inline def setSelectionFeedbackUndefined: Self = StObject.set(x, "selectionFeedback", js.undefined)
      
      inline def setSize(value: ListBoxSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitleText(value: ReactNode): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
      
      inline def setType(value: ListBoxType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseTitleInItem(value: Boolean): Self = StObject.set(x, "useTitleInItem", value.asInstanceOf[js.Any])
      
      inline def setUseTitleInItemUndefined: Self = StObject.set(x, "useTitleInItem", js.undefined)
      
      inline def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnText(value: ReactNode): Self = StObject.set(x, "warnText", value.asInstanceOf[js.Any])
      
      inline def setWarnTextUndefined: Self = StObject.set(x, "warnText", js.undefined)
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
