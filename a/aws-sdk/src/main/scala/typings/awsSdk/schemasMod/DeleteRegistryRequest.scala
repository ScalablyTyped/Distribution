package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRegistryRequest extends js.Object {
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
}

object DeleteRegistryRequest {
  @scala.inline
  def apply(RegistryName: string): DeleteRegistryRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRegistryRequest]
  }
}

