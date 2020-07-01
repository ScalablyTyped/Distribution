package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainResult extends js.Object {
  var domain: js.UndefOr[DomainDescription] = js.native
}

object DescribeDomainResult {
  @scala.inline
  def apply(domain: DomainDescription = null): DescribeDomainResult = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainResult]
  }
}

