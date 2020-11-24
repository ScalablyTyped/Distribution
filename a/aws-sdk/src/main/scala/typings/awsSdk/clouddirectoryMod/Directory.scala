package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directory extends js.Object {
  
  /**
    * The date and time when the directory was created.
    */
  var CreationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the directory. For more information, see arns.
    */
  var DirectoryArn: js.UndefOr[typings.awsSdk.clouddirectoryMod.DirectoryArn] = js.native
  
  /**
    * The name of the directory.
    */
  var Name: js.UndefOr[DirectoryName] = js.native
  
  /**
    * The state of the directory. Can be either Enabled, Disabled, or Deleted.
    */
  var State: js.UndefOr[DirectoryState] = js.native
}
object Directory {
  
  @scala.inline
  def apply(): Directory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Directory]
  }
  
  @scala.inline
  implicit class DirectoryOps[Self <: Directory] (val x: Self) extends AnyVal {
    
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
    def setCreationDateTime(value: Date): Self = this.set("CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDateTime: Self = this.set("CreationDateTime", js.undefined)
    
    @scala.inline
    def setDirectoryArn(value: DirectoryArn): Self = this.set("DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryArn: Self = this.set("DirectoryArn", js.undefined)
    
    @scala.inline
    def setName(value: DirectoryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setState(value: DirectoryState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
