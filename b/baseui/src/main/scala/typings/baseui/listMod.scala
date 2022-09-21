package typings.baseui

import typings.baseui.anon.IsFocusVisibleBoolean
import typings.baseui.anon.NewIndex
import typings.baseui.dndListTypesMod.ListOverrides
import typings.baseui.dndListTypesMod.ListProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("baseui/dnd-list/list", JSImport.Default)
  @js.native
  open class default () extends StatelessList
  object default {
    
    /* static member */
    /* Inlined std.Partial<baseui.baseui/dnd-list/types.ListProps> */
    object defaultProps {
      
      @JSImport("baseui/dnd-list/list", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/dnd-list/list", "default.defaultProps.items")
      @js.native
      def items: js.UndefOr[js.Array[ReactNode]] = js.native
      inline def items_=(x: js.UndefOr[js.Array[ReactNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list/list", "default.defaultProps.onChange")
      @js.native
      def onChange: js.UndefOr[js.Function1[/* a */ NewIndex, Any]] = js.native
      inline def onChange_=(x: js.UndefOr[js.Function1[/* a */ NewIndex, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list/list", "default.defaultProps.overrides")
      @js.native
      def overrides: js.UndefOr[ListOverrides] = js.native
      inline def overrides_=(x: js.UndefOr[ListOverrides]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list/list", "default.defaultProps.removable")
      @js.native
      def removable: js.UndefOr[Boolean] = js.native
      
      @JSImport("baseui/dnd-list/list", "default.defaultProps.removableByMove")
      @js.native
      def removableByMove: js.UndefOr[Boolean] = js.native
      inline def removableByMove_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removableByMove")(x.asInstanceOf[js.Any])
      
      inline def removable_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removable")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatelessList extends Component[ListProps, IsFocusVisibleBoolean, Any] {
    
    def handleBlur(event: SyntheticEvent[Element, Event]): Unit = js.native
    
    def handleFocus(event: SyntheticEvent[Element, Event]): Unit = js.native
  }
}
