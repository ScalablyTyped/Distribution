package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainResponse extends js.Object {
  /**
    * The domain Amazon Resource Name (ARN).
    */
  var DomainArn: js.UndefOr[typings.awsSdk.sagemakerMod.DomainArn] = js.native
}

object UpdateDomainResponse {
  @scala.inline
  def apply(DomainArn: DomainArn = null): UpdateDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainArn != null) __obj.updateDynamic("DomainArn")(DomainArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainResponse]
  }
}

