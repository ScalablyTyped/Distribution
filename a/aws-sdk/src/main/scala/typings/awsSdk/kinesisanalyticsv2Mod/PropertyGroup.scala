package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyGroup extends StObject {
  
  /**
    * Describes the key of an application execution property key-value pair.
    */
  var PropertyGroupId: Id
  
  /**
    * Describes the value of an application execution property key-value pair.
    */
  var PropertyMap: typings.awsSdk.kinesisanalyticsv2Mod.PropertyMap
}
object PropertyGroup {
  
  @scala.inline
  def apply(PropertyGroupId: Id, PropertyMap: PropertyMap): PropertyGroup = {
    val __obj = js.Dynamic.literal(PropertyGroupId = PropertyGroupId.asInstanceOf[js.Any], PropertyMap = PropertyMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyGroup]
  }
  
  @scala.inline
  implicit class PropertyGroupMutableBuilder[Self <: PropertyGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyGroupId(value: Id): Self = StObject.set(x, "PropertyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyMap(value: PropertyMap): Self = StObject.set(x, "PropertyMap", value.asInstanceOf[js.Any])
  }
}
