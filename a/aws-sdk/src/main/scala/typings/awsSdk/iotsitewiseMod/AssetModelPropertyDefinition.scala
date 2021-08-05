package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetModelPropertyDefinition extends StObject {
  
  /**
    * The data type of the property definition.
    */
  var dataType: PropertyDataType
  
  /**
    * The name of the property definition.
    */
  var name: Name
  
  /**
    * The property definition type (see PropertyType). You can only specify one type in a property definition.
    */
  var `type`: PropertyType
  
  /**
    * The unit of the property definition, such as Newtons or RPM.
    */
  var unit: js.UndefOr[PropertyUnit] = js.undefined
}
object AssetModelPropertyDefinition {
  
  inline def apply(dataType: PropertyDataType, name: Name, `type`: PropertyType): AssetModelPropertyDefinition = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelPropertyDefinition]
  }
  
  extension [Self <: AssetModelPropertyDefinition](x: Self) {
    
    inline def setDataType(value: PropertyDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: PropertyUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
