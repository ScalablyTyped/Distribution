package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesServerSideEncryptionConfigurationMod.UnmarshalledServerSideEncryptionConfiguration
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketEncryptionOutputMod {
  
  trait GetBucketEncryptionOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>Container for server-side encryption configuration rules. Currently S3 supports one rule only.</p>
      */
    var ServerSideEncryptionConfiguration: js.UndefOr[UnmarshalledServerSideEncryptionConfiguration] = js.undefined
  }
  object GetBucketEncryptionOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketEncryptionOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketEncryptionOutput]
    }
    
    extension [Self <: GetBucketEncryptionOutput](x: Self) {
      
      inline def setServerSideEncryptionConfiguration(value: UnmarshalledServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "ServerSideEncryptionConfiguration", js.undefined)
    }
  }
}
