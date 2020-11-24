package typings.chartmogulNode.mod.Plan

import typings.chartmogulNode.commonMod.CursorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPlansParams extends CursorParams {
  
  var data_source_uuid: js.UndefOr[String] = js.native
  
  var external_id: js.UndefOr[String] = js.native
  
  var system: js.UndefOr[String] = js.native
}
object ListPlansParams {
  
  @scala.inline
  def apply(): ListPlansParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlansParams]
  }
  
  @scala.inline
  implicit class ListPlansParamsOps[Self <: ListPlansParams] (val x: Self) extends AnyVal {
    
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
    def setData_source_uuid(value: String): Self = this.set("data_source_uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData_source_uuid: Self = this.set("data_source_uuid", js.undefined)
    
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
    
    @scala.inline
    def setSystem(value: String): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
  }
}
