package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsSelect.anon.PartialIPopoverProps
import typings.blueprintjsSelect.listItemsPropsMod.IListItemsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("@blueprintjs/select/lib/esm/components/select/select", "Select")
  @js.native
  class Select[T] protected ()
    extends AbstractPureComponent2[ISelectProps[T], ISelectState, js.Object] {
    def this(props: ISelectProps[T]) = this()
    def this(props: ISelectProps[T], context: js.Any) = this()
    
    var TypedQueryList: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSelect(_prevProps: ISelectProps[T], prevState: ISelectState): Unit = js.native
    
    var handleItemSelect: js.Any = js.native
    
    var handlePopoverClosing: js.Any = js.native
    
    var handlePopoverInteraction: js.Any = js.native
    
    var handlePopoverOpened: js.Any = js.native
    
    var handlePopoverOpening: js.Any = js.native
    
    var handleTargetKeyDown: js.Any = js.native
    
    var inputEl: js.Any = js.native
    
    var maybeRenderClearButton: js.Any = js.native
    
    var previousFocusedElement: js.Any = js.native
    
    var queryList: js.Any = js.native
    
    var refHandlers: js.Any = js.native
    
    var renderQueryList: js.Any = js.native
    
    var resetQuery: js.Any = js.native
  }
  /* static members */
  object Select {
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/select", "Select")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/select", "Select.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/select", "Select.ofType")
    @js.native
    def ofType[U](): Instantiable1[/* props */ ISelectProps[U], Select[U]] = js.native
  }
  
  @js.native
  trait ISelectProps[T] extends IListItemsProps[T] {
    
    /**
      * Whether the component is non-interactive.
      * If true, the list's item renderer will not be called.
      * Note that you'll also need to disable the component's children, if appropriate.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the dropdown list can be filtered.
      * Disabling this option will remove the `InputGroup` and ignore `inputProps`.
      * @default true
      */
    var filterable: js.UndefOr[Boolean] = js.native
    
    /**
      * Props to spread to the query `InputGroup`. Use `query` and
      * `onQueryChange` instead of `inputProps.value` and `inputProps.onChange`
      * to control this input.
      */
    var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
    
    /** Props to spread to `Popover`. Note that `content` cannot be changed. */
    var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.native
    
    /**
      * Whether the active item should be reset to the first matching item _when
      * the popover closes_. The query will also be reset to the empty string.
      * @default false
      */
    var resetOnClose: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait ISelectState extends StObject {
    
    var isOpen: Boolean = js.native
  }
  object ISelectState {
    
    @scala.inline
    def apply(isOpen: Boolean): ISelectState = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectState]
    }
    
    @scala.inline
    implicit class ISelectStateMutableBuilder[Self <: ISelectState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
}
