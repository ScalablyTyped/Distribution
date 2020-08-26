package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClustersResponse extends js.Object {
  /**
    * The descriptions of your DAX clusters, in response to a DescribeClusters request.
    */
  var Clusters: js.UndefOr[ClusterList] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeClustersResponse {
  @scala.inline
  def apply(): DescribeClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClustersResponse]
  }
  @scala.inline
  implicit class DescribeClustersResponseOps[Self <: DescribeClustersResponse] (val x: Self) extends AnyVal {
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
    def setClustersVarargs(value: Cluster*): Self = this.set("Clusters", js.Array(value :_*))
    @scala.inline
    def setClusters(value: ClusterList): Self = this.set("Clusters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusters: Self = this.set("Clusters", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

