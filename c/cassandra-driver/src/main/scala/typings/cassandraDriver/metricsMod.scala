package typings.cassandraDriver

import typings.cassandraDriver.mod.errors.AuthenticationError
import typings.cassandraDriver.mod.errors.OperationTimedOutError
import typings.cassandraDriver.mod.errors.ResponseError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricsMod {
  
  object metrics {
    
    @JSImport("cassandra-driver/lib/metrics", "metrics.DefaultMetrics")
    @js.native
    class DefaultMetrics ()
      extends StObject
         with ClientMetrics
    
    @js.native
    trait ClientMetrics extends StObject {
      
      def onAuthenticationError(e: AuthenticationError): Unit = js.native
      def onAuthenticationError(e: Error): Unit = js.native
      
      def onClientTimeoutError(e: OperationTimedOutError): Unit = js.native
      
      def onClientTimeoutRetry(e: Error): Unit = js.native
      
      def onConnectionError(e: Error): Unit = js.native
      
      def onIgnoreError(e: Error): Unit = js.native
      
      def onOtherError(e: Error): Unit = js.native
      
      def onOtherErrorRetry(e: Error): Unit = js.native
      
      def onReadTimeoutError(e: ResponseError): Unit = js.native
      
      def onReadTimeoutRetry(e: Error): Unit = js.native
      
      def onResponse(latency: js.Array[Double]): Unit = js.native
      
      def onSpeculativeExecution(): Unit = js.native
      
      def onSuccessfulResponse(latency: js.Array[Double]): Unit = js.native
      
      def onUnavailableError(e: ResponseError): Unit = js.native
      
      def onUnavailableRetry(e: Error): Unit = js.native
      
      def onWriteTimeoutError(e: ResponseError): Unit = js.native
      
      def onWriteTimeoutRetry(e: Error): Unit = js.native
    }
  }
}
