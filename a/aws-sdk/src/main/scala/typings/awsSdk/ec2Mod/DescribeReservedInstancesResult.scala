package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedInstancesResult extends StObject {
  
  /**
    * A list of Reserved Instances.
    */
  var ReservedInstances: js.UndefOr[ReservedInstancesList] = js.native
}
object DescribeReservedInstancesResult {
  
  @scala.inline
  def apply(): DescribeReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesResult]
  }
  
  @scala.inline
  implicit class DescribeReservedInstancesResultMutableBuilder[Self <: DescribeReservedInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReservedInstances(value: ReservedInstancesList): Self = StObject.set(x, "ReservedInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesUndefined: Self = StObject.set(x, "ReservedInstances", js.undefined)
    
    @scala.inline
    def setReservedInstancesVarargs(value: ReservedInstances*): Self = StObject.set(x, "ReservedInstances", js.Array(value :_*))
  }
}
