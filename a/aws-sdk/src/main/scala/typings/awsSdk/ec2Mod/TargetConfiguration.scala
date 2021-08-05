package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetConfiguration extends StObject {
  
  /**
    * The number of instances the Convertible Reserved Instance offering can be applied to. This parameter is reserved and cannot be specified in a request
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the Convertible Reserved Instance offering.
    */
  var OfferingId: js.UndefOr[String] = js.undefined
}
object TargetConfiguration {
  
  inline def apply(): TargetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetConfiguration]
  }
  
  extension [Self <: TargetConfiguration](x: Self) {
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setOfferingId(value: String): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
    
    inline def setOfferingIdUndefined: Self = StObject.set(x, "OfferingId", js.undefined)
  }
}
