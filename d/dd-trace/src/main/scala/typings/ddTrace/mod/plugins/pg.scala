package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [pg](https://node-postgres.com/) module.
  */
trait pg
  extends StObject
     with Instrumentation {
  
  /**
    * The service name to be used for this plugin. If a function is used, it will be passed the connection parameters and its return value will be used as the service name.
    */
  @JSName("service")
  var service_pg: js.UndefOr[String | (js.Function1[/* params */ js.Any, String])] = js.undefined
}
object pg {
  
  @scala.inline
  def apply(): pg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pg]
  }
  
  @scala.inline
  implicit class pgMutableBuilder[Self <: pg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService(value: String | (js.Function1[/* params */ js.Any, String])): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceFunction1(value: /* params */ js.Any => String): Self = StObject.set(x, "service", js.Any.fromFunction1(value))
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
