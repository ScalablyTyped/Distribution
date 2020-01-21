package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHsmsRequest extends js.Object {
  /**
    * The NextToken value from a previous call to ListHsms. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListHsmsRequest {
  @scala.inline
  def apply(NextToken: PaginationToken = null): ListHsmsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHsmsRequest]
  }
}

