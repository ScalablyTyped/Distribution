package typings.awsSdkLocationConstraintMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationConstraint extends js.Object {
  
  var LocationConstraint: js.UndefOr[String] = js.native
}
object LocationConstraint {
  
  @scala.inline
  def apply(): LocationConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationConstraint]
  }
  
  @scala.inline
  implicit class LocationConstraintOps[Self <: LocationConstraint] (val x: Self) extends AnyVal {
    
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
    def setLocationConstraint(value: String): Self = this.set("LocationConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationConstraint: Self = this.set("LocationConstraint", js.undefined)
  }
}
