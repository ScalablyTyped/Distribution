package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceCountLimits extends js.Object {
  
  var MaximumInstanceCount: js.UndefOr[typings.awsSdk.esMod.MaximumInstanceCount] = js.native
  
  var MinimumInstanceCount: js.UndefOr[typings.awsSdk.esMod.MinimumInstanceCount] = js.native
}
object InstanceCountLimits {
  
  @scala.inline
  def apply(): InstanceCountLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCountLimits]
  }
  
  @scala.inline
  implicit class InstanceCountLimitsOps[Self <: InstanceCountLimits] (val x: Self) extends AnyVal {
    
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
    def setMaximumInstanceCount(value: MaximumInstanceCount): Self = this.set("MaximumInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumInstanceCount: Self = this.set("MaximumInstanceCount", js.undefined)
    
    @scala.inline
    def setMinimumInstanceCount(value: MinimumInstanceCount): Self = this.set("MinimumInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumInstanceCount: Self = this.set("MinimumInstanceCount", js.undefined)
  }
}
