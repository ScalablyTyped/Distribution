package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeDefinition extends StObject {
  
  /**
    * A name for the attribute.
    */
  var AttributeName: KeySchemaAttributeName
  
  /**
    * The data type for the attribute, where:    S - the attribute is of type String    N - the attribute is of type Number    B - the attribute is of type Binary  
    */
  var AttributeType: ScalarAttributeType
}
object AttributeDefinition {
  
  inline def apply(AttributeName: KeySchemaAttributeName, AttributeType: ScalarAttributeType): AttributeDefinition = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeDefinition]
  }
  
  extension [Self <: AttributeDefinition](x: Self) {
    
    inline def setAttributeName(value: KeySchemaAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeType(value: ScalarAttributeType): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
  }
}
