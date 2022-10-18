package typings.bizcharts

import typings.bizcharts.libInterfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryAreaMod {
  
  @JSImport("bizcharts/lib/geometry/Area", JSImport.Default)
  @js.native
  open class default () extends AreaGeom
  
  @js.native
  trait AreaGeom
    extends typings.bizcharts.libGeometryBaseMod.default[IAreaGemoProps]
  
  type IAreaGemoProps = IBaseGemoProps
}
