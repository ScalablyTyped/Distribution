package typings.bizcharts

import typings.antvG2.libInterfaceMod.CoordinateActions
import typings.antvG2.libInterfaceMod.CoordinateCfg
import typings.bizcharts.bizchartsStrings.cartesian
import typings.bizcharts.bizchartsStrings.helix
import typings.bizcharts.bizchartsStrings.polar
import typings.bizcharts.bizchartsStrings.rect
import typings.bizcharts.bizchartsStrings.theta
import typings.bizcharts.bizchartsStrings.x
import typings.bizcharts.bizchartsStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCoordinateMod {
  
  @JSImport("bizcharts/lib/components/Coordinate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ICoordinateProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait ICoordinateProps
    extends StObject
       with CoordinateCfg {
    
    /**
      * 坐标系变换动作串行操作:
      * 1. rotate 表示旋转，使用弧度制。
      * 2. scale 表示沿着 x 和 y 方向的缩放比率。
      * 3. reflect 表示沿 x 方向镜像或者沿 y 轴方向映射。
      * 4. transpose 表示 x，y 轴置换。
      */
    var actions: js.UndefOr[js.Array[CoordinateActions]] = js.undefined
    
    /** 坐标系配置项，目前常用于极坐标。 */
    var cfg: js.UndefOr[CoordinateCfg] = js.undefined
    
    /** 表示沿 x 方向镜像或者沿 y 轴方向映射。 */
    var reflect: js.UndefOr[x | y] = js.undefined
    
    /** 旋转，使用弧度制。 */
    var rotate: js.UndefOr[Double] = js.undefined
    
    /** 表示沿着 x 和 y 方向的缩放比率。 */
    var scale: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    /** 是否转置。 */
    var transpose: js.UndefOr[Boolean] = js.undefined
    
    /** 坐标系类型 */
    var `type`: js.UndefOr[polar | theta | rect | cartesian | helix] = js.undefined
  }
  object ICoordinateProps {
    
    inline def apply(): ICoordinateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICoordinateProps]
    }
    
    extension [Self <: ICoordinateProps](x: Self) {
      
      inline def setActions(value: js.Array[CoordinateActions]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: CoordinateActions*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setCfg(value: CoordinateCfg): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
      
      inline def setCfgUndefined: Self = StObject.set(x, "cfg", js.undefined)
      
      inline def setReflect(value: typings.bizcharts.bizchartsStrings.x | y): Self = StObject.set(x, "reflect", value.asInstanceOf[js.Any])
      
      inline def setReflectUndefined: Self = StObject.set(x, "reflect", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setScale(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setTranspose(value: Boolean): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
      
      inline def setTransposeUndefined: Self = StObject.set(x, "transpose", js.undefined)
      
      inline def setType(value: polar | theta | rect | cartesian | helix): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
