package typings.awsSdk.privatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The description of the network.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the network. You can't change the name after you create the network.
    */
  var networkName: Name
  
  /**
    *  The tags to apply to the network. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateNetworkRequest {
  
  inline def apply(networkName: Name): CreateNetworkRequest = {
    val __obj = js.Dynamic.literal(networkName = networkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkRequest]
  }
  
  extension [Self <: CreateNetworkRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setNetworkName(value: Name): Self = StObject.set(x, "networkName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
