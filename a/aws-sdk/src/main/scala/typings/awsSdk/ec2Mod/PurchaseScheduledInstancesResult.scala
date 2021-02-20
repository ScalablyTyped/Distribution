package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseScheduledInstancesResult extends StObject {
  
  /**
    * Information about the Scheduled Instances.
    */
  var ScheduledInstanceSet: js.UndefOr[PurchasedScheduledInstanceSet] = js.native
}
object PurchaseScheduledInstancesResult {
  
  @scala.inline
  def apply(): PurchaseScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseScheduledInstancesResult]
  }
  
  @scala.inline
  implicit class PurchaseScheduledInstancesResultMutableBuilder[Self <: PurchaseScheduledInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduledInstanceSet(value: PurchasedScheduledInstanceSet): Self = StObject.set(x, "ScheduledInstanceSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledInstanceSetUndefined: Self = StObject.set(x, "ScheduledInstanceSet", js.undefined)
    
    @scala.inline
    def setScheduledInstanceSetVarargs(value: ScheduledInstance*): Self = StObject.set(x, "ScheduledInstanceSet", js.Array(value :_*))
  }
}
