package typings.backblazeB2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFileVersionsOpts extends CommonArgs {
  
  var bucketId: String = js.native
  
  var maxFileCount: Double = js.native
  
  var startFileId: String = js.native
  
  var startFileName: String = js.native
}
object ListFileVersionsOpts {
  
  @scala.inline
  def apply(bucketId: String, maxFileCount: Double, startFileId: String, startFileName: String): ListFileVersionsOpts = {
    val __obj = js.Dynamic.literal(bucketId = bucketId.asInstanceOf[js.Any], maxFileCount = maxFileCount.asInstanceOf[js.Any], startFileId = startFileId.asInstanceOf[js.Any], startFileName = startFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFileVersionsOpts]
  }
  
  @scala.inline
  implicit class ListFileVersionsOptsOps[Self <: ListFileVersionsOpts] (val x: Self) extends AnyVal {
    
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
    def setBucketId(value: String): Self = this.set("bucketId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileCount(value: Double): Self = this.set("maxFileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFileId(value: String): Self = this.set("startFileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFileName(value: String): Self = this.set("startFileName", value.asInstanceOf[js.Any])
  }
}
