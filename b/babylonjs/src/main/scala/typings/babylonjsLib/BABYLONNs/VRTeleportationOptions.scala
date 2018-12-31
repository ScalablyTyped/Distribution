package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to modify the vr teleportation behavior.
  */
trait VRTeleportationOptions extends js.Object {
  /**
    * The name of the mesh which should be used as the teleportation floor. (default: null)
    */
  var floorMeshName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of meshes to be used as the teleportation floor. (default: empty)
    */
  var floorMeshes: js.UndefOr[js.Array[Mesh]] = js.undefined
}

