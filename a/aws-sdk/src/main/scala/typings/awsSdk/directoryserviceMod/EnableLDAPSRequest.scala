package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableLDAPSRequest extends js.Object {
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The type of LDAP security to enable. Currently only the value Client is supported.
    */
  var Type: LDAPSType = js.native
}

object EnableLDAPSRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, Type: LDAPSType): EnableLDAPSRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnableLDAPSRequest]
  }
}

