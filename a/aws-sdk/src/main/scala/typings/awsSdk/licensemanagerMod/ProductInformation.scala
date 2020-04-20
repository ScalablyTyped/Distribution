package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductInformation extends js.Object {
  /**
    * Product information filters. The following filters and logical operators are supported:    Application Name - The name of the application. Logical operator is EQUALS.    Application Publisher - The publisher of the application. Logical operator is EQUALS.    Application Version - The version of the application. Logical operator is EQUALS.    Platform Name - The name of the platform. Logical operator is EQUALS.    Platform Type - The platform type. Logical operator is EQUALS.    License Included - The type of license included. Logical operators are EQUALS and NOT_EQUALS. Possible values are sql-server-enterprise | sql-server-standard | sql-server-web | windows-server-datacenter.  
    */
  var ProductInformationFilterList: typings.awsSdk.licensemanagerMod.ProductInformationFilterList = js.native
  /**
    * Resource type. The value is SSM_MANAGED.
    */
  var ResourceType: String = js.native
}

object ProductInformation {
  @scala.inline
  def apply(ProductInformationFilterList: ProductInformationFilterList, ResourceType: String): ProductInformation = {
    val __obj = js.Dynamic.literal(ProductInformationFilterList = ProductInformationFilterList.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductInformation]
  }
}

