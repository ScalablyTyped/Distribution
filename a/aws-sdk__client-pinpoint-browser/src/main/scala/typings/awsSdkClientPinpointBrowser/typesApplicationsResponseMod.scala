package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesApplicationResponseMod.ApplicationResponse
import typings.awsSdkClientPinpointBrowser.typesApplicationResponseMod.UnmarshalledApplicationResponse
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesApplicationsResponseMod {
  
  @js.native
  trait ApplicationsResponse extends StObject {
    
    /**
      * List of applications returned in this page.
      */
    var Item: js.UndefOr[js.Array[ApplicationResponse] | Iterable[ApplicationResponse]] = js.native
    
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[String] = js.native
  }
  object ApplicationsResponse {
    
    @scala.inline
    def apply(): ApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationsResponse]
    }
    
    @scala.inline
    implicit class ApplicationsResponseMutableBuilder[Self <: ApplicationsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[ApplicationResponse] | Iterable[ApplicationResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: ApplicationResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledApplicationsResponse extends ApplicationsResponse {
    
    /**
      * List of applications returned in this page.
      */
    @JSName("Item")
    var Item_UnmarshalledApplicationsResponse: js.UndefOr[js.Array[UnmarshalledApplicationResponse]] = js.native
  }
  object UnmarshalledApplicationsResponse {
    
    @scala.inline
    def apply(): UnmarshalledApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledApplicationsResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledApplicationsResponseMutableBuilder[Self <: UnmarshalledApplicationsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[UnmarshalledApplicationResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: UnmarshalledApplicationResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
}
