package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  var params: js.Array[Any]
  
  var query: String
}
object Query {
  
  inline def apply(params: js.Array[Any], query: String): Query = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
