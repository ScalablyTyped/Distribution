package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecuteSubsetResult extends StObject {
  
  var message: String
  
  var resultSubset: ResultSetSubset
}
object QueryExecuteSubsetResult {
  
  inline def apply(message: String, resultSubset: ResultSetSubset): QueryExecuteSubsetResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultSubset = resultSubset.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteSubsetResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryExecuteSubsetResult] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setResultSubset(value: ResultSetSubset): Self = StObject.set(x, "resultSubset", value.asInstanceOf[js.Any])
  }
}
