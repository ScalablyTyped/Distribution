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
  def apply(): ListNamespacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNamespacesResponse]
  }
  @scala.inline
  implicit class ListNamespacesResponseOps[Self <: ListNamespacesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNamespacesVarargs(value: NamespaceSummary*): Self = this.set("Namespaces", js.Array(value :_*))
    @scala.inline
    def setNamespaces(value: NamespaceSummariesList): Self = this.set("Namespaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaces: Self = this.set("Namespaces", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

