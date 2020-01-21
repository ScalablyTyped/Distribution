package typings.awsSdk.codestarconnectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConnectionsInput extends js.Object {
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.codestarconnectionsMod.MaxResults] = js.native
  /**
    * The token that was returned from the previous ListConnections call, which can be used to return the next set of connections in the list.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarconnectionsMod.NextToken] = js.native
  /**
    * Filters the list of connections to those associated with a specified provider, such as Bitbucket.
    */
  var ProviderTypeFilter: js.UndefOr[ProviderType] = js.native
}

object ListConnectionsInput {
  @scala.inline
  def apply(
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    ProviderTypeFilter: ProviderType = null
  ): ListConnectionsInput = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ProviderTypeFilter != null) __obj.updateDynamic("ProviderTypeFilter")(ProviderTypeFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConnectionsInput]
  }
}

