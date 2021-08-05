package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableEntry extends StObject {
  
  /**
    * The data source of the variable.
    */
  var dataSource: js.UndefOr[String] = js.undefined
  
  /**
    * The data type of the variable.
    */
  var dataType: js.UndefOr[String] = js.undefined
  
  /**
    * The default value of the variable.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the variable.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the variable.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the variable. For more information see Variable types. Valid Values: AUTH_CODE | AVS | BILLING_ADDRESS_L1 | BILLING_ADDRESS_L2 | BILLING_CITY | BILLING_COUNTRY | BILLING_NAME | BILLING_PHONE | BILLING_STATE | BILLING_ZIP | CARD_BIN | CATEGORICAL | CURRENCY_CODE | EMAIL_ADDRESS | FINGERPRINT | FRAUD_LABEL | FREE_FORM_TEXT | IP_ADDRESS | NUMERIC | ORDER_ID | PAYMENT_TYPE | PHONE_NUMBER | PRICE | PRODUCT_CATEGORY | SHIPPING_ADDRESS_L1 | SHIPPING_ADDRESS_L2 | SHIPPING_CITY | SHIPPING_COUNTRY | SHIPPING_NAME | SHIPPING_PHONE | SHIPPING_STATE | SHIPPING_ZIP | USERAGENT  
    */
  var variableType: js.UndefOr[String] = js.undefined
}
object VariableEntry {
  
  inline def apply(): VariableEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariableEntry]
  }
  
  extension [Self <: VariableEntry](x: Self) {
    
    inline def setDataSource(value: String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVariableType(value: String): Self = StObject.set(x, "variableType", value.asInstanceOf[js.Any])
    
    inline def setVariableTypeUndefined: Self = StObject.set(x, "variableType", js.undefined)
  }
}
