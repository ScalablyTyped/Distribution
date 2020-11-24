package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateFileSystemAliasesRequest extends js.Object {
  
  /**
    * An array of one or more DNS alias names to disassociate, or remove, from the file system.
    */
  var Aliases: AlternateDNSNames = js.native
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.native
  
  /**
    * Specifies the file system from which to disassociate the DNS aliases.
    */
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId = js.native
}
object DisassociateFileSystemAliasesRequest {
  
  @scala.inline
  def apply(Aliases: AlternateDNSNames, FileSystemId: FileSystemId): DisassociateFileSystemAliasesRequest = {
    val __obj = js.Dynamic.literal(Aliases = Aliases.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateFileSystemAliasesRequest]
  }
  
  @scala.inline
  implicit class DisassociateFileSystemAliasesRequestOps[Self <: DisassociateFileSystemAliasesRequest] (val x: Self) extends AnyVal {
    
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
    def setAliasesVarargs(value: AlternateDNSName*): Self = this.set("Aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: AlternateDNSNames): Self = this.set("Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
  }
}
