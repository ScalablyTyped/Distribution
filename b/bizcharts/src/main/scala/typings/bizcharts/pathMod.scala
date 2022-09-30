package typings.bizcharts

import typings.bizcharts.interfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("bizcharts/lib/geometry/Path", JSImport.Default)
  @js.native
  open class default () extends PathGeom
  
  type IPathGemoProps = IBaseGemoProps
  
  @js.native
  trait PathGeom
    extends typings.bizcharts.geometryBaseMod.default[IPathGemoProps]
}
