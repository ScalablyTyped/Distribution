package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEntitiesDetectionJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with an entities detection job.
    */
  var EntitiesDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.EntitiesDetectionJobProperties] = js.undefined
}
object DescribeEntitiesDetectionJobResponse {
  
  inline def apply(): DescribeEntitiesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntitiesDetectionJobResponse]
  }
  
  extension [Self <: DescribeEntitiesDetectionJobResponse](x: Self) {
    
    inline def setEntitiesDetectionJobProperties(value: EntitiesDetectionJobProperties): Self = StObject.set(x, "EntitiesDetectionJobProperties", value.asInstanceOf[js.Any])
    
    inline def setEntitiesDetectionJobPropertiesUndefined: Self = StObject.set(x, "EntitiesDetectionJobProperties", js.undefined)
  }
}
