package typings.awsSdkClientS3Browser.typesGetBucketInventoryConfigurationOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesInventoryConfigurationMod.UnmarshalledInventoryConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketInventoryConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Specifies the inventory configuration.</p>
    */
  var InventoryConfiguration: js.UndefOr[UnmarshalledInventoryConfiguration] = js.undefined
}

object GetBucketInventoryConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, InventoryConfiguration: UnmarshalledInventoryConfiguration = null): GetBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (InventoryConfiguration != null) __obj.updateDynamic("InventoryConfiguration")(InventoryConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketInventoryConfigurationOutput]
  }
}

