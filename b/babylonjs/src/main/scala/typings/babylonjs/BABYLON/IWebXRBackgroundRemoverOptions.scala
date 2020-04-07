package typings.babylonjs.BABYLON

import typings.babylonjs.AnonGround
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRBackgroundRemoverOptions extends js.Object {
  /**
    * Further background meshes to disable when entering AR
    */
  var backgroundMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.undefined
  /**
    * flags to configure the removal of the environment helper.
    * If not set, the entire background will be removed. If set, flags should be set as well.
    */
  var environmentHelperRemovalFlags: js.UndefOr[AnonGround] = js.undefined
  /**
    * don't disable the environment helper
    */
  var ignoreEnvironmentHelper: js.UndefOr[Boolean] = js.undefined
}

object IWebXRBackgroundRemoverOptions {
  @scala.inline
  def apply(
    backgroundMeshes: js.Array[AbstractMesh] = null,
    environmentHelperRemovalFlags: AnonGround = null,
    ignoreEnvironmentHelper: js.UndefOr[Boolean] = js.undefined
  ): IWebXRBackgroundRemoverOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundMeshes != null) __obj.updateDynamic("backgroundMeshes")(backgroundMeshes.asInstanceOf[js.Any])
    if (environmentHelperRemovalFlags != null) __obj.updateDynamic("environmentHelperRemovalFlags")(environmentHelperRemovalFlags.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEnvironmentHelper)) __obj.updateDynamic("ignoreEnvironmentHelper")(ignoreEnvironmentHelper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRBackgroundRemoverOptions]
  }
}

