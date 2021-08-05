package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2ResourceUtilization extends StObject {
  
  /**
    *  The EBS field that contains a list of EBS metrics associated with the current instance. 
    */
  var EBSResourceUtilization: js.UndefOr[typings.awsSdk.costexplorerMod.EBSResourceUtilization] = js.undefined
  
  /**
    *  Maximum observed or expected CPU utilization of the instance.
    */
  var MaxCpuUtilizationPercentage: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  Maximum observed or expected memory utilization of the instance.
    */
  var MaxMemoryUtilizationPercentage: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  Maximum observed or expected storage utilization of the instance (does not measure EBS storage).
    */
  var MaxStorageUtilizationPercentage: js.UndefOr[GenericString] = js.undefined
}
object EC2ResourceUtilization {
  
  inline def apply(): EC2ResourceUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2ResourceUtilization]
  }
  
  extension [Self <: EC2ResourceUtilization](x: Self) {
    
    inline def setEBSResourceUtilization(value: EBSResourceUtilization): Self = StObject.set(x, "EBSResourceUtilization", value.asInstanceOf[js.Any])
    
    inline def setEBSResourceUtilizationUndefined: Self = StObject.set(x, "EBSResourceUtilization", js.undefined)
    
    inline def setMaxCpuUtilizationPercentage(value: GenericString): Self = StObject.set(x, "MaxCpuUtilizationPercentage", value.asInstanceOf[js.Any])
    
    inline def setMaxCpuUtilizationPercentageUndefined: Self = StObject.set(x, "MaxCpuUtilizationPercentage", js.undefined)
    
    inline def setMaxMemoryUtilizationPercentage(value: GenericString): Self = StObject.set(x, "MaxMemoryUtilizationPercentage", value.asInstanceOf[js.Any])
    
    inline def setMaxMemoryUtilizationPercentageUndefined: Self = StObject.set(x, "MaxMemoryUtilizationPercentage", js.undefined)
    
    inline def setMaxStorageUtilizationPercentage(value: GenericString): Self = StObject.set(x, "MaxStorageUtilizationPercentage", value.asInstanceOf[js.Any])
    
    inline def setMaxStorageUtilizationPercentageUndefined: Self = StObject.set(x, "MaxStorageUtilizationPercentage", js.undefined)
  }
}
