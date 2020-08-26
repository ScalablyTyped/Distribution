package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCACertificateParams extends js.Object {
  /**
    * The action that you want to apply to the CA cerrtificate. The only supported value is DEACTIVATE.
    */
  var action: CACertificateUpdateAction = js.native
}

object UpdateCACertificateParams {
  @scala.inline
  def apply(action: CACertificateUpdateAction): UpdateCACertificateParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCACertificateParams]
  }
  @scala.inline
  implicit class UpdateCACertificateParamsOps[Self <: UpdateCACertificateParams] (val x: Self) extends AnyVal {
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
    def setAction(value: CACertificateUpdateAction): Self = this.set("action", value.asInstanceOf[js.Any])
  }
  
}

