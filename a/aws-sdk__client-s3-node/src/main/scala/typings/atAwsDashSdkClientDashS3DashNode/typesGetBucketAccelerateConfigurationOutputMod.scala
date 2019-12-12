package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Enabled
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Suspended
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketAccelerateConfigurationOutput", JSImport.Namespace)
@js.native
object typesGetBucketAccelerateConfigurationOutputMod extends js.Object {
  @js.native
  trait GetBucketAccelerateConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>The accelerate configuration of the bucket.</p>
      */
    var Status: js.UndefOr[Enabled | Suspended | String] = js.native
  }
  
}

