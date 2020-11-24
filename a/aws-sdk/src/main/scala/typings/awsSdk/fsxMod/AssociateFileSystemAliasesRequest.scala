package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateFileSystemAliasesRequest extends js.Object {
  
  /**
    * An array of one or more DNS alias names to associate with the file system. The alias name has to comply with the following formatting requirements:   Formatted as a fully-qualified domain name (FQDN),  hostname.domain , for example, accounting.corp.example.com.   Can contain alphanumeric characters and the hyphen (-).   Cannot start or end with a hyphen.   Can start with a numeric.   For DNS alias names, Amazon FSx stores alphabetic characters as lowercase letters (a-z), regardless of how you specify them: as uppercase letters, lowercase letters, or the corresponding letters in escape codes.
    */
  var Aliases: AlternateDNSNames = js.native
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.native
  
  /**
    * Specifies the file system with which you want to associate one or more DNS aliases.
    */
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId = js.native
}
object AssociateFileSystemAliasesRequest {
  
  @scala.inline
  def apply(Aliases: AlternateDNSNames, FileSystemId: FileSystemId): AssociateFileSystemAliasesRequest = {
    val __obj = js.Dynamic.literal(Aliases = Aliases.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateFileSystemAliasesRequest]
  }
  
  @scala.inline
  implicit class AssociateFileSystemAliasesRequestOps[Self <: AssociateFileSystemAliasesRequest] (val x: Self) extends AnyVal {
    
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
