package typings.baseui

import typings.baseui.anon.NewIndex
import typings.baseui.anon.NewState
import typings.baseui.anon.OmitListPropschildren
import typings.baseui.baseuiStrings.change_
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dndListTypesMod {
  
  trait ListOverrides extends StObject {
    
    var CloseHandle: js.UndefOr[Override[Any]] = js.undefined
    
    var DragHandle: js.UndefOr[Override[Any]] = js.undefined
    
    var Item: js.UndefOr[Override[Any]] = js.undefined
    
    var Label: js.UndefOr[Override[Any]] = js.undefined
    
    var List: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object ListOverrides {
    
    inline def apply(): ListOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListOverrides] (val x: Self) extends AnyVal {
      
      inline def setCloseHandle(value: Override[Any]): Self = StObject.set(x, "CloseHandle", value.asInstanceOf[js.Any])
      
      inline def setCloseHandleUndefined: Self = StObject.set(x, "CloseHandle", js.undefined)
      
      inline def setDragHandle(value: Override[Any]): Self = StObject.set(x, "DragHandle", value.asInstanceOf[js.Any])
      
      inline def setDragHandleUndefined: Self = StObject.set(x, "DragHandle", js.undefined)
      
      inline def setItem(value: Override[Any]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setLabel(value: Override[Any]): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
      
      inline def setList(value: Override[Any]): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "List", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait ListProps extends StObject {
    
    /** Items (labels) to be rendered */
    var items: js.Array[ReactNode]
    
    /** Handler for when drag and drop is finished and order changed or item is deleted (newIndex would be -1 in that case) */
    def onChange(a: NewIndex): Any
    
    var overrides: js.UndefOr[ListOverrides] = js.undefined
    
    /** Set if the list items should be removable */
    var removable: js.UndefOr[Boolean] = js.undefined
    
    /** Set if the list items should be removable by dragging them far left or right */
    var removableByMove: js.UndefOr[Boolean] = js.undefined
  }
  object ListProps {
    
    inline def apply(items: js.Array[ReactNode], onChange: NewIndex => Any): ListProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[ListProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[ReactNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: ReactNode*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnChange(value: NewIndex => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMoveUndefined: Self = StObject.set(x, "removableByMove", js.undefined)
      
      inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
    }
  }
  
  trait SharedStylePropsArg extends StObject {
    
    @JSName("$index")
    var $index: Double
    
    @JSName("$isDragged")
    var $isDragged: Boolean
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: Boolean
    
    @JSName("$isOutOfBounds")
    var $isOutOfBounds: Boolean
    
    @JSName("$isRemovable")
    var $isRemovable: Boolean
    
    @JSName("$isRemovableByMove")
    var $isRemovableByMove: Boolean
    
    @JSName("$isSelected")
    var $isSelected: Boolean
    
    @JSName("$value")
    var $value: ReactNode
  }
  object SharedStylePropsArg {
    
    inline def apply(
      $index: Double,
      $isDragged: Boolean,
      $isFocusVisible: Boolean,
      $isOutOfBounds: Boolean,
      $isRemovable: Boolean,
      $isRemovableByMove: Boolean,
      $isSelected: Boolean
    ): SharedStylePropsArg = {
      val __obj = js.Dynamic.literal($index = $index.asInstanceOf[js.Any], $isDragged = $isDragged.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isOutOfBounds = $isOutOfBounds.asInstanceOf[js.Any], $isRemovable = $isRemovable.asInstanceOf[js.Any], $isRemovableByMove = $isRemovableByMove.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedStylePropsArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SharedStylePropsArg] (val x: Self) extends AnyVal {
      
      inline def set$index(value: Double): Self = StObject.set(x, "$index", value.asInstanceOf[js.Any])
      
      inline def set$isDragged(value: Boolean): Self = StObject.set(x, "$isDragged", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isOutOfBounds(value: Boolean): Self = StObject.set(x, "$isOutOfBounds", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[ReactNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: ReactNode*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  /* Inlined { readonly change :'change'}[keyof { readonly change :'change'}] */
  type StateChangeType = change_
  
  type StateReducer = js.Function3[
    /* stateChangeType */ StateChangeType, 
    /* nextState */ State, 
    /* currentState */ State, 
    State
  ]
  
  /* Inlined std.Omit<baseui.baseui/dnd-list/types.StatefulListProps, 'children'> & {  initialState :baseui.baseui/dnd-list/types.State | undefined, children (props : std.Omit<baseui.baseui/dnd-list/types.ListProps, 'children'>): react.react.ReactNode} */
  trait StatefulComponentContainerProps extends StObject {
    
    def children(props: OmitListPropschildren): ReactNode
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* params */ NewState, Any]] = js.undefined
    
    var overrides: js.UndefOr[ListOverrides] = js.undefined
    
    var removable: js.UndefOr[Boolean] = js.undefined
    
    var removableByMove: js.UndefOr[Boolean] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulComponentContainerProps {
    
    inline def apply(children: OmitListPropschildren => ReactNode): StatefulComponentContainerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[StatefulComponentContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulComponentContainerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: OmitListPropschildren => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* params */ NewState => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMoveUndefined: Self = StObject.set(x, "removableByMove", js.undefined)
      
      inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
      
      inline def setStateReducer(
        value: (/* stateChangeType */ StateChangeType, /* nextState */ State, /* currentState */ State) => State
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  trait StatefulListProps extends StObject {
    
    /** Initial state populated into the component */
    var initialState: js.UndefOr[State] = js.undefined
    
    /** Handler for when drag and drop is finished and order changed or item is deleted (newIndex would be -1 in that case) */
    var onChange: js.UndefOr[js.Function1[/* params */ NewState, Any]] = js.undefined
    
    var overrides: js.UndefOr[ListOverrides] = js.undefined
    
    /** Set if the list items should be removable */
    var removable: js.UndefOr[Boolean] = js.undefined
    
    /** Set if the list items should be removable by dragging them far left or right */
    var removableByMove: js.UndefOr[Boolean] = js.undefined
    
    /** Reducer function to manipulate internal state updates. */
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulListProps {
    
    inline def apply(): StatefulListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulListProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulListProps] (val x: Self) extends AnyVal {
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* params */ NewState => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMove(value: Boolean): Self = StObject.set(x, "removableByMove", value.asInstanceOf[js.Any])
      
      inline def setRemovableByMoveUndefined: Self = StObject.set(x, "removableByMove", js.undefined)
      
      inline def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
      
      inline def setStateReducer(
        value: (/* stateChangeType */ StateChangeType, /* nextState */ State, /* currentState */ State) => State
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
