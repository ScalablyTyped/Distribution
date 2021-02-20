package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceCapacity extends StObject {
  
  /**
    * The number of instances that can be launched onto the Dedicated Host based on the host's available capacity.
    */
  var AvailableCapacity: js.UndefOr[Integer] = js.native
  
  /**
    * The instance type supported by the Dedicated Host.
    */
  var InstanceType: js.UndefOr[String] = js.native
  
  /**
    * The total number of instances that can be launched onto the Dedicated Host if there are no instances running on it.
    */
  var TotalCapacity: js.UndefOr[Integer] = js.native
}
object InstanceCapacity {
  
  @scala.inline
  def apply(): InstanceCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCapacity]
  }
  
  @scala.inline
  implicit class InstanceCapacityMutableBuilder[Self <: InstanceCapacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableCapacity(value: Integer): Self = StObject.set(x, "AvailableCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableCapacityUndefined: Self = StObject.set(x, "AvailableCapacity", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setTotalCapacity(value: Integer): Self = StObject.set(x, "TotalCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCapacityUndefined: Self = StObject.set(x, "TotalCapacity", js.undefined)
  }
}
