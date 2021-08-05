package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingParameters extends StObject {
  
  /**
    * The instance type that you want to preconfigure for your domain. For example, search.m1.small.
    */
  var DesiredInstanceType: js.UndefOr[PartitionInstanceType] = js.undefined
  
  /**
    * The number of partitions you want to preconfigure for your domain. Only valid when you select m2.2xlarge as the desired instance type.
    */
  var DesiredPartitionCount: js.UndefOr[UIntValue] = js.undefined
  
  /**
    * The number of replicas you want to preconfigure for each index partition.
    */
  var DesiredReplicationCount: js.UndefOr[UIntValue] = js.undefined
}
object ScalingParameters {
  
  inline def apply(): ScalingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingParameters]
  }
  
  extension [Self <: ScalingParameters](x: Self) {
    
    inline def setDesiredInstanceType(value: PartitionInstanceType): Self = StObject.set(x, "DesiredInstanceType", value.asInstanceOf[js.Any])
    
    inline def setDesiredInstanceTypeUndefined: Self = StObject.set(x, "DesiredInstanceType", js.undefined)
    
    inline def setDesiredPartitionCount(value: UIntValue): Self = StObject.set(x, "DesiredPartitionCount", value.asInstanceOf[js.Any])
    
    inline def setDesiredPartitionCountUndefined: Self = StObject.set(x, "DesiredPartitionCount", js.undefined)
    
    inline def setDesiredReplicationCount(value: UIntValue): Self = StObject.set(x, "DesiredReplicationCount", value.asInstanceOf[js.Any])
    
    inline def setDesiredReplicationCountUndefined: Self = StObject.set(x, "DesiredReplicationCount", js.undefined)
  }
}
