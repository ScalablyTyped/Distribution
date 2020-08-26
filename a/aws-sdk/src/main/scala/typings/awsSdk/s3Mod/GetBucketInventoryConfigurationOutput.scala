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
  def apply(): GetBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketInventoryConfigurationOutput]
  }
  @scala.inline
  implicit class GetBucketInventoryConfigurationOutputOps[Self <: GetBucketInventoryConfigurationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInventoryConfiguration(value: InventoryConfiguration): Self = this.set("InventoryConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventoryConfiguration: Self = this.set("InventoryConfiguration", js.undefined)
  }
  
}

