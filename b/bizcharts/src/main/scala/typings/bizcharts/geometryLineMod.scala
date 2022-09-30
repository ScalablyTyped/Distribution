package typings.bizcharts

import typings.bizcharts.interfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryLineMod {
  
  @JSImport("bizcharts/lib/geometry/Line", JSImport.Default)
  @js.native
  open class default () extends LineGeom
  
  type ILineGemoProps = IBaseGemoProps
  
  @js.native
  trait LineGeom
    extends typings.bizcharts.geometryBaseMod.default[ILineGemoProps]
}
