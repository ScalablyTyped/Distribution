package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "throttleRequestByServer")
@js.native
object throttleRequestByServer extends js.Object {
  
  def apply(url: String, requestFunction: RequestFunction): js.Promise[_] = js.native
  
  type RequestFunction = js.Function1[/* url */ String, js.Promise[js.Any]]
}
