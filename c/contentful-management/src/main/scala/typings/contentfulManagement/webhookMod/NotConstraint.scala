package typings.contentfulManagement.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotConstraint extends WebhookFilter {
  
  var not: EqualityConstraint | InConstraint | RegexpConstraint = js.native
}
object NotConstraint {
  
  @scala.inline
  def apply(not: EqualityConstraint | InConstraint | RegexpConstraint): NotConstraint = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotConstraint]
  }
  
  @scala.inline
  implicit class NotConstraintOps[Self <: NotConstraint] (val x: Self) extends AnyVal {
    
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
    def setNot(value: EqualityConstraint | InConstraint | RegexpConstraint): Self = this.set("not", value.asInstanceOf[js.Any])
  }
}
