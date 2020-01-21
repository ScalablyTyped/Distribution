package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRemoteAccessSessionResult extends js.Object {
  /**
    * A container that represents the metadata from the service about the remote access session you are stopping.
    */
  var remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.native
}

object StopRemoteAccessSessionResult {
  @scala.inline
  def apply(remoteAccessSession: RemoteAccessSession = null): StopRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    if (remoteAccessSession != null) __obj.updateDynamic("remoteAccessSession")(remoteAccessSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRemoteAccessSessionResult]
  }
}

