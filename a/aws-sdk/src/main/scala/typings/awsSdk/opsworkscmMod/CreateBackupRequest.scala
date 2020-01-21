package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackupRequest extends js.Object {
  /**
    *  A user-defined description of the backup. 
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the server that you want to back up. 
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName = js.native
  /**
    * A map that contains tag keys and tag values to attach to an AWS OpsWorks-CM server backup.   The key cannot be empty.   The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : /    The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : /    Leading and trailing white spaces are trimmed from both the key and value.   A maximum of 50 user-applied tags is allowed for tag-supported AWS OpsWorks-CM resources.  
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateBackupRequest {
  @scala.inline
  def apply(ServerName: ServerName, Description: String = null, Tags: TagList = null): CreateBackupRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupRequest]
  }
}

