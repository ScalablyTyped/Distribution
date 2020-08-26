package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNetworkInterfacePermissionResult extends js.Object {
  /**
    * Returns true if the request succeeds, otherwise returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.native
}

object DeleteNetworkInterfacePermissionResult {
  @scala.inline
  def apply(): DeleteNetworkInterfacePermissionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNetworkInterfacePermissionResult]
  }
  @scala.inline
  implicit class DeleteNetworkInterfacePermissionResultOps[Self <: DeleteNetworkInterfacePermissionResult] (val x: Self) extends AnyVal {
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
    def setReturn(value: Boolean): Self = this.set("Return", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn: Self = this.set("Return", js.undefined)
  }
  
}

