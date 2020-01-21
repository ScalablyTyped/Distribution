package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the created domain.
    */
  var DomainArn: js.UndefOr[typings.awsSdk.sagemakerMod.DomainArn] = js.native
  /**
    * The URL to the created domain.
    */
  var Url: js.UndefOr[String1024] = js.native
}

object CreateDomainResponse {
  @scala.inline
  def apply(DomainArn: DomainArn = null, Url: String1024 = null): CreateDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainArn != null) __obj.updateDynamic("DomainArn")(DomainArn.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainResponse]
  }
}

