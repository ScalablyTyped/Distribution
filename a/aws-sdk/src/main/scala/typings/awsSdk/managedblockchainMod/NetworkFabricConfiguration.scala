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
}

