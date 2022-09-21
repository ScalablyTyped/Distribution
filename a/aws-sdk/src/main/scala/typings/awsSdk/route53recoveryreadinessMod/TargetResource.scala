package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetResource extends StObject {
  
  /**
    * The Network Load Balancer Resource.
    */
  var NLBResource: js.UndefOr[typings.awsSdk.route53recoveryreadinessMod.NLBResource] = js.undefined
  
  /**
    * The Route 53 resource.
    */
  var R53Resource: js.UndefOr[R53ResourceRecord] = js.undefined
}
object TargetResource {
  
  inline def apply(): TargetResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetResource]
  }
  
  extension [Self <: TargetResource](x: Self) {
    
    inline def setNLBResource(value: NLBResource): Self = StObject.set(x, "NLBResource", value.asInstanceOf[js.Any])
    
    inline def setNLBResourceUndefined: Self = StObject.set(x, "NLBResource", js.undefined)
    
    inline def setR53Resource(value: R53ResourceRecord): Self = StObject.set(x, "R53Resource", value.asInstanceOf[js.Any])
    
    inline def setR53ResourceUndefined: Self = StObject.set(x, "R53Resource", js.undefined)
  }
}
