package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEgressOnlyInternetGatewayResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var ReturnCode: js.UndefOr[Boolean] = js.native
}

object DeleteEgressOnlyInternetGatewayResult {
  @scala.inline
  def apply(): DeleteEgressOnlyInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEgressOnlyInternetGatewayResult]
  }
  @scala.inline
  implicit class DeleteEgressOnlyInternetGatewayResultOps[Self <: DeleteEgressOnlyInternetGatewayResult] (val x: Self) extends AnyVal {
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
    def setReturnCode(value: Boolean): Self = this.set("ReturnCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnCode: Self = this.set("ReturnCode", js.undefined)
  }
  
}

