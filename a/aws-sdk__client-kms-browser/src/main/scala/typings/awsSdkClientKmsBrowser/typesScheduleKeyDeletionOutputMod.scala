package typings.awsSdkClientKmsBrowser

import typings.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesScheduleKeyDeletionOutputMod {
  
  trait ScheduleKeyDeletionOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The date and time after which AWS KMS deletes the customer master key (CMK).</p>
      */
    var DeletionDate: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>The unique identifier of the customer master key (CMK) for which deletion is scheduled.</p>
      */
    var KeyId: js.UndefOr[String] = js.undefined
  }
  object ScheduleKeyDeletionOutput {
    
    inline def apply($metadata: ResponseMetadata): ScheduleKeyDeletionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScheduleKeyDeletionOutput]
    }
    
    extension [Self <: ScheduleKeyDeletionOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setDeletionDate(value: js.Date): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
      
      inline def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
      
      inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    }
  }
}
