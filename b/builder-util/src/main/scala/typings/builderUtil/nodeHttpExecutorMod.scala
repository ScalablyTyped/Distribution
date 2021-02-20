package typings.builderUtil

import typings.builderUtilRuntime.mod.HttpExecutor
import typings.node.httpMod.ClientRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHttpExecutorMod {
  
  @JSImport("builder-util/out/nodeHttpExecutor", "NodeHttpExecutor")
  @js.native
  class NodeHttpExecutor () extends HttpExecutor[ClientRequest]
  
  @JSImport("builder-util/out/nodeHttpExecutor", "httpExecutor")
  @js.native
  val httpExecutor: NodeHttpExecutor = js.native
}
