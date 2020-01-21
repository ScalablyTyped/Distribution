package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesReplicationConfigurationMod.UnmarshalledReplicationConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketReplicationOutput", JSImport.Namespace)
@js.native
object typesGetBucketReplicationOutputMod extends js.Object {
  @js.native
  trait GetBucketReplicationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Container for replication rules. You can add as many as 1,000 rules. Total replication configuration size can be up to 2 MB.</p>
      */
    var ReplicationConfiguration: js.UndefOr[UnmarshalledReplicationConfiguration] = js.native
  }
  
}

