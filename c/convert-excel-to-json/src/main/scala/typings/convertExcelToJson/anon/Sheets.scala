package typings.convertExcelToJson.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheets extends js.Object {
  
  var sheets: js.UndefOr[js.Array[String | SheetConfignamestring]] = js.native
}
object Sheets {
  
  @scala.inline
  def apply(): Sheets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheets]
  }
  
  @scala.inline
  implicit class SheetsOps[Self <: Sheets] (val x: Self) extends AnyVal {
    
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
    def setSheetsVarargs(value: (String | SheetConfignamestring)*): Self = this.set("sheets", js.Array(value :_*))
    
    @scala.inline
    def setSheets(value: js.Array[String | SheetConfignamestring]): Self = this.set("sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheets: Self = this.set("sheets", js.undefined)
  }
}
