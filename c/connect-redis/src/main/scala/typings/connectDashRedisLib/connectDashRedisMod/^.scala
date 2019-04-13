package typings
package connectDashRedisLib.connectDashRedisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-redis", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    options: js.Function1[
      /* options */ js.UndefOr[expressDashSessionLib.expressDashSessionMod.SessionOptions], 
      expressLib.expressMod.RequestHandler
    ]
  ): RedisStore = js.native
}

