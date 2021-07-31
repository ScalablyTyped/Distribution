package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeType extends StObject {
  
  /**
    * The name of the attribute.
    */
  var Name: AttributeNameType
  
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[AttributeValueType] = js.undefined
}
object AttributeType {
  
  @scala.inline
  def apply(Name: AttributeNameType): AttributeType = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeType]
  }
  
  @scala.inline
  implicit class AttributeTypeMutableBuilder[Self <: AttributeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: AttributeNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: AttributeValueType): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
