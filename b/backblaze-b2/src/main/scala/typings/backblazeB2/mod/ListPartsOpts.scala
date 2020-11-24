package typings.backblazeB2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPartsOpts extends CommonArgs {
  
  var fileId: String = js.native
  
  /**
    * maximum part count
    * max value 100
    */
  var maxPartCount: js.UndefOr[Double] = js.native
  
  var startPartNumber: js.UndefOr[Double] = js.native
}
object ListPartsOpts {
  
  @scala.inline
  def apply(fileId: String): ListPartsOpts = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsOpts]
  }
  
  @scala.inline
  implicit class ListPartsOptsOps[Self <: ListPartsOpts] (val x: Self) extends AnyVal {
    
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
    def setMaxPartCount(value: Double): Self = this.set("maxPartCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPartCount: Self = this.set("maxPartCount", js.undefined)
    
    @scala.inline
    def setStartPartNumber(value: Double): Self = this.set("startPartNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPartNumber: Self = this.set("startPartNumber", js.undefined)
  }
}
