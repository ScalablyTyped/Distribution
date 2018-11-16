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

