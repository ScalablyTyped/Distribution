package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreReplicationConfigurationMod._UnmarshalledReplicationConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/GetBucketReplicationOutput", JSImport.Namespace)
@js.native
object typesGetBucketReplicationOutputMod extends js.Object {
  @js.native
  trait GetBucketReplicationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Container for replication rules. You can add as many as 1,000 rules. Total replication configuration size can be up to 2 MB.</p>
      */
    var ReplicationConfiguration: js.UndefOr[_UnmarshalledReplicationConfiguration] = js.native
  }
  
}

