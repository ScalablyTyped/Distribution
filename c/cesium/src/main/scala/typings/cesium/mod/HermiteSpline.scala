package typings.cesium.mod

import typings.cesium.anon.InTangents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "HermiteSpline")
@js.native
class HermiteSpline protected () extends js.Object {
  def this(options: InTangents) = this()
  
  def evaluate(time: Double): Cartesian3 = js.native
  def evaluate(time: Double, result: Cartesian3): Cartesian3 = js.native
  
  def findTimeInterval(time: Double): Double = js.native
  
  var inTangents: js.Array[Cartesian3] = js.native
  
  var outTangents: js.Array[Cartesian3] = js.native
  
  var points: js.Array[Cartesian3] = js.native
  
  var times: js.Array[Double] = js.native
}
/* static members */
@JSImport("cesium", "HermiteSpline")
@js.native
object HermiteSpline extends js.Object {
  
  def createC1(): HermiteSpline = js.native
  
  def createClampedCubic(): HermiteSpline | LinearSpline = js.native
  
  def createNaturalCubic(): HermiteSpline | LinearSpline = js.native
}
