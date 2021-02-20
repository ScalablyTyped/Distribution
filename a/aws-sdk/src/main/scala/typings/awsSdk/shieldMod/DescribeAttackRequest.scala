package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAttackRequest extends StObject {
  
  /**
    * The unique identifier (ID) for the attack that to be described.
    */
  var AttackId: typings.awsSdk.shieldMod.AttackId = js.native
}
object DescribeAttackRequest {
  
  @scala.inline
  def apply(AttackId: AttackId): DescribeAttackRequest = {
    val __obj = js.Dynamic.literal(AttackId = AttackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAttackRequest]
  }
  
  @scala.inline
  implicit class DescribeAttackRequestMutableBuilder[Self <: DescribeAttackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttackId(value: AttackId): Self = StObject.set(x, "AttackId", value.asInstanceOf[js.Any])
  }
}
