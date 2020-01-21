package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceDelegatesResponse extends js.Object {
  /**
    * One page of the resource's delegates.
    */
  var Delegates: js.UndefOr[ResourceDelegates] = js.native
  /**
    * The token used to paginate through the delegates associated with a resource. While results are still available, it has an associated value. When the last page is reached, the token is empty. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.native
}

object ListResourceDelegatesResponse {
  @scala.inline
  def apply(Delegates: ResourceDelegates = null, NextToken: NextToken = null): ListResourceDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    if (Delegates != null) __obj.updateDynamic("Delegates")(Delegates.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceDelegatesResponse]
  }
}

