package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEntitiesDetectionJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with an entities detection job.
    */
  var EntitiesDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.EntitiesDetectionJobProperties] = js.native
}
object DescribeEntitiesDetectionJobResponse {
  
  @scala.inline
  def apply(): DescribeEntitiesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEntitiesDetectionJobResponse]
  }
  
  @scala.inline
  implicit class DescribeEntitiesDetectionJobResponseMutableBuilder[Self <: DescribeEntitiesDetectionJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntitiesDetectionJobProperties(value: EntitiesDetectionJobProperties): Self = StObject.set(x, "EntitiesDetectionJobProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesDetectionJobPropertiesUndefined: Self = StObject.set(x, "EntitiesDetectionJobProperties", js.undefined)
  }
}
