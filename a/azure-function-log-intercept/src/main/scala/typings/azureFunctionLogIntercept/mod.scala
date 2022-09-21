package typings.azureFunctionLogIntercept

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * `console.log` doesn't actually log as you would expect in `node.js` Azure Functions.
    * You are expected to use `context.log` and` context` is not a global object, it's a parameter to your Azure Function
    * so you would have to pass this throughout your modules/functions to get logging like you would expect.
    * This package fixes this with minimal friction, 0 dependencies, and allows you
    * to use `console.log` (and other `console` methods) like normal.
    */
  inline def apply(
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].apply(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("azure-function-log-intercept", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
