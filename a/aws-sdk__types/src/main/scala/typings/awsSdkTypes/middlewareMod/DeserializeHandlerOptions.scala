package typings.awsSdkTypes.middlewareMod

import typings.awsSdkTypes.awsSdkTypesStrings.deserialize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeserializeHandlerOptions
  extends StObject
     with HandlerOptions {
  
  @JSName("step")
  var step_DeserializeHandlerOptions: deserialize
}
object DeserializeHandlerOptions {
  
  inline def apply(): DeserializeHandlerOptions = {
    val __obj = js.Dynamic.literal(step = "deserialize")
    __obj.asInstanceOf[DeserializeHandlerOptions]
  }
  
  extension [Self <: DeserializeHandlerOptions](x: Self) {
    
    inline def setStep(value: deserialize): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
