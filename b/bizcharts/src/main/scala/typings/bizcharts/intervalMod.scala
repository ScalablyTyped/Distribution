package typings.bizcharts

import typings.bizcharts.interfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intervalMod {
  
  @JSImport("bizcharts/lib/geometry/Interval", JSImport.Default)
  @js.native
  open class default () extends IntervalGeom
  
  type IIntervalGemoProps = IBaseGemoProps
  
  @js.native
  trait IntervalGeom
    extends typings.bizcharts.geometryBaseMod.default[IIntervalGemoProps]
}
