package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberIdArnPair extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the member.
    */
  var MemberArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the member.
    */
  var MemberId: js.UndefOr[RestrictiveResourceId] = js.undefined
}
object MemberIdArnPair {
  
  inline def apply(): MemberIdArnPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberIdArnPair]
  }
  
  extension [Self <: MemberIdArnPair](x: Self) {
    
    inline def setMemberArn(value: Arn): Self = StObject.set(x, "MemberArn", value.asInstanceOf[js.Any])
    
    inline def setMemberArnUndefined: Self = StObject.set(x, "MemberArn", js.undefined)
    
    inline def setMemberId(value: RestrictiveResourceId): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
  }
}
