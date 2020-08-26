package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservedElasticsearchInstanceOfferingsRequest extends js.Object {
  /**
    * Set this value to limit the number of results returned. If not specified, defaults to 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.esMod.MaxResults] = js.native
  /**
    * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
  /**
    * The offering identifier filter value. Use this parameter to show only the available offering that matches the specified reservation identifier.
    */
  var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.native
}

object DescribeReservedElasticsearchInstanceOfferingsRequest {
  @scala.inline
  def apply(): DescribeReservedElasticsearchInstanceOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsRequest]
  }
  @scala.inline
  implicit class DescribeReservedElasticsearchInstanceOfferingsRequestOps[Self <: DescribeReservedElasticsearchInstanceOfferingsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setReservedElasticsearchInstanceOfferingId(value: GUID): Self = this.set("ReservedElasticsearchInstanceOfferingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedElasticsearchInstanceOfferingId: Self = this.set("ReservedElasticsearchInstanceOfferingId", js.undefined)
  }
  
}

