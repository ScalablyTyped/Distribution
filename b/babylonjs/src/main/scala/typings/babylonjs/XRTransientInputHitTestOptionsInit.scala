package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRTransientInputHitTestOptionsInit extends js.Object {
  
  var entityTypes: js.UndefOr[js.Array[XRHitTestTrackableType]] = js.native
  
  var offsetRay: js.UndefOr[XRRay] = js.native
  
  var profile: String = js.native
}
object XRTransientInputHitTestOptionsInit {
  
  @scala.inline
  def apply(profile: String): XRTransientInputHitTestOptionsInit = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRTransientInputHitTestOptionsInit]
  }
  
  @scala.inline
  implicit class XRTransientInputHitTestOptionsInitOps[Self <: XRTransientInputHitTestOptionsInit] (val x: Self) extends AnyVal {
    
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
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesVarargs(value: XRHitTestTrackableType*): Self = this.set("entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setEntityTypes(value: js.Array[XRHitTestTrackableType]): Self = this.set("entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityTypes: Self = this.set("entityTypes", js.undefined)
    
    @scala.inline
    def setOffsetRay(value: XRRay): Self = this.set("offsetRay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetRay: Self = this.set("offsetRay", js.undefined)
  }
}
