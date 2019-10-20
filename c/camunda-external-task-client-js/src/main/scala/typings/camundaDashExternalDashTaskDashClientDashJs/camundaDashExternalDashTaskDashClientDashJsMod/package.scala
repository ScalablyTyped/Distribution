package typings.camundaDashExternalDashTaskDashClientDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object camundaDashExternalDashTaskDashClientDashJsMod {
  import typings.camundaDashExternalDashTaskDashClientDashJs.Anon_Error

  type Handler = js.Function1[/* args */ HandlerArgs, Unit]
  type Interceptor = js.Function1[/* config */ js.Any, js.Any]
  type Logger = Middleware with Anon_Error
  type Middleware = js.Function1[/* client */ Client, Unit]
  type Value = js.Any
}
