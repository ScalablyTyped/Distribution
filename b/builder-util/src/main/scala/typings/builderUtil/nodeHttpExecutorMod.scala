package typings.builderUtil

import typings.builderUtilRuntime.mod.HttpExecutor
import typings.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("builder-util/out/nodeHttpExecutor", JSImport.Namespace)
@js.native
object nodeHttpExecutorMod extends js.Object {
  
  val httpExecutor: NodeHttpExecutor = js.native
  
  @js.native
  class NodeHttpExecutor () extends HttpExecutor[ClientRequest]
}
