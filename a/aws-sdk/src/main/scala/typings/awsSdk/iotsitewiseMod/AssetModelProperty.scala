package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetModelProperty extends StObject {
  
  /**
    * The data type of the asset model property.
    */
  var dataType: PropertyDataType
  
  /**
    * The ID of the asset model property.
    */
  var id: js.UndefOr[ID] = js.undefined
  
  /**
    * The name of the asset model property.
    */
  var name: Name
  
  /**
    * The property type (see PropertyType).
    */
  var `type`: PropertyType
  
  /**
    * The unit of the asset model property, such as Newtons or RPM.
    */
  var unit: js.UndefOr[PropertyUnit] = js.undefined
}
object AssetModelProperty {
  
  @scala.inline
  def apply(dataType: PropertyDataType, name: Name, `type`: PropertyType): AssetModelProperty = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelProperty]
  }
  
  @scala.inline
  implicit class AssetModelPropertyMutableBuilder[Self <: AssetModelProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: PropertyDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: PropertyUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
