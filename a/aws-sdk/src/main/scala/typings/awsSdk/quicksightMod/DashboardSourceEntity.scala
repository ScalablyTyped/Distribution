package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardSourceEntity extends js.Object {
  
  /**
    * Source template.
    */
  var SourceTemplate: js.UndefOr[DashboardSourceTemplate] = js.native
}
object DashboardSourceEntity {
  
  @scala.inline
  def apply(): DashboardSourceEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardSourceEntity]
  }
  
  @scala.inline
  implicit class DashboardSourceEntityOps[Self <: DashboardSourceEntity] (val x: Self) extends AnyVal {
    
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
    def setSourceTemplate(value: DashboardSourceTemplate): Self = this.set("SourceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceTemplate: Self = this.set("SourceTemplate", js.undefined)
  }
}
