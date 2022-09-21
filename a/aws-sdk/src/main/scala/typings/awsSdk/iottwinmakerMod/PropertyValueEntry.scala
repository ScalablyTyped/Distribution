package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyValueEntry extends StObject {
  
  /**
    * An object that contains information about the entity that has the property.
    */
  var entityPropertyReference: EntityPropertyReference
  
  /**
    * A list of objects that specify time series property values.
    */
  var propertyValues: js.UndefOr[PropertyValues] = js.undefined
}
object PropertyValueEntry {
  
  inline def apply(entityPropertyReference: EntityPropertyReference): PropertyValueEntry = {
    val __obj = js.Dynamic.literal(entityPropertyReference = entityPropertyReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyValueEntry]
  }
  
  extension [Self <: PropertyValueEntry](x: Self) {
    
    inline def setEntityPropertyReference(value: EntityPropertyReference): Self = StObject.set(x, "entityPropertyReference", value.asInstanceOf[js.Any])
    
    inline def setPropertyValues(value: PropertyValues): Self = StObject.set(x, "propertyValues", value.asInstanceOf[js.Any])
    
    inline def setPropertyValuesUndefined: Self = StObject.set(x, "propertyValues", js.undefined)
    
    inline def setPropertyValuesVarargs(value: PropertyValue*): Self = StObject.set(x, "propertyValues", js.Array(value*))
  }
}
