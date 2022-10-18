package typings.baseui

import typings.baseui.anon.CurrentPage
import typings.baseui.paginationTypesMod.StatefulPaginationProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationStatefulPaginationMod {
  
  object default {
    
    inline def apply(hasNumPagesInitialStateStateReducerOnPageChangeProps: StatefulPaginationProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasNumPagesInitialStateStateReducerOnPageChangeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/pagination/stateful-pagination", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/pagination/stateful-pagination", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/pagination/stateful-pagination", "default.defaultProps.initialState")
      @js.native
      def initialState: CurrentPage = js.native
      inline def initialState_=(x: CurrentPage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      inline def stateReducer(changeType: Any, changes: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stateReducer")(changeType.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
  }
}
