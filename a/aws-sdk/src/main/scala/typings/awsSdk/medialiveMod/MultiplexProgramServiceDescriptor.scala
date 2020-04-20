package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexProgramServiceDescriptor extends js.Object {
  /**
    * Name of the provider.
    */
  var ProviderName: stringMax256 = js.native
  /**
    * Name of the service.
    */
  var ServiceName: stringMax256 = js.native
}

object MultiplexProgramServiceDescriptor {
  @scala.inline
  def apply(ProviderName: stringMax256, ServiceName: stringMax256): MultiplexProgramServiceDescriptor = {
    val __obj = js.Dynamic.literal(ProviderName = ProviderName.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexProgramServiceDescriptor]
  }
}

