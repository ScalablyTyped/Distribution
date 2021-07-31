package typings.awsSdkMiddlewareStack

import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def constructStack[Input /* <: js.Object */, Output /* <: js.Object */](): MiddlewareStack[Input, Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("constructStack")().asInstanceOf[MiddlewareStack[Input, Output]]
}
