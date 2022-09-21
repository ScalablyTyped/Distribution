package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyLatestValue extends StObject {
  
  /**
    * An object that specifies information about a property.&gt;
    */
  var propertyReference: EntityPropertyReference
  
  /**
    * The value of the property.
    */
  var propertyValue: js.UndefOr[DataValue] = js.undefined
}
object PropertyLatestValue {
  
  inline def apply(propertyReference: EntityPropertyReference): PropertyLatestValue = {
    val __obj = js.Dynamic.literal(propertyReference = propertyReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyLatestValue]
  }
  
  extension [Self <: PropertyLatestValue](x: Self) {
    
    inline def setPropertyReference(value: EntityPropertyReference): Self = StObject.set(x, "propertyReference", value.asInstanceOf[js.Any])
    
    inline def setPropertyValue(value: DataValue): Self = StObject.set(x, "propertyValue", value.asInstanceOf[js.Any])
    
    inline def setPropertyValueUndefined: Self = StObject.set(x, "propertyValue", js.undefined)
  }
}
