package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLineageResponse extends StObject {
  
  /**
    * A list of edges that connect vertices in the response.
    */
  var Edges: js.UndefOr[typings.awsSdk.sagemakerMod.Edges] = js.undefined
  
  /**
    * Limits the number of vertices in the response. Use the NextToken in a response to to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String8192] = js.undefined
  
  /**
    * A list of vertices connected to the start entity(ies) in the lineage graph.
    */
  var Vertices: js.UndefOr[typings.awsSdk.sagemakerMod.Vertices] = js.undefined
}
object QueryLineageResponse {
  
  inline def apply(): QueryLineageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryLineageResponse]
  }
  
  extension [Self <: QueryLineageResponse](x: Self) {
    
    inline def setEdges(value: Edges): Self = StObject.set(x, "Edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "Edges", js.undefined)
    
    inline def setEdgesVarargs(value: Edge*): Self = StObject.set(x, "Edges", js.Array(value*))
    
    inline def setNextToken(value: String8192): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVertices(value: Vertices): Self = StObject.set(x, "Vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "Vertices", js.undefined)
    
    inline def setVerticesVarargs(value: Vertex*): Self = StObject.set(x, "Vertices", js.Array(value*))
  }
}
