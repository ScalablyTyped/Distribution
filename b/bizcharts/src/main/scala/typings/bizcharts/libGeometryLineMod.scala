package typings.bizcharts

import typings.bizcharts.libInterfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryLineMod {
  
  @JSImport("bizcharts/lib/geometry/Line", JSImport.Default)
  @js.native
  open class default () extends LineGeom
  
  type ILineGemoProps = IBaseGemoProps
  
  @js.native
  trait LineGeom
    extends typings.bizcharts.libGeometryBaseMod.default[ILineGemoProps]
}
