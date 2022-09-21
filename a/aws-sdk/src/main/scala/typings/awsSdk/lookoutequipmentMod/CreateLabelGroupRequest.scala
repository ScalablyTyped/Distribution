package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLabelGroupRequest extends StObject {
  
  /**
    *  A unique identifier for the request to create a label group. If you do not set the client request token, Lookout for Equipment generates one. 
    */
  var ClientToken: IdempotenceToken
  
  /**
    *  The acceptable fault codes (indicating the type of anomaly associated with the label) that can be used with this label group. Data in this field will be retained for service usage. Follow best practices for the security of your data.
    */
  var FaultCodes: js.UndefOr[typings.awsSdk.lookoutequipmentMod.FaultCodes] = js.undefined
  
  /**
    *  Names a group of labels. Data in this field will be retained for service usage. Follow best practices for the security of your data. 
    */
  var LabelGroupName: typings.awsSdk.lookoutequipmentMod.LabelGroupName
  
  /**
    *  Tags that provide metadata about the label group you are creating.  Data in this field will be retained for service usage. Follow best practices for the security of your data.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateLabelGroupRequest {
  
  inline def apply(ClientToken: IdempotenceToken, LabelGroupName: LabelGroupName): CreateLabelGroupRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], LabelGroupName = LabelGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLabelGroupRequest]
  }
  
  extension [Self <: CreateLabelGroupRequest](x: Self) {
    
    inline def setClientToken(value: IdempotenceToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setFaultCodes(value: FaultCodes): Self = StObject.set(x, "FaultCodes", value.asInstanceOf[js.Any])
    
    inline def setFaultCodesUndefined: Self = StObject.set(x, "FaultCodes", js.undefined)
    
    inline def setFaultCodesVarargs(value: FaultCode*): Self = StObject.set(x, "FaultCodes", js.Array(value*))
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
