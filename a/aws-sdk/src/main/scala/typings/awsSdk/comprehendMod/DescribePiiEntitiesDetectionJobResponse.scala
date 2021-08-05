package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePiiEntitiesDetectionJobResponse extends StObject {
  
  var PiiEntitiesDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.PiiEntitiesDetectionJobProperties] = js.undefined
}
object DescribePiiEntitiesDetectionJobResponse {
  
  inline def apply(): DescribePiiEntitiesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePiiEntitiesDetectionJobResponse]
  }
  
  extension [Self <: DescribePiiEntitiesDetectionJobResponse](x: Self) {
    
    inline def setPiiEntitiesDetectionJobProperties(value: PiiEntitiesDetectionJobProperties): Self = StObject.set(x, "PiiEntitiesDetectionJobProperties", value.asInstanceOf[js.Any])
    
    inline def setPiiEntitiesDetectionJobPropertiesUndefined: Self = StObject.set(x, "PiiEntitiesDetectionJobProperties", js.undefined)
  }
}
