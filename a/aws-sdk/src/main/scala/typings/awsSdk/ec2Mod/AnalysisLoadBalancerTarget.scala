package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisLoadBalancerTarget extends StObject {
  
  /**
    * The IP address.
    */
  var Address: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the instance.
    */
  var Instance: js.UndefOr[AnalysisComponent] = js.undefined
  
  /**
    * The port on which the target is listening.
    */
  var Port: js.UndefOr[typings.awsSdk.ec2Mod.Port] = js.undefined
}
object AnalysisLoadBalancerTarget {
  
  inline def apply(): AnalysisLoadBalancerTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisLoadBalancerTarget]
  }
  
  extension [Self <: AnalysisLoadBalancerTarget](x: Self) {
    
    inline def setAddress(value: IpAddress): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setInstance(value: AnalysisComponent): Self = StObject.set(x, "Instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "Instance", js.undefined)
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
