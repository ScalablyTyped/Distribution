package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimplificationTask extends js.Object {
  /**
    * Mesh to simplify
    */
  var mesh: Mesh
  /**
    * Defines if parallel processing can be used
    */
  var parallelProcessing: Boolean
  /**
    * Array of settings
    */
  var settings: js.Array[ISimplificationSettings]
  /**
    * Simplification type
    */
  var simplificationType: SimplificationType
  /**
    * Callback called on success
    */
  var successCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ISimplificationTask {
  @scala.inline
  def apply(
    mesh: Mesh,
    parallelProcessing: Boolean,
    settings: js.Array[ISimplificationSettings],
    simplificationType: SimplificationType,
    successCallback: () => Unit = null
  ): ISimplificationTask = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any], parallelProcessing = parallelProcessing.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], simplificationType = simplificationType.asInstanceOf[js.Any])
    if (successCallback != null) __obj.updateDynamic("successCallback")(js.Any.fromFunction0(successCallback))
    __obj.asInstanceOf[ISimplificationTask]
  }
}

