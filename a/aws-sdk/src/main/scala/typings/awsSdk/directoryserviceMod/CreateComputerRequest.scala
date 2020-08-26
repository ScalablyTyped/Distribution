package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateComputerRequest extends js.Object {
  /**
    * An array of Attribute objects that contain any LDAP attributes to apply to the computer account.
    */
  var ComputerAttributes: js.UndefOr[Attributes] = js.native
  /**
    * The name of the computer account.
    */
  var ComputerName: typings.awsSdk.directoryserviceMod.ComputerName = js.native
  /**
    * The identifier of the directory in which to create the computer account.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The fully-qualified distinguished name of the organizational unit to place the computer account in.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDN] = js.native
  /**
    * A one-time password that is used to join the computer to the directory. You should generate a random, strong password to use for this parameter.
    */
  var Password: ComputerPassword = js.native
}

object CreateComputerRequest {
  @scala.inline
  def apply(ComputerName: ComputerName, DirectoryId: DirectoryId, Password: ComputerPassword): CreateComputerRequest = {
    val __obj = js.Dynamic.literal(ComputerName = ComputerName.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComputerRequest]
  }
  @scala.inline
  implicit class CreateComputerRequestOps[Self <: CreateComputerRequest] (val x: Self) extends AnyVal {
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
    def setComputerName(value: ComputerName): Self = this.set("ComputerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: ComputerPassword): Self = this.set("Password", value.asInstanceOf[js.Any])
    @scala.inline
    def setComputerAttributesVarargs(value: Attribute*): Self = this.set("ComputerAttributes", js.Array(value :_*))
    @scala.inline
    def setComputerAttributes(value: Attributes): Self = this.set("ComputerAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputerAttributes: Self = this.set("ComputerAttributes", js.undefined)
    @scala.inline
    def setOrganizationalUnitDistinguishedName(value: OrganizationalUnitDN): Self = this.set("OrganizationalUnitDistinguishedName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationalUnitDistinguishedName: Self = this.set("OrganizationalUnitDistinguishedName", js.undefined)
  }
  
}

