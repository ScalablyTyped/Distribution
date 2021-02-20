package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod.ExportJobResponse
import typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod.UnmarshalledExportJobResponse
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExportJobsResponseMod {
  
  @js.native
  trait ExportJobsResponse extends StObject {
    
    /**
      * A list of export jobs for the application.
      */
    var Item: js.UndefOr[js.Array[ExportJobResponse] | Iterable[ExportJobResponse]] = js.native
    
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[String] = js.native
  }
  object ExportJobsResponse {
    
    @scala.inline
    def apply(): ExportJobsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportJobsResponse]
    }
    
    @scala.inline
    implicit class ExportJobsResponseMutableBuilder[Self <: ExportJobsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[ExportJobResponse] | Iterable[ExportJobResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: ExportJobResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
      
      @scala.inline
      def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledExportJobsResponse extends ExportJobsResponse {
    
    /**
      * A list of export jobs for the application.
      */
    @JSName("Item")
    var Item_UnmarshalledExportJobsResponse: js.UndefOr[js.Array[UnmarshalledExportJobResponse]] = js.native
  }
  object UnmarshalledExportJobsResponse {
    
    @scala.inline
    def apply(): UnmarshalledExportJobsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledExportJobsResponse]
    }
    
    @scala.inline
    implicit class UnmarshalledExportJobsResponseMutableBuilder[Self <: UnmarshalledExportJobsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: js.Array[UnmarshalledExportJobResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setItemVarargs(value: UnmarshalledExportJobResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
    }
  }
}
