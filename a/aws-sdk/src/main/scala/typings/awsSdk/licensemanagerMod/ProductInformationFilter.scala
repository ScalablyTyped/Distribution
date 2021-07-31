package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductInformationFilter extends StObject {
  
  /**
    * Logical operator.
    */
  var ProductInformationFilterComparator: String
  
  /**
    * Filter name.
    */
  var ProductInformationFilterName: String
  
  /**
    * Filter value.
    */
  var ProductInformationFilterValue: StringList
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
  implicit class ProductInformationFilterMutableBuilder[Self <: ProductInformationFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductInformationFilterComparator(value: String): Self = StObject.set(x, "ProductInformationFilterComparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductInformationFilterName(value: String): Self = StObject.set(x, "ProductInformationFilterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductInformationFilterValue(value: StringList): Self = StObject.set(x, "ProductInformationFilterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductInformationFilterValueVarargs(value: String*): Self = StObject.set(x, "ProductInformationFilterValue", js.Array(value :_*))
  }
}
