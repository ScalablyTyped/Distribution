package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod.ExportJobResponse
import typings.awsSdkClientPinpointBrowser.typesExportJobResponseMod.UnmarshalledExportJobResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExportJobsResponseMod {
  
  trait ExportJobsResponse extends StObject {
    
    /**
      * A list of export jobs for the application.
      */
    var Item: js.UndefOr[js.Array[ExportJobResponse] | js.Iterable[ExportJobResponse]] = js.undefined
    
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  object ExportJobsResponse {
    
    inline def apply(): ExportJobsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportJobsResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportJobsResponse] (val x: Self) extends AnyVal {
      
      inline def setItem(value: js.Array[ExportJobResponse] | js.Iterable[ExportJobResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: ExportJobResponse*): Self = StObject.set(x, "Item", js.Array(value*))
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait UnmarshalledExportJobsResponse
    extends StObject
       with ExportJobsResponse {
    
    /**
      * A list of export jobs for the application.
      */
    @JSName("Item")
    var Item_UnmarshalledExportJobsResponse: js.UndefOr[js.Array[UnmarshalledExportJobResponse]] = js.undefined
  }
  object UnmarshalledExportJobsResponse {
    
    inline def apply(): UnmarshalledExportJobsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledExportJobsResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledExportJobsResponse] (val x: Self) extends AnyVal {
      
      inline def setItem(value: js.Array[UnmarshalledExportJobResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: UnmarshalledExportJobResponse*): Self = StObject.set(x, "Item", js.Array(value*))
    }
  }
}
