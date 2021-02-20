package typings.cesium.mod

import typings.cesium.anon.InTangents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  /* static member */
  @JSImport("cesium", "HermiteSpline.createC1")
  @js.native
  def createC1(): HermiteSpline = js.native
  
  /* static member */
  @JSImport("cesium", "HermiteSpline.createClampedCubic")
  @js.native
  def createClampedCubic(): HermiteSpline | LinearSpline = js.native
  
  /* static member */
  @JSImport("cesium", "HermiteSpline.createNaturalCubic")
  @js.native
  def createNaturalCubic(): HermiteSpline | LinearSpline = js.native
}
