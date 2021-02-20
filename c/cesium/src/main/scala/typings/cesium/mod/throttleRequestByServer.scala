package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throttleRequestByServer {
  
  @JSImport("cesium", "throttleRequestByServer")
  @js.native
  def apply(url: String, requestFunction: RequestFunction): js.Promise[_] = js.native
  
  type RequestFunction = js.Function1[/* url */ String, js.Promise[js.Any]]
}
