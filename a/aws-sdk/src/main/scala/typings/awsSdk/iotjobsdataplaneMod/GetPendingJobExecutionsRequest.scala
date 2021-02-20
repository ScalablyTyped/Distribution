package typings.awsSdk.iotjobsdataplaneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPendingJobExecutionsRequest extends StObject {
  
  /**
    * The name of the thing that is executing the job.
    */
  var thingName: ThingName = js.native
}
object GetPendingJobExecutionsRequest {
  
  @scala.inline
  def apply(thingName: ThingName): GetPendingJobExecutionsRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPendingJobExecutionsRequest]
  }
  
  @scala.inline
  implicit class GetPendingJobExecutionsRequestMutableBuilder[Self <: GetPendingJobExecutionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
