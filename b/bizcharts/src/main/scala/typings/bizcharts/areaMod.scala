package typings.bizcharts

import typings.bizcharts.interfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areaMod {
  
  @JSImport("bizcharts/lib/geometry/Area", JSImport.Default)
  @js.native
  open class default () extends AreaGeom
  
  @js.native
  trait AreaGeom
    extends typings.bizcharts.geometryBaseMod.default[IAreaGemoProps]
  
  type IAreaGemoProps = IBaseGemoProps
}
