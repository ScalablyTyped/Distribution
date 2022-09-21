package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactFlowModuleSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the flow module.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the flow module.
    */
  var Id: js.UndefOr[ContactFlowModuleId] = js.undefined
  
  /**
    * The name of the flow module.
    */
  var Name: js.UndefOr[ContactFlowModuleName] = js.undefined
  
  /**
    * The type of flow module.
    */
  var State: js.UndefOr[ContactFlowModuleState] = js.undefined
}
object ContactFlowModuleSummary {
  
  inline def apply(): ContactFlowModuleSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFlowModuleSummary]
  }
  
  extension [Self <: ContactFlowModuleSummary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: ContactFlowModuleId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ContactFlowModuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: ContactFlowModuleState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
