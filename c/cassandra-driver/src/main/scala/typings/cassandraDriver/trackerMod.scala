package typings.cassandraDriver

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.anon.LogErroredRequests
import typings.cassandraDriver.anon.ParamsQuery
import typings.cassandraDriver.mod.ExecutionOptions
import typings.cassandraDriver.mod.Host
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/tracker", JSImport.Namespace)
@js.native
object trackerMod extends js.Object {
  
  @js.native
  object tracker extends js.Object {
    
    @js.native
    class RequestLogger protected () extends RequestTracker {
      def this(options: LogErroredRequests) = this()
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
        query: js.Array[ParamsQuery],
        parameters: js.Array[_],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: js.Array[ParamsQuery],
        parameters: StringDictionary[js.Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: js.Array[ParamsQuery],
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
        query: js.Array[ParamsQuery],
        parameters: js.Array[_],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        responseLength: Double,
        latency: js.Array[Double]
      ): Unit = js.native
      def onSuccess(
        host: Host,
        query: js.Array[ParamsQuery],
        parameters: StringDictionary[js.Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        responseLength: Double,
        latency: js.Array[Double]
      ): Unit = js.native
      def onSuccess(
        host: Host,
        query: js.Array[ParamsQuery],
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
