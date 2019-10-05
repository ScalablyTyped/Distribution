package typings.cassandraDashDriver.cassandraDashDriverMod.concurrent

import typings.cassandraDashDriver.Anon_CollectResults
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "concurrent.ResultSetGroup")
@js.native
class ResultSetGroup protected () extends js.Object {
  def this(options: Anon_CollectResults) = this()
  var errors: js.Array[Error] = js.native
  var resultItems: js.Array[_] = js.native
  var totalExecuted: Double = js.native
}

