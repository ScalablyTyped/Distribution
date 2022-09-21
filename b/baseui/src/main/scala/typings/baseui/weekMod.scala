package typings.baseui

import typings.baseui.anon.HighlightedDate
import typings.baseui.datepickerTypesMod.WeekProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weekMod {
  
  @JSImport("baseui/datepicker/week", JSImport.Default)
  @js.native
  open class default[T] protected () extends Week[T] {
    def this(props: WeekProps[T]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("baseui/datepicker/week", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/datepicker/week", "default.defaultProps")
    @js.native
    def defaultProps: HighlightedDate = js.native
    inline def defaultProps_=(x: HighlightedDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Week[T]
    extends Component[WeekProps[T], js.Object, Any] {
    
    var dateHelpers: typings.baseui.dateHelpersMod.default[T] = js.native
    
    def renderDays(): js.Array[Any] = js.native
  }
}
