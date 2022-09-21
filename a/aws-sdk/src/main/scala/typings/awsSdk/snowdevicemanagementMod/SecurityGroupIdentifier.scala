package typings.awsSdk.snowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroupIdentifier extends StObject {
  
  /**
    * The security group ID.
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * The security group name.
    */
  var groupName: js.UndefOr[String] = js.undefined
}
object SecurityGroupIdentifier {
  
  inline def apply(): SecurityGroupIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupIdentifier]
  }
  
  extension [Self <: SecurityGroupIdentifier](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
  }
}
