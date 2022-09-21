package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDetails extends StObject {
  
  /**
    * Details for the Amazon EC2 resource.
    */
  var EC2ResourceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.EC2ResourceDetails] = js.undefined
}
object ResourceDetails {
  
  inline def apply(): ResourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDetails]
  }
  
  extension [Self <: ResourceDetails](x: Self) {
    
    inline def setEC2ResourceDetails(value: EC2ResourceDetails): Self = StObject.set(x, "EC2ResourceDetails", value.asInstanceOf[js.Any])
    
    inline def setEC2ResourceDetailsUndefined: Self = StObject.set(x, "EC2ResourceDetails", js.undefined)
  }
}
