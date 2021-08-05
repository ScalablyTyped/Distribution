package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceAttribute extends StObject {
  
  /**
    * Type of resource.
    */
  var Type: ResourceAttributeType
  
  /**
    * Value of the resource type.
    */
  var Value: ResourceAttributeValue
}
object ResourceAttribute {
  
  inline def apply(Type: ResourceAttributeType, Value: ResourceAttributeValue): ResourceAttribute = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAttribute]
  }
  
  extension [Self <: ResourceAttribute](x: Self) {
    
    inline def setType(value: ResourceAttributeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ResourceAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
