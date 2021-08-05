package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesSelectObjectContentEventStreamMod.UnmarshalledSelectObjectContentEventStream
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSelectObjectContentOutputMod {
  
  trait SelectObjectContentOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _SelectObjectContentEventStream shape
      */
    var Payload: js.UndefOr[UnmarshalledSelectObjectContentEventStream] = js.undefined
  }
  object SelectObjectContentOutput {
    
    inline def apply($metadata: ResponseMetadata): SelectObjectContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectObjectContentOutput]
    }
    
    extension [Self <: SelectObjectContentOutput](x: Self) {
      
      inline def setPayload(value: UnmarshalledSelectObjectContentEventStream): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    }
  }
}
