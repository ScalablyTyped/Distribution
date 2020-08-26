package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedElasticsearchInstancesResponse extends js.Object {
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * List of reserved Elasticsearch instances.
    */
  var ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList] = js.native
}

object DescribeReservedElasticsearchInstancesResponse {
  @scala.inline
  def apply(): DescribeReservedElasticsearchInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedElasticsearchInstancesResponse]
  }
  @scala.inline
  implicit class DescribeReservedElasticsearchInstancesResponseOps[Self <: DescribeReservedElasticsearchInstancesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setReservedElasticsearchInstancesVarargs(value: ReservedElasticsearchInstance*): Self = this.set("ReservedElasticsearchInstances", js.Array(value :_*))
    @scala.inline
    def setReservedElasticsearchInstances(value: ReservedElasticsearchInstanceList): Self = this.set("ReservedElasticsearchInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedElasticsearchInstances: Self = this.set("ReservedElasticsearchInstances", js.undefined)
  }
  
}

