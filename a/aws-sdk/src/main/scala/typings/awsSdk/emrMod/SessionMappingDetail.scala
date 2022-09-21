package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionMappingDetail extends StObject {
  
  /**
    * The time the session mapping was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The globally unique identifier (GUID) of the user or group.
    */
  var IdentityId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The name of the user or group. For more information, see UserName and DisplayName in the Amazon Web Services SSO Identity Store API Reference.
    */
  var IdentityName: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * Specifies whether the identity mapped to the Amazon EMR Studio is a user or a group.
    */
  var IdentityType: js.UndefOr[typings.awsSdk.emrMod.IdentityType] = js.undefined
  
  /**
    * The time the session mapping was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the session policy associated with the user or group.
    */
  var SessionPolicyArn: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The ID of the Amazon EMR Studio.
    */
  var StudioId: js.UndefOr[XmlStringMaxLen256] = js.undefined
}
object SessionMappingDetail {
  
  inline def apply(): SessionMappingDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionMappingDetail]
  }
  
  extension [Self <: SessionMappingDetail](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setIdentityId(value: XmlStringMaxLen256): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    inline def setIdentityName(value: XmlStringMaxLen256): Self = StObject.set(x, "IdentityName", value.asInstanceOf[js.Any])
    
    inline def setIdentityNameUndefined: Self = StObject.set(x, "IdentityName", js.undefined)
    
    inline def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    inline def setIdentityTypeUndefined: Self = StObject.set(x, "IdentityType", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setSessionPolicyArn(value: XmlStringMaxLen256): Self = StObject.set(x, "SessionPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setSessionPolicyArnUndefined: Self = StObject.set(x, "SessionPolicyArn", js.undefined)
    
    inline def setStudioId(value: XmlStringMaxLen256): Self = StObject.set(x, "StudioId", value.asInstanceOf[js.Any])
    
    inline def setStudioIdUndefined: Self = StObject.set(x, "StudioId", js.undefined)
  }
}
