package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadBlockBlobOptions extends UploadBlobOptions {
  
  var blockIdPrefix: js.UndefOr[String] = js.native
}
object UploadBlockBlobOptions {
  
  @scala.inline
  def apply(): UploadBlockBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadBlockBlobOptions]
  }
  
  @scala.inline
  implicit class UploadBlockBlobOptionsOps[Self <: UploadBlockBlobOptions] (val x: Self) extends AnyVal {
    
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
    def setBlockIdPrefix(value: String): Self = this.set("blockIdPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockIdPrefix: Self = this.set("blockIdPrefix", js.undefined)
  }
}
