package typings.cesium.global.Cesium

import typings.cesium.anon.InTangents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.HermiteSpline")
@js.native
class HermiteSpline protected ()
  extends typings.cesium.mod.HermiteSpline {
  def this(options: InTangents) = this()
}
object HermiteSpline {
  
  @JSGlobal("Cesium.HermiteSpline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createC1(): typings.cesium.mod.HermiteSpline = ^.asInstanceOf[js.Dynamic].applyDynamic("createC1")().asInstanceOf[typings.cesium.mod.HermiteSpline]
  
  /* static member */
  inline def createClampedCubic(): typings.cesium.mod.HermiteSpline | typings.cesium.mod.LinearSpline = ^.asInstanceOf[js.Dynamic].applyDynamic("createClampedCubic")().asInstanceOf[typings.cesium.mod.HermiteSpline | typings.cesium.mod.LinearSpline]
  
  /* static member */
  inline def createNaturalCubic(): typings.cesium.mod.HermiteSpline | typings.cesium.mod.LinearSpline = ^.asInstanceOf[js.Dynamic].applyDynamic("createNaturalCubic")().asInstanceOf[typings.cesium.mod.HermiteSpline | typings.cesium.mod.LinearSpline]
}
