package typings.bootstrapTimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimepickerIconOptions extends StObject {
  
  var down: js.UndefOr[String] = js.native
  
  var up: js.UndefOr[String] = js.native
}
object TimepickerIconOptions {
  
  @scala.inline
  def apply(): TimepickerIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimepickerIconOptions]
  }
  
  @scala.inline
  implicit class TimepickerIconOptionsMutableBuilder[Self <: TimepickerIconOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDown(value: String): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    @scala.inline
    def setUp(value: String): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
