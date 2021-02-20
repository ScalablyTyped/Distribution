package typings.bootstrapTimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryEventObject extends StObject {
  
  var time: js.UndefOr[TimepickerTime] = js.native
}
object JQueryEventObject {
  
  @scala.inline
  def apply(): JQueryEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryEventObject]
  }
  
  @scala.inline
  implicit class JQueryEventObjectMutableBuilder[Self <: JQueryEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTime(value: TimepickerTime): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
