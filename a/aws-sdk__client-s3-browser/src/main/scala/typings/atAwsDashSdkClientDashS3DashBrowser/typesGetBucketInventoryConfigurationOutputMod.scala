package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryConfigurationMod._UnmarshalledInventoryConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/GetBucketInventoryConfigurationOutput", JSImport.Namespace)
@js.native
object typesGetBucketInventoryConfigurationOutputMod extends js.Object {
  @js.native
  trait GetBucketInventoryConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Specifies the inventory configuration.</p>
      */
    var InventoryConfiguration: js.UndefOr[_UnmarshalledInventoryConfiguration] = js.native
  }
  
}

