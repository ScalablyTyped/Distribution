package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.PaginationOptions> */
trait ListNotificationHubsOptions extends StObject {
  
  var skip: js.UndefOr[Double] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
}
object ListNotificationHubsOptions {
  
  inline def apply(): ListNotificationHubsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationHubsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNotificationHubsOptions] (val x: Self) extends AnyVal {
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
