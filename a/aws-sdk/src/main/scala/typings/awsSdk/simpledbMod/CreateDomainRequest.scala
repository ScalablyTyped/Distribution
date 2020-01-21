package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainRequest extends js.Object {
  /**
    * The name of the domain to create. The name can range between 3 and 255 characters and can contain the following characters: a-z, A-Z, 0-9, '_', '-', and '.'.
    */
  var DomainName: String = js.native
}

object CreateDomainRequest {
  @scala.inline
  def apply(DomainName: String): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateDomainRequest]
  }
}

