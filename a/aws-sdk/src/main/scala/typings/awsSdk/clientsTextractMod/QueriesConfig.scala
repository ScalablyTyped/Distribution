package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueriesConfig extends StObject {
  
  /**
    * 
    */
  var Queries: typings.awsSdk.clientsTextractMod.Queries
}
object QueriesConfig {
  
  inline def apply(Queries: Queries): QueriesConfig = {
    val __obj = js.Dynamic.literal(Queries = Queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueriesConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueriesConfig] (val x: Self) extends AnyVal {
    
    inline def setQueries(value: Queries): Self = StObject.set(x, "Queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesVarargs(value: Query*): Self = StObject.set(x, "Queries", js.Array(value*))
  }
}
