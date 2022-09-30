package typings.bizcharts

import typings.bizcharts.interfaceMod.Chart
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTooltipConnectorMod {
  
  @JSImport("bizcharts/lib/connector/createTooltipConnector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Connector = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Connector]
  
  @JSImport("bizcharts/lib/connector/createTooltipConnector", "Connector")
  @js.native
  open class Connector protected () extends StObject {
    def this(`type`: Any) = this()
    
    /* protected */ var cfg: Record[String, Any] = js.native
    
    def connect(id: Any, chart: Chart): this.type = js.native
    def connect(id: Any, chart: Chart, pointFinder: js.Function): this.type = js.native
    
    def destroy(): Unit = js.native
    
    var id: String = js.native
    
    /* protected */ var `type`: String = js.native
    
    def unConnect(id: Any): Unit = js.native
  }
  
  inline def registerConnector(cid: String, tid: String, chart: Null, shared: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerConnector")(cid.asInstanceOf[js.Any], tid.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], shared.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerConnector(cid: String, tid: String, chart: Null, shared: Any, pointFinder: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerConnector")(cid.asInstanceOf[js.Any], tid.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], shared.asInstanceOf[js.Any], pointFinder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerConnector(cid: String, tid: String, chart: Chart, shared: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerConnector")(cid.asInstanceOf[js.Any], tid.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], shared.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerConnector(cid: String, tid: String, chart: Chart, shared: Any, pointFinder: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerConnector")(cid.asInstanceOf[js.Any], tid.asInstanceOf[js.Any], chart.asInstanceOf[js.Any], shared.asInstanceOf[js.Any], pointFinder.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
