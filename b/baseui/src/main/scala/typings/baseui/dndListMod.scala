package typings.baseui

import typings.baseui.anon.Items
import typings.baseui.anon.NewIndex
import typings.baseui.anon.NewState
import typings.baseui.anon.OmitListPropschildren
import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.li_
import typings.baseui.baseuiStrings.ul
import typings.baseui.dndListTypesMod.ListOverrides
import typings.baseui.dndListTypesMod.SharedStylePropsArg
import typings.baseui.dndListTypesMod.State
import typings.baseui.dndListTypesMod.StateReducer
import typings.baseui.dndListTypesMod.StatefulListProps
import typings.baseui.listMod.default
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dndListMod {
  
  @JSImport("baseui/dnd-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/dnd-list", "List")
  @js.native
  open class List () extends default
  object List {
    
    /* static member */
    /* Inlined std.Partial<baseui.baseui/dnd-list/types.ListProps> */
    object defaultProps {
      
      @JSImport("baseui/dnd-list", "List.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/dnd-list", "List.defaultProps.items")
      @js.native
      def items: js.UndefOr[js.Array[ReactNode]] = js.native
      inline def items_=(x: js.UndefOr[js.Array[ReactNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list", "List.defaultProps.onChange")
      @js.native
      def onChange: js.UndefOr[js.Function1[/* a */ NewIndex, Any]] = js.native
      inline def onChange_=(x: js.UndefOr[js.Function1[/* a */ NewIndex, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list", "List.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[ListOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[ListOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list", "List.defaultProps.removable")
      @js.native
      def removable: js.UndefOr[Boolean] = js.native
      
      @JSImport("baseui/dnd-list", "List.defaultProps.removableByMove")
      @js.native
      def removableByMove: js.UndefOr[Boolean] = js.native
      inline def removableByMove_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removableByMove")(x.asInstanceOf[js.Any])
      
      inline def removable_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removable")(x.asInstanceOf[js.Any])
    }
  }
  
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/dnd-list", "STATE_CHANGE_TYPE.change")
    @js.native
    val change: change_ = js.native
  }
  
  object StatefulList {
    
    inline def apply(props: StatefulListProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/dnd-list", "StatefulList")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/dnd-list", "StatefulList.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/dnd-list", "StatefulList.defaultProps.initialState")
      @js.native
      def initialState: Items = js.native
      inline def initialState_=(x: Items): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list", "StatefulList.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/dnd-list", "StatefulListContainer")
  @js.native
  open class StatefulListContainer ()
    extends typings.baseui.statefulListContainerMod.default
  object StatefulListContainer {
    
    /* static member */
    /* Inlined std.Partial<baseui.baseui/dnd-list/types.StatefulComponentContainerProps> */
    object defaultProps {
      
      @JSImport("baseui/dnd-list", "StatefulListContainer.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/dnd-list", "StatefulListContainer.defaultProps.children")
      @js.native
      def children: js.UndefOr[js.Function1[/* props */ OmitListPropschildren, ReactNode]] = js.native
      inline def children_=(x: js.UndefOr[js.Function1[/* props */ OmitListPropschildren, ReactNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list", "StatefulListContainer.defaultProps.initialState")
      @js.native
      def initialState: js.UndefOr[State] = js.native
      inline def initialState_=(x: js.UndefOr[State]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list", "StatefulListContainer.defaultProps.onChange")
      @js.native
      def onChange: js.UndefOr[js.Function1[/* params */ NewState, Any]] = js.native
      inline def onChange_=(x: js.UndefOr[js.Function1[/* params */ NewState, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list", "StatefulListContainer.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[ListOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[ListOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list", "StatefulListContainer.defaultProps.removable")
      @js.native
      def removable: js.UndefOr[Boolean] = js.native
      
      @JSImport("baseui/dnd-list", "StatefulListContainer.defaultProps.removableByMove")
      @js.native
      def removableByMove: js.UndefOr[Boolean] = js.native
      inline def removableByMove_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removableByMove")(x.asInstanceOf[js.Any])
      
      inline def removable_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removable")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list", "StatefulListContainer.defaultProps.stateReducer")
      @js.native
      def stateReducer: js.UndefOr[StateReducer] = js.native
      inline def stateReducer_=(x: js.UndefOr[StateReducer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/dnd-list", "StyledCloseHandle")
  @js.native
  val StyledCloseHandle: StyletronComponent[button, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/dnd-list", "StyledDragHandle")
  @js.native
  val StyledDragHandle: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/dnd-list", "StyledItem")
  @js.native
  val StyledItem: StyletronComponent[li_, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/dnd-list", "StyledLabel")
  @js.native
  val StyledLabel: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/dnd-list", "StyledList")
  @js.native
  val StyledList: StyletronComponent[ul, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/dnd-list", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  inline def arrayMove[T](array: js.Array[T], from: Double, to: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMove")(array.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def arrayRemove[T](array: js.Array[T], index: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  type SharedStylePropsArgT = SharedStylePropsArg
}
