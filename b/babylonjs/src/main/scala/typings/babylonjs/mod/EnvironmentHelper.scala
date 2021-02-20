package typings.babylonjs.mod

import typings.babylonjs.anon.PartialIEnvironmentHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "EnvironmentHelper")
@js.native
class EnvironmentHelper protected ()
  extends typings.babylonjs.legacyMod.EnvironmentHelper {
  /**
    * constructor
    * @param options Defines the options we want to customize the helper
    * @param scene The scene to add the material to
    */
  def this(options: PartialIEnvironmentHelper, scene: typings.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object EnvironmentHelper {
  
  @JSImport("babylonjs", "EnvironmentHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default environment texture URL.
    */
  @JSImport("babylonjs", "EnvironmentHelper._environmentTextureCDNUrl")
  @js.native
  def _environmentTextureCDNUrl: js.Any = js.native
  @scala.inline
  def _environmentTextureCDNUrl_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_environmentTextureCDNUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Creates the default options for the helper.
    */
  @JSImport("babylonjs", "EnvironmentHelper._getDefaultOptions")
  @js.native
  def _getDefaultOptions: js.Any = js.native
  @scala.inline
  def _getDefaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getDefaultOptions")(x.asInstanceOf[js.Any])
  
  /**
    * Default ground texture URL.
    */
  @JSImport("babylonjs", "EnvironmentHelper._groundTextureCDNUrl")
  @js.native
  def _groundTextureCDNUrl: js.Any = js.native
  @scala.inline
  def _groundTextureCDNUrl_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_groundTextureCDNUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Default skybox texture URL.
    */
  @JSImport("babylonjs", "EnvironmentHelper._skyboxTextureCDNUrl")
  @js.native
  def _skyboxTextureCDNUrl: js.Any = js.native
  @scala.inline
  def _skyboxTextureCDNUrl_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_skyboxTextureCDNUrl")(x.asInstanceOf[js.Any])
}
