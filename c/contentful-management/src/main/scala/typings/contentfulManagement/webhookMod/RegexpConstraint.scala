package typings.contentfulManagement.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexpConstraint extends WebhookFilter {
  
  var regexp: js.Tuple2[Doc, Pattern] = js.native
}
object RegexpConstraint {
  
  @scala.inline
  def apply(regexp: js.Tuple2[Doc, Pattern]): RegexpConstraint = {
    val __obj = js.Dynamic.literal(regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexpConstraint]
  }
  
  @scala.inline
  implicit class RegexpConstraintOps[Self <: RegexpConstraint] (val x: Self) extends AnyVal {
    
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
    def setRegexp(value: js.Tuple2[Doc, Pattern]): Self = this.set("regexp", value.asInstanceOf[js.Any])
  }
}
