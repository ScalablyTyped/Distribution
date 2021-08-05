package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRdsDbInstancesResult extends StObject {
  
  /**
    * An a array of RdsDbInstance objects that describe the instances.
    */
  var RdsDbInstances: js.UndefOr[typings.awsSdk.opsworksMod.RdsDbInstances] = js.undefined
}
object DescribeRdsDbInstancesResult {
  
  inline def apply(): DescribeRdsDbInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRdsDbInstancesResult]
  }
  
  extension [Self <: DescribeRdsDbInstancesResult](x: Self) {
    
    inline def setRdsDbInstances(value: RdsDbInstances): Self = StObject.set(x, "RdsDbInstances", value.asInstanceOf[js.Any])
    
    inline def setRdsDbInstancesUndefined: Self = StObject.set(x, "RdsDbInstances", js.undefined)
    
    inline def setRdsDbInstancesVarargs(value: RdsDbInstance*): Self = StObject.set(x, "RdsDbInstances", js.Array(value :_*))
  }
}
