package typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketInventoryConfigurationOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryConfigurationMod._UnmarshalledInventoryConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketInventoryConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Specifies the inventory configuration.</p>
    */
  var InventoryConfiguration: js.UndefOr[_UnmarshalledInventoryConfiguration] = js.undefined
}

object GetBucketInventoryConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, InventoryConfiguration: _UnmarshalledInventoryConfiguration = null): GetBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (InventoryConfiguration != null) __obj.updateDynamic("InventoryConfiguration")(InventoryConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketInventoryConfigurationOutput]
  }
}

