package typings.awsSdk.privatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkResponse extends StObject {
  
  /**
    * Information about the network.
    */
  var network: Network
  
  /**
    *  The network tags. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateNetworkResponse {
  
  inline def apply(network: Network): CreateNetworkResponse = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkResponse]
  }
  
  extension [Self <: CreateNetworkResponse](x: Self) {
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
