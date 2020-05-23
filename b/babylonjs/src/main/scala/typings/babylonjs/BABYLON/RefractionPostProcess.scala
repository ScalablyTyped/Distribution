package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefractionPostProcess extends PostProcess {
  var _ownRefractionTexture: js.Any = js.native
  var _refTexture: js.Any = js.native
  /** the base color of the refraction (used to taint the rendering) */
  var color: Color3 = js.native
  /** the coefficient of the base color (0 to remove base color tainting) */
  var colorLevel: Double = js.native
  /** simulated refraction depth */
  var depth: Double = js.native
  /**
    * Gets or sets the refraction texture
    * Please note that you are responsible for disposing the texture if you set it manually
    */
  def refractionTexture: Texture = js.native
  def refractionTexture(value: Texture): js.Any = js.native
}

