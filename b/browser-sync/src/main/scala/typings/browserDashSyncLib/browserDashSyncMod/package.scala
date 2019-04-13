package typings
package browserDashSyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browserDashSyncMod {
  type Hash[T] = org.scalablytyped.runtime.StringDictionary[T]
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
