package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesSelectObjectContentEventStreamMod.UnmarshalledSelectObjectContentEventStream
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
    
    @scala.inline
    def apply($metadata: ResponseMetadata): SelectObjectContentOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectObjectContentOutput]
    }
    
    @scala.inline
    implicit class SelectObjectContentOutputMutableBuilder[Self <: SelectObjectContentOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: UnmarshalledSelectObjectContentEventStream): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    }
  }
}
