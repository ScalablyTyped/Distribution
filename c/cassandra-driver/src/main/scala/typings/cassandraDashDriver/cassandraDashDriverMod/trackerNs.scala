package typings.cassandraDashDriver.cassandraDashDriverMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.Anon_Params
import typings.cassandraDashDriver.cassandraDashDriverMod.trackerNs.RequestLogger
import typings.cassandraDashDriver.cassandraDashDriverMod.trackerNs.RequestLoggerOptions
import typings.cassandraDashDriver.cassandraDashDriverMod.trackerNs.RequestLoggerStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.trackerNs.RequestTracker
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "tracker")
@js.native
object trackerNs extends js.Object {
  @js.native
  class RequestLoggerCls protected () extends RequestLogger {
    def this(options: RequestLoggerOptions) = this()
  }
  
  trait RequestLoggerOptions extends js.Object {
    var logErroredRequests: js.UndefOr[Boolean] = js.undefined
    var logNormalRequests: js.UndefOr[Boolean] = js.undefined
    var messageMaxErrorStackTraceLength: js.UndefOr[Double] = js.undefined
    var messageMaxParameterValueLength: js.UndefOr[Double] = js.undefined
    var messageMaxQueryLength: js.UndefOr[Double] = js.undefined
    var slowThreshold: js.UndefOr[Double] = js.undefined
  }
  
  @js.native
  trait RequestLoggerStatic extends Instantiable1[/* options */ RequestLoggerOptions, RequestLogger]
  
  @js.native
  trait RequestTracker extends js.Object {
    def onError(
      host: Host,
      query: String,
      parameters: js.Array[_],
      executionOptions: ExecutionOptions,
      requestLength: Double,
      err: Error,
      latency: js.Array[Double]
    ): Unit = js.native
    def onError(
      host: Host,
      query: String,
      parameters: StringDictionary[js.Any],
      executionOptions: ExecutionOptions,
      requestLength: Double,
      err: Error,
      latency: js.Array[Double]
    ): Unit = js.native
    def onError(
      host: Host,
      query: String,
      parameters: Null,
      executionOptions: ExecutionOptions,
      requestLength: Double,
      err: Error,
      latency: js.Array[Double]
    ): Unit = js.native
    def onError(
      host: Host,
      query: js.Array[Anon_Params],
      parameters: js.Array[_],
      executionOptions: ExecutionOptions,
      requestLength: Double,
      err: Error,
      latency: js.Array[Double]
    ): Unit = js.native
    def onError(
      host: Host,
      query: js.Array[Anon_Params],
      parameters: StringDictionary[js.Any],
      executionOptions: ExecutionOptions,
      requestLength: Double,
      err: Error,
      latency: js.Array[Double]
    ): Unit = js.native
    def onError(
      host: Host,
      query: js.Array[Anon_Params],
      parameters: Null,
      executionOptions: ExecutionOptions,
      requestLength: Double,
      err: Error,
      latency: js.Array[Double]
    ): Unit = js.native
    def onSuccess(
      host: Host,
      query: String,
      parameters: js.Array[_],
      executionOptions: ExecutionOptions,
      requestLength: Double,
      responseLength: Double,
      latency: js.Array[Double]
    ): Unit = js.native
    def onSuccess(
      host: Host,
      query: String,
      parameters: StringDictionary[js.Any],
      executionOptions: ExecutionOptions,
      requestLength: Double,
      responseLength: Double,
      latency: js.Array[Double]
    ): Unit = js.native
    def onSuccess(
      host: Host,
      query: String,
      parameters: Null,
      executionOptions: ExecutionOptions,
      requestLength: Double,
      responseLength: Double,
      latency: js.Array[Double]
    ): Unit = js.native
    def onSuccess(
      host: Host,
      query: js.Array[Anon_Params],
      parameters: js.Array[_],
      executionOptions: ExecutionOptions,
      requestLength: Double,
      responseLength: Double,
      latency: js.Array[Double]
    ): Unit = js.native
    def onSuccess(
      host: Host,
      query: js.Array[Anon_Params],
      parameters: StringDictionary[js.Any],
      executionOptions: ExecutionOptions,
      requestLength: Double,
      responseLength: Double,
      latency: js.Array[Double]
    ): Unit = js.native
    def onSuccess(
      host: Host,
      query: js.Array[Anon_Params],
      parameters: Null,
      executionOptions: ExecutionOptions,
      requestLength: Double,
      responseLength: Double,
      latency: js.Array[Double]
    ): Unit = js.native
    def shutdown(): Unit = js.native
  }
  
  var RequestLogger: RequestLoggerStatic = js.native
  type RequestLogger = RequestTracker
}

