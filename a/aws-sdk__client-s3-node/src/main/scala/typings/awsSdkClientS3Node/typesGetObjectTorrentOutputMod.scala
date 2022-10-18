package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetObjectTorrentOutputMod {
  
  trait GetObjectTorrentOutput[StreamType]
    extends StObject
       with MetadataBearer {
    
    /**
      * _Body shape
      */
    var Body: js.UndefOr[StreamType] = js.undefined
    
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
  }
  object GetObjectTorrentOutput {
    
    inline def apply[StreamType]($metadata: ResponseMetadata): GetObjectTorrentOutput[StreamType] = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetObjectTorrentOutput[StreamType]]
    }
    
    extension [Self <: GetObjectTorrentOutput[?], StreamType](x: Self & GetObjectTorrentOutput[StreamType]) {
      
      inline def setBody(value: StreamType): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      inline def setRequestCharged(value: requester_ | String): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
      
      inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    }
  }
}
