package typings.baseui

import typings.baseui.anon.`1`
import typings.baseui.anon.`2`
import typings.baseui.anon.`3`
import typings.baseui.datepickerTypesMod.ContainerState
import typings.baseui.datepickerTypesMod.StateChangeType
import typings.baseui.datepickerTypesMod.StateReducer
import typings.baseui.datepickerTypesMod.StatefulContainerProps
import typings.baseui.datepickerUtilsTypesMod.DateIOAdapter
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datepickerStatefulContainerMod {
  
  @JSImport("baseui/datepicker/stateful-container", JSImport.Default)
  @js.native
  open class default[T] protected () extends StatefulContainer[T] {
    def this(props: Props[T]) = this()
  }
  object default {
    
    /* static member */
    /* Inlined {  stateReducer :baseui.baseui/datepicker/types.StateReducer<unknown>} & std.Partial<baseui.baseui/datepicker/stateful-container.Props<unknown>> */
    object defaultProps {
      
      @JSImport("baseui/datepicker/stateful-container", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/datepicker/stateful-container", "default.defaultProps.adapter")
      @js.native
      def adapter: js.UndefOr[DateIOAdapter[Any]] = js.native
      inline def adapter_=(x: js.UndefOr[DateIOAdapter[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adapter")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker/stateful-container", "default.defaultProps.children")
      @js.native
      def children: js.UndefOr[js.Function1[/* a */ InputProps[Any], ReactNode]] = js.native
      inline def children_=(x: js.UndefOr[js.Function1[/* a */ InputProps[Any], ReactNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker/stateful-container", "default.defaultProps.initialState")
      @js.native
      def initialState: js.UndefOr[ContainerState[Any]] = js.native
      inline def initialState_=(x: js.UndefOr[ContainerState[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker/stateful-container", "default.defaultProps.onChange")
      @js.native
      def onChange: js.UndefOr[js.Function1[/* a */ `3`, Any]] = js.native
      inline def onChange_=(x: js.UndefOr[js.Function1[/* a */ `3`, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker/stateful-container", "default.defaultProps.onRangeChange")
      @js.native
      def onRangeChange: js.UndefOr[js.Function1[/* a */ `1`, Any]] = js.native
      inline def onRangeChange_=(x: js.UndefOr[js.Function1[/* a */ `1`, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRangeChange")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker/stateful-container", "default.defaultProps.range")
      @js.native
      def range: js.UndefOr[Boolean] = js.native
      inline def range_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("range")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/datepicker/stateful-container", "default.defaultProps.stateReducer")
      @js.native
      def stateReducer: js.UndefOr[StateReducer[Any]] = js.native
      inline def stateReducer_=(x: js.UndefOr[StateReducer[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.datepickerTypesMod.CalendarProps[T]
    - typings.baseui.datepickerTypesMod.DatepickerProps[T]
  */
  trait InputProps[T] extends StObject
  object InputProps {
    
    inline def CalendarProps[T](): typings.baseui.datepickerTypesMod.CalendarProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.baseui.datepickerTypesMod.CalendarProps[T]]
    }
    
    inline def DatepickerProps[T](): typings.baseui.datepickerTypesMod.DatepickerProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.baseui.datepickerTypesMod.DatepickerProps[T]]
    }
  }
  
  type Props[T] = StatefulContainerProps[InputProps[T], T]
  
  @js.native
  trait StatefulContainer[T] extends Component[Props[T], ContainerState[T], Any] {
    
    def internalSetState(`type`: StateChangeType, changes: ContainerState[T]): Unit = js.native
    
    def onChange(a: `2`[T]): Any = js.native
  }
}
