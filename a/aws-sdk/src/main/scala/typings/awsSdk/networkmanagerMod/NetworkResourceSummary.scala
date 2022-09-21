package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkResourceSummary extends StObject {
  
  /**
    * Information about the resource, in JSON format. Network Manager gets this information by describing the resource using its Describe API call.
    */
  var Definition: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * Indicates whether this is a middlebox appliance.
    */
  var IsMiddlebox: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value for the Name tag.
    */
  var NameTag: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ARN of the gateway.
    */
  var RegisteredGatewayArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ARN of the resource.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.networkmanagerMod.ResourceArn] = js.undefined
  
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[ConstrainedString] = js.undefined
}
object NetworkResourceSummary {
  
  inline def apply(): NetworkResourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkResourceSummary]
  }
  
  extension [Self <: NetworkResourceSummary](x: Self) {
    
    inline def setDefinition(value: ConstrainedString): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setIsMiddlebox(value: Boolean): Self = StObject.set(x, "IsMiddlebox", value.asInstanceOf[js.Any])
    
    inline def setIsMiddleboxUndefined: Self = StObject.set(x, "IsMiddlebox", js.undefined)
    
    inline def setNameTag(value: ConstrainedString): Self = StObject.set(x, "NameTag", value.asInstanceOf[js.Any])
    
    inline def setNameTagUndefined: Self = StObject.set(x, "NameTag", js.undefined)
    
    inline def setRegisteredGatewayArn(value: ResourceArn): Self = StObject.set(x, "RegisteredGatewayArn", value.asInstanceOf[js.Any])
    
    inline def setRegisteredGatewayArnUndefined: Self = StObject.set(x, "RegisteredGatewayArn", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceType(value: ConstrainedString): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
