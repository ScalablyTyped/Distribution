package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreLoggingEnabledMod._UnmarshalledLoggingEnabled
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketLoggingOutput", JSImport.Namespace)
@js.native
object typesGetBucketLoggingOutputMod extends js.Object {
  @js.native
  trait GetBucketLoggingOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
      */
    var LoggingEnabled: js.UndefOr[_UnmarshalledLoggingEnabled] = js.native
  }
  
}

