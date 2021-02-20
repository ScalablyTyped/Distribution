package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAttackResponse extends StObject {
  
  /**
    * The attack that is described.
    */
  var Attack: js.UndefOr[AttackDetail] = js.native
}
object DescribeAttackResponse {
  
  @scala.inline
  def apply(): DescribeAttackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAttackResponse]
  }
  
  @scala.inline
  implicit class DescribeAttackResponseMutableBuilder[Self <: DescribeAttackResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttack(value: AttackDetail): Self = StObject.set(x, "Attack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackUndefined: Self = StObject.set(x, "Attack", js.undefined)
  }
}
