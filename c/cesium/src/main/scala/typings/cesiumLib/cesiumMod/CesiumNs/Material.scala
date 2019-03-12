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

object Material {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    isDestroyed: () => scala.Boolean,
    isTranslucent: () => scala.Boolean,
    materials: js.Any,
    shaderSource: java.lang.String,
    translucent: scala.Boolean,
    `type`: java.lang.String,
    uniforms: js.Any
  ): Material = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), isDestroyed = js.Any.fromFunction0(isDestroyed), isTranslucent = js.Any.fromFunction0(isTranslucent), materials = materials, shaderSource = shaderSource, translucent = translucent, uniforms = uniforms)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Material]
  }
}

