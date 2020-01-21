package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesServerSideEncryptionConfigurationMod.UnmarshalledServerSideEncryptionConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/GetBucketEncryptionOutput", JSImport.Namespace)
@js.native
object typesGetBucketEncryptionOutputMod extends js.Object {
  @js.native
  trait GetBucketEncryptionOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Container for server-side encryption configuration rules. Currently S3 supports one rule only.</p>
      */
    var ServerSideEncryptionConfiguration: js.UndefOr[UnmarshalledServerSideEncryptionConfiguration] = js.native
  }
  
}

