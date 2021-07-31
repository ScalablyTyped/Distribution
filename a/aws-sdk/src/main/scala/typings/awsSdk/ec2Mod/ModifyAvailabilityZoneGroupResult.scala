package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyAvailabilityZoneGroupResult extends StObject {
  
  /**
    * Is true if the request succeeds, and an error otherwise.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object ModifyAvailabilityZoneGroupResult {
  
  @scala.inline
  def apply(): ModifyAvailabilityZoneGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyAvailabilityZoneGroupResult]
  }
  
  @scala.inline
  implicit class ModifyAvailabilityZoneGroupResultMutableBuilder[Self <: ModifyAvailabilityZoneGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}
