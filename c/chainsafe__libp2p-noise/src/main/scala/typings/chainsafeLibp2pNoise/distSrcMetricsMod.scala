package typings.chainsafeLibp2pNoise

import typings.libp2pInterfaceMetrics.mod.Counter
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMetricsMod {
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/metrics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerMetrics(metrics: Metrics): MetricsRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("registerMetrics")(metrics.asInstanceOf[js.Any]).asInstanceOf[MetricsRegistry]
  
  type MetricsRegistry = Record[String, Counter]
}
