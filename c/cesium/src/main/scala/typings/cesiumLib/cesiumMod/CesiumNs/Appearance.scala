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

