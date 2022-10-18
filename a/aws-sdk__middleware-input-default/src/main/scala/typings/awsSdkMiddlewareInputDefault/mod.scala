package typings.awsSdkMiddlewareInputDefault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-input-default", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inputDefault[Input /* <: js.Object */](inputBag: InputDefaultArgs[Input]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inputDefault")(inputBag.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ field in keyof Input ]:? Input[field]}
    }}}
    */
  type InputDefaultArgs[Input /* <: js.Object */] = Input
}
