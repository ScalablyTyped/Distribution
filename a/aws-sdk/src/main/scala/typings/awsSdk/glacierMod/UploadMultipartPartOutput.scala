package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadMultipartPartOutput extends js.Object {
  
  /**
    * The SHA256 tree hash that Amazon S3 Glacier computed for the uploaded part.
    */
  var checksum: js.UndefOr[String] = js.native
}
object UploadMultipartPartOutput {
  
  @scala.inline
  def apply(): UploadMultipartPartOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadMultipartPartOutput]
  }
  
  @scala.inline
  implicit class UploadMultipartPartOutputOps[Self <: UploadMultipartPartOutput] (val x: Self) extends AnyVal {
    
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
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
  }
}
