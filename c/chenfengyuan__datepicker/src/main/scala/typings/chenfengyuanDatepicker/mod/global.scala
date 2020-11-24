package typings.chenfengyuanDatepicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait JQuery[TElement] extends js.Object {
    
    def datepicker(): DatepickerPlugin[TElement] = js.native
    def datepicker(options: DatepickerOptions): DatepickerPlugin[TElement] = js.native
  }
}
