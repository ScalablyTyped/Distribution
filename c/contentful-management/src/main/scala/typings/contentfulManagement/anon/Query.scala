package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.QueryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  var query: js.UndefOr[QueryOptions] = js.undefined
  
  var teamId: js.UndefOr[String] = js.undefined
}
object Query {
  
  inline def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setQuery(value: QueryOptions): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
  }
}
