package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceLimits extends StObject {
  
  var InstanceCountLimits: js.UndefOr[typings.awsSdk.esMod.InstanceCountLimits] = js.native
}
object InstanceLimits {
  
  @scala.inline
  def apply(): InstanceLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceLimits]
  }
  
  @scala.inline
  implicit class InstanceLimitsMutableBuilder[Self <: InstanceLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceCountLimits(value: InstanceCountLimits): Self = StObject.set(x, "InstanceCountLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountLimitsUndefined: Self = StObject.set(x, "InstanceCountLimits", js.undefined)
  }
}
