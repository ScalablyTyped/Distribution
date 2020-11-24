package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceLimits extends js.Object {
  
  var InstanceCountLimits: js.UndefOr[typings.awsSdk.esMod.InstanceCountLimits] = js.native
}
object InstanceLimits {
  
  @scala.inline
  def apply(): InstanceLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceLimits]
  }
  
  @scala.inline
  implicit class InstanceLimitsOps[Self <: InstanceLimits] (val x: Self) extends AnyVal {
    
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
    def setInstanceCountLimits(value: InstanceCountLimits): Self = this.set("InstanceCountLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceCountLimits: Self = this.set("InstanceCountLimits", js.undefined)
  }
}
