package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroup extends StObject {
  
  /**
    * The security group ID of the EC2 instance.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The security group name of the EC2 instance.
    */
  var GroupName: js.UndefOr[String] = js.undefined
}
object SecurityGroup {
  
  inline def apply(): SecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroup]
  }
  
  extension [Self <: SecurityGroup](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
