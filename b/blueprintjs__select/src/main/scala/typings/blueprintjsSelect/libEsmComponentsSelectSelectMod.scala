package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.libEsmComponentsFormsInputGroupMod.InputGroupProps2
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsSelect.anon.PartialIPopoverProps
import typings.blueprintjsSelect.libEsmCommonListItemsPropsMod.ListItemsProps
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsSelectSelectMod {
  
  @JSImport("@blueprintjs/select/lib/esm/components/select/select", "Select")
  @js.native
  open class Select[T] protected ()
    extends AbstractPureComponent2[SelectProps[T], ISelectState, js.Object] {
    def this(props: SelectProps[T]) = this()
    def this(props: SelectProps[T], context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSelect(prevProps: SelectProps[T], prevState: ISelectState): Unit = js.native
    
    /* private */ var handleInputRef: Any = js.native
    
    /* private */ var handleItemSelect: Any = js.native
    
    /* private */ var handlePopoverClosing: Any = js.native
    
    /* private */ var handlePopoverInteraction: Any = js.native
    
    /* private */ var handlePopoverOpened: Any = js.native
    
    /* private */ var handlePopoverOpening: Any = js.native
    
    /* private */ var handleQueryListRef: Any = js.native
    
    /* private */ var handleTargetKeyDown: Any = js.native
    
    var inputElement: HTMLInputElement | Null = js.native
    
    /* private */ var maybeRenderClearButton: Any = js.native
    
    /* private */ var previousFocusedElement: Any = js.native
    
    /* private */ var queryList: Any = js.native
    
    /* private */ var renderQueryList: Any = js.native
    
    /* private */ var resetQuery: Any = js.native
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
    
    inline def ofType[U](): Instantiable1[/* props */ SelectProps[U], Select[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ SelectProps[U], Select[U]]]
  }
  
  @js.native
  trait ISelectProps[T]
    extends StObject
       with ListItemsProps[T] {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    /**
      * Whether the component is non-interactive.
      * If true, the list's item renderer will not be called.
      * Note that you'll also need to disable the component's children, if appropriate.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the component should take up the full width of its container.
      * This overrides `popoverProps.fill`. You also have to ensure that the child
      * component has `fill` set to `true` or is styled appropriately.
      */
    var fill: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the dropdown list can be filtered.
      * Disabling this option will remove the `InputGroup` and ignore `inputProps`.
      *
      * @default true
      */
    var filterable: js.UndefOr[Boolean] = js.native
    
    /**
      * Props to spread to the query `InputGroup`. Use `query` and
      * `onQueryChange` instead of `inputProps.value` and `inputProps.onChange`
      * to control this input.
      */
    var inputProps: js.UndefOr[InputGroupProps2] = js.native
    
    /**
      * Whether the select popover should be styled so that it matches the width of the target.
      * This is done using a popper.js modifier passed through `popoverProps`.
      *
      * Note that setting `matchTargetWidth={true}` will also set `popoverProps.usePortal={false}` and `popoverProps.wrapperTagName="div"`.
      *
      * @default false
      */
    var matchTargetWidth: js.UndefOr[Boolean] = js.native
    
    /** Props to spread to `Popover`. Note that `content` cannot be changed. */
    var popoverProps: js.UndefOr[PartialIPopoverProps & js.Object] = js.native
    
    /**
      * Whether the active item should be reset to the first matching item _when
      * the popover closes_. The query will also be reset to the empty string.
      *
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
  
  type SelectProps[T] = ISelectProps[T]
}
