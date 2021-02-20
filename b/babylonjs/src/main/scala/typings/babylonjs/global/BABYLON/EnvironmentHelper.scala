package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.PartialIEnvironmentHelperBackgroundYRotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.EnvironmentHelper")
@js.native
class EnvironmentHelper protected ()
  extends typings.babylonjs.BABYLON.EnvironmentHelper {
  /**
    * constructor
    * @param options Defines the options we want to customize the helper
    * @param scene The scene to add the material to
    */
  def this(options: PartialIEnvironmentHelperBackgroundYRotation, scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
object EnvironmentHelper {
  
  @JSGlobal("BABYLON.EnvironmentHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default environment texture URL.
    */
  @JSGlobal("BABYLON.EnvironmentHelper._environmentTextureCDNUrl")
  @js.native
  def _environmentTextureCDNUrl: js.Any = js.native
  @scala.inline
  def _environmentTextureCDNUrl_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_environmentTextureCDNUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Creates the default options for the helper.
    */
  @JSGlobal("BABYLON.EnvironmentHelper._getDefaultOptions")
  @js.native
  def _getDefaultOptions: js.Any = js.native
  @scala.inline
  def _getDefaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getDefaultOptions")(x.asInstanceOf[js.Any])
  
  /**
    * Default ground texture URL.
    */
  @JSGlobal("BABYLON.EnvironmentHelper._groundTextureCDNUrl")
  @js.native
  def _groundTextureCDNUrl: js.Any = js.native
  @scala.inline
  def _groundTextureCDNUrl_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_groundTextureCDNUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Default skybox texture URL.
    */
  @JSGlobal("BABYLON.EnvironmentHelper._skyboxTextureCDNUrl")
  @js.native
  def _skyboxTextureCDNUrl: js.Any = js.native
  @scala.inline
  def _skyboxTextureCDNUrl_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_skyboxTextureCDNUrl")(x.asInstanceOf[js.Any])
}
