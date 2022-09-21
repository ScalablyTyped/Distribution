package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceIdPreference extends StObject {
  
  /**
    * Identifies the EFS resource ID preference, either LONG_ID (17 characters) or SHORT_ID (8 characters).
    */
  var ResourceIdType: js.UndefOr[typings.awsSdk.efsMod.ResourceIdType] = js.undefined
  
  /**
    * Identifies the Amazon EFS resources to which the ID preference setting applies, FILE_SYSTEM and MOUNT_TARGET.
    */
  var Resources: js.UndefOr[typings.awsSdk.efsMod.Resources] = js.undefined
}
object ResourceIdPreference {
  
  inline def apply(): ResourceIdPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdPreference]
  }
  
  extension [Self <: ResourceIdPreference](x: Self) {
    
    inline def setResourceIdType(value: ResourceIdType): Self = StObject.set(x, "ResourceIdType", value.asInstanceOf[js.Any])
    
    inline def setResourceIdTypeUndefined: Self = StObject.set(x, "ResourceIdType", js.undefined)
    
    inline def setResources(value: Resources): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "Resources", js.Array(value*))
  }
}
