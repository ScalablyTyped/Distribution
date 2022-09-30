package typings.awsSdk.migrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPluginsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Migration Hub Orchestrator plugins.
    */
  var plugins: js.UndefOr[PluginSummaries] = js.undefined
}
object ListPluginsResponse {
  
  inline def apply(): ListPluginsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPluginsResponse]
  }
  
  extension [Self <: ListPluginsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPlugins(value: PluginSummaries): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: PluginSummary*): Self = StObject.set(x, "plugins", js.Array(value*))
  }
}
