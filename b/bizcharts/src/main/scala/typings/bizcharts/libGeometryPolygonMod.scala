package typings.bizcharts

import typings.bizcharts.libInterfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryPolygonMod {
  
  @JSImport("bizcharts/lib/geometry/Polygon", JSImport.Default)
  @js.native
  open class default () extends PolygonGeom
  
  type IPolygonGemoProps = IBaseGemoProps
  
  @js.native
  trait PolygonGeom
    extends typings.bizcharts.libGeometryBaseMod.default[IPolygonGemoProps]
}
