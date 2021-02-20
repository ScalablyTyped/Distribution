package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesImportJobResponseMod.ImportJobResponse
import typings.awsSdkClientPinpointBrowser.typesImportJobResponseMod.UnmarshalledImportJobResponse
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesImportJobsResponseMod {
  
  @js.native
  trait ImportJobsResponse extends StObject {
    
    /**
      * A list of import jobs for the application.
      */
    var Item: js.UndefOr[js.Array[ImportJobResponse] | Iterable[ImportJobResponse]] = js.native
    
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[String] = js.native
  }
  object ImportJobsResponse {
    
    @scala.inline
    def apply(): ImportJobsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportJobsResponse]
    }
    
    @scala.inline
    implicit class ImportJobsResponseMutableBuilder[Self <: ImportJobsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[ImportJobResponse] | Iterable[ImportJobResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: ImportJobResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledImportJobsResponse extends ImportJobsResponse {
    
    /**
      * A list of import jobs for the application.
      */
    @JSName("Item")
    var Item_UnmarshalledImportJobsResponse: js.UndefOr[js.Array[UnmarshalledImportJobResponse]] = js.native
  }
  object UnmarshalledImportJobsResponse {
    
    @scala.inline
    def apply(): UnmarshalledImportJobsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledImportJobsResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledImportJobsResponseMutableBuilder[Self <: UnmarshalledImportJobsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[UnmarshalledImportJobResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: UnmarshalledImportJobResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
}
