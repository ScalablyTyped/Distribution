package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesApplicationResponseMod.ApplicationResponse
import typings.awsSdkClientPinpointBrowser.typesApplicationResponseMod.UnmarshalledApplicationResponse
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesApplicationsResponseMod {
  
  trait ApplicationsResponse extends StObject {
    
    /**
      * List of applications returned in this page.
      */
    var Item: js.UndefOr[js.Array[ApplicationResponse] | Iterable[ApplicationResponse]] = js.undefined
    
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  object ApplicationsResponse {
    
    inline def apply(): ApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationsResponse]
    }
    
    extension [Self <: ApplicationsResponse](x: Self) {
      
      inline def setItem(value: js.Array[ApplicationResponse] | Iterable[ApplicationResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: ApplicationResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait UnmarshalledApplicationsResponse
    extends StObject
       with ApplicationsResponse {
    
    /**
      * List of applications returned in this page.
      */
    @JSName("Item")
    var Item_UnmarshalledApplicationsResponse: js.UndefOr[js.Array[UnmarshalledApplicationResponse]] = js.undefined
  }
  object UnmarshalledApplicationsResponse {
    
    inline def apply(): UnmarshalledApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledApplicationsResponse]
    }
    
    extension [Self <: UnmarshalledApplicationsResponse](x: Self) {
      
      inline def setItem(value: js.Array[UnmarshalledApplicationResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: UnmarshalledApplicationResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
}
