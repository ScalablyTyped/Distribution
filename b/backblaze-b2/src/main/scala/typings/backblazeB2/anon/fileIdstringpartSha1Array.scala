package typings.backblazeB2.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  fileId :string,   partSha1Array :std.Array<string>} & backblaze-b2.backblaze-b2.CommonArgs */
@js.native
trait fileIdstringpartSha1Array extends js.Object {
  
  var axios: js.UndefOr[Record[String, _]] = js.native
  
  var axiosOverride: js.UndefOr[Record[String, _]] = js.native
  
  var fileId: String = js.native
  
  var partSha1Array: js.Array[String] = js.native
}
object fileIdstringpartSha1Array {
  
  @scala.inline
  def apply(fileId: String, partSha1Array: js.Array[String]): fileIdstringpartSha1Array = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], partSha1Array = partSha1Array.asInstanceOf[js.Any])
    __obj.asInstanceOf[fileIdstringpartSha1Array]
  }
  
  @scala.inline
  implicit class fileIdstringpartSha1ArrayOps[Self <: fileIdstringpartSha1Array] (val x: Self) extends AnyVal {
    
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
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartSha1ArrayVarargs(value: String*): Self = this.set("partSha1Array", js.Array(value :_*))
    
    @scala.inline
    def setPartSha1Array(value: js.Array[String]): Self = this.set("partSha1Array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxios(value: Record[String, _]): Self = this.set("axios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxios: Self = this.set("axios", js.undefined)
    
    @scala.inline
    def setAxiosOverride(value: Record[String, _]): Self = this.set("axiosOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxiosOverride: Self = this.set("axiosOverride", js.undefined)
  }
}
