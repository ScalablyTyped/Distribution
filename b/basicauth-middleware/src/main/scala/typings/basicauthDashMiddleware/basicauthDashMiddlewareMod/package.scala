package typings.basicauthDashMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object basicauthDashMiddlewareMod {
  import typings.std.Error

  type CheckFunction = checkFunctionSync | checkFunctionPromise | checkFunctionCallback
  type checkFunctionCallback = js.Function3[
    /* username */ String, 
    /* password */ String, 
    /* callback */ js.Function2[/* err */ Error | Null, /* authorized */ Boolean, Unit], 
    Unit
  ]
  type checkFunctionPromise = js.Function2[/* username */ String, /* password */ String, js.Thenable[Boolean]]
  type checkFunctionSync = js.Function2[/* username */ String, /* password */ String, Boolean]
}
