package typings.awsSdkMiddlewareEndpoint

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkMiddlewareEndpoint.awsSdkMiddlewareEndpointStrings.builtInParams
import typings.awsSdkMiddlewareEndpoint.awsSdkMiddlewareEndpointStrings.clientContextParams
import typings.awsSdkMiddlewareEndpoint.awsSdkMiddlewareEndpointStrings.contextParams
import typings.awsSdkMiddlewareEndpoint.awsSdkMiddlewareEndpointStrings.staticContextParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  trait BuiltInParamInstruction extends StObject {
    
    var name: String
    
    var `type`: builtInParams
  }
  object BuiltInParamInstruction {
    
    inline def apply(name: String): BuiltInParamInstruction = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("builtInParams")
      __obj.asInstanceOf[BuiltInParamInstruction]
    }
    
    extension [Self <: BuiltInParamInstruction](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: builtInParams): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientContextParamInstruction extends StObject {
    
    var name: String
    
    var `type`: clientContextParams
  }
  object ClientContextParamInstruction {
    
    inline def apply(name: String): ClientContextParamInstruction = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("clientContextParams")
      __obj.asInstanceOf[ClientContextParamInstruction]
    }
    
    extension [Self <: ClientContextParamInstruction](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: clientContextParams): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextParamInstruction extends StObject {
    
    var name: String
    
    var `type`: contextParams
  }
  object ContextParamInstruction {
    
    inline def apply(name: String): ContextParamInstruction = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("contextParams")
      __obj.asInstanceOf[ContextParamInstruction]
    }
    
    extension [Self <: ContextParamInstruction](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: contextParams): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type EndpointParameterInstructions = StringDictionary[
    BuiltInParamInstruction | ClientContextParamInstruction | StaticContextParamInstruction | ContextParamInstruction
  ]
  
  trait StaticContextParamInstruction extends StObject {
    
    var `type`: staticContextParams
    
    var value: String | Boolean
  }
  object StaticContextParamInstruction {
    
    inline def apply(value: String | Boolean): StaticContextParamInstruction = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("staticContextParams")
      __obj.asInstanceOf[StaticContextParamInstruction]
    }
    
    extension [Self <: StaticContextParamInstruction](x: Self) {
      
      inline def setType(value: staticContextParams): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
