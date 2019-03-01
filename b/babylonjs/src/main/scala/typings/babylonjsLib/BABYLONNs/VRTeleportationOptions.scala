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

object VRTeleportationOptions {
  @scala.inline
  def apply(floorMeshName: java.lang.String = null, floorMeshes: js.Array[Mesh] = null): VRTeleportationOptions = {
    val __obj = js.Dynamic.literal()
    if (floorMeshName != null) __obj.updateDynamic("floorMeshName")(floorMeshName)
    if (floorMeshes != null) __obj.updateDynamic("floorMeshes")(floorMeshes)
    __obj.asInstanceOf[VRTeleportationOptions]
  }
}

