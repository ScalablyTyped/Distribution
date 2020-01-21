package typings.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSitesOutput extends js.Object {
  var NextToken: js.UndefOr[Token] = js.native
  var Sites: js.UndefOr[siteListDefinition] = js.native
}

object ListSitesOutput {
  @scala.inline
  def apply(NextToken: Token = null, Sites: siteListDefinition = null): ListSitesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Sites != null) __obj.updateDynamic("Sites")(Sites.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSitesOutput]
  }
}

