package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstantiateSolNetworkInstanceInput extends StObject {
  
  /**
    * Provides values for the configurable properties.
    */
  var additionalParamsForNs: js.UndefOr[Document] = js.undefined
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ID of the network instance.
    */
  var nsInstanceId: NsInstanceId
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. When you use this API, the tags are transferred to the network operation that is created. Use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object InstantiateSolNetworkInstanceInput {
  
  inline def apply(nsInstanceId: NsInstanceId): InstantiateSolNetworkInstanceInput = {
    val __obj = js.Dynamic.literal(nsInstanceId = nsInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantiateSolNetworkInstanceInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstantiateSolNetworkInstanceInput] (val x: Self) extends AnyVal {
    
    inline def setAdditionalParamsForNs(value: Document): Self = StObject.set(x, "additionalParamsForNs", value.asInstanceOf[js.Any])
    
    inline def setAdditionalParamsForNsUndefined: Self = StObject.set(x, "additionalParamsForNs", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setNsInstanceId(value: NsInstanceId): Self = StObject.set(x, "nsInstanceId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
