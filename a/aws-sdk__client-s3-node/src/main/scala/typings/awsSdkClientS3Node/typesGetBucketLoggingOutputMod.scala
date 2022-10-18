package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesLoggingEnabledMod.UnmarshalledLoggingEnabled
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketLoggingOutputMod {
  
  trait GetBucketLoggingOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
      */
    var LoggingEnabled: js.UndefOr[UnmarshalledLoggingEnabled] = js.undefined
  }
  object GetBucketLoggingOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketLoggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketLoggingOutput]
    }
    
    extension [Self <: GetBucketLoggingOutput](x: Self) {
      
      inline def setLoggingEnabled(value: UnmarshalledLoggingEnabled): Self = StObject.set(x, "LoggingEnabled", value.asInstanceOf[js.Any])
      
      inline def setLoggingEnabledUndefined: Self = StObject.set(x, "LoggingEnabled", js.undefined)
    }
  }
}
