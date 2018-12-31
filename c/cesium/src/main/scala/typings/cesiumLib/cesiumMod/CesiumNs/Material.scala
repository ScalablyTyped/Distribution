package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Material extends js.Object {
  var materials: js.Any
  var shaderSource: java.lang.String
  var translucent: scala.Boolean
  var `type`: java.lang.String
  var uniforms: js.Any
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def isTranslucent(): scala.Boolean
}

