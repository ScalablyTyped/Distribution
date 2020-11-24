package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductInformation extends js.Object {
  
  /**
    * Product information filters. The following filters and logical operators are supported when the resource type is SSM_MANAGED:    Application Name - The name of the application. Logical operator is EQUALS.    Application Publisher - The publisher of the application. Logical operator is EQUALS.    Application Version - The version of the application. Logical operator is EQUALS.    Platform Name - The name of the platform. Logical operator is EQUALS.    Platform Type - The platform type. Logical operator is EQUALS.    License Included - The type of license included. Logical operators are EQUALS and NOT_EQUALS. Possible values are: sql-server-enterprise | sql-server-standard | sql-server-web | windows-server-datacenter.   The following filters and logical operators are supported when the resource type is RDS:    Engine Edition - The edition of the database engine. Logical operator is EQUALS. Possible values are: oracle-ee | oracle-se | oracle-se1 | oracle-se2.    License Pack - The license pack. Logical operator is EQUALS. Possible values are: data guard | diagnostic pack sqlt | tuning pack sqlt | ols | olap.  
    */
  var ProductInformationFilterList: typings.awsSdk.licensemanagerMod.ProductInformationFilterList = js.native
  
  /**
    * Resource type. The possible values are SSM_MANAGED | RDS.
    */
  var ResourceType: String = js.native
}
object ProductInformation {
  
  @scala.inline
  def apply(ProductInformationFilterList: ProductInformationFilterList, ResourceType: String): ProductInformation = {
    val __obj = js.Dynamic.literal(ProductInformationFilterList = ProductInformationFilterList.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductInformation]
  }
  
  @scala.inline
  implicit class ProductInformationOps[Self <: ProductInformation] (val x: Self) extends AnyVal {
    
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
    def setProductInformationFilterListVarargs(value: ProductInformationFilter*): Self = this.set("ProductInformationFilterList", js.Array(value :_*))
    
    @scala.inline
    def setProductInformationFilterList(value: ProductInformationFilterList): Self = this.set("ProductInformationFilterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: String): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
  }
}
