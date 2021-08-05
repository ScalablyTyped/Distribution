package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsSelect.anon.PartialIPopoverProps
import typings.blueprintjsSelect.listItemsPropsMod.IListItemsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("@blueprintjs/select/lib/esm/components/select/select", "Select")
  @js.native
  class Select[T] protected ()
    extends AbstractPureComponent2[ISelectProps[T], ISelectState, js.Object] {
    def this(props: ISelectProps[T]) = this()
    def this(props: ISelectProps[T], context: js.Any) = this()
    
    /* private */ var TypedQueryList: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSelect(_prevProps: ISelectProps[T], prevState: ISelectState): Unit = js.native
    
    /* private */ var handleItemSelect: js.Any = js.native
    
    /* private */ var handlePopoverClosing: js.Any = js.native
    
    /* private */ var handlePopoverInteraction: js.Any = js.native
    
    /* private */ var handlePopoverOpened: js.Any = js.native
    
    /* private */ var handlePopoverOpening: js.Any = js.native
    
    /* private */ var handleTargetKeyDown: js.Any = js.native
    
    /* private */ var inputEl: js.Any = js.native
    
    /* private */ var maybeRenderClearButton: js.Any = js.native
    
    /* private */ var previousFocusedElement: js.Any = js.native
    
    /* private */ var queryList: js.Any = js.native
    
    /* private */ var refHandlers: js.Any = js.native
    
    /* private */ var renderQueryList: js.Any = js.native
    
    /* private */ var resetQuery: js.Any = js.native
  }
  /* static members */
  object Select {
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/select", "Select")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/select", "Select.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def ofType[U](): Instantiable1[/* props */ ISelectProps[U], Select[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ ISelectProps[U], Select[U]]]
  }
  
  @js.native
  trait ISelectProps[T]
    extends StObject
       with IListItemsProps[T] {
    
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
    var inputProps: js.UndefOr[IInputGroupProps & HTMLInputProps] = js.native
    
    /** Props to spread to `Popover`. Note that `content` cannot be changed. */
    var popoverProps: js.UndefOr[PartialIPopoverProps & js.Object] = js.native
    
    /**
      * Whether the active item should be reset to the first matching item _when
      * the popover closes_. The query will also be reset to the empty string.
      * @default false
      */
    var resetOnClose: js.UndefOr[Boolean] = js.native
  }
  
  trait ISelectState extends StObject {
    
    var isOpen: Boolean
  }
  object ISelectState {
    
    inline def apply(isOpen: Boolean): ISelectState = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISelectState]
    }
    
    extension [Self <: ISelectState](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
}
