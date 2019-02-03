package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class of all the textures in babylon.
  * It groups all the common properties the materials, post process, lights... might need
  * in order to make a correct use of the texture.
  */
@JSImport("babylonjs", "BaseTexture")
@js.native
class BaseTexture protected ()
  extends babylonjsLib.BABYLONNs.BaseTexture {
  /**
    * Instantiates a new BaseTexture.
    * Base class of all the textures in babylon.
    * It groups all the common properties the materials, post process, lights... might need
    * in order to make a correct use of the texture.
    * @param scene Define the scene the texture blongs to
    */
  def this(scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]) = this()
}

/* static members */
@JSImport("babylonjs", "BaseTexture")
@js.native
object BaseTexture extends js.Object {
  /**
    * Default anisotropic filtering level for the application.
    * It is set to 4 as a good tradeoff between perf and quality.
    */
  var DEFAULT_ANISOTROPIC_FILTERING_LEVEL: scala.Double = js.native
  /**
    * Helper function to be called back once a list of texture contains only ready textures.
    * @param textures Define the list of textures to wait for
    * @param callback Define the callback triggered once the entire list will be ready
    */
  def WhenAllReady(textures: js.Array[babylonjsLib.BABYLONNs.BaseTexture], callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

