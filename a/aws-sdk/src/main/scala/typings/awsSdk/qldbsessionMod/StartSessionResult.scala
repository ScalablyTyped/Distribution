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
  def apply(SessionToken: SessionToken = null): StartSessionResult = {
    val __obj = js.Dynamic.literal()
    if (SessionToken != null) __obj.updateDynamic("SessionToken")(SessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSessionResult]
  }
}

