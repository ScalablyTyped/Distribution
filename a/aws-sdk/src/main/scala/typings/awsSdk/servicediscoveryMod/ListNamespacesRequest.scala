package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNamespacesRequest extends js.Object {
  /**
    * A complex type that contains specifications for the namespaces that you want to list. If you specify more than one filter, a namespace must match all filters to be returned by ListNamespaces.
    */
  var Filters: js.UndefOr[NamespaceFilters] = js.native
  /**
    * The maximum number of namespaces that you want AWS Cloud Map to return in the response to a ListNamespaces request. If you don't specify a value for MaxResults, AWS Cloud Map returns up to 100 namespaces.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.servicediscoveryMod.MaxResults] = js.native
  /**
    * For the first ListNamespaces request, omit this value. If the response contains NextToken, submit another ListNamespaces request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults namespaces and then filters them based on the specified criteria. It's possible that no namespaces in the first MaxResults namespaces matched the specified criteria but that subsequent groups of MaxResults namespaces do contain namespaces that match the criteria. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicediscoveryMod.NextToken] = js.native
}

object ListNamespacesRequest {
  @scala.inline
  def apply(
    Filters: NamespaceFilters = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListNamespacesRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNamespacesRequest]
  }
}

