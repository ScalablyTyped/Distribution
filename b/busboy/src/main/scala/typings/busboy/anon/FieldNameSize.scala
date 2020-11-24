package typings.busboy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldNameSize extends js.Object {
  
  var fieldNameSize: js.UndefOr[Double] = js.native
  
  var fieldSize: js.UndefOr[Double] = js.native
  
  var fields: js.UndefOr[Double] = js.native
  
  var fileSize: js.UndefOr[Double] = js.native
  
  var files: js.UndefOr[Double] = js.native
  
  var headerPairs: js.UndefOr[Double] = js.native
  
  var parts: js.UndefOr[Double] = js.native
}
object FieldNameSize {
  
  @scala.inline
  def apply(): FieldNameSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldNameSize]
  }
  
  @scala.inline
  implicit class FieldNameSizeOps[Self <: FieldNameSize] (val x: Self) extends AnyVal {
    
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
    def setFieldNameSize(value: Double): Self = this.set("fieldNameSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldNameSize: Self = this.set("fieldNameSize", js.undefined)
    
    @scala.inline
    def setFieldSize(value: Double): Self = this.set("fieldSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldSize: Self = this.set("fieldSize", js.undefined)
    
    @scala.inline
    def setFields(value: Double): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    
    @scala.inline
    def setFiles(value: Double): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setHeaderPairs(value: Double): Self = this.set("headerPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderPairs: Self = this.set("headerPairs", js.undefined)
    
    @scala.inline
    def setParts(value: Double): Self = this.set("parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParts: Self = this.set("parts", js.undefined)
  }
}
