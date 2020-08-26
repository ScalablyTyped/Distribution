package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkFabricConfiguration extends js.Object {
  /**
    * The edition of Amazon Managed Blockchain that the network uses. For more information, see Amazon Managed Blockchain Pricing.
    */
  var Edition: typings.awsSdk.managedblockchainMod.Edition = js.native
}

object NetworkFabricConfiguration {
  @scala.inline
  def apply(Edition: Edition): NetworkFabricConfiguration = {
    val __obj = js.Dynamic.literal(Edition = Edition.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkFabricConfiguration]
  }
  @scala.inline
  implicit class NetworkFabricConfigurationOps[Self <: NetworkFabricConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEdition(value: Edition): Self = this.set("Edition", value.asInstanceOf[js.Any])
  }
  
}

