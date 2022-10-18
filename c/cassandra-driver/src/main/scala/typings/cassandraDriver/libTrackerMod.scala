package typings.cassandraDriver

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.anon.LogErroredRequests
import typings.cassandraDriver.anon.ParamsQuery
import typings.cassandraDriver.mod.ExecutionOptions
import typings.cassandraDriver.mod.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTrackerMod {
  
  object tracker {
    
    @JSImport("cassandra-driver/lib/tracker", "tracker.RequestLogger")
    @js.native
    open class RequestLogger protected ()
      extends StObject
         with RequestTracker {
      def this(options: LogErroredRequests) = this()
    }
    
    @js.native
    trait RequestTracker extends StObject {
      
      def onError(
        host: Host,
        query: String,
        parameters: js.Array[Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: js.Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: String,
        parameters: StringDictionary[Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: js.Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: String,
        parameters: Null,
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: js.Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: js.Array[ParamsQuery],
        parameters: js.Array[Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: js.Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: js.Array[ParamsQuery],
        parameters: StringDictionary[Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: js.Error,
        latency: js.Array[Double]
      ): Unit = js.native
      def onError(
        host: Host,
        query: js.Array[ParamsQuery],
        parameters: Null,
        executionOptions: ExecutionOptions,
        requestLength: Double,
        err: js.Error,
        latency: js.Array[Double]
      ): Unit = js.native
      
      def onSuccess(
        host: Host,
        query: String,
        parameters: js.Array[Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        responseLength: Double,
        latency: js.Array[Double]
      ): Unit = js.native
      def onSuccess(
        host: Host,
        query: String,
        parameters: StringDictionary[Any],
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
        parameters: js.Array[Any],
        executionOptions: ExecutionOptions,
        requestLength: Double,
        responseLength: Double,
        latency: js.Array[Double]
      ): Unit = js.native
      def onSuccess(
        host: Host,
        query: js.Array[ParamsQuery],
        parameters: StringDictionary[Any],
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
