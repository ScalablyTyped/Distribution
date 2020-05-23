package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRegistryRequest extends js.Object {
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
}

object DescribeRegistryRequest {
  @scala.inline
  def apply(RegistryName: string): DescribeRegistryRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRegistryRequest]
  }
}

