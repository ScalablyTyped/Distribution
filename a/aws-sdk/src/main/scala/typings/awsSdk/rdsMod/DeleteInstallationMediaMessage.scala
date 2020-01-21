package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInstallationMediaMessage extends js.Object {
  /**
    * The installation medium ID.
    */
  var InstallationMediaId: String = js.native
}

object DeleteInstallationMediaMessage {
  @scala.inline
  def apply(InstallationMediaId: String): DeleteInstallationMediaMessage = {
    val __obj = js.Dynamic.literal(InstallationMediaId = InstallationMediaId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteInstallationMediaMessage]
  }
}

