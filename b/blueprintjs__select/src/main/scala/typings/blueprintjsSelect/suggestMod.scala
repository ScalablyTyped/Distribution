package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsSelect.anon.PartialIPopoverProps
import typings.blueprintjsSelect.anon.PartialISuggestPropsany
import typings.blueprintjsSelect.listItemsPropsMod.IListItemsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suggestMod {
  
  @JSImport("@blueprintjs/select/lib/esm/components/select/suggest", "Suggest")
  @js.native
  class Suggest[T] protected ()
    extends AbstractPureComponent2[ISuggestProps[T], ISuggestState[T], js.Object] {
    def this(props: ISuggestProps[T]) = this()
    def this(props: ISuggestProps[T], context: js.Any) = this()
    
    var TypedQueryList: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSuggest(_prevProps: ISuggestProps[T], prevState: ISuggestState[T]): Unit = js.native
    
    var getInitialSelectedItem: js.Any = js.native
    
    var getTargetKeyDownHandler: js.Any = js.native
    
    var getTargetKeyUpHandler: js.Any = js.native
    
    var handleInputFocus: js.Any = js.native
    
    var handleItemSelect: js.Any = js.native
    
    var handlePopoverInteraction: js.Any = js.native
    
    var handlePopoverOpened: js.Any = js.native
    
    var handlePopoverOpening: js.Any = js.native
    
    var inputEl: js.Any = js.native
    
    var maybeResetActiveItemToSelectedItem: js.Any = js.native
    
    var queryList: js.Any = js.native
    
    var refHandlers: js.Any = js.native
    
    var renderQueryList: js.Any = js.native
    
    var selectText: js.Any = js.native
  }
  /* static members */
  object Suggest {
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/suggest", "Suggest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/suggest", "Suggest.defaultProps")
    @js.native
    def defaultProps: PartialISuggestPropsany = js.native
    @scala.inline
    def defaultProps_=(x: PartialISuggestPropsany): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/suggest", "Suggest.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/suggest", "Suggest.ofType")
    @js.native
    def ofType[U](): Instantiable1[/* props */ ISuggestProps[U], Suggest[U]] = js.native
  }
  
  @js.native
  trait ISuggestProps[T] extends IListItemsProps[T] {
    
    /**
      * Whether the popover should close after selecting an item.
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
    var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
    
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
    var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.native
    
    /**
      * Whether the active item should be reset to the first matching item _when
      * the popover closes_. The query will also be reset to the empty string.
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
  
  @js.native
  trait ISuggestState[T] extends StObject {
    
    var isOpen: Boolean = js.native
    
    var selectedItem: T | Null = js.native
  }
  object ISuggestState {
    
    @scala.inline
    def apply[T](isOpen: Boolean): ISuggestState[T] = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISuggestState[T]]
    }
    
    @scala.inline
    implicit class ISuggestStateMutableBuilder[Self <: ISuggestState[_], T] (val x: Self with ISuggestState[T]) extends AnyVal {
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItem(value: T): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    }
  }
}
