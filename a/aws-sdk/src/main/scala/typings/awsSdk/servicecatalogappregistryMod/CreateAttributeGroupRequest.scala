package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAttributeGroupRequest extends StObject {
  
  /**
    * A JSON string in the form of nested key-value pairs that represent the attributes in the group and describes an application and its components.
    */
  var attributes: Attributes
  
  /**
    * A unique identifier that you provide to ensure idempotency. If you retry a request that completed successfully using the same client token and the same parameters, the retry succeeds without performing any further actions. If you retry a successful request using the same client token, but one or more of the parameters are different, the retry fails.
    */
  var clientToken: ClientToken
  
  /**
    * The description of the attribute group that the user provides.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the attribute group.
    */
  var name: Name
  
  /**
    * Key-value pairs you can use to associate with the attribute group.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateAttributeGroupRequest {
  
  @scala.inline
  def apply(attributes: Attributes, clientToken: ClientToken, name: Name): CreateAttributeGroupRequest = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], clientToken = clientToken.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAttributeGroupRequest]
  }
  
  @scala.inline
  implicit class CreateAttributeGroupRequestMutableBuilder[Self <: CreateAttributeGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
