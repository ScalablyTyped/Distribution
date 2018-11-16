package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Expected simplification settings.
     * Quality should be between 0 and 1 (1 being 100%, 0 being 0%)
     * @see http://doc.babylonjs.com/how_to/in-browser_mesh_simplification
     */

trait ISimplificationSettings extends js.Object {
  /**
           * Gets or sets the distance when this optimized version should be used
           */
  var distance: scala.Double
  /**
           * Gets an already optimized mesh
           */
  var optimizeMesh: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Gets or sets the expected quality
           */
  var quality: scala.Double
}

