package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNamespacesResponse extends js.Object {
  /**
    * An array that contains one NamespaceSummary object for each namespace that matches the specified filter criteria.
    */
  var Namespaces: js.UndefOr[NamespaceSummariesList] = js.native
  /**
    * If the response contains NextToken, submit another ListNamespaces request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  AWS Cloud Map gets MaxResults namespaces and then filters them based on the specified criteria. It's possible that no namespaces in the first MaxResults namespaces matched the specified criteria but that subsequent groups of MaxResults namespaces do contain namespaces that match the criteria. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.servicediscoveryMod.NextToken] = js.native
}

object ListNamespacesResponse {
  @scala.inline
  def apply(Namespaces: NamespaceSummariesList = null, NextToken: NextToken = null): ListNamespacesResponse = {
    val __obj = js.Dynamic.literal()
    if (Namespaces != null) __obj.updateDynamic("Namespaces")(Namespaces.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNamespacesResponse]
  }
}

