package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsSelect.anon.Disabled
import typings.blueprintjsSelect.anon.PartialTagInputProps
import typings.blueprintjsSelect.libEsmCommonListItemsPropsMod.ListItemsProps
import typings.blueprintjsSelect.libEsmCommonSelectPopoverPropsMod.SelectPopoverProps
import typings.blueprintjsSelect.libEsmComponentsQueryListQueryListMod.QueryList
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsMultiSelectMultiSelect2Mod {
  
  @JSImport("@blueprintjs/select/lib/esm/components/multi-select/multiSelect2", "MultiSelect2")
  @js.native
  open class MultiSelect2[T] protected ()
    extends AbstractPureComponent2[MultiSelect2Props[T], MultiSelect2State, js.Object] {
    def this(props: MultiSelect2Props[T]) = this()
    def this(props: MultiSelect2Props[T], context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MMultiSelect2(prevProps: MultiSelect2Props[T]): Unit = js.native
    
    /* private */ var getPopoverTargetRenderer: Any = js.native
    
    /* private */ var getTagInputAddHandler: Any = js.native
    
    /* private */ var getTagInputKeyDownHandler: Any = js.native
    
    /* private */ var getTagInputKeyUpHandler: Any = js.native
    
    /* private */ var handleClearButtonClick: Any = js.native
    
    /* private */ var handleItemSelect: Any = js.native
    
    /* private */ var handlePopoverInteraction: Any = js.native
    
    /* private */ var handlePopoverOpened: Any = js.native
    
    /* private */ var handleQueryChange: Any = js.native
    
    /* private */ var handleTagRemove: Any = js.native
    
    var input: HTMLInputElement | Null = js.native
    
    /* private */ var listboxId: Any = js.native
    
    var queryList: QueryList[T] | Null = js.native
    
    /* private */ var refHandlers: Any = js.native
    
    /* private */ var renderQueryList: Any = js.native
  }
  /* static members */
  object MultiSelect2 {
    
    @JSImport("@blueprintjs/select/lib/esm/components/multi-select/multiSelect2", "MultiSelect2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components/multi-select/multiSelect2", "MultiSelect2.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components/multi-select/multiSelect2", "MultiSelect2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /** @deprecated no longer necessary now that the TypeScript parser supports type arguments on JSX element tags */
    inline def ofType[U](): Instantiable1[/* props */ MultiSelect2Props[U], MultiSelect2[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ MultiSelect2Props[U], MultiSelect2[U]]]
  }
  
  @js.native
  trait MultiSelect2Props[T]
    extends StObject
       with ListItemsProps[T]
       with SelectPopoverProps {
    
    /**
      * Whether the component is non-interactive.
      * If true, the list's item renderer will not be called.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the component should take up the full width of its container.
      * This overrides `popoverProps.fill` and `tagInputProps.fill`.
      */
    var fill: js.UndefOr[Boolean] = js.native
    
    /**
      * Props to spread to the `Menu` listbox containing the selectable options.
      */
    var menuProps: js.UndefOr[HTMLAttributes[HTMLUListElement]] = js.native
    
    /**
      * If provided, this component will render a "clear" button inside its TagInput.
      * Clicking that button will invoke this callback to clear all items from the current selection.
      */
    var onClear: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Callback invoked when an item is removed from the selection by
      * removing its tag in the TagInput. This is generally more useful than
      * `tagInputProps.onRemove`  because it receives the removed value instead of
      * the value's rendered `ReactNode` tag.
      *
      * It is not recommended to supply _both_ this prop and `tagInputProps.onRemove`.
      */
    var onRemove: js.UndefOr[js.Function2[/* value */ T, /* index */ Double, Unit]] = js.native
    
    /**
      * If true, the component waits until a keydown event in the TagInput
      * before opening its popover.
      *
      * If false, the popover opens immediately after a mouse click focuses
      * the component's TagInput.
      *
      * N.B. the behavior of this prop differs slightly from the same one
      * in the Suggest component; see https://github.com/palantir/blueprint/issues/4152.
      *
      * @default false
      */
    var openOnKeyDown: js.UndefOr[Boolean] = js.native
    
    /**
      * Input placeholder text. Shorthand for `tagInputProps.placeholder`.
      *
      * @default "Search..."
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * Props to add to the `div` that wraps the TagInput
      */
    var popoverTargetProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
    
    /** Controlled selected values. */
    var selectedItems: js.Array[T] = js.native
    
    /**
      * Props to spread to `TagInput`.
      * If you wish to control the value of the input, use `query` and `onQueryChange` instead.
      *
      * Notes for `tagInputProps.rightElement`:
      * - you are responsible for disabling any elements you may render here when the overall
      *   `MultiSelect2` is disabled.
      * - if the `onClear` prop is defined, this element will override/replace the default rightElement,
      *   which is a "clear" button that removes all items from the current selection.
      */
    var tagInputProps: js.UndefOr[PartialTagInputProps] = js.native
    
    /** Custom renderer to transform an item into tag content. */
    def tagRenderer(item: T): ReactNode = js.native
  }
  
  trait MultiSelect2State extends StObject {
    
    var isOpen: Boolean
  }
  object MultiSelect2State {
    
    inline def apply(isOpen: Boolean): MultiSelect2State = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiSelect2State]
    }
    
    extension [Self <: MultiSelect2State](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
}
