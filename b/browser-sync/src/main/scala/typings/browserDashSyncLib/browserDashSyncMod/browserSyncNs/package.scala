package typings
package browserDashSyncLib.browserDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browserSyncNs {
  type LogLevel = browserDashSyncLib.browserDashSyncLibStrings.info | browserDashSyncLib.browserDashSyncLibStrings.debug | browserDashSyncLib.browserDashSyncLibStrings.warn | browserDashSyncLib.browserDashSyncLibStrings.silent
  type MiddlewareHandler = js.Function3[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ js.Function0[scala.Unit], 
    js.Any
  ]
  type OpenOptions = browserDashSyncLib.browserDashSyncLibStrings.local | browserDashSyncLib.browserDashSyncLibStrings.external | browserDashSyncLib.browserDashSyncLibStrings.ui | browserDashSyncLib.browserDashSyncLibStrings.`ui-external` | browserDashSyncLib.browserDashSyncLibStrings.tunnel
  type ProxyResponseMiddleware = js.Function3[
    /* proxyRes */ nodeLib.httpMod.ServerResponse | nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* req */ nodeLib.httpMod.IncomingMessage, 
    scala.Unit
  ]
  type WatchEvents = browserDashSyncLib.browserDashSyncLibStrings.add | browserDashSyncLib.browserDashSyncLibStrings.change | browserDashSyncLib.browserDashSyncLibStrings.unlink | browserDashSyncLib.browserDashSyncLibStrings.addDir | browserDashSyncLib.browserDashSyncLibStrings.unlinkDir
}
