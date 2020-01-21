package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRemoteAccessSessionResult extends js.Object {
  /**
    * A container that lists detailed information about the remote access session.
    */
  var remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.native
}

object GetRemoteAccessSessionResult {
  @scala.inline
  def apply(remoteAccessSession: RemoteAccessSession = null): GetRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    if (remoteAccessSession != null) __obj.updateDynamic("remoteAccessSession")(remoteAccessSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRemoteAccessSessionResult]
  }
}

