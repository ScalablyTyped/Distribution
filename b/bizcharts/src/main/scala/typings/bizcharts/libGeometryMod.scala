package typings.bizcharts

import typings.bizcharts.bizchartsStrings.`line-advance`
import typings.bizcharts.bizchartsStrings.area
import typings.bizcharts.bizchartsStrings.edge
import typings.bizcharts.bizchartsStrings.heatmap
import typings.bizcharts.bizchartsStrings.interval
import typings.bizcharts.bizchartsStrings.line
import typings.bizcharts.bizchartsStrings.point
import typings.bizcharts.bizchartsStrings.polygon
import typings.bizcharts.libInterfaceMod.IBaseGemoProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryMod {
  
  @JSImport("bizcharts/lib/geometry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: IGemo): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait IGemo
    extends StObject
       with IBaseGemoProps {
    
    /** 几何标记类型 */
    var `type`: area | edge | heatmap | interval | line | point | polygon | `line-advance`
  }
  object IGemo {
    
    inline def apply(
      position: String,
      `type`: area | edge | heatmap | interval | line | point | polygon | `line-advance`
    ): IGemo = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGemo]
    }
    
    extension [Self <: IGemo](x: Self) {
      
      inline def setType(value: area | edge | heatmap | interval | line | point | polygon | `line-advance`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
