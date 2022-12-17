package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.libEsmComponentsFormsInputGroupMod.InputGroupProps2
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsSelect.anon.PartialIPopoverProps
import typings.blueprintjsSelect.anon.PartialSuggestPropsany
import typings.blueprintjsSelect.libEsmCommonListItemsPropsMod.ListItemsProps
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsSuggestSuggestMod {
  
  @JSImport("@blueprintjs/select/lib/esm/components/suggest/suggest", "Suggest")
  @js.native
  open class Suggest[T] protected ()
    extends AbstractPureComponent2[SuggestProps[T], ISuggestState[T], js.Object] {
    def this(props: SuggestProps[T]) = this()
    def this(props: SuggestProps[T], context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSuggest(prevProps: SuggestProps[T], prevState: ISuggestState[T]): Unit = js.native
    
    /* private */ var getInitialSelectedItem: Any = js.native
    
    /* private */ var getTargetKeyDownHandler: Any = js.native
    
    /* private */ var getTargetKeyUpHandler: Any = js.native
    
    /* private */ var handleInputFocus: Any = js.native
    
    /* private */ var handleInputRef: Any = js.native
    
    /* private */ var handleItemSelect: Any = js.native
    
    /* private */ var handlePopoverInteraction: Any = js.native
    
    /* private */ var handlePopoverOpened: Any = js.native
    
    /* private */ var handlePopoverOpening: Any = js.native
    
    /* private */ var handleQueryListRef: Any = js.native
    
    var inputElement: HTMLInputElement | Null = js.native
    
    /* private */ var maybeResetActiveItemToSelectedItem: Any = js.native
    
    /* private */ var queryList: Any = js.native
    
    /* private */ var renderQueryList: Any = js.native
    
    /* private */ var selectText: Any = js.native
  }
  /* static members */
  object Suggest {
    
    @JSImport("@blueprintjs/select/lib/esm/components/suggest/suggest", "Suggest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components/suggest/suggest", "Suggest.defaultProps")
    @js.native
    def defaultProps: PartialSuggestPropsany = js.native
    inline def defaultProps_=(x: PartialSuggestPropsany): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components/suggest/suggest", "Suggest.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def ofType[U](): Instantiable1[/* props */ SuggestProps[U], Suggest[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ SuggestProps[U], Suggest[U]]]
  }
  
  @js.native
  trait ISuggestProps[T]
    extends StObject
       with ListItemsProps[T] {
    
    /**
      * Whether the popover should close after selecting an item.
      *
      * @default true
      */
    var closeOnSelect: js.UndefOr[Boolean] = js.native
    
    /**
      * The uncontrolled default selected item.
      * This prop is ignored if `selectedItem` is used to control the state.
      */
    var defaultSelectedItem: js.UndefOr[T] = js.native
    
    /** Whether the input field should be disabled. */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the component should take up the full width of its container.
      * This overrides `popoverProps.fill` and `inputProps.fill`.
      */
    var fill: js.UndefOr[Boolean] = js.native
    
    /**
      * Props to spread to the query `InputGroup`. To control this input, use
      * `query` and `onQueryChange` instead of `inputProps.value` and
      * `inputProps.onChange`.
      */
    var inputProps: js.UndefOr[InputGroupProps2] = js.native
    
    /** Custom renderer to transform an item into a string for the input value. */
    def inputValueRenderer(item: T): String = js.native
    
    /**
      * If true, the component waits until a keydown event in the TagInput
      * before opening its popover.
      *
      * If false, the popover opens immediately after a mouse click or TAB key
      * interaction focuses the component's TagInput.
      *
      * @default false
      */
    var openOnKeyDown: js.UndefOr[Boolean] = js.native
    
    /** Props to spread to `Popover`. Note that `content` cannot be changed. */
    var popoverProps: js.UndefOr[PartialIPopoverProps] = js.native
    
    /**
      * Whether the active item should be reset to the first matching item _when
      * the popover closes_. The query will also be reset to the empty string.
      *
      * @default false
      */
    var resetOnClose: js.UndefOr[Boolean] = js.native
    
    /**
      * The currently selected item, or `null` to indicate that no item is selected.
      * If omitted or `undefined`, this prop will be uncontrolled (managed by the component's state).
      * Use `onItemSelect` to listen for updates.
      */
    var selectedItem: js.UndefOr[T | Null] = js.native
  }
  
  trait ISuggestState[T] extends StObject {
    
    var isOpen: Boolean
    
    var selectedItem: T | Null
  }
  object ISuggestState {
    
    inline def apply[T](isOpen: Boolean): ISuggestState[T] = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], selectedItem = null)
      __obj.asInstanceOf[ISuggestState[T]]
    }
    
    extension [Self <: ISuggestState[?], T](x: Self & ISuggestState[T]) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setSelectedItem(value: T): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    }
  }
  
  type SuggestProps[T] = ISuggestProps[T]
}
