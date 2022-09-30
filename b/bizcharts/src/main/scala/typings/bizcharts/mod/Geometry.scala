package typings.bizcharts.mod

import typings.antvG2.geometryBaseMod.GeometryCfg
import typings.antvG2.libInterfaceMod.ShapePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bizcharts", "Geometry")
@js.native
open class Geometry[S /* <: ShapePoint */] protected ()
  extends typings.bizcharts.coreMod.Geometry[S] {
  /**
    * 创建 Geometry 实例。
    * @param cfg
    */
  def this(cfg: GeometryCfg) = this()
}
