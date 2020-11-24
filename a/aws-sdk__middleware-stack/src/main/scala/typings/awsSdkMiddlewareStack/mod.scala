package typings.awsSdkMiddlewareStack

import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-stack", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def constructStack[Input /* <: js.Object */, Output /* <: js.Object */](): MiddlewareStack[Input, Output] = js.native
}
