package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAliasRequest extends js.Object {
  /**
    * The requested alias. The alias must be unique amongst all aliases in AWS. This operation throws an EntityAlreadyExistsException error if the alias already exists.
    */
  var Alias: AliasName = js.native
  /**
    * The identifier of the directory for which to create the alias.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object CreateAliasRequest {
  @scala.inline
  def apply(Alias: AliasName, DirectoryId: DirectoryId): CreateAliasRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasRequest]
  }
  @scala.inline
  implicit class CreateAliasRequestOps[Self <: CreateAliasRequest] (val x: Self) extends AnyVal {
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
    def setAlias(value: AliasName): Self = this.set("Alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
  }
  
}

