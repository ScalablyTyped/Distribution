package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAttributesRequest extends js.Object {
  /**
    * The name of the attribute with which to filter the results. 
    */
  var attributeName: js.UndefOr[String] = js.native
  /**
    * The value of the attribute with which to filter results. You must also specify an attribute name to use this parameter.
    */
  var attributeValue: js.UndefOr[String] = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster to list attributes. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * The maximum number of cluster results returned by ListAttributes in paginated output. When this parameter is used, ListAttributes only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListAttributes request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListAttributes returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[BoxedInteger] = js.native
  /**
    * The nextToken value returned from a ListAttributes request indicating that more results are available to fulfill the request and further calls will be needed. If maxResults was provided, it is possible the number of results to be fewer than maxResults.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The type of the target with which to list attributes.
    */
  var targetType: TargetType = js.native
}

object ListAttributesRequest {
  @scala.inline
  def apply(targetType: TargetType): ListAttributesRequest = {
    val __obj = js.Dynamic.literal(targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttributesRequest]
  }
  @scala.inline
  implicit class ListAttributesRequestOps[Self <: ListAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTargetType(value: TargetType): Self = this.set("targetType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    @scala.inline
    def setAttributeValue(value: String): Self = this.set("attributeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeValue: Self = this.set("attributeValue", js.undefined)
    @scala.inline
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setMaxResults(value: BoxedInteger): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

