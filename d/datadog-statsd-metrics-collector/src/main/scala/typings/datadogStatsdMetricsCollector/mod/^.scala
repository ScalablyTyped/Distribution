package typings.datadogStatsdMetricsCollector.mod

import typings.nodeDogstatsd.mod.StatsDClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("datadog-statsd-metrics-collector", JSImport.Namespace)
@js.native
class ^ () extends Collector {
  def this(client: StatsDClient) = this()
  def this(client: Null, delayMilliseconds: Double) = this()
  def this(client: StatsDClient, delayMilliseconds: Double) = this()
}

