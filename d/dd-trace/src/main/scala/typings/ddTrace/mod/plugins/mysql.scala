package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [mysql](https://github.com/mysqljs/mysql) module.
  */
trait mysql
  extends StObject
     with Instrumentation {
  
  @JSName("service")
  var service_mysql: js.UndefOr[String | (js.Function1[/* params */ Any, String])] = js.undefined
}
object mysql {
  
  inline def apply(): mysql = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[mysql]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: mysql] (val x: Self) extends AnyVal {
    
    inline def setService(value: String | (js.Function1[/* params */ Any, String])): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceFunction1(value: /* params */ Any => String): Self = StObject.set(x, "service", js.Any.fromFunction1(value))
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
