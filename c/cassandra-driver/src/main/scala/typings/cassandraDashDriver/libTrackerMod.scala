package typings.cassandraDashDriver

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.cassandraDashDriverMod.ExecutionOptions
import typings.cassandraDashDriver.cassandraDashDriverMod.Host
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/tracker", JSImport.Namespace)
@js.native
object libTrackerMod extends js.Object {
  @js.native
  object tracker extends js.Object {
    @js.native
    class RequestLogger protected () extends RequestTracker {
      def this(options: Anon_LogErroredRequests) = this()
    }
    
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
        query: js.Array[Anon_ParamsQueryAny],
        parameters: js.Array[_],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: js.Array[Anon_ParamsQueryAny],
        parameters: StringDictionary[js.Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: js.Array[Anon_ParamsQueryAny],
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
        query: js.Array[Anon_ParamsQueryAny],
        parameters: js.Array[_],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        responseLength: Double,
        latency: js.Array[Double]
      ): Unit = js.native
      def onSuccess(
        host: Host,
        query: js.Array[Anon_ParamsQueryAny],
        parameters: StringDictionary[js.Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        responseLength: Double,
        latency: js.Array[Double]
      ): Unit = js.native
      def onSuccess(
        host: Host,
        query: js.Array[Anon_ParamsQueryAny],
        parameters: Null,
        executionOptions: ExecutionOptions,
        requestLength: Double,
        responseLength: Double,
        latency: js.Array[Double]
      ): Unit = js.native
      def shutdown(): Unit = js.native
    }
    
  }
  
}

