package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "metrics")
@js.native
object metricsNs extends js.Object {
  @js.native
  trait ClientMetrics extends js.Object {
    def onAuthenticationError(e: cassandraDashDriverLib.cassandraDashDriverMod.errorsNs.AuthenticationError): scala.Unit = js.native
    def onAuthenticationError(e: nodeLib.Error): scala.Unit = js.native
    def onClientTimeoutError(e: cassandraDashDriverLib.cassandraDashDriverMod.errorsNs.OperationTimedOutError): scala.Unit = js.native
    def onClientTimeoutRetry(e: nodeLib.Error): scala.Unit = js.native
    def onConnectionError(e: nodeLib.Error): scala.Unit = js.native
    def onIgnoreError(e: nodeLib.Error): scala.Unit = js.native
    def onOtherError(e: nodeLib.Error): scala.Unit = js.native
    def onOtherErrorRetry(e: nodeLib.Error): scala.Unit = js.native
    def onReadTimeoutError(e: cassandraDashDriverLib.cassandraDashDriverMod.errorsNs.ResponseError): scala.Unit = js.native
    def onReadTimeoutRetry(e: nodeLib.Error): scala.Unit = js.native
    def onResponse(latency: js.Array[scala.Double]): scala.Unit = js.native
    def onSpeculativeExecution(): scala.Unit = js.native
    def onSuccessfulResponse(latency: js.Array[scala.Double]): scala.Unit = js.native
    def onUnavailableError(e: cassandraDashDriverLib.cassandraDashDriverMod.errorsNs.ResponseError): scala.Unit = js.native
    def onUnavailableRetry(e: nodeLib.Error): scala.Unit = js.native
    def onWriteTimeoutError(e: cassandraDashDriverLib.cassandraDashDriverMod.errorsNs.ResponseError): scala.Unit = js.native
    def onWriteTimeoutRetry(e: nodeLib.Error): scala.Unit = js.native
  }
  
  @js.native
  trait DefaultMetricsStatic
    extends org.scalablytyped.runtime.Instantiable0[DefaultMetrics]
  
  var DefaultMetrics: DefaultMetricsStatic = js.native
  type DefaultMetrics = ClientMetrics
}

