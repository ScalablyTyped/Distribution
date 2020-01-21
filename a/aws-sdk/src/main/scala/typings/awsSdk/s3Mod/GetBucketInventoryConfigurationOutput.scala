package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketInventoryConfigurationOutput extends js.Object {
  /**
    * Specifies the inventory configuration.
    */
  var InventoryConfiguration: js.UndefOr[typings.awsSdk.s3Mod.InventoryConfiguration] = js.native
}

object GetBucketInventoryConfigurationOutput {
  @scala.inline
  def apply(InventoryConfiguration: InventoryConfiguration = null): GetBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (InventoryConfiguration != null) __obj.updateDynamic("InventoryConfiguration")(InventoryConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketInventoryConfigurationOutput]
  }
}

