package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Environment helper class can be used to add a fully featuread none expensive background to your scene.
  * It includes by default a skybox and a ground relying on the BackgroundMaterial.
  * It also helps with the default setup of your imageProcessing configuration.
  */
@JSImport("babylonjs", "EnvironmentHelper")
@js.native
class EnvironmentHelper protected ()
  extends babylonjsLib.BABYLONNs.EnvironmentHelper {
  /**
    * constructor
    * @param options
    * @param scene The scene to add the material to
    */
  def this(options: stdLib.Partial[babylonjsLib.BABYLONNs.IEnvironmentHelperOptions], scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/**
  * The Environment helper class can be used to add a fully featuread none expensive background to your scene.
  * It includes by default a skybox and a ground relying on the BackgroundMaterial.
  * It also helps with the default setup of your imageProcessing configuration.
  */
@JSImport("babylonjs", "EnvironmentHelper")
@js.native
object EnvironmentHelper extends js.Object {
  /**
    * Default environment texture URL.
    */
  var _environmentTextureCDNUrl: js.Any = js.native
  /**
    * Creates the default options for the helper.
    */
  var _getDefaultOptions: js.Any = js.native
  /**
    * Default ground texture URL.
    */
  var _groundTextureCDNUrl: js.Any = js.native
  /**
    * Default skybox texture URL.
    */
  var _skyboxTextureCDNUrl: js.Any = js.native
}

