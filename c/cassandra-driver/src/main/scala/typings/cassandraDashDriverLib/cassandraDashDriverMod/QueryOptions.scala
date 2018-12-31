package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var autoPage: js.UndefOr[scala.Boolean] = js.undefined
  var captureStackTrace: js.UndefOr[scala.Boolean] = js.undefined
  var consistency: js.UndefOr[scala.Double] = js.undefined
  var customPayload: js.UndefOr[js.Any] = js.undefined
  var executionProfile: js.UndefOr[java.lang.String | ExecutionProfile] = js.undefined
  var fetchSize: js.UndefOr[scala.Double] = js.undefined
  var hints: js.UndefOr[js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]]] = js.undefined
  var host: js.UndefOr[Host] = js.undefined
  var isIdempotent: js.UndefOr[scala.Boolean] = js.undefined
  var keyspace: js.UndefOr[java.lang.String] = js.undefined
  var logged: js.UndefOr[scala.Boolean] = js.undefined
  var pageState: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  var prepare: js.UndefOr[scala.Boolean] = js.undefined
  var readTimeout: js.UndefOr[scala.Double] = js.undefined
  var retry: js.UndefOr[cassandraDashDriverLib.cassandraDashDriverMod.policiesNs.retryNs.RetryPolicy] = js.undefined
  var retryOnTimeout: js.UndefOr[scala.Boolean] = js.undefined
  var routingIndexes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var routingKey: js.UndefOr[nodeLib.Buffer | js.Array[nodeLib.Buffer]] = js.undefined
  var routingNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var serialConsistency: js.UndefOr[scala.Double] = js.undefined
  var timestamp: js.UndefOr[scala.Double | longLib.longMod.namespaced] = js.undefined
  var traceQuery: js.UndefOr[scala.Boolean] = js.undefined
}

