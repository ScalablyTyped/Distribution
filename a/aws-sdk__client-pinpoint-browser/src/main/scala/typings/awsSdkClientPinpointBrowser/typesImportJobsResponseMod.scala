package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesImportJobResponseMod.ImportJobResponse
import typings.awsSdkClientPinpointBrowser.typesImportJobResponseMod.UnmarshalledImportJobResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesImportJobsResponseMod {
  
  trait ImportJobsResponse extends StObject {
    
    /**
      * A list of import jobs for the application.
      */
    var Item: js.UndefOr[js.Array[ImportJobResponse] | js.Iterable[ImportJobResponse]] = js.undefined
    
    /**
      * The string that you use in a subsequent request to get the next page of results in a paginated response.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  object ImportJobsResponse {
    
    inline def apply(): ImportJobsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportJobsResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportJobsResponse] (val x: Self) extends AnyVal {
      
      inline def setItem(value: js.Array[ImportJobResponse] | js.Iterable[ImportJobResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: ImportJobResponse*): Self = StObject.set(x, "Item", js.Array(value*))
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    }
  }
  
  trait UnmarshalledImportJobsResponse
    extends StObject
       with ImportJobsResponse {
    
    /**
      * A list of import jobs for the application.
      */
    @JSName("Item")
    var Item_UnmarshalledImportJobsResponse: js.UndefOr[js.Array[UnmarshalledImportJobResponse]] = js.undefined
  }
  object UnmarshalledImportJobsResponse {
    
    inline def apply(): UnmarshalledImportJobsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledImportJobsResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledImportJobsResponse] (val x: Self) extends AnyVal {
      
      inline def setItem(value: js.Array[UnmarshalledImportJobResponse]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setItemVarargs(value: UnmarshalledImportJobResponse*): Self = StObject.set(x, "Item", js.Array(value*))
    }
  }
}
