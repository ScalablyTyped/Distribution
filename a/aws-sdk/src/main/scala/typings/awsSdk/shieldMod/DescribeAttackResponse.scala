package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAttackResponse extends js.Object {
  
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
  implicit class DescribeAttackResponseOps[Self <: DescribeAttackResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttack(value: AttackDetail): Self = this.set("Attack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttack: Self = this.set("Attack", js.undefined)
  }
}
