package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateServerEngineAttributesRequest extends StObject {
  
  /**
    * The name of the engine attribute to update. 
    */
  var AttributeName: typings.awsSdk.opsworkscmMod.AttributeName = js.native
  
  /**
    * The value to set for the attribute. 
    */
  var AttributeValue: js.UndefOr[typings.awsSdk.opsworkscmMod.AttributeValue] = js.native
  
  /**
    * The name of the server to update. 
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName = js.native
}
object UpdateServerEngineAttributesRequest {
  
  @scala.inline
  def apply(AttributeName: AttributeName, ServerName: ServerName): UpdateServerEngineAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerEngineAttributesRequest]
  }
  
  @scala.inline
  implicit class UpdateServerEngineAttributesRequestMutableBuilder[Self <: UpdateServerEngineAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: AttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValue(value: AttributeValue): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValueUndefined: Self = StObject.set(x, "AttributeValue", js.undefined)
    
    @scala.inline
    def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
