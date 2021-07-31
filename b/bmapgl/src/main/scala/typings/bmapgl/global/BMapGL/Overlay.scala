package typings.bmapgl.global.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.Overlay")
@js.native
class Overlay ()
  extends StObject
     with typings.bmapgl.BMapGL.Overlay
object Overlay {
  
  @JSGlobal("BMapGL.Overlay")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def getZIndex(lat: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getZIndex")(lat.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getZIndex(lat: Double, coordTyppe: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getZIndex")(lat.asInstanceOf[js.Any], coordTyppe.asInstanceOf[js.Any])).asInstanceOf[Double]
}
