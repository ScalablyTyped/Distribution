package typings.cassandraDriver.mod

import typings.cassandraDriver.libPoliciesMod.policies.retry.RetryPolicy
import typings.cassandraDriver.libTypesMod.types.Long
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptions extends StObject {
  
  var autoPage: js.UndefOr[Boolean] = js.undefined
  
  var captureStackTrace: js.UndefOr[Boolean] = js.undefined
  
  var consistency: js.UndefOr[Double] = js.undefined
  
  var counter: js.UndefOr[Boolean] = js.undefined
  
  var customPayload: js.UndefOr[Any] = js.undefined
  
  var executionProfile: js.UndefOr[String | ExecutionProfile] = js.undefined
  
  var fetchSize: js.UndefOr[Double] = js.undefined
  
  var hints: js.UndefOr[js.Array[js.Array[String] | String]] = js.undefined
  
  var host: js.UndefOr[Host] = js.undefined
  
  var isIdempotent: js.UndefOr[Boolean] = js.undefined
  
  var keyspace: js.UndefOr[String] = js.undefined
  
  var logged: js.UndefOr[Boolean] = js.undefined
  
  var pageState: js.UndefOr[Buffer | String] = js.undefined
  
  var prepare: js.UndefOr[Boolean] = js.undefined
  
  var readTimeout: js.UndefOr[Double] = js.undefined
  
  var retry: js.UndefOr[RetryPolicy] = js.undefined
  
  var routingIndexes: js.UndefOr[js.Array[Double]] = js.undefined
  
  var routingKey: js.UndefOr[Buffer | js.Array[Buffer]] = js.undefined
  
  var routingNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var serialConsistency: js.UndefOr[Double] = js.undefined
  
  var timestamp: js.UndefOr[Double | Long] = js.undefined
  
  var traceQuery: js.UndefOr[Boolean] = js.undefined
}
object QueryOptions {
  
  inline def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoPage(value: Boolean): Self = StObject.set(x, "autoPage", value.asInstanceOf[js.Any])
    
    inline def setAutoPageUndefined: Self = StObject.set(x, "autoPage", js.undefined)
    
    inline def setCaptureStackTrace(value: Boolean): Self = StObject.set(x, "captureStackTrace", value.asInstanceOf[js.Any])
    
    inline def setCaptureStackTraceUndefined: Self = StObject.set(x, "captureStackTrace", js.undefined)
    
    inline def setConsistency(value: Double): Self = StObject.set(x, "consistency", value.asInstanceOf[js.Any])
    
    inline def setConsistencyUndefined: Self = StObject.set(x, "consistency", js.undefined)
    
    inline def setCounter(value: Boolean): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setCustomPayload(value: Any): Self = StObject.set(x, "customPayload", value.asInstanceOf[js.Any])
    
    inline def setCustomPayloadUndefined: Self = StObject.set(x, "customPayload", js.undefined)
    
    inline def setExecutionProfile(value: String | ExecutionProfile): Self = StObject.set(x, "executionProfile", value.asInstanceOf[js.Any])
    
    inline def setExecutionProfileUndefined: Self = StObject.set(x, "executionProfile", js.undefined)
    
    inline def setFetchSize(value: Double): Self = StObject.set(x, "fetchSize", value.asInstanceOf[js.Any])
    
    inline def setFetchSizeUndefined: Self = StObject.set(x, "fetchSize", js.undefined)
    
    inline def setHints(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    inline def setHintsVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "hints", js.Array(value*))
    
    inline def setHost(value: Host): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setIsIdempotent(value: Boolean): Self = StObject.set(x, "isIdempotent", value.asInstanceOf[js.Any])
    
    inline def setIsIdempotentUndefined: Self = StObject.set(x, "isIdempotent", js.undefined)
    
    inline def setKeyspace(value: String): Self = StObject.set(x, "keyspace", value.asInstanceOf[js.Any])
    
    inline def setKeyspaceUndefined: Self = StObject.set(x, "keyspace", js.undefined)
    
    inline def setLogged(value: Boolean): Self = StObject.set(x, "logged", value.asInstanceOf[js.Any])
    
    inline def setLoggedUndefined: Self = StObject.set(x, "logged", js.undefined)
    
    inline def setPageState(value: Buffer | String): Self = StObject.set(x, "pageState", value.asInstanceOf[js.Any])
    
    inline def setPageStateUndefined: Self = StObject.set(x, "pageState", js.undefined)
    
    inline def setPrepare(value: Boolean): Self = StObject.set(x, "prepare", value.asInstanceOf[js.Any])
    
    inline def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
    
    inline def setReadTimeout(value: Double): Self = StObject.set(x, "readTimeout", value.asInstanceOf[js.Any])
    
    inline def setReadTimeoutUndefined: Self = StObject.set(x, "readTimeout", js.undefined)
    
    inline def setRetry(value: RetryPolicy): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setRoutingIndexes(value: js.Array[Double]): Self = StObject.set(x, "routingIndexes", value.asInstanceOf[js.Any])
    
    inline def setRoutingIndexesUndefined: Self = StObject.set(x, "routingIndexes", js.undefined)
    
    inline def setRoutingIndexesVarargs(value: Double*): Self = StObject.set(x, "routingIndexes", js.Array(value*))
    
    inline def setRoutingKey(value: Buffer | js.Array[Buffer]): Self = StObject.set(x, "routingKey", value.asInstanceOf[js.Any])
    
    inline def setRoutingKeyUndefined: Self = StObject.set(x, "routingKey", js.undefined)
    
    inline def setRoutingKeyVarargs(value: Buffer*): Self = StObject.set(x, "routingKey", js.Array(value*))
    
    inline def setRoutingNames(value: js.Array[String]): Self = StObject.set(x, "routingNames", value.asInstanceOf[js.Any])
    
    inline def setRoutingNamesUndefined: Self = StObject.set(x, "routingNames", js.undefined)
    
    inline def setRoutingNamesVarargs(value: String*): Self = StObject.set(x, "routingNames", js.Array(value*))
    
    inline def setSerialConsistency(value: Double): Self = StObject.set(x, "serialConsistency", value.asInstanceOf[js.Any])
    
    inline def setSerialConsistencyUndefined: Self = StObject.set(x, "serialConsistency", js.undefined)
    
    inline def setTimestamp(value: Double | Long): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTraceQuery(value: Boolean): Self = StObject.set(x, "traceQuery", value.asInstanceOf[js.Any])
    
    inline def setTraceQueryUndefined: Self = StObject.set(x, "traceQuery", js.undefined)
  }
}
