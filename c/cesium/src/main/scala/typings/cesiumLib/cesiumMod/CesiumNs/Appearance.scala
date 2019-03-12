package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appearance extends js.Object {
  val closed: scala.Boolean
  val fragmentShaderSource: java.lang.String
  var material: Material
  val renderState: js.Any
  var translucent: scala.Boolean
  val vertexShaderSource: java.lang.String
  def getFragmentShaderSource(): java.lang.String
  def getRenderState(): js.Any
  def isTranslucent(): scala.Boolean
}

object Appearance {
  @scala.inline
  def apply(
    closed: scala.Boolean,
    fragmentShaderSource: java.lang.String,
    getFragmentShaderSource: () => java.lang.String,
    getRenderState: () => js.Any,
    isTranslucent: () => scala.Boolean,
    material: Material,
    renderState: js.Any,
    translucent: scala.Boolean,
    vertexShaderSource: java.lang.String
  ): Appearance = {
    val __obj = js.Dynamic.literal(closed = closed, fragmentShaderSource = fragmentShaderSource, getFragmentShaderSource = js.Any.fromFunction0(getFragmentShaderSource), getRenderState = js.Any.fromFunction0(getRenderState), isTranslucent = js.Any.fromFunction0(isTranslucent), material = material, renderState = renderState, translucent = translucent, vertexShaderSource = vertexShaderSource)
  
    __obj.asInstanceOf[Appearance]
  }
}

