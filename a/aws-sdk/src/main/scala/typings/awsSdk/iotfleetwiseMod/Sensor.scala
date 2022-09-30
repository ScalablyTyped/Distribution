package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sensor extends StObject {
  
  /**
    * A list of possible values a sensor can take.
    */
  var allowedValues: js.UndefOr[listOfStrings] = js.undefined
  
  /**
    * The specified data type of the sensor. 
    */
  var dataType: NodeDataType
  
  /**
    * A brief description of a sensor.
    */
  var description: js.UndefOr[typings.awsSdk.iotfleetwiseMod.description] = js.undefined
  
  /**
    * The fully qualified name of the sensor. For example, the fully qualified name of a sensor might be Vehicle.Body.Engine.Battery.
    */
  var fullyQualifiedName: java.lang.String
  
  /**
    * The specified possible maximum value of the sensor.
    */
  var max: js.UndefOr[double] = js.undefined
  
  /**
    * The specified possible minimum value of the sensor.
    */
  var min: js.UndefOr[double] = js.undefined
  
  /**
    * The scientific unit of measurement for data collected by the sensor.
    */
  var unit: js.UndefOr[java.lang.String] = js.undefined
}
object Sensor {
  
  inline def apply(dataType: NodeDataType, fullyQualifiedName: java.lang.String): Sensor = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], fullyQualifiedName = fullyQualifiedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sensor]
  }
  
  extension [Self <: Sensor](x: Self) {
    
    inline def setAllowedValues(value: listOfStrings): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: java.lang.String*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setDataType(value: NodeDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFullyQualifiedName(value: java.lang.String): Self = StObject.set(x, "fullyQualifiedName", value.asInstanceOf[js.Any])
    
    inline def setMax(value: double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setUnit(value: java.lang.String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
