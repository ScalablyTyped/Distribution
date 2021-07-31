package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAttribute extends StObject {
  
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of attribute values.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
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
    def setAttributeValues(value: AttributeValueList): Self = StObject.set(x, "AttributeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValuesUndefined: Self = StObject.set(x, "AttributeValues", js.undefined)
    
    @scala.inline
    def setAttributeValuesVarargs(value: AttributeValueTarget*): Self = StObject.set(x, "AttributeValues", js.Array(value :_*))
  }
}
