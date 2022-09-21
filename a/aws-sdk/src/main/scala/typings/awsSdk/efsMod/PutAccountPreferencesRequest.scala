package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountPreferencesRequest extends StObject {
  
  /**
    * Specifies the EFS resource ID preference to set for the user's Amazon Web Services account, in the current Amazon Web Services Region, either LONG_ID (17 characters), or SHORT_ID (8 characters).  Starting in October, 2021, you will receive an error when setting the account preference to SHORT_ID. Contact Amazon Web Services support if you receive an error and must use short IDs for file system and mount target resources. 
    */
  var ResourceIdType: typings.awsSdk.efsMod.ResourceIdType
}
object PutAccountPreferencesRequest {
  
  inline def apply(ResourceIdType: ResourceIdType): PutAccountPreferencesRequest = {
    val __obj = js.Dynamic.literal(ResourceIdType = ResourceIdType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccountPreferencesRequest]
  }
  
  extension [Self <: PutAccountPreferencesRequest](x: Self) {
    
    inline def setResourceIdType(value: ResourceIdType): Self = StObject.set(x, "ResourceIdType", value.asInstanceOf[js.Any])
  }
}
