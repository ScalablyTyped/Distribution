package typings.blueprintjsCore.portalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPortalState extends js.Object {
  
  var hasMounted: Boolean = js.native
}
object IPortalState {
  
  @scala.inline
  def apply(hasMounted: Boolean): IPortalState = {
    val __obj = js.Dynamic.literal(hasMounted = hasMounted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPortalState]
  }
  
  @scala.inline
  implicit class IPortalStateOps[Self <: IPortalState] (val x: Self) extends AnyVal {
    
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
    def setHasMounted(value: Boolean): Self = this.set("hasMounted", value.asInstanceOf[js.Any])
  }
}
