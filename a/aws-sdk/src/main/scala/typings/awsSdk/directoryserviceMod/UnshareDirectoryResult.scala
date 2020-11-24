package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnshareDirectoryResult extends js.Object {
  
  /**
    * Identifier of the directory stored in the directory consumer account that is to be unshared from the specified directory (DirectoryId).
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.native
}
object UnshareDirectoryResult {
  
  @scala.inline
  def apply(): UnshareDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnshareDirectoryResult]
  }
  
  @scala.inline
  implicit class UnshareDirectoryResultOps[Self <: UnshareDirectoryResult] (val x: Self) extends AnyVal {
    
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
    def setSharedDirectoryId(value: DirectoryId): Self = this.set("SharedDirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedDirectoryId: Self = this.set("SharedDirectoryId", js.undefined)
  }
}
