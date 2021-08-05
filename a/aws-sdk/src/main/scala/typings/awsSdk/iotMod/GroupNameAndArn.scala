package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupNameAndArn extends StObject {
  
  /**
    * The group ARN.
    */
  var groupArn: js.UndefOr[ThingGroupArn] = js.undefined
  
  /**
    * The group name.
    */
  var groupName: js.UndefOr[ThingGroupName] = js.undefined
}
object GroupNameAndArn {
  
  inline def apply(): GroupNameAndArn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupNameAndArn]
  }
  
  extension [Self <: GroupNameAndArn](x: Self) {
    
    inline def setGroupArn(value: ThingGroupArn): Self = StObject.set(x, "groupArn", value.asInstanceOf[js.Any])
    
    inline def setGroupArnUndefined: Self = StObject.set(x, "groupArn", js.undefined)
    
    inline def setGroupName(value: ThingGroupName): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
  }
}
