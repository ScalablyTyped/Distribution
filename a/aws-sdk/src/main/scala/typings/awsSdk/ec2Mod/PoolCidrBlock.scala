package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PoolCidrBlock extends js.Object {
  /**
    * The CIDR block.
    */
  var Cidr: js.UndefOr[String] = js.native
}

object PoolCidrBlock {
  @scala.inline
  def apply(Cidr: String = null): PoolCidrBlock = {
    val __obj = js.Dynamic.literal()
    if (Cidr != null) __obj.updateDynamic("Cidr")(Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolCidrBlock]
  }
}

