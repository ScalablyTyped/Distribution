package typings.cassandraDashDriver.cassandraDashDriverMod

import org.scalablytyped.runtime.Instantiable0
import typings.cassandraDashDriver.cassandraDashDriverMod.errorsNs.AuthenticationError
import typings.cassandraDashDriver.cassandraDashDriverMod.errorsNs.OperationTimedOutError
import typings.cassandraDashDriver.cassandraDashDriverMod.errorsNs.ResponseError
import typings.cassandraDashDriver.cassandraDashDriverMod.metricsNs.ClientMetrics
import typings.cassandraDashDriver.cassandraDashDriverMod.metricsNs.DefaultMetrics
import typings.cassandraDashDriver.cassandraDashDriverMod.metricsNs.DefaultMetricsStatic
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "metrics")
@js.native
object metricsNs extends js.Object {
  @js.native
  trait ClientMetrics extends js.Object {
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
  
  @js.native
  class DefaultMetricsCls () extends DefaultMetrics
  
  @js.native
  trait DefaultMetricsStatic extends Instantiable0[DefaultMetrics]
  
  var DefaultMetrics: DefaultMetricsStatic = js.native
  type DefaultMetrics = ClientMetrics
}

