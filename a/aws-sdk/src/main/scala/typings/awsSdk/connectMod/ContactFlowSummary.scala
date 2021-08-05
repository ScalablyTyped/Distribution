package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactFlowSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact flow.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The type of contact flow.
    */
  var ContactFlowType: js.UndefOr[typings.awsSdk.connectMod.ContactFlowType] = js.undefined
  
  /**
    * The identifier of the contact flow.
    */
  var Id: js.UndefOr[ContactFlowId] = js.undefined
  
  /**
    * The name of the contact flow.
    */
  var Name: js.UndefOr[ContactFlowName] = js.undefined
}
object ContactFlowSummary {
  
  inline def apply(): ContactFlowSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFlowSummary]
  }
  
  extension [Self <: ContactFlowSummary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setContactFlowType(value: ContactFlowType): Self = StObject.set(x, "ContactFlowType", value.asInstanceOf[js.Any])
    
    inline def setContactFlowTypeUndefined: Self = StObject.set(x, "ContactFlowType", js.undefined)
    
    inline def setId(value: ContactFlowId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ContactFlowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
