package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesEndpointResponseMod.EndpointResponse
import typings.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndpointsResponseMod {
  
  @js.native
  trait EndpointsResponse extends StObject {
    
    /**
      * The list of endpoints.
      */
    var Item: js.UndefOr[js.Array[EndpointResponse] | Iterable[EndpointResponse]] = js.native
  }
  object EndpointsResponse {
    
    @scala.inline
    def apply(): EndpointsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointsResponse]
    }
    
    @scala.inline
    implicit class EndpointsResponseMutableBuilder[Self <: EndpointsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[EndpointResponse] | Iterable[EndpointResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: EndpointResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledEndpointsResponse extends EndpointsResponse {
    
    /**
      * The list of endpoints.
      */
    @JSName("Item")
    var Item_UnmarshalledEndpointsResponse: js.UndefOr[js.Array[UnmarshalledEndpointResponse]] = js.native
  }
  object UnmarshalledEndpointsResponse {
    
    @scala.inline
    def apply(): UnmarshalledEndpointsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEndpointsResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledEndpointsResponseMutableBuilder[Self <: UnmarshalledEndpointsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[UnmarshalledEndpointResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: UnmarshalledEndpointResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
}
