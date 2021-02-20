package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateAdapterOptions extends StObject {
  
  var date: js.UndefOr[js.Object] = js.native
}
object DateAdapterOptions {
  
  @scala.inline
  def apply(): DateAdapterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateAdapterOptions]
  }
  
  @scala.inline
  implicit class DateAdapterOptionsMutableBuilder[Self <: DateAdapterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: js.Object): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
  }
}
