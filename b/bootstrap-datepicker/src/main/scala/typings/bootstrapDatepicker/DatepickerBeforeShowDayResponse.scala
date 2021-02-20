package typings.bootstrapDatepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatepickerBeforeShowDayResponse extends DatepickerBeforeShowResponse {
  
  var content: js.UndefOr[String] = js.native
}
object DatepickerBeforeShowDayResponse {
  
  @scala.inline
  def apply(): DatepickerBeforeShowDayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerBeforeShowDayResponse]
  }
  
  @scala.inline
  implicit class DatepickerBeforeShowDayResponseMutableBuilder[Self <: DatepickerBeforeShowDayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
