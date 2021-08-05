package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactFlow extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact flow.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The content of the contact flow.
    */
  var Content: js.UndefOr[ContactFlowContent] = js.undefined
  
  /**
    * The description of the contact flow.
    */
  var Description: js.UndefOr[ContactFlowDescription] = js.undefined
  
  /**
    * The identifier of the contact flow.
    */
  var Id: js.UndefOr[ContactFlowId] = js.undefined
  
  /**
    * The name of the contact flow.
    */
  var Name: js.UndefOr[ContactFlowName] = js.undefined
  
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of the contact flow. For descriptions of the available types, see Choose a Contact Flow Type in the Amazon Connect Administrator Guide.
    */
  var Type: js.UndefOr[ContactFlowType] = js.undefined
}
object ContactFlow {
  
  inline def apply(): ContactFlow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFlow]
  }
  
  extension [Self <: ContactFlow](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setContent(value: ContactFlowContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setDescription(value: ContactFlowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: ContactFlowId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ContactFlowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: ContactFlowType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
