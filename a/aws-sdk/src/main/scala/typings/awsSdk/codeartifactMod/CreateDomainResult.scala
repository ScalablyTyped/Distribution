package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainResult extends js.Object {
  /**
    *  Contains information about the created domain after processing the request. 
    */
  var domain: js.UndefOr[DomainDescription] = js.native
}

object CreateDomainResult {
  @scala.inline
  def apply(domain: DomainDescription = null): CreateDomainResult = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainResult]
  }
}

