package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceCountLimits extends StObject {
  
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
  implicit class InstanceCountLimitsMutableBuilder[Self <: InstanceCountLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumInstanceCount(value: MaximumInstanceCount): Self = StObject.set(x, "MaximumInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumInstanceCountUndefined: Self = StObject.set(x, "MaximumInstanceCount", js.undefined)
    
    @scala.inline
    def setMinimumInstanceCount(value: MinimumInstanceCount): Self = StObject.set(x, "MinimumInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumInstanceCountUndefined: Self = StObject.set(x, "MinimumInstanceCount", js.undefined)
  }
}
