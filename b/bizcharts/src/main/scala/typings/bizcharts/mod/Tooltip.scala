package typings.bizcharts.mod

import typings.bizcharts.tooltipMod.ITooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  inline def apply(props: ITooltip): typings.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.global.JSX.Element]
  
  @JSImport("bizcharts", "Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  object defaultProps {
    
    @JSImport("bizcharts", "Tooltip.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bizcharts", "Tooltip.defaultProps.showMarkers")
    @js.native
    def showMarkers: Boolean = js.native
    inline def showMarkers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showMarkers")(x.asInstanceOf[js.Any])
    
    @JSImport("bizcharts", "Tooltip.defaultProps.triggerOn")
    @js.native
    def triggerOn: String = js.native
    inline def triggerOn_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerOn")(x.asInstanceOf[js.Any])
  }
}
