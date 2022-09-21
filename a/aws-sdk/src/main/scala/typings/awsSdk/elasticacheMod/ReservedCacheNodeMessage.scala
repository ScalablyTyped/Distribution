package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedCacheNodeMessage extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of reserved cache nodes. Each element in the list contains detailed information about one node.
    */
  var ReservedCacheNodes: js.UndefOr[ReservedCacheNodeList] = js.undefined
}
object ReservedCacheNodeMessage {
  
  inline def apply(): ReservedCacheNodeMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedCacheNodeMessage]
  }
  
  extension [Self <: ReservedCacheNodeMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setReservedCacheNodes(value: ReservedCacheNodeList): Self = StObject.set(x, "ReservedCacheNodes", value.asInstanceOf[js.Any])
    
    inline def setReservedCacheNodesUndefined: Self = StObject.set(x, "ReservedCacheNodes", js.undefined)
    
    inline def setReservedCacheNodesVarargs(value: ReservedCacheNode*): Self = StObject.set(x, "ReservedCacheNodes", js.Array(value*))
  }
}
