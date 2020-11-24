package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedElasticsearchInstanceOfferingsResponse extends js.Object {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
  
  /**
    * List of reserved Elasticsearch instance offerings
    */
  var ReservedElasticsearchInstanceOfferings: js.UndefOr[ReservedElasticsearchInstanceOfferingList] = js.native
}
object DescribeReservedElasticsearchInstanceOfferingsResponse {
  
  @scala.inline
  def apply(): DescribeReservedElasticsearchInstanceOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedElasticsearchInstanceOfferingsResponse]
  }
  
  @scala.inline
  implicit class DescribeReservedElasticsearchInstanceOfferingsResponseOps[Self <: DescribeReservedElasticsearchInstanceOfferingsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setReservedElasticsearchInstanceOfferingsVarargs(value: ReservedElasticsearchInstanceOffering*): Self = this.set("ReservedElasticsearchInstanceOfferings", js.Array(value :_*))
    
    @scala.inline
    def setReservedElasticsearchInstanceOfferings(value: ReservedElasticsearchInstanceOfferingList): Self = this.set("ReservedElasticsearchInstanceOfferings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedElasticsearchInstanceOfferings: Self = this.set("ReservedElasticsearchInstanceOfferings", js.undefined)
  }
}
