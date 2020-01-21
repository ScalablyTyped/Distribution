package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryServiceAuthentication extends js.Object {
  /**
    * The ID of the Active Directory used for authentication.
    */
  var DirectoryId: js.UndefOr[String] = js.native
}

object DirectoryServiceAuthentication {
  @scala.inline
  def apply(DirectoryId: String = null): DirectoryServiceAuthentication = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryServiceAuthentication]
  }
}

