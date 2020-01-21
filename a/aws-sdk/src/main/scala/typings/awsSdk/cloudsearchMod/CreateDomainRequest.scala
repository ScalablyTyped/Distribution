package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainRequest extends js.Object {
  /**
    * A name for the domain you are creating. Allowed characters are a-z (lower-case letters), 0-9, and hyphen (-). Domain names must start with a letter or number and be at least 3 and no more than 28 characters long.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
}

object CreateDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateDomainRequest]
  }
}

