package typings
package browserDashSyncLib.browserDashSyncMod.browserSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RewriteRules extends js.Object {
  var fn: js.UndefOr[
    js.Function3[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      /* match */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  var `match`: stdLib.RegExp
  var replace: js.UndefOr[java.lang.String] = js.undefined
}

