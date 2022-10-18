package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteBucketAnalyticsConfigurationOutputMod {
  
  trait DeleteBucketAnalyticsConfigurationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion
  object DeleteBucketAnalyticsConfigurationOutput {
    
    inline def apply($metadata: ResponseMetadata): DeleteBucketAnalyticsConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteBucketAnalyticsConfigurationOutput]
    }
  }
}
