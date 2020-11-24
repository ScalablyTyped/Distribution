package typings.contentfulManagement.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InConstraint extends WebhookFilter {
  
  var in: js.Tuple2[Doc, Array[String]] = js.native
}
object InConstraint {
  
  @scala.inline
  def apply(in: js.Tuple2[Doc, Array[String]]): InConstraint = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[InConstraint]
  }
  
  @scala.inline
  implicit class InConstraintOps[Self <: InConstraint] (val x: Self) extends AnyVal {
    
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
    def setIn(value: js.Tuple2[Doc, Array[String]]): Self = this.set("in", value.asInstanceOf[js.Any])
  }
}
