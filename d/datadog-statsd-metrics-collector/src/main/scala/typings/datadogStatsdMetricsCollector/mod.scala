package typings.datadogStatsdMetricsCollector

import typings.nodeDogstatsd.mod.StatsDClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("datadog-statsd-metrics-collector", JSImport.Namespace)
  @js.native
  class ^ () extends Collector {
    def this(client: StatsDClient) = this()
    def this(client: Null, delayMilliseconds: Double) = this()
    def this(client: StatsDClient, delayMilliseconds: Double) = this()
  }
  
  @js.native
  trait Collector extends StatsDClient
}
