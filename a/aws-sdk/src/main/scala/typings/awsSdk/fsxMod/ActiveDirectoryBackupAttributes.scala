package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveDirectoryBackupAttributes extends js.Object {
  
  /**
    * The ID of the AWS Managed Microsoft Active Directory instance to which the file system is joined.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.native
  
  /**
    * The fully qualified domain name of the self-managed AD directory.
    */
  var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName] = js.native
}
object ActiveDirectoryBackupAttributes {
  
  @scala.inline
  def apply(): ActiveDirectoryBackupAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveDirectoryBackupAttributes]
  }
  
  @scala.inline
  implicit class ActiveDirectoryBackupAttributesOps[Self <: ActiveDirectoryBackupAttributes] (val x: Self) extends AnyVal {
    
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
    def setActiveDirectoryId(value: DirectoryId): Self = this.set("ActiveDirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveDirectoryId: Self = this.set("ActiveDirectoryId", js.undefined)
    
    @scala.inline
    def setDomainName(value: ActiveDirectoryFullyQualifiedName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
  }
}
