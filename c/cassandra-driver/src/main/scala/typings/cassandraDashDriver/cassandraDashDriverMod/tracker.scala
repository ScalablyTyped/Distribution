package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.cassandraDashDriver.Anon_LogErroredRequests
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "tracker")
@js.native
object tracker extends js.Object {
  @js.native
  class RequestLogger protected ()
    extends typings.cassandraDashDriver.libTrackerMod.tracker.RequestLogger {
    def this(options: Anon_LogErroredRequests) = this()
  }
  
}

