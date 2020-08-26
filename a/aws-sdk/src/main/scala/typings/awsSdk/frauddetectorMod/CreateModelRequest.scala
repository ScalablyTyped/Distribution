package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateModelRequest extends js.Object {
  /**
    * The model description. 
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The name of the event type.
    */
  var eventTypeName: String = js.native
  /**
    * The model ID.
    */
  var modelId: modelIdentifier = js.native
  /**
    * The model type. 
    */
  var modelType: ModelTypeEnum = js.native
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.native
}

object CreateModelRequest {
  @scala.inline
  def apply(eventTypeName: String, modelId: modelIdentifier, modelType: ModelTypeEnum): CreateModelRequest = {
    val __obj = js.Dynamic.literal(eventTypeName = eventTypeName.asInstanceOf[js.Any], modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelRequest]
  }
  @scala.inline
  implicit class CreateModelRequestOps[Self <: CreateModelRequest] (val x: Self) extends AnyVal {
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
    def setEventTypeName(value: String): Self = this.set("eventTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelId(value: modelIdentifier): Self = this.set("modelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelType(value: ModelTypeEnum): Self = this.set("modelType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: tagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

