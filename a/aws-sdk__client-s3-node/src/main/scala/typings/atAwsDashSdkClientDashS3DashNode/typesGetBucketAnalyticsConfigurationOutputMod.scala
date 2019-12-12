package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAnalyticsConfigurationMod._UnmarshalledAnalyticsConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketAnalyticsConfigurationOutput", JSImport.Namespace)
@js.native
object typesGetBucketAnalyticsConfigurationOutputMod extends js.Object {
  @js.native
  trait GetBucketAnalyticsConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>The configuration and any analyses for the analytics filter.</p>
      */
    var AnalyticsConfiguration: js.UndefOr[_UnmarshalledAnalyticsConfiguration] = js.native
  }
  
}

