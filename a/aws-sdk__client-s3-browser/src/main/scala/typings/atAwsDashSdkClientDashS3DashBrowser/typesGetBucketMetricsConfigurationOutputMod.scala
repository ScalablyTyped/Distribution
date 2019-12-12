package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreMetricsConfigurationMod._UnmarshalledMetricsConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/GetBucketMetricsConfigurationOutput", JSImport.Namespace)
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

