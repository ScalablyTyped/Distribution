package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshCacheInput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the file share you want to refresh.
    */
  var FileShareARN: typings.awsSdk.storagegatewayMod.FileShareARN = js.native
  
  /**
    * A comma-separated list of the paths of folders to refresh in the cache. The default is ["/"]. The default refreshes objects and folders at the root of the Amazon S3 bucket. If Recursive is set to true, the entire S3 bucket that the file share has access to is refreshed.
    */
  var FolderList: js.UndefOr[typings.awsSdk.storagegatewayMod.FolderList] = js.native
  
  /**
    * A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders that were in the cache the last time the gateway listed the folder's contents. If this value set to true, each folder that is listed in FolderList is recursively updated. Otherwise, subfolders listed in FolderList are not refreshed. Only objects that are in folders listed directly under FolderList are found and used for the update. The default is true. Valid Values: true | false 
    */
  var Recursive: js.UndefOr[Boolean] = js.native
}
object RefreshCacheInput {
  
  @scala.inline
  def apply(FileShareARN: FileShareARN): RefreshCacheInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshCacheInput]
  }
  
  @scala.inline
  implicit class RefreshCacheInputOps[Self <: RefreshCacheInput] (val x: Self) extends AnyVal {
    
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
    def setFileShareARN(value: FileShareARN): Self = this.set("FileShareARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderListVarargs(value: Folder*): Self = this.set("FolderList", js.Array(value :_*))
    
    @scala.inline
    def setFolderList(value: FolderList): Self = this.set("FolderList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderList: Self = this.set("FolderList", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("Recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecursive: Self = this.set("Recursive", js.undefined)
  }
}
