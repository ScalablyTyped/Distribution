package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMultipartUploadsOutput extends js.Object {
  
  /**
    * An opaque string that represents where to continue pagination of the results. You use the marker in a new List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is null.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of in-progress multipart uploads.
    */
  var UploadsList: js.UndefOr[typings.awsSdk.glacierMod.UploadsList] = js.native
}
object ListMultipartUploadsOutput {
  
  @scala.inline
  def apply(): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMultipartUploadsOutput]
  }
  
  @scala.inline
  implicit class ListMultipartUploadsOutputOps[Self <: ListMultipartUploadsOutput] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setUploadsListVarargs(value: UploadListElement*): Self = this.set("UploadsList", js.Array(value :_*))
    
    @scala.inline
    def setUploadsList(value: UploadsList): Self = this.set("UploadsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadsList: Self = this.set("UploadsList", js.undefined)
  }
}
