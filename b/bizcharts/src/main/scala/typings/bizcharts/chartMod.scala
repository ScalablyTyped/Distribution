package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.anon.Filter
import typings.bizcharts.interfaceMod.IChartProps
import typings.juggleResizeObserver.mod.ResizeObserver
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/components/Chart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[IChartProps, String | Double]) & RefAttributes[Any]] = js.native
  
  @JSImport("bizcharts/lib/components/Chart", "Chart")
  @js.native
  open class Chart protected ()
    extends Component[IChartProps, js.Object, Any] {
    def this(props: Any) = this()
    
    /* private */ var chartHelper: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MChart(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MChart(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MChart(): Unit = js.native
    
    def getG2Instance(): typings.antvG2.chartChartMod.default = js.native
    
    var isError: Boolean = js.native
    
    val isRootView: /* true */ Boolean = js.native
    
    /* private */ var resize: Any = js.native
    
    /* protected */ var resizeObserver: ResizeObserver = js.native
  }
  /* static members */
  object Chart {
    
    @JSImport("bizcharts/lib/components/Chart", "Chart")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bizcharts/lib/components/Chart", "Chart.defaultProps")
    @js.native
    def defaultProps: Filter = js.native
    inline def defaultProps_=(x: Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type _To = ForwardRefExoticComponent[(Pick[IChartProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `chartMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[IChartProps, String | Double]) & RefAttributes[Any]] = default
}
