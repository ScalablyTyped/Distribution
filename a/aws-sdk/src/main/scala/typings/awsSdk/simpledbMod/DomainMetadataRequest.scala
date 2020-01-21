package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainMetadataRequest extends js.Object {
  /**
    * The name of the domain for which to display the metadata of.
    */
  var DomainName: String = js.native
}

object DomainMetadataRequest {
  @scala.inline
  def apply(DomainName: String): DomainMetadataRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainMetadataRequest]
  }
}

