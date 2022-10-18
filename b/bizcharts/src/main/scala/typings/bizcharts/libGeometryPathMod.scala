package typings.bizcharts

import typings.bizcharts.libInterfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryPathMod {
  
  @JSImport("bizcharts/lib/geometry/Path", JSImport.Default)
  @js.native
  open class default () extends PathGeom
  
  type IPathGemoProps = IBaseGemoProps
  
  @js.native
  trait PathGeom
    extends typings.bizcharts.libGeometryBaseMod.default[IPathGemoProps]
}
