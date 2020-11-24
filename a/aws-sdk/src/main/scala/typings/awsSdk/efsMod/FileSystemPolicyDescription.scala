package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystemPolicyDescription extends js.Object {
  
  /**
    * Specifies the EFS file system to which the FileSystemPolicy applies.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.efsMod.FileSystemId] = js.native
  
  /**
    * The JSON formatted FileSystemPolicy for the EFS file system.
    */
  var Policy: js.UndefOr[typings.awsSdk.efsMod.Policy] = js.native
}
object FileSystemPolicyDescription {
  
  @scala.inline
  def apply(): FileSystemPolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemPolicyDescription]
  }
  
  @scala.inline
  implicit class FileSystemPolicyDescriptionOps[Self <: FileSystemPolicyDescription] (val x: Self) extends AnyVal {
    
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
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSystemId: Self = this.set("FileSystemId", js.undefined)
    
    @scala.inline
    def setPolicy(value: Policy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
  }
}
