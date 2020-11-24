package typings.chenfengyuanDatepicker.mod

import typings.chenfengyuanDatepicker.chenfengyuanDatepickerStrings.datepicker
import typings.std.Date
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerEvent extends Event {
  
  var date: Date = js.native
  
  var namespace: datepicker = js.native
  
  var view: String = js.native
}
