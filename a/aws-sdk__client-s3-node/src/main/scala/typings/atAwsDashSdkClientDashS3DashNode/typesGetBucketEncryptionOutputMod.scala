package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreServerSideEncryptionConfigurationMod._UnmarshalledServerSideEncryptionConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketEncryptionOutput", JSImport.Namespace)
@js.native
object typesGetBucketEncryptionOutputMod extends js.Object {
  @js.native
  trait GetBucketEncryptionOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Container for server-side encryption configuration rules. Currently S3 supports one rule only.</p>
      */
    var ServerSideEncryptionConfiguration: js.UndefOr[_UnmarshalledServerSideEncryptionConfiguration] = js.native
  }
  
}

