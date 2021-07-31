package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetProperty extends StObject {
  
  /**
    * The property alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping industrial data streams to asset properties in the AWS IoT SiteWise User Guide.
    */
  var alias: js.UndefOr[PropertyAlias] = js.undefined
  
  /**
    * The data type of the asset property.
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
    * The unit (such as Newtons or RPM) of the asset property.
    */
  var unit: js.UndefOr[PropertyUnit] = js.undefined
}
object AssetProperty {
  
  @scala.inline
  def apply(dataType: PropertyDataType, id: ID, name: Name): AssetProperty = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetProperty]
  }
  
  @scala.inline
  implicit class AssetPropertyMutableBuilder[Self <: AssetProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: PropertyAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setDataType(value: PropertyDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: PropertyNotification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    @scala.inline
    def setUnit(value: PropertyUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
