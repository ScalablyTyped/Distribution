package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContactFlowRequest extends js.Object {
  
  /**
    * The content of the contact flow. 
    */
  var Content: ContactFlowContent = js.native
  
  /**
    * The description of the contact flow. 
    */
  var Description: js.UndefOr[ContactFlowDescription] = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The name of the contact flow.
    */
  var Name: ContactFlowName = js.native
  
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The type of the contact flow. For descriptions of the available types, see Choose a Contact Flow Type in the Amazon Connect Administrator Guide.
    */
  var Type: ContactFlowType = js.native
}
object CreateContactFlowRequest {
  
  @scala.inline
  def apply(Content: ContactFlowContent, InstanceId: InstanceId, Name: ContactFlowName, Type: ContactFlowType): CreateContactFlowRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactFlowRequest]
  }
  
  @scala.inline
  implicit class CreateContactFlowRequestOps[Self <: CreateContactFlowRequest] (val x: Self) extends AnyVal {
    
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
    def setContent(value: ContactFlowContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ContactFlowName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ContactFlowType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ContactFlowDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
