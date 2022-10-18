package typings.bizcharts

import typings.bizcharts.libInterfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryHeatmapMod {
  
  @JSImport("bizcharts/lib/geometry/Heatmap", JSImport.Default)
  @js.native
  open class default () extends HeatmapGeom
  
  @js.native
  trait HeatmapGeom
    extends typings.bizcharts.libGeometryBaseMod.default[IHeatmapGemoProps]
  
  type IHeatmapGemoProps = IBaseGemoProps
}
