package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductInformationFilter extends js.Object {
  
  /**
    * Logical operator.
    */
  var ProductInformationFilterComparator: String = js.native
  
  /**
    * Filter name.
    */
  var ProductInformationFilterName: String = js.native
  
  /**
    * Filter value.
    */
  var ProductInformationFilterValue: StringList = js.native
}
object ProductInformationFilter {
  
  @scala.inline
  def apply(
    ProductInformationFilterComparator: String,
    ProductInformationFilterName: String,
    ProductInformationFilterValue: StringList
  ): ProductInformationFilter = {
    val __obj = js.Dynamic.literal(ProductInformationFilterComparator = ProductInformationFilterComparator.asInstanceOf[js.Any], ProductInformationFilterName = ProductInformationFilterName.asInstanceOf[js.Any], ProductInformationFilterValue = ProductInformationFilterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductInformationFilter]
  }
  
  @scala.inline
  implicit class ProductInformationFilterOps[Self <: ProductInformationFilter] (val x: Self) extends AnyVal {
    
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
    def setProductInformationFilterComparator(value: String): Self = this.set("ProductInformationFilterComparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductInformationFilterName(value: String): Self = this.set("ProductInformationFilterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductInformationFilterValueVarargs(value: String*): Self = this.set("ProductInformationFilterValue", js.Array(value :_*))
    
    @scala.inline
    def setProductInformationFilterValue(value: StringList): Self = this.set("ProductInformationFilterValue", value.asInstanceOf[js.Any])
  }
}
