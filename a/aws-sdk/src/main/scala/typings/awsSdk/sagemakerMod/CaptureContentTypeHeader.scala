package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptureContentTypeHeader extends js.Object {
  
  /**
    * 
    */
  var CsvContentTypes: js.UndefOr[typings.awsSdk.sagemakerMod.CsvContentTypes] = js.native
  
  /**
    * 
    */
  var JsonContentTypes: js.UndefOr[typings.awsSdk.sagemakerMod.JsonContentTypes] = js.native
}
object CaptureContentTypeHeader {
  
  @scala.inline
  def apply(): CaptureContentTypeHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureContentTypeHeader]
  }
  
  @scala.inline
  implicit class CaptureContentTypeHeaderOps[Self <: CaptureContentTypeHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCsvContentTypesVarargs(value: CsvContentType*): Self = this.set("CsvContentTypes", js.Array(value :_*))
    
    @scala.inline
    def setCsvContentTypes(value: CsvContentTypes): Self = this.set("CsvContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvContentTypes: Self = this.set("CsvContentTypes", js.undefined)
    
    @scala.inline
    def setJsonContentTypesVarargs(value: JsonContentType*): Self = this.set("JsonContentTypes", js.Array(value :_*))
    
    @scala.inline
    def setJsonContentTypes(value: JsonContentTypes): Self = this.set("JsonContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonContentTypes: Self = this.set("JsonContentTypes", js.undefined)
  }
}
