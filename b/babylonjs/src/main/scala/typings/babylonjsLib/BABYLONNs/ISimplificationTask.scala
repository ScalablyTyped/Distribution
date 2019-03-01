package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface used to define a simplification task
  */
trait ISimplificationTask extends js.Object {
  /**
    * Mesh to simplify
    */
  var mesh: Mesh
  /**
    * Defines if parallel processing can be used
    */
  var parallelProcessing: scala.Boolean
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
  var successCallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object ISimplificationTask {
  @scala.inline
  def apply(
    mesh: Mesh,
    parallelProcessing: scala.Boolean,
    settings: js.Array[ISimplificationSettings],
    simplificationType: SimplificationType,
    successCallback: js.Function0[scala.Unit] = null
  ): ISimplificationTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mesh")(mesh)
    __obj.updateDynamic("parallelProcessing")(parallelProcessing)
    __obj.updateDynamic("settings")(settings)
    __obj.updateDynamic("simplificationType")(simplificationType)
    if (successCallback != null) __obj.updateDynamic("successCallback")(successCallback)
    __obj.asInstanceOf[ISimplificationTask]
  }
}

