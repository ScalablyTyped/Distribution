package typings.baseui

import typings.baseui.anon.NewIndex
import typings.baseui.anon.OldIndex
import typings.baseui.baseuiStrings.change_
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dndListMod {
  
  @JSImport("baseui/dnd-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/dnd-list", "List")
  @js.native
  class List protected ()
    extends Component[ListProps, js.Object, js.Any] {
    def this(props: ListProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListProps, context: js.Any) = this()
  }
  
  trait STATE_CHANGE_TYPE extends StObject {
    
    var change: change_
  }
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/dnd-list", "STATE_CHANGE_TYPE")
    @js.native
    val ^ : STATE_CHANGE_TYPE = js.native
    
    extension [Self <: STATE_CHANGE_TYPE](x: Self) {
      
      inline def setChange(value: change_): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/dnd-list", "StatefulList")
  @js.native
  val StatefulList: FC[StatefulListProps] = js.native
  
  @JSImport("baseui/dnd-list", "StatefulListContainer")
  @js.native
  class StatefulListContainer protected ()
    extends Component[StatefulComponentContainerProps, State, js.Any] {
    def this(props: StatefulComponentContainerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StatefulComponentContainerProps, context: js.Any) = this()
    
    @JSName("internalSetState")
    def internalSetState_change(`type`: change_, changes: State): Unit = js.native
    
    def onChange(hasOldIndexNewIndex: OldIndex): Unit = js.native
  }
  
  @JSImport("baseui/dnd-list", "StyledCloseHandle")
  @js.native
  val StyledCloseHandle: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/dnd-list", "StyledDragHandle")
  @js.native
  val StyledDragHandle: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/dnd-list", "StyledItem")
  @js.native
  val StyledItem: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/dnd-list", "StyledLabel")
  @js.native
  val StyledLabel: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/dnd-list", "StyledList")
  @js.native
  val StyledList: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/dnd-list", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  inline def arrayMove[T](array: js.Array[T], from: Double, to: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMove")(array.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def arrayRemove[T](array: js.Array[T], index: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  trait ListOverrides extends StObject {
    
    var CloseHandle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ] = js.undefined
    
    var DragHandle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ] = js.undefined
    
    var Item: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ] = js.undefined
    
    var Label: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ] = js.undefined
    
    var List: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ] = js.undefined
  }
  object ListOverrides {
    
    inline def apply(): ListOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOverrides]
    }
    
    extension [Self <: ListOverrides](x: Self) {
      
      inline def setCloseHandle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ): Self = StObject.set(x, "CloseHandle", value.asInstanceOf[js.Any])
      
      inline def setCloseHandleUndefined: Self = StObject.set(x, "CloseHandle", js.undefined)
      
      inline def setDragHandle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ): Self = StObject.set(x, "DragHandle", value.asInstanceOf[js.Any])
      
      inline def setDragHandleUndefined: Self = StObject.set(x, "DragHandle", js.undefined)
      
      inline def setItem(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
      
      inline def setList(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "List", js.undefined)
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait ListProps extends StObject {
    
    var items: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* args */ OldIndex, js.Any]] = js.undefined
    
    var overrides: js.UndefOr[ListOverrides] = js.undefined
    
    var removable: js.UndefOr[Boolean] = js.undefined
    
    var removableByMove: js.UndefOr[Boolean] = js.undefined
  }
  object ListProps {
    
    inline def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
    
    extension [Self <: ListProps](x: Self) {
      
      inline def setItems(value: js.Array[ReactNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: ReactNode*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setOnChange(value: /* args */ OldIndex => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMoveUndefined: Self = StObject.set(x, "removableByMove", js.undefined)
      
      inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
    }
  }
  
  trait SharedStylePropsArgT extends StObject {
    
    @JSName("$isDragged")
    var $isDragged: Boolean
    
    @JSName("$isRemovable")
    var $isRemovable: Boolean
    
    @JSName("$isRemovableByMove")
    var $isRemovableByMove: Boolean
    
    @JSName("$isSelected")
    var $isSelected: Boolean
    
    @JSName("$value")
    var $value: ReactNode
  }
  object SharedStylePropsArgT {
    
    inline def apply($isDragged: Boolean, $isRemovable: Boolean, $isRemovableByMove: Boolean, $isSelected: Boolean): SharedStylePropsArgT = {
      val __obj = js.Dynamic.literal($isDragged = $isDragged.asInstanceOf[js.Any], $isRemovable = $isRemovable.asInstanceOf[js.Any], $isRemovableByMove = $isRemovableByMove.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedStylePropsArgT]
    }
    
    extension [Self <: SharedStylePropsArgT](x: Self) {
      
      inline def set$isDragged(value: Boolean): Self = StObject.set(x, "$isDragged", value.asInstanceOf[js.Any])
      
      inline def set$isRemovable(value: Boolean): Self = StObject.set(x, "$isRemovable", value.asInstanceOf[js.Any])
      
      inline def set$isRemovableByMove(value: Boolean): Self = StObject.set(x, "$isRemovableByMove", value.asInstanceOf[js.Any])
      
      inline def set$isSelected(value: Boolean): Self = StObject.set(x, "$isSelected", value.asInstanceOf[js.Any])
      
      inline def set$value(value: ReactNode): Self = StObject.set(x, "$value", value.asInstanceOf[js.Any])
      
      inline def set$valueUndefined: Self = StObject.set(x, "$value", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var items: js.Array[ReactNode]
  }
  object State {
    
    inline def apply(items: js.Array[ReactNode]): State = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setItems(value: js.Array[ReactNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: ReactNode*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  type StateReducer = js.Function3[change_, /* nextState */ State, /* currentState */ State, State]
  
  trait StatefulComponentContainerProps
    extends StObject
       with StatefulListProps {
    
    var children: ReactNode
  }
  object StatefulComponentContainerProps {
    
    inline def apply(): StatefulComponentContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulComponentContainerProps]
    }
    
    extension [Self <: StatefulComponentContainerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait StatefulListProps extends StObject {
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* params */ NewIndex, js.Any]] = js.undefined
    
    var overrides: js.UndefOr[ListOverrides] = js.undefined
    
    var removable: js.UndefOr[Boolean] = js.undefined
    
    var removableByMove: js.UndefOr[Boolean] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulListProps {
    
    inline def apply(): StatefulListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulListProps]
    }
    
    extension [Self <: StatefulListProps](x: Self) {
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* params */ NewIndex => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMoveUndefined: Self = StObject.set(x, "removableByMove", js.undefined)
      
      inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
      
      inline def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
