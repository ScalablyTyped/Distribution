package typings.contentfulManagement.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EqualityConstraint extends WebhookFilter {
  
  @JSName("equals")
  var equals_FEqualityConstraint: js.Tuple2[Doc, String] = js.native
}
object EqualityConstraint {
  
  @scala.inline
  def apply(equals: js.Tuple2[Doc, String]): EqualityConstraint = {
    val __obj = js.Dynamic.literal(equals = equals.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqualityConstraint]
  }
  
  @scala.inline
  implicit class EqualityConstraintOps[Self <: EqualityConstraint] (val x: Self) extends AnyVal {
    
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
    def setEquals(value: js.Tuple2[Doc, String]): Self = this.set("equals", value.asInstanceOf[js.Any])
  }
}
