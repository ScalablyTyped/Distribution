package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServerEngineAttributesRequest extends StObject {
  
  /**
    * The name of the engine attribute to update. 
    */
  var AttributeName: typings.awsSdk.opsworkscmMod.AttributeName
  
  /**
    * The value to set for the attribute. 
    */
  var AttributeValue: js.UndefOr[typings.awsSdk.opsworkscmMod.AttributeValue] = js.undefined
  
  /**
    * The name of the server to update. 
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName
}
object UpdateServerEngineAttributesRequest {
  
  inline def apply(AttributeName: AttributeName, ServerName: ServerName): UpdateServerEngineAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServerEngineAttributesRequest]
  }
  
  extension [Self <: UpdateServerEngineAttributesRequest](x: Self) {
    
    inline def setAttributeName(value: AttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeValue(value: AttributeValue): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueUndefined: Self = StObject.set(x, "AttributeValue", js.undefined)
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
