package typings.bizcharts

import typings.bizcharts.interfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object edgeMod {
  
  @JSImport("bizcharts/lib/geometry/Edge", JSImport.Default)
  @js.native
  open class default () extends EdgeGeom
  
  @js.native
  trait EdgeGeom
    extends typings.bizcharts.geometryBaseMod.default[IEdgeGemoProps]
  
  type IEdgeGemoProps = IBaseGemoProps
}
