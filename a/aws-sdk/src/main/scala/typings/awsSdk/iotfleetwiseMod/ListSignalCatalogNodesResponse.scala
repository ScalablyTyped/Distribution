package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSignalCatalogNodesResponse extends StObject {
  
  /**
    *  The token to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.iotfleetwiseMod.nextToken] = js.undefined
  
  /**
    *  A list of information about nodes. 
    */
  var nodes: js.UndefOr[Nodes] = js.undefined
}
object ListSignalCatalogNodesResponse {
  
  inline def apply(): ListSignalCatalogNodesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSignalCatalogNodesResponse]
  }
  
  extension [Self <: ListSignalCatalogNodesResponse](x: Self) {
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setNodes(value: Nodes): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value*))
  }
}
