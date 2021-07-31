package typings.awsSdk.identitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The attribute path used to specify which attribute name to search. Length limit is 255 characters. For example, UserName is a valid attribute path for the ListUsers API, and DisplayName is a valid attribute path for the ListGroups API.
    */
  var AttributePath: typings.awsSdk.identitystoreMod.AttributePath
  
  /**
    * Represents the data for an attribute. Each attribute value is described as a name-value pair. 
    */
  var AttributeValue: SensitiveStringType
}
object Filter {
  
  @scala.inline
  def apply(AttributePath: AttributePath, AttributeValue: SensitiveStringType): Filter = {
    val __obj = js.Dynamic.literal(AttributePath = AttributePath.asInstanceOf[js.Any], AttributeValue = AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributePath(value: AttributePath): Self = StObject.set(x, "AttributePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValue(value: SensitiveStringType): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
  }
}
