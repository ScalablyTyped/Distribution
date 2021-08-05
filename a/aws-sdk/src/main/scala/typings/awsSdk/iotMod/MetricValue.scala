package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricValue extends StObject {
  
  /**
    * If the comparisonOperator calls for a set of CIDRs, use this to specify that set to be compared with the metric.
    */
  var cidrs: js.UndefOr[Cidrs] = js.undefined
  
  /**
    * If the comparisonOperator calls for a numeric value, use this to specify that numeric value to be compared with the metric.
    */
  var count: js.UndefOr[UnsignedLong] = js.undefined
  
  /**
    * If the comparisonOperator calls for a set of ports, use this to specify that set to be compared with the metric.
    */
  var ports: js.UndefOr[Ports] = js.undefined
}
object MetricValue {
  
  inline def apply(): MetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricValue]
  }
  
  extension [Self <: MetricValue](x: Self) {
    
    inline def setCidrs(value: Cidrs): Self = StObject.set(x, "cidrs", value.asInstanceOf[js.Any])
    
    inline def setCidrsUndefined: Self = StObject.set(x, "cidrs", js.undefined)
    
    inline def setCidrsVarargs(value: Cidr*): Self = StObject.set(x, "cidrs", js.Array(value :_*))
    
    inline def setCount(value: UnsignedLong): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setPorts(value: Ports): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: Port*): Self = StObject.set(x, "ports", js.Array(value :_*))
  }
}
