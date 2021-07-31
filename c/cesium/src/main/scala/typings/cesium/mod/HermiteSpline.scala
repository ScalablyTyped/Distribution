package typings.cesium.mod

import typings.cesium.anon.InTangents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "HermiteSpline")
@js.native
class HermiteSpline protected () extends StObject {
  def this(options: InTangents) = this()
  
  def evaluate(time: Double): Cartesian3 = js.native
  def evaluate(time: Double, result: Cartesian3): Cartesian3 = js.native
  
  def findTimeInterval(time: Double): Double = js.native
  
  var inTangents: js.Array[Cartesian3] = js.native
  
  var outTangents: js.Array[Cartesian3] = js.native
  
  var points: js.Array[Cartesian3] = js.native
  
  var times: js.Array[Double] = js.native
}
object HermiteSpline {
  
  @JSImport("cesium", "HermiteSpline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def createC1(): HermiteSpline = ^.asInstanceOf[js.Dynamic].applyDynamic("createC1")().asInstanceOf[HermiteSpline]
  
  /* static member */
  @scala.inline
  def createClampedCubic(): HermiteSpline | LinearSpline = ^.asInstanceOf[js.Dynamic].applyDynamic("createClampedCubic")().asInstanceOf[HermiteSpline | LinearSpline]
  
  /* static member */
  @scala.inline
  def createNaturalCubic(): HermiteSpline | LinearSpline = ^.asInstanceOf[js.Dynamic].applyDynamic("createNaturalCubic")().asInstanceOf[HermiteSpline | LinearSpline]
}
