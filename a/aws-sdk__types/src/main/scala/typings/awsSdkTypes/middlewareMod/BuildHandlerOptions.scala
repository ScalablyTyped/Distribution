package typings.awsSdkTypes.middlewareMod

import typings.awsSdkTypes.awsSdkTypesStrings.build
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildHandlerOptions
  extends StObject
     with HandlerOptions {
  
  @JSName("step")
  var step_BuildHandlerOptions: build
}
object BuildHandlerOptions {
  
  inline def apply(): BuildHandlerOptions = {
    val __obj = js.Dynamic.literal(step = "build")
    __obj.asInstanceOf[BuildHandlerOptions]
  }
  
  extension [Self <: BuildHandlerOptions](x: Self) {
    
    inline def setStep(value: build): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
