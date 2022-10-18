package typings.builderUtil

import typings.builderUtilRuntime.mod.HttpExecutor
import typings.node.httpMod.ClientRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outNodeHttpExecutorMod {
  
  @JSImport("builder-util/out/nodeHttpExecutor", "NodeHttpExecutor")
  @js.native
  open class NodeHttpExecutor () extends HttpExecutor[ClientRequest] {
    
    def createRequest(options: Any, callback: js.Function1[/* response */ Any, Unit]): ClientRequest = js.native
  }
  
  @JSImport("builder-util/out/nodeHttpExecutor", "httpExecutor")
  @js.native
  val httpExecutor: NodeHttpExecutor = js.native
}
