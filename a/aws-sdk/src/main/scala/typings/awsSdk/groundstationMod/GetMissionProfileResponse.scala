package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMissionProfileResponse extends StObject {
  
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined
  
  /**
    * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
    */
  var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined
  
  /**
    * A list of lists of ARNs. Each list of ARNs is an edge, with a from Config and a to Config.
    */
  var dataflowEdges: js.UndefOr[DataflowEdgeList] = js.undefined
  
  /**
    * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not present you with contacts shorter than this duration.
    */
  var minimumViableContactDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined
  
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined
  
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of a mission profile.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Region of a mission profile.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Tags assigned to a mission profile.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
  
  /**
    * ARN of a tracking Config.
    */
  var trackingConfigArn: js.UndefOr[ConfigArn] = js.undefined
}
object GetMissionProfileResponse {
  
  inline def apply(): GetMissionProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMissionProfileResponse]
  }
  
  extension [Self <: GetMissionProfileResponse](x: Self) {
    
    inline def setContactPostPassDurationSeconds(value: DurationInSeconds): Self = StObject.set(x, "contactPostPassDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setContactPostPassDurationSecondsUndefined: Self = StObject.set(x, "contactPostPassDurationSeconds", js.undefined)
    
    inline def setContactPrePassDurationSeconds(value: DurationInSeconds): Self = StObject.set(x, "contactPrePassDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setContactPrePassDurationSecondsUndefined: Self = StObject.set(x, "contactPrePassDurationSeconds", js.undefined)
    
    inline def setDataflowEdges(value: DataflowEdgeList): Self = StObject.set(x, "dataflowEdges", value.asInstanceOf[js.Any])
    
    inline def setDataflowEdgesUndefined: Self = StObject.set(x, "dataflowEdges", js.undefined)
    
    inline def setDataflowEdgesVarargs(value: DataflowEdge*): Self = StObject.set(x, "dataflowEdges", js.Array(value :_*))
    
    inline def setMinimumViableContactDurationSeconds(value: DurationInSeconds): Self = StObject.set(x, "minimumViableContactDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setMinimumViableContactDurationSecondsUndefined: Self = StObject.set(x, "minimumViableContactDurationSeconds", js.undefined)
    
    inline def setMissionProfileArn(value: MissionProfileArn): Self = StObject.set(x, "missionProfileArn", value.asInstanceOf[js.Any])
    
    inline def setMissionProfileArnUndefined: Self = StObject.set(x, "missionProfileArn", js.undefined)
    
    inline def setMissionProfileId(value: String): Self = StObject.set(x, "missionProfileId", value.asInstanceOf[js.Any])
    
    inline def setMissionProfileIdUndefined: Self = StObject.set(x, "missionProfileId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTrackingConfigArn(value: ConfigArn): Self = StObject.set(x, "trackingConfigArn", value.asInstanceOf[js.Any])
    
    inline def setTrackingConfigArnUndefined: Self = StObject.set(x, "trackingConfigArn", js.undefined)
  }
}
