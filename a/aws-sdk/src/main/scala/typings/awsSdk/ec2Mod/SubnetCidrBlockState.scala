package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetCidrBlockState extends js.Object {
  /**
    * The state of a CIDR block.
    */
  var State: js.UndefOr[SubnetCidrBlockStateCode] = js.native
  /**
    * A message about the status of the CIDR block, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object SubnetCidrBlockState {
  @scala.inline
  def apply(): SubnetCidrBlockState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetCidrBlockState]
  }
  @scala.inline
  implicit class SubnetCidrBlockStateOps[Self <: SubnetCidrBlockState] (val x: Self) extends AnyVal {
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
    def setState(value: SubnetCidrBlockStateCode): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
  }
  
}

