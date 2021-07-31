package typings.chartmogulNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ping {
  
  @JSImport("chartmogul-node", "Ping")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ping(config: Config): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("ping")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
