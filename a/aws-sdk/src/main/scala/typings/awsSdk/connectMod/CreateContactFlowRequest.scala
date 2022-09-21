package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContactFlowRequest extends StObject {
  
  /**
    * The content of the flow. 
    */
  var Content: ContactFlowContent
  
  /**
    * The description of the flow. 
    */
  var Description: js.UndefOr[ContactFlowDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The name of the flow.
    */
  var Name: ContactFlowName
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of the flow. For descriptions of the available types, see Choose a flow type in the Amazon Connect Administrator Guide.
    */
  var Type: ContactFlowType
}
object CreateContactFlowRequest {
  
  inline def apply(Content: ContactFlowContent, InstanceId: InstanceId, Name: ContactFlowName, Type: ContactFlowType): CreateContactFlowRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactFlowRequest]
  }
  
  extension [Self <: CreateContactFlowRequest](x: Self) {
    
    inline def setContent(value: ContactFlowContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ContactFlowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ContactFlowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: ContactFlowType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
