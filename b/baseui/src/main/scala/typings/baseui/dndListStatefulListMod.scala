package typings.baseui

import typings.baseui.anon.Items
import typings.baseui.dndListTypesMod.StateReducer
import typings.baseui.dndListTypesMod.StatefulListProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dndListStatefulListMod {
  
  object default {
    
    inline def apply(props: StatefulListProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/dnd-list/stateful-list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/dnd-list/stateful-list", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/dnd-list/stateful-list", "default.defaultProps.initialState")
      @js.native
      def initialState: Items = js.native
      inline def initialState_=(x: Items): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list/stateful-list", "default.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
}
