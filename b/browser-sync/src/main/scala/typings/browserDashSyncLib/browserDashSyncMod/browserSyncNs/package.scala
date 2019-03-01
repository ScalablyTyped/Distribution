package typings
package browserDashSyncLib.browserDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browserSyncNs {
  type MiddlewareHandler = js.Function3[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ js.Function0[scala.Unit], 
    js.Any
  ]
  type ProxyResponseMiddleware = js.Function3[
    /* proxyRes */ nodeLib.httpMod.ServerResponse | nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* req */ nodeLib.httpMod.IncomingMessage, 
    scala.Unit
  ]
}
