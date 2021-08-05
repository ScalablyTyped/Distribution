package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupMember extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the group member (user).
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The name of the group member (user).
    */
  var MemberName: js.UndefOr[GroupMemberName] = js.undefined
}
object GroupMember {
  
  inline def apply(): GroupMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupMember]
  }
  
  extension [Self <: GroupMember](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setMemberName(value: GroupMemberName): Self = StObject.set(x, "MemberName", value.asInstanceOf[js.Any])
    
    inline def setMemberNameUndefined: Self = StObject.set(x, "MemberName", js.undefined)
  }
}
