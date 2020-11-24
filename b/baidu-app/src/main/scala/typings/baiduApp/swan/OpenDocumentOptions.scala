package typings.baiduApp.swan

import typings.baiduApp.baiduAppStrings.doc
import typings.baiduApp.baiduAppStrings.docx
import typings.baiduApp.baiduAppStrings.pdf
import typings.baiduApp.baiduAppStrings.ppt
import typings.baiduApp.baiduAppStrings.pptx
import typings.baiduApp.baiduAppStrings.xls
import typings.baiduApp.baiduAppStrings.xlsx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenDocumentOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 文件路径，可通过 downFile 获得
    */
  var filePath: String = js.native
  
  /**
    * 文件类型，指定文件类型打开文件，有效值 doc, xls, ppt, pdf, docx, xlsx, pptx
    */
  var fileType: js.UndefOr[doc | xls | ppt | pdf | docx | xlsx | pptx] = js.native
}
object OpenDocumentOptions {
  
  @scala.inline
  def apply(filePath: String): OpenDocumentOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDocumentOptions]
  }
  
  @scala.inline
  implicit class OpenDocumentOptionsOps[Self <: OpenDocumentOptions] (val x: Self) extends AnyVal {
    
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileType(value: doc | xls | ppt | pdf | docx | xlsx | pptx): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
  }
}
