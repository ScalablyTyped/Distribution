package typings.chartist

import typings.chartist.anon.High
import typings.chartist.distCoreTypesMod.Bounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreDataBoundsMod {
  
  @JSImport("chartist/dist/core/data/bounds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBounds(axisLength: Double, highLow: High, scaleMinSpace: Double): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("getBounds")(axisLength.asInstanceOf[js.Any], highLow.asInstanceOf[js.Any], scaleMinSpace.asInstanceOf[js.Any])).asInstanceOf[Bounds]
  inline def getBounds(axisLength: Double, highLow: High, scaleMinSpace: Double, onlyInteger: Boolean): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("getBounds")(axisLength.asInstanceOf[js.Any], highLow.asInstanceOf[js.Any], scaleMinSpace.asInstanceOf[js.Any], onlyInteger.asInstanceOf[js.Any])).asInstanceOf[Bounds]
}
