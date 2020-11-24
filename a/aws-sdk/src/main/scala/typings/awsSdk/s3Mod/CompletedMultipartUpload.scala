package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletedMultipartUpload extends js.Object {
  
  /**
    * Array of CompletedPart data types.
    */
  var Parts: js.UndefOr[CompletedPartList] = js.native
}
object CompletedMultipartUpload {
  
  @scala.inline
  def apply(): CompletedMultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletedMultipartUpload]
  }
  
  @scala.inline
  implicit class CompletedMultipartUploadOps[Self <: CompletedMultipartUpload] (val x: Self) extends AnyVal {
    
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
    def setPartsVarargs(value: CompletedPart*): Self = this.set("Parts", js.Array(value :_*))
    
    @scala.inline
    def setParts(value: CompletedPartList): Self = this.set("Parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParts: Self = this.set("Parts", js.undefined)
  }
}
