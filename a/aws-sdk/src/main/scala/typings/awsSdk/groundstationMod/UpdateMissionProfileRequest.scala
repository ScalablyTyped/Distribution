package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMissionProfileRequest extends StObject {
  
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  
  /**
    * A list of lists of ARNs. Each list of ARNs is an edge, with a from Config and a to Config.
    */
  var dataflowEdges: js.UndefOr[DataflowEdgeList] = js.native
  
  /**
    * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not present you with contacts shorter than this duration.
    */
  var minimumViableContactDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: String = js.native
  
  /**
    * Name of a mission profile.
    */
  var name: js.UndefOr[SafeName] = js.native
  
  /**
    * ARN of a tracking Config.
    */
  var trackingConfigArn: js.UndefOr[ConfigArn] = js.native
}
object UpdateMissionProfileRequest {
  
  @scala.inline
  def apply(missionProfileId: String): UpdateMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMissionProfileRequest]
  }
  
  @scala.inline
  implicit class UpdateMissionProfileRequestMutableBuilder[Self <: UpdateMissionProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactPostPassDurationSeconds(value: DurationInSeconds): Self = StObject.set(x, "contactPostPassDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactPostPassDurationSecondsUndefined: Self = StObject.set(x, "contactPostPassDurationSeconds", js.undefined)
    
    @scala.inline
    def setContactPrePassDurationSeconds(value: DurationInSeconds): Self = StObject.set(x, "contactPrePassDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactPrePassDurationSecondsUndefined: Self = StObject.set(x, "contactPrePassDurationSeconds", js.undefined)
    
    @scala.inline
    def setDataflowEdges(value: DataflowEdgeList): Self = StObject.set(x, "dataflowEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataflowEdgesUndefined: Self = StObject.set(x, "dataflowEdges", js.undefined)
    
    @scala.inline
    def setDataflowEdgesVarargs(value: DataflowEdge*): Self = StObject.set(x, "dataflowEdges", js.Array(value :_*))
    
    @scala.inline
    def setMinimumViableContactDurationSeconds(value: DurationInSeconds): Self = StObject.set(x, "minimumViableContactDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumViableContactDurationSecondsUndefined: Self = StObject.set(x, "minimumViableContactDurationSeconds", js.undefined)
    
    @scala.inline
    def setMissionProfileId(value: String): Self = StObject.set(x, "missionProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: SafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTrackingConfigArn(value: ConfigArn): Self = StObject.set(x, "trackingConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingConfigArnUndefined: Self = StObject.set(x, "trackingConfigArn", js.undefined)
  }
}
