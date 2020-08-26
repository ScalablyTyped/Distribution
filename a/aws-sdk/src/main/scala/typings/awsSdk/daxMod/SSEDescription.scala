package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSEDescription extends js.Object {
  /**
    * The current state of server-side encryption:    ENABLING - Server-side encryption is being enabled.    ENABLED - Server-side encryption is enabled.    DISABLING - Server-side encryption is being disabled.    DISABLED - Server-side encryption is disabled.  
    */
  var Status: js.UndefOr[SSEStatus] = js.native
}

object SSEDescription {
  @scala.inline
  def apply(): SSEDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSEDescription]
  }
  @scala.inline
  implicit class SSEDescriptionOps[Self <: SSEDescription] (val x: Self) extends AnyVal {
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
    def setStatus(value: SSEStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

