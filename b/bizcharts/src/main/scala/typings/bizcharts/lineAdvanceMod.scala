package typings.bizcharts

import typings.bizcharts.areaMod.IAreaGemoProps
import typings.bizcharts.interfaceMod.IBaseGemoProps
import typings.bizcharts.pointMod.IPointGemoProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineAdvanceMod {
  
  @JSImport("bizcharts/lib/geometry/LineAdvance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ILineAdvanceGemoProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ILineAdvanceGemoProps
    extends StObject
       with IBaseGemoProps {
    
    var area: js.UndefOr[Boolean | IAreaGemoProps] = js.undefined
    
    var point: js.UndefOr[Boolean | IPointGemoProps] = js.undefined
  }
  object ILineAdvanceGemoProps {
    
    inline def apply(position: String): ILineAdvanceGemoProps = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILineAdvanceGemoProps]
    }
    
    extension [Self <: ILineAdvanceGemoProps](x: Self) {
      
      inline def setArea(value: Boolean | IAreaGemoProps): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setPoint(value: Boolean | IPointGemoProps): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    }
  }
}
