package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property extends StObject {
  
  /**
    * The property alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping industrial data streams to asset properties in the AWS IoT SiteWise User Guide.
    */
  var alias: js.UndefOr[PropertyAlias] = js.undefined
  
  /**
    * The property data type.
    */
  var dataType: PropertyDataType
  
  /**
    * The ID of the asset property.
    */
  var id: ID
  
  /**
    * The name of the property.
    */
  var name: Name
  
  /**
    * The asset property's notification topic and state. For more information, see UpdateAssetProperty.
    */
  var notification: js.UndefOr[PropertyNotification] = js.undefined
  
  /**
    * The property type (see PropertyType). A property contains one type.
    */
  var `type`: js.UndefOr[PropertyType] = js.undefined
  
  /**
    * The unit (such as Newtons or RPM) of the asset property.
    */
  var unit: js.UndefOr[PropertyUnit] = js.undefined
}
object Property {
  
  inline def apply(dataType: PropertyDataType, id: ID, name: Name): Property = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  
  extension [Self <: Property](x: Self) {
    
    inline def setAlias(value: PropertyAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setDataType(value: PropertyDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: PropertyNotification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setType(value: PropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnit(value: PropertyUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
