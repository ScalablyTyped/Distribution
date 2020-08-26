package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventPredictionRequest extends js.Object {
  /**
    * The detector ID.
    */
  var detectorId: String = js.native
  /**
    * The detector version ID.
    */
  var detectorVersionId: js.UndefOr[wholeNumberVersionString] = js.native
  /**
    * The entity type (associated with the detector's event type) and specific entity ID representing who performed the event. If an entity id is not available, use "UNKNOWN."
    */
  var entities: listOfEntities = js.native
  /**
    * The unique ID used to identify the event.
    */
  var eventId: String = js.native
  /**
    * Timestamp that defines when the event under evaluation occurred.
    */
  var eventTimestamp: String = js.native
  /**
    * The event type associated with the detector specified for the prediction.
    */
  var eventTypeName: String = js.native
  /**
    * Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and their corresponding values for the event you are sending for evaluation.
    */
  var eventVariables: EventVariableMap = js.native
  /**
    * The Amazon SageMaker model endpoint input data blobs.
    */
  var externalModelEndpointDataBlobs: js.UndefOr[ExternalModelEndpointDataBlobMap] = js.native
}

object GetEventPredictionRequest {
  @scala.inline
  def apply(
    detectorId: String,
    entities: listOfEntities,
    eventId: String,
    eventTimestamp: String,
    eventTypeName: String,
    eventVariables: EventVariableMap
  ): GetEventPredictionRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], eventTimestamp = eventTimestamp.asInstanceOf[js.Any], eventTypeName = eventTypeName.asInstanceOf[js.Any], eventVariables = eventVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventPredictionRequest]
  }
  @scala.inline
  implicit class GetEventPredictionRequestOps[Self <: GetEventPredictionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetectorId(value: String): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: listOfEntities): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventId(value: String): Self = this.set("eventId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventTimestamp(value: String): Self = this.set("eventTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventTypeName(value: String): Self = this.set("eventTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventVariables(value: EventVariableMap): Self = this.set("eventVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectorVersionId(value: wholeNumberVersionString): Self = this.set("detectorVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorVersionId: Self = this.set("detectorVersionId", js.undefined)
    @scala.inline
    def setExternalModelEndpointDataBlobs(value: ExternalModelEndpointDataBlobMap): Self = this.set("externalModelEndpointDataBlobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalModelEndpointDataBlobs: Self = this.set("externalModelEndpointDataBlobs", js.undefined)
  }
  
}

