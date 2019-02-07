package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "tracker")
@js.native
object trackerNs extends js.Object {
  trait RequestLoggerOptions extends js.Object {
    var logErroredRequests: js.UndefOr[scala.Boolean] = js.undefined
    var logNormalRequests: js.UndefOr[scala.Boolean] = js.undefined
    var messageMaxErrorStackTraceLength: js.UndefOr[scala.Double] = js.undefined
    var messageMaxParameterValueLength: js.UndefOr[scala.Double] = js.undefined
    var messageMaxQueryLength: js.UndefOr[scala.Double] = js.undefined
    var slowThreshold: js.UndefOr[scala.Double] = js.undefined
  }
  
  @js.native
  trait RequestLoggerStatic
    extends org.scalablytyped.runtime.Instantiable1[/* options */ RequestLoggerOptions, RequestLogger]
  
  @js.native
  trait RequestTracker extends js.Object {
    def onError(
      host: cassandraDashDriverLib.cassandraDashDriverMod.Host,
      query: java.lang.String,
      parameters: js.Array[_],
      executionOptions: cassandraDashDriverLib.cassandraDashDriverMod.ExecutionOptions,
      requestLength: scala.Double,
      err: nodeLib.Error,
      latency: js.Array[scala.Double]
    ): scala.Unit = js.native
    def onError(
      host: cassandraDashDriverLib.cassandraDashDriverMod.Host,
      query: java.lang.String,
      parameters: org.scalablytyped.runtime.StringDictionary[js.Any],
      executionOptions: cassandraDashDriverLib.cassandraDashDriverMod.ExecutionOptions,
      requestLength: scala.Double,
      err: nodeLib.Error,
      latency: js.Array[scala.Double]
    ): scala.Unit = js.native
    def onError(
      host: cassandraDashDriverLib.cassandraDashDriverMod.Host,
      query: java.lang.String,
      parameters: scala.Null,
      executionOptions: cassandraDashDriverLib.cassandraDashDriverMod.ExecutionOptions,
      requestLength: scala.Double,
      err: nodeLib.Error,
      latency: js.Array[scala.Double]
    ): scala.Unit = js.native
    def onError(
      host: cassandraDashDriverLib.cassandraDashDriverMod.Host,
      query: js.Array[cassandraDashDriverLib.Anon_Params],
      parameters: js.Array[_],
      executionOptions: cassandraDashDriverLib.cassandraDashDriverMod.ExecutionOptions,
      requestLength: scala.Double,
      err: nodeLib.Error,
      latency: js.Array[scala.Double]
    ): scala.Unit = js.native
    def onError(
      host: cassandraDashDriverLib.cassandraDashDriverMod.Host,
      query: js.Array[cassandraDashDriverLib.Anon_Params],
      parameters: org.scalablytyped.runtime.StringDictionary[js.Any],
      executionOptions: cassandraDashDriverLib.cassandraDashDriverMod.ExecutionOptions,
      requestLength: scala.Double,
      err: nodeLib.Error,
      latency: js.Array[scala.Double]
    ): scala.Unit = js.native
    def onError(
      host: cassandraDashDriverLib.cassandraDashDriverMod.Host,
      query: js.Array[cassandraDashDriverLib.Anon_Params],
      parameters: scala.Null,
      executionOptions: cassandraDashDriverLib.cassandraDashDriverMod.ExecutionOptions,
      requestLength: scala.Double,
      err: nodeLib.Error,
      latency: js.Array[scala.Double]
    ): scala.Unit = js.native
    def onSuccess(
      host: cassandraDashDriverLib.cassandraDashDriverMod.Host,
      query: java.lang.String,
      parameters: js.Array[_],
      executionOptions: cassandraDashDriverLib.cassandraDashDriverMod.ExecutionOptions,
      requestLength: scala.Double,
      responseLength: scala.Double,
      latency: js.Array[scala.Double]
    ): scala.Unit = js.native
    def onSuccess(
      host: cassandraDashDriverLib.cassandraDashDriverMod.Host,
      query: java.lang.String,
      parameters: org.scalablytyped.runtime.StringDictionary[js.Any],
      executionOptions: cassandraDashDriverLib.cassandraDashDriverMod.ExecutionOptions,
      requestLength: scala.Double,
      responseLength: scala.Double,
      latency: js.Array[scala.Double]
    ): scala.Unit = js.native
    def onSuccess(
      host: cassandraDashDriverLib.cassandraDashDriverMod.Host,
      query: java.lang.String,
      parameters: scala.Null,
      executionOptions: cassandraDashDriverLib.cassandraDashDriverMod.ExecutionOptions,
      requestLength: scala.Double,
      responseLength: scala.Double,
      latency: js.Array[scala.Double]
    ): scala.Unit = js.native
    def onSuccess(
      host: cassandraDashDriverLib.cassandraDashDriverMod.Host,
      query: js.Array[cassandraDashDriverLib.Anon_Params],
      parameters: js.Array[_],
      executionOptions: cassandraDashDriverLib.cassandraDashDriverMod.ExecutionOptions,
      requestLength: scala.Double,
      responseLength: scala.Double,
      latency: js.Array[scala.Double]
    ): scala.Unit = js.native
    def onSuccess(
      host: cassandraDashDriverLib.cassandraDashDriverMod.Host,
      query: js.Array[cassandraDashDriverLib.Anon_Params],
      parameters: org.scalablytyped.runtime.StringDictionary[js.Any],
      executionOptions: cassandraDashDriverLib.cassandraDashDriverMod.ExecutionOptions,
      requestLength: scala.Double,
      responseLength: scala.Double,
      latency: js.Array[scala.Double]
    ): scala.Unit = js.native
    def onSuccess(
      host: cassandraDashDriverLib.cassandraDashDriverMod.Host,
      query: js.Array[cassandraDashDriverLib.Anon_Params],
      parameters: scala.Null,
      executionOptions: cassandraDashDriverLib.cassandraDashDriverMod.ExecutionOptions,
      requestLength: scala.Double,
      responseLength: scala.Double,
      latency: js.Array[scala.Double]
    ): scala.Unit = js.native
    def shutdown(): scala.Unit = js.native
  }
  
  var RequestLogger: RequestLoggerStatic = js.native
  type RequestLogger = RequestTracker
}

