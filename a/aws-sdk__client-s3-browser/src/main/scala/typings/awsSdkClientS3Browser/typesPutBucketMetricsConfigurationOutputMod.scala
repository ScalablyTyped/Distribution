package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketMetricsConfigurationOutputMod {
  
  trait PutBucketMetricsConfigurationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion
  object PutBucketMetricsConfigurationOutput {
    
    inline def apply($metadata: ResponseMetadata): PutBucketMetricsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketMetricsConfigurationOutput]
    }
  }
}
