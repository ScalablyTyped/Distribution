package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMissionProfileRequest extends js.Object {
  
  /**
    * Amount of time after a contact ends that you’d like to receive a CloudWatch event indicating the pass has finished.
    */
  var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  
  /**
    * Amount of time prior to contact start you’d like to receive a CloudWatch event indicating an upcoming pass.
    */
  var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.native
  
  /**
    * A list of lists of ARNs. Each list of ARNs is an edge, with a from Config and a to Config.
    */
  var dataflowEdges: DataflowEdgeList = js.native
  
  /**
    * Smallest amount of time in seconds that you’d like to see for an available contact. AWS Ground Station will not present you with contacts shorter than this duration.
    */
  var minimumViableContactDurationSeconds: DurationInSeconds = js.native
  
  /**
    * Name of a mission profile.
    */
  var name: SafeName = js.native
  
  /**
    * Tags assigned to a mission profile.
    */
  var tags: js.UndefOr[TagsMap] = js.native
  
  /**
    * ARN of a tracking Config.
    */
  var trackingConfigArn: ConfigArn = js.native
}
object CreateMissionProfileRequest {
  
  @scala.inline
  def apply(
    dataflowEdges: DataflowEdgeList,
    minimumViableContactDurationSeconds: DurationInSeconds,
    name: SafeName,
    trackingConfigArn: ConfigArn
  ): CreateMissionProfileRequest = {
    val __obj = js.Dynamic.literal(dataflowEdges = dataflowEdges.asInstanceOf[js.Any], minimumViableContactDurationSeconds = minimumViableContactDurationSeconds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], trackingConfigArn = trackingConfigArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMissionProfileRequest]
  }
  
  @scala.inline
  implicit class CreateMissionProfileRequestOps[Self <: CreateMissionProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataflowEdgesVarargs(value: DataflowEdge*): Self = this.set("dataflowEdges", js.Array(value :_*))
    
    @scala.inline
    def setDataflowEdges(value: DataflowEdgeList): Self = this.set("dataflowEdges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumViableContactDurationSeconds(value: DurationInSeconds): Self = this.set("minimumViableContactDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: SafeName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingConfigArn(value: ConfigArn): Self = this.set("trackingConfigArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactPostPassDurationSeconds(value: DurationInSeconds): Self = this.set("contactPostPassDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactPostPassDurationSeconds: Self = this.set("contactPostPassDurationSeconds", js.undefined)
    
    @scala.inline
    def setContactPrePassDurationSeconds(value: DurationInSeconds): Self = this.set("contactPrePassDurationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactPrePassDurationSeconds: Self = this.set("contactPrePassDurationSeconds", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
