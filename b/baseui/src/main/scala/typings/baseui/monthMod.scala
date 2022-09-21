package typings.baseui

import typings.baseui.anon.DateLabel
import typings.baseui.datepickerTypesMod.MonthProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monthMod {
  
  @JSImport("baseui/datepicker/month", JSImport.Default)
  @js.native
  open class default[T] protected () extends CalendarMonth[T] {
    def this(props: MonthProps[T]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("baseui/datepicker/month", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/datepicker/month", "default.defaultProps")
    @js.native
    def defaultProps: DateLabel = js.native
    inline def defaultProps_=(x: DateLabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CalendarMonth[T]
    extends Component[MonthProps[T], js.Object, Any] {
    
    var dateHelpers: typings.baseui.dateHelpersMod.default[T] = js.native
    
    def getDateProp(): T = js.native
    
    def isWeekInMonth(a: T): Boolean = js.native
    
    def renderWeeks(): js.Array[Any] = js.native
  }
}
