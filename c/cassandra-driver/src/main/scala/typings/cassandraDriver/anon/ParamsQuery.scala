package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsQuery extends StObject {
  
  var params: js.UndefOr[js.Any] = js.undefined
  
  var query: String
}
object ParamsQuery {
  
  @scala.inline
  def apply(query: String): ParamsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsQuery]
  }
  
  @scala.inline
  implicit class ParamsQueryMutableBuilder[Self <: ParamsQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
