package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAttribute extends StObject {
  
  /**
    * The name of the account attribute.
    */
  var AttributeName: js.UndefOr[String] = js.undefined
  
  /**
    * The values for the account attribute.
    */
  var AttributeValues: js.UndefOr[AccountAttributeValueList] = js.undefined
}
object AccountAttribute {
  
  @scala.inline
  def apply(): AccountAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttribute]
  }
  
  @scala.inline
  implicit class AccountAttributeMutableBuilder[Self <: AccountAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    @scala.inline
    def setAttributeValues(value: AccountAttributeValueList): Self = StObject.set(x, "AttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValuesUndefined: Self = StObject.set(x, "AttributeValues", js.undefined)
    
    @scala.inline
    def setAttributeValuesVarargs(value: AccountAttributeValue*): Self = StObject.set(x, "AttributeValues", js.Array(value :_*))
  }
}
