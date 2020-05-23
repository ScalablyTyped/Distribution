package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainsRequest extends js.Object {
  /**
    * The maximum number of domain names you want returned. The range is 1 to 100. The default setting is 100.
    */
  var MaxNumberOfDomains: js.UndefOr[Integer] = js.native
  /**
    * A string informing Amazon SimpleDB where to start the next list of domain names.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListDomainsRequest {
  @scala.inline
  def apply(MaxNumberOfDomains: js.UndefOr[Integer] = js.undefined, NextToken: String = null): ListDomainsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxNumberOfDomains)) __obj.updateDynamic("MaxNumberOfDomains")(MaxNumberOfDomains.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsRequest]
  }
}

