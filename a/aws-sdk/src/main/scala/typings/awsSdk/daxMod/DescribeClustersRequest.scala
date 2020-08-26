package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClustersRequest extends js.Object {
  /**
    * The names of the DAX clusters being described.
    */
  var ClusterNames: js.UndefOr[ClusterNameList] = js.native
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. The value for MaxResults must be between 20 and 100.
    */
  var MaxResults: js.UndefOr[IntegerOptional] = js.native
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeClustersRequest {
  @scala.inline
  def apply(): DescribeClustersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClustersRequest]
  }
  @scala.inline
  implicit class DescribeClustersRequestOps[Self <: DescribeClustersRequest] (val x: Self) extends AnyVal {
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
    def setClusterNamesVarargs(value: String*): Self = this.set("ClusterNames", js.Array(value :_*))
    @scala.inline
    def setClusterNames(value: ClusterNameList): Self = this.set("ClusterNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterNames: Self = this.set("ClusterNames", js.undefined)
    @scala.inline
    def setMaxResults(value: IntegerOptional): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

