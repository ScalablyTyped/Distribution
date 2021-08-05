package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesDeletedObjectMod.UnmarshalledDeletedObject
import typings.awsSdkClientS3Browser.typesErrorMod.UnmarshalledError
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteObjectsOutputMod {
  
  trait DeleteObjectsOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _DeletedObjects shape
      */
    var Deleted: js.UndefOr[js.Array[UnmarshalledDeletedObject]] = js.undefined
    
    /**
      * _Errors shape
      */
    var Errors: js.UndefOr[js.Array[UnmarshalledError]] = js.undefined
    
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
  }
  object DeleteObjectsOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteObjectsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteObjectsOutput]
    }
    
    extension [Self <: DeleteObjectsOutput](x: Self) {
      
      inline def setDeleted(value: js.Array[UnmarshalledDeletedObject]): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
      
      inline def setDeletedUndefined: Self = StObject.set(x, "Deleted", js.undefined)
      
      inline def setDeletedVarargs(value: UnmarshalledDeletedObject*): Self = StObject.set(x, "Deleted", js.Array(value :_*))
      
      inline def setErrors(value: js.Array[UnmarshalledError]): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
      
      inline def setErrorsVarargs(value: UnmarshalledError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
      
      inline def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    }
  }
}
