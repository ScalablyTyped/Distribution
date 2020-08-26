package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSessionResult extends js.Object {
  /**
    * Session token of the started session. This SessionToken is required for every subsequent command that is issued during the current session.
    */
  var SessionToken: js.UndefOr[typings.awsSdk.qldbsessionMod.SessionToken] = js.native
}

object StartSessionResult {
  @scala.inline
  def apply(): StartSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSessionResult]
  }
  @scala.inline
  implicit class StartSessionResultOps[Self <: StartSessionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSessionToken(value: SessionToken): Self = this.set("SessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionToken: Self = this.set("SessionToken", js.undefined)
  }
  
}

