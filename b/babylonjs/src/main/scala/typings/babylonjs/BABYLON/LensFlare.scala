package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LensFlare extends js.Object {
  var _system: js.Any
  /**
    * Define the alpha mode to render this particular lens.
    */
  var alphaMode: Double
  /**
    * Define the lens color.
    */
  var color: Color3
  /**
    * Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
    */
  var position: Double
  /**
    * Define the size of the lens flare in the system (a floating value between 0 and 1)
    */
  var size: Double
  /**
    * Define the lens texture.
    */
  var texture: Nullable[Texture]
  /**
    * Dispose and release the lens flare with its associated resources.
    */
  def dispose(): Unit
}

object LensFlare {
  @scala.inline
  def apply(
    _system: js.Any,
    alphaMode: Double,
    color: Color3,
    dispose: () => Unit,
    position: Double,
    size: Double,
    texture: Nullable[Texture] = null
  ): LensFlare = {
    val __obj = js.Dynamic.literal(_system = _system.asInstanceOf[js.Any], alphaMode = alphaMode.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[LensFlare]
  }
}

