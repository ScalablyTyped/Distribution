package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelOptions extends js.Object {
  
  /**
    * Specifies one or more sheet numbers in the Excel file, which will be included in the dataset.
    */
  var SheetIndexes: js.UndefOr[SheetIndexList] = js.native
  
  /**
    * Specifies one or more named sheets in the Excel file, which will be included in the dataset.
    */
  var SheetNames: js.UndefOr[SheetNameList] = js.native
}
object ExcelOptions {
  
  @scala.inline
  def apply(): ExcelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelOptions]
  }
  
  @scala.inline
  implicit class ExcelOptionsOps[Self <: ExcelOptions] (val x: Self) extends AnyVal {
    
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
    def setSheetIndexesVarargs(value: SheetIndex*): Self = this.set("SheetIndexes", js.Array(value :_*))
    
    @scala.inline
    def setSheetIndexes(value: SheetIndexList): Self = this.set("SheetIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetIndexes: Self = this.set("SheetIndexes", js.undefined)
    
    @scala.inline
    def setSheetNamesVarargs(value: SheetName*): Self = this.set("SheetNames", js.Array(value :_*))
    
    @scala.inline
    def setSheetNames(value: SheetNameList): Self = this.set("SheetNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetNames: Self = this.set("SheetNames", js.undefined)
  }
}
