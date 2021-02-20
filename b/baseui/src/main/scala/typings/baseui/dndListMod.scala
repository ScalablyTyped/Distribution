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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dndListMod {
  
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
  
  @js.native
  trait STATE_CHANGE_TYPE extends StObject {
    
    var change: change_ = js.native
  }
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/dnd-list", "STATE_CHANGE_TYPE")
    @js.native
    val ^ : STATE_CHANGE_TYPE = js.native
    
    @scala.inline
    implicit class STATE_CHANGE_TYPEMutableBuilder[Self <: STATE_CHANGE_TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: change_): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
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
  
  @JSImport("baseui/dnd-list", "arrayMove")
  @js.native
  def arrayMove[T](array: js.Array[T], from: Double, to: Double): js.Array[T] = js.native
  
  @JSImport("baseui/dnd-list", "arrayRemove")
  @js.native
  def arrayRemove[T](array: js.Array[T], index: Double): js.Array[T] = js.native
  
  @js.native
  trait ListOverrides extends StObject {
    
    var CloseHandle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ] = js.native
    
    var DragHandle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ] = js.native
    
    var Item: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ] = js.native
    
    var Label: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ] = js.native
    
    var List: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ] = js.native
  }
  object ListOverrides {
    
    @scala.inline
    def apply(): ListOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOverrides]
    }
    
    @scala.inline
    implicit class ListOverridesMutableBuilder[Self <: ListOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseHandle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ): Self = StObject.set(x, "CloseHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseHandleUndefined: Self = StObject.set(x, "CloseHandle", js.undefined)
      
      @scala.inline
      def setDragHandle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ): Self = StObject.set(x, "DragHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragHandleUndefined: Self = StObject.set(x, "DragHandle", js.undefined)
      
      @scala.inline
      def setItem(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
      
      @scala.inline
      def setList(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "List", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedStylePropsArgT> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  @js.native
  trait ListProps extends StObject {
    
    var items: js.UndefOr[js.Array[ReactNode]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* args */ OldIndex, _]] = js.native
    
    var overrides: js.UndefOr[ListOverrides] = js.native
    
    var removable: js.UndefOr[Boolean] = js.native
    
    var removableByMove: js.UndefOr[Boolean] = js.native
  }
  object ListProps {
    
    @scala.inline
    def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
    
    @scala.inline
    implicit class ListPropsMutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[ReactNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: ReactNode*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOnChange(value: /* args */ OldIndex => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovableByMoveUndefined: Self = StObject.set(x, "removableByMove", js.undefined)
      
      @scala.inline
      def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
    }
  }
  
  @js.native
  trait SharedStylePropsArgT extends StObject {
    
    @JSName("$isDragged")
    var $isDragged: Boolean = js.native
    
    @JSName("$isRemovable")
    var $isRemovable: Boolean = js.native
    
    @JSName("$isRemovableByMove")
    var $isRemovableByMove: Boolean = js.native
    
    @JSName("$isSelected")
    var $isSelected: Boolean = js.native
    
    @JSName("$value")
    var $value: ReactNode = js.native
  }
  object SharedStylePropsArgT {
    
    @scala.inline
    def apply($isDragged: Boolean, $isRemovable: Boolean, $isRemovableByMove: Boolean, $isSelected: Boolean): SharedStylePropsArgT = {
      val __obj = js.Dynamic.literal($isDragged = $isDragged.asInstanceOf[js.Any], $isRemovable = $isRemovable.asInstanceOf[js.Any], $isRemovableByMove = $isRemovableByMove.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedStylePropsArgT]
    }
    
    @scala.inline
    implicit class SharedStylePropsArgTMutableBuilder[Self <: SharedStylePropsArgT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$isDragged(value: Boolean): Self = StObject.set(x, "$isDragged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isRemovable(value: Boolean): Self = StObject.set(x, "$isRemovable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isRemovableByMove(value: Boolean): Self = StObject.set(x, "$isRemovableByMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isSelected(value: Boolean): Self = StObject.set(x, "$isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$value(value: ReactNode): Self = StObject.set(x, "$value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$valueUndefined: Self = StObject.set(x, "$value", js.undefined)
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var items: js.Array[ReactNode] = js.native
  }
  object State {
    
    @scala.inline
    def apply(items: js.Array[ReactNode]): State = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[ReactNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: ReactNode*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
  
  type StateReducer = js.Function3[change_, /* nextState */ State, /* currentState */ State, State]
  
  /* Inlined baseui.baseui/dnd-list.StatefulListProps & {  initialState :baseui.baseui/dnd-list.State | undefined,   children :react.react.ReactNode} */
  @js.native
  trait StatefulComponentContainerProps extends StObject {
    
    var children: ReactNode = js.native
    
    var initialState: js.UndefOr[State] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* params */ NewIndex, _]] = js.native
    
    var overrides: js.UndefOr[ListOverrides] = js.native
    
    var removable: js.UndefOr[Boolean] = js.native
    
    var removableByMove: js.UndefOr[Boolean] = js.native
    
    var stateReducer: js.UndefOr[StateReducer] = js.native
  }
  object StatefulComponentContainerProps {
    
    @scala.inline
    def apply(): StatefulComponentContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulComponentContainerProps]
    }
    
    @scala.inline
    implicit class StatefulComponentContainerPropsMutableBuilder[Self <: StatefulComponentContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* params */ NewIndex => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovableByMoveUndefined: Self = StObject.set(x, "removableByMove", js.undefined)
      
      @scala.inline
      def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
      
      @scala.inline
      def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  @js.native
  trait StatefulListProps extends StObject {
    
    var initialState: js.UndefOr[State] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* params */ NewIndex, _]] = js.native
    
    var overrides: js.UndefOr[ListOverrides] = js.native
    
    var removable: js.UndefOr[Boolean] = js.native
    
    var removableByMove: js.UndefOr[Boolean] = js.native
    
    var stateReducer: js.UndefOr[StateReducer] = js.native
  }
  object StatefulListProps {
    
    @scala.inline
    def apply(): StatefulListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulListProps]
    }
    
    @scala.inline
    implicit class StatefulListPropsMutableBuilder[Self <: StatefulListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* params */ NewIndex => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovableByMoveUndefined: Self = StObject.set(x, "removableByMove", js.undefined)
      
      @scala.inline
      def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
      
      @scala.inline
      def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
