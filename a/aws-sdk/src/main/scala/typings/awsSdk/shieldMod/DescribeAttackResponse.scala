package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAttackResponse extends js.Object {
  /**
    * The attack that is described.
    */
  var Attack: js.UndefOr[AttackDetail] = js.native
}

object DescribeAttackResponse {
  @scala.inline
  def apply(Attack: AttackDetail = null): DescribeAttackResponse = {
    val __obj = js.Dynamic.literal()
    if (Attack != null) __obj.updateDynamic("Attack")(Attack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAttackResponse]
  }
}

