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
  def apply(
    targetType: TargetType,
    attributeName: String = null,
    attributeValue: String = null,
    cluster: String = null,
    maxResults: Int | scala.Double = null,
    nextToken: String = null
  ): ListAttributesRequest = {
    val __obj = js.Dynamic.literal(targetType = targetType.asInstanceOf[js.Any])
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (attributeValue != null) __obj.updateDynamic("attributeValue")(attributeValue.asInstanceOf[js.Any])
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttributesRequest]
  }
}

