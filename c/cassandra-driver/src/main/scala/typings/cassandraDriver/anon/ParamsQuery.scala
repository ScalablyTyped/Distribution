package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsQuery extends StObject {
  
  var params: js.UndefOr[Any] = js.undefined
  
  var query: String
}
object ParamsQuery {
  
  inline def apply(query: String): ParamsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParamsQuery] (val x: Self) extends AnyVal {
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
