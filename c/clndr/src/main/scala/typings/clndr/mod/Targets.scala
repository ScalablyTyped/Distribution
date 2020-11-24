package typings.clndr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Targets extends js.Object {
  
  var day: js.UndefOr[String] = js.native
  
  var empty: js.UndefOr[String] = js.native
  
  var nextButton: js.UndefOr[String] = js.native
  
  var nextYearButton: js.UndefOr[String] = js.native
  
  var previousButton: js.UndefOr[String] = js.native
  
  var previousYearButton: js.UndefOr[String] = js.native
  
  var todayButton: js.UndefOr[String] = js.native
}
object Targets {
  
  @scala.inline
  def apply(): Targets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Targets]
  }
  
  @scala.inline
  implicit class TargetsOps[Self <: Targets] (val x: Self) extends AnyVal {
    
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
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setNextButton(value: String): Self = this.set("nextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextButton: Self = this.set("nextButton", js.undefined)
    
    @scala.inline
    def setNextYearButton(value: String): Self = this.set("nextYearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextYearButton: Self = this.set("nextYearButton", js.undefined)
    
    @scala.inline
    def setPreviousButton(value: String): Self = this.set("previousButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousButton: Self = this.set("previousButton", js.undefined)
    
    @scala.inline
    def setPreviousYearButton(value: String): Self = this.set("previousYearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousYearButton: Self = this.set("previousYearButton", js.undefined)
    
    @scala.inline
    def setTodayButton(value: String): Self = this.set("todayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayButton: Self = this.set("todayButton", js.undefined)
  }
}
