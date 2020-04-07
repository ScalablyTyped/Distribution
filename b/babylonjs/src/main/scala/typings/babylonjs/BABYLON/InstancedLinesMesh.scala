package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.InstancedLinesMesh")
@js.native
class InstancedLinesMesh protected () extends InstancedMesh {
  def this(name: String, source: LinesMesh) = this()
  /**
    * The intersection Threshold is the margin applied when intersection a segment of the LinesMesh with a Ray.
    * This margin is expressed in world space coordinates, so its value may vary.
    * Initilized with the intersectionThreshold value of the source LinesMesh
    */
  var intersectionThreshold: Double = js.native
}

