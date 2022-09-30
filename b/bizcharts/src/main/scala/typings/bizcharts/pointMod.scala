package typings.bizcharts

import typings.bizcharts.interfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointMod {
  
  @JSImport("bizcharts/lib/geometry/Point", JSImport.Default)
  @js.native
  open class default () extends PointGeom
  
  type IPointGemoProps = IBaseGemoProps
  
  @js.native
  trait PointGeom
    extends typings.bizcharts.geometryBaseMod.default[IPointGemoProps]
}
