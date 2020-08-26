package typings.cassandraDriver.mod

import typings.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.typesMod.types.Long
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions extends js.Object {
  var autoPage: js.UndefOr[Boolean] = js.native
  var captureStackTrace: js.UndefOr[Boolean] = js.native
  var consistency: js.UndefOr[Double] = js.native
  var counter: js.UndefOr[Boolean] = js.native
  var customPayload: js.UndefOr[js.Any] = js.native
  var executionProfile: js.UndefOr[String | ExecutionProfile] = js.native
  var fetchSize: js.UndefOr[Double] = js.native
  var hints: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
  var host: js.UndefOr[Host] = js.native
  var isIdempotent: js.UndefOr[Boolean] = js.native
  var keyspace: js.UndefOr[String] = js.native
  var logged: js.UndefOr[Boolean] = js.native
  var pageState: js.UndefOr[Buffer | String] = js.native
  var prepare: js.UndefOr[Boolean] = js.native
  var readTimeout: js.UndefOr[Double] = js.native
  var retry: js.UndefOr[RetryPolicy] = js.native
  var routingIndexes: js.UndefOr[js.Array[Double]] = js.native
  var routingKey: js.UndefOr[Buffer | js.Array[Buffer]] = js.native
  var routingNames: js.UndefOr[js.Array[String]] = js.native
  var serialConsistency: js.UndefOr[Double] = js.native
  var timestamp: js.UndefOr[Double | Long] = js.native
  var traceQuery: js.UndefOr[Boolean] = js.native
}

object QueryOptions {
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoPage(value: Boolean): Self = this.set("autoPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPage: Self = this.set("autoPage", js.undefined)
    @scala.inline
    def setCaptureStackTrace(value: Boolean): Self = this.set("captureStackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureStackTrace: Self = this.set("captureStackTrace", js.undefined)
    @scala.inline
    def setConsistency(value: Double): Self = this.set("consistency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistency: Self = this.set("consistency", js.undefined)
    @scala.inline
    def setCounter(value: Boolean): Self = this.set("counter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
    @scala.inline
    def setCustomPayload(value: js.Any): Self = this.set("customPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomPayload: Self = this.set("customPayload", js.undefined)
    @scala.inline
    def setExecutionProfile(value: String | ExecutionProfile): Self = this.set("executionProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionProfile: Self = this.set("executionProfile", js.undefined)
    @scala.inline
    def setFetchSize(value: Double): Self = this.set("fetchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchSize: Self = this.set("fetchSize", js.undefined)
    @scala.inline
    def setHintsVarargs(value: (js.Array[String] | String)*): Self = this.set("hints", js.Array(value :_*))
    @scala.inline
    def setHints(value: js.Array[js.Array[String] | String]): Self = this.set("hints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHints: Self = this.set("hints", js.undefined)
    @scala.inline
    def setHost(value: Host): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setIsIdempotent(value: Boolean): Self = this.set("isIdempotent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsIdempotent: Self = this.set("isIdempotent", js.undefined)
    @scala.inline
    def setKeyspace(value: String): Self = this.set("keyspace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyspace: Self = this.set("keyspace", js.undefined)
    @scala.inline
    def setLogged(value: Boolean): Self = this.set("logged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogged: Self = this.set("logged", js.undefined)
    @scala.inline
    def setPageState(value: Buffer | String): Self = this.set("pageState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageState: Self = this.set("pageState", js.undefined)
    @scala.inline
    def setPrepare(value: Boolean): Self = this.set("prepare", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepare: Self = this.set("prepare", js.undefined)
    @scala.inline
    def setReadTimeout(value: Double): Self = this.set("readTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadTimeout: Self = this.set("readTimeout", js.undefined)
    @scala.inline
    def setRetry(value: RetryPolicy): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setRoutingIndexesVarargs(value: Double*): Self = this.set("routingIndexes", js.Array(value :_*))
    @scala.inline
    def setRoutingIndexes(value: js.Array[Double]): Self = this.set("routingIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutingIndexes: Self = this.set("routingIndexes", js.undefined)
    @scala.inline
    def setRoutingKeyVarargs(value: Buffer*): Self = this.set("routingKey", js.Array(value :_*))
    @scala.inline
    def setRoutingKey(value: Buffer | js.Array[Buffer]): Self = this.set("routingKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutingKey: Self = this.set("routingKey", js.undefined)
    @scala.inline
    def setRoutingNamesVarargs(value: String*): Self = this.set("routingNames", js.Array(value :_*))
    @scala.inline
    def setRoutingNames(value: js.Array[String]): Self = this.set("routingNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutingNames: Self = this.set("routingNames", js.undefined)
    @scala.inline
    def setSerialConsistency(value: Double): Self = this.set("serialConsistency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialConsistency: Self = this.set("serialConsistency", js.undefined)
    @scala.inline
    def setTimestamp(value: Double | Long): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setTraceQuery(value: Boolean): Self = this.set("traceQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceQuery: Self = this.set("traceQuery", js.undefined)
  }
  
}

