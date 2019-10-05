package typings.cesium.cesiumMod

import typings.cesium.cesiumMod.throttleRequestByServer.RequestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "throttleRequestByServer")
@js.native
object throttleRequestByServer extends js.Object {
  def apply(url: String, requestFunction: RequestFunction): js.Promise[_] = js.native
  type RequestFunction = js.Function1[/* url */ String, js.Promise[js.Any]]
}

