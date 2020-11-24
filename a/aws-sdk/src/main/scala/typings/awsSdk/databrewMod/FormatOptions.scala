package typings.awsSdk.databrewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatOptions extends js.Object {
  
  /**
    * Options that define how Excel input is to be interpreted by DataBrew.
    */
  var Excel: js.UndefOr[ExcelOptions] = js.native
  
  /**
    * Options that define how JSON input is to be interpreted by DataBrew.
    */
  var Json: js.UndefOr[JsonOptions] = js.native
}
object FormatOptions {
  
  @scala.inline
  def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  
  @scala.inline
  implicit class FormatOptionsOps[Self <: FormatOptions] (val x: Self) extends AnyVal {
    
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
    def setExcel(value: ExcelOptions): Self = this.set("Excel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcel: Self = this.set("Excel", js.undefined)
    
    @scala.inline
    def setJson(value: JsonOptions): Self = this.set("Json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("Json", js.undefined)
  }
}
