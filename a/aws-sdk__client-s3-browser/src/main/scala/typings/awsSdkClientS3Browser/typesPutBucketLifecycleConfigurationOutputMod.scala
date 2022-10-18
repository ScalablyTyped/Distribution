package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketLifecycleConfigurationOutputMod {
  
  trait PutBucketLifecycleConfigurationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion
  object PutBucketLifecycleConfigurationOutput {
    
    inline def apply($metadata: ResponseMetadata): PutBucketLifecycleConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketLifecycleConfigurationOutput]
    }
  }
}
