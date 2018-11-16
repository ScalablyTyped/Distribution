package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a Depth Sorted Particle in the solid particle system.
     */
@JSGlobal("BABYLON.DepthSortedParticle")
@js.native
class DepthSortedParticle () extends js.Object {
  /**
           * Index of the particle in the "indices" array
           */
  var ind: scala.Double = js.native
  /**
           * Length of the particle shape in the "indices" array
           */
  var indicesLength: scala.Double = js.native
  /**
           * Squared distance from the particle to the camera
           */
  var sqDistance: scala.Double = js.native
}

