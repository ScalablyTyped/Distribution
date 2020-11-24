package typings.convertExcelToJson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceFile extends js.Object {
  
  var sourceFile: String = js.native
}
object SourceFile {
  
  @scala.inline
  def apply(sourceFile: String): SourceFile = {
    val __obj = js.Dynamic.literal(sourceFile = sourceFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFile]
  }
  
  @scala.inline
  implicit class SourceFileOps[Self <: SourceFile] (val x: Self) extends AnyVal {
    
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
    def setSourceFile(value: String): Self = this.set("sourceFile", value.asInstanceOf[js.Any])
  }
}
