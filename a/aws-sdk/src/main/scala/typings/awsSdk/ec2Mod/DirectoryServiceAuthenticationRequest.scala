package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryServiceAuthenticationRequest extends js.Object {
  /**
    * The ID of the Active Directory to be used for authentication.
    */
  var DirectoryId: js.UndefOr[String] = js.native
}

object DirectoryServiceAuthenticationRequest {
  @scala.inline
  def apply(): DirectoryServiceAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryServiceAuthenticationRequest]
  }
  @scala.inline
  implicit class DirectoryServiceAuthenticationRequestOps[Self <: DirectoryServiceAuthenticationRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryId(value: String): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
  }
  
}

