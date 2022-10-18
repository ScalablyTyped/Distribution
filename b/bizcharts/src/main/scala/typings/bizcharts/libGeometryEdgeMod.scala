package typings.bizcharts

import typings.bizcharts.libInterfaceMod.IBaseGemoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryEdgeMod {
  
  @JSImport("bizcharts/lib/geometry/Edge", JSImport.Default)
  @js.native
  open class default () extends EdgeGeom
  
  @js.native
  trait EdgeGeom
    extends typings.bizcharts.libGeometryBaseMod.default[IEdgeGemoProps]
  
  type IEdgeGemoProps = IBaseGemoProps
}
