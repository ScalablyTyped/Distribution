package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateDate extends StObject {
  
  var date: typings.std.Date = js.native
}
object DateDate {
  
  @scala.inline
  def apply(date: typings.std.Date): DateDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateDate]
  }
  
  @scala.inline
  implicit class DateDateMutableBuilder[Self <: DateDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: typings.std.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
  }
}
