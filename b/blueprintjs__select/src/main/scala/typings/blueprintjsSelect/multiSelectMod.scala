package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsSelect.anon.Fill
import typings.blueprintjsSelect.anon.PartialIPopoverProps
import typings.blueprintjsSelect.anon.PartialITagInputProps
import typings.blueprintjsSelect.listItemsPropsMod.IListItemsProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSelectMod {
  
  @JSImport("@blueprintjs/select/lib/esm/components/select/multiSelect", "MultiSelect")
  @js.native
  class MultiSelect[T] protected ()
    extends AbstractPureComponent2[IMultiSelectProps[T], IMultiSelectState, js.Object] {
    def this(props: IMultiSelectProps[T]) = this()
    def this(props: IMultiSelectProps[T], context: js.Any) = this()
    
    var TypedQueryList: js.Any = js.native
    
    var getTagInputKeyDownHandler: js.Any = js.native
    
    var getTagInputKeyUpHandler: js.Any = js.native
    
    var handleItemSelect: js.Any = js.native
    
    var handlePopoverInteraction: js.Any = js.native
    
    var handlePopoverOpened: js.Any = js.native
    
    var handleQueryChange: js.Any = js.native
    
    var handleTagRemove: js.Any = js.native
    
    var input: js.Any = js.native
    
    var queryList: js.Any = js.native
    
    var refHandlers: js.Any = js.native
    
    var renderQueryList: js.Any = js.native
  }
  /* static members */
  object MultiSelect {
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/multiSelect", "MultiSelect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/multiSelect", "MultiSelect.defaultProps")
    @js.native
    def defaultProps: Fill = js.native
    @scala.inline
    def defaultProps_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components/select/multiSelect", "MultiSelect.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ofType[U](): Instantiable1[/* props */ IMultiSelectProps[U], MultiSelect[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ IMultiSelectProps[U], MultiSelect[U]]]
  }
  
  @js.native
  trait IMultiSelectProps[T]
    extends StObject
       with IListItemsProps[T] {
    
    /**
      * Whether the component should take up the full width of its container.
      * This overrides `popoverProps.fill` and `tagInputProps.fill`.
      */
    var fill: js.UndefOr[Boolean] = js.native
    
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
      * @default "Search..."
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /** Props to spread to `Popover`. Note that `content` cannot be changed. */
    var popoverProps: js.UndefOr[PartialIPopoverProps & js.Object] = js.native
    
    /** Controlled selected values. */
    var selectedItems: js.UndefOr[js.Array[T]] = js.native
    
    /** Props to spread to `TagInput`. Use `query` and `onQueryChange` to control the input. */
    var tagInputProps: js.UndefOr[PartialITagInputProps & js.Object] = js.native
    
    /** Custom renderer to transform an item into tag content. */
    def tagRenderer(item: T): ReactNode = js.native
  }
  
  trait IMultiSelectState extends StObject {
    
    var isOpen: Boolean
  }
  object IMultiSelectState {
    
    @scala.inline
    def apply(isOpen: Boolean): IMultiSelectState = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMultiSelectState]
    }
    
    @scala.inline
    implicit class IMultiSelectStateMutableBuilder[Self <: IMultiSelectState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
}
