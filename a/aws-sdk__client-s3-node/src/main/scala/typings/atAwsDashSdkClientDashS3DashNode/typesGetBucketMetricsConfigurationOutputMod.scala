package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreMetricsConfigurationMod._UnmarshalledMetricsConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketMetricsConfigurationOutput", JSImport.Namespace)
@js.native
object typesGetBucketMetricsConfigurationOutputMod extends js.Object {
  @js.native
  trait GetBucketMetricsConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Specifies the metrics configuration.</p>
      */
    var MetricsConfiguration: js.UndefOr[_UnmarshalledMetricsConfiguration] = js.native
  }
  
}

