package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesEndpointBatchItemMod.EndpointBatchItem
import typings.awsSdkClientPinpointBrowser.typesEndpointBatchItemMod.UnmarshalledEndpointBatchItem
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndpointBatchRequestMod {
  
  trait EndpointBatchRequest extends StObject {
    
    /**
      * List of items to update. Maximum 100 items
      */
    var Item: js.UndefOr[js.Array[EndpointBatchItem] | Iterable[EndpointBatchItem]] = js.undefined
  }
  object EndpointBatchRequest {
    
    inline def apply(): EndpointBatchRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointBatchRequest]
    }
    
    extension [Self <: EndpointBatchRequest](x: Self) {
      
      inline def setItem(value: js.Array[EndpointBatchItem] | Iterable[EndpointBatchItem]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: EndpointBatchItem*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
  
  trait UnmarshalledEndpointBatchRequest
    extends StObject
       with EndpointBatchRequest {
    
    /**
      * List of items to update. Maximum 100 items
      */
    @JSName("Item")
    var Item_UnmarshalledEndpointBatchRequest: js.UndefOr[js.Array[UnmarshalledEndpointBatchItem]] = js.undefined
  }
  object UnmarshalledEndpointBatchRequest {
    
    inline def apply(): UnmarshalledEndpointBatchRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEndpointBatchRequest]
    }
    
    extension [Self <: UnmarshalledEndpointBatchRequest](x: Self) {
      
      inline def setItem(value: js.Array[UnmarshalledEndpointBatchItem]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: UnmarshalledEndpointBatchItem*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
}
