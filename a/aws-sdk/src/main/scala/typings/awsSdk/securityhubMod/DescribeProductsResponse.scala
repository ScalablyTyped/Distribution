package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProductsResponse extends js.Object {
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  
  /**
    * A list of products, including details for each product.
    */
  var Products: ProductsList = js.native
}
object DescribeProductsResponse {
  
  @scala.inline
  def apply(Products: ProductsList): DescribeProductsResponse = {
    val __obj = js.Dynamic.literal(Products = Products.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProductsResponse]
  }
  
  @scala.inline
  implicit class DescribeProductsResponseOps[Self <: DescribeProductsResponse] (val x: Self) extends AnyVal {
    
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
    def setProductsVarargs(value: Product*): Self = this.set("Products", js.Array(value :_*))
    
    @scala.inline
    def setProducts(value: ProductsList): Self = this.set("Products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
