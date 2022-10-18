package typings.bizcharts

import typings.bizcharts.libInterfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryPointMod {
  
  @JSImport("bizcharts/lib/geometry/Point", JSImport.Default)
  @js.native
  open class default () extends PointGeom
  
  type IPointGemoProps = IBaseGemoProps
  
  @js.native
  trait PointGeom
    extends typings.bizcharts.libGeometryBaseMod.default[IPointGemoProps]
}
