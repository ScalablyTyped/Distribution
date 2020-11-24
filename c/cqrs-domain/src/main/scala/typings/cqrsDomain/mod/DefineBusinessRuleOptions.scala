package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// endregion
// region defineBusinessRule
@js.native
trait DefineBusinessRuleOptions extends js.Object {
  
  /**
    * optional
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * optional, default is file name without extension
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * optional, default Infinity, all business rules will be sorted by this value
    */
  var priority: js.UndefOr[Double] = js.native
}
object DefineBusinessRuleOptions {
  
  @scala.inline
  def apply(): DefineBusinessRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineBusinessRuleOptions]
  }
  
  @scala.inline
  implicit class DefineBusinessRuleOptionsOps[Self <: DefineBusinessRuleOptions] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
}
