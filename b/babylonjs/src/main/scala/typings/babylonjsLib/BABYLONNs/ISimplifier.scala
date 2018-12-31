package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simplifier interface for future simplification implementations
  * @see http://doc.babylonjs.com/how_to/in-browser_mesh_simplification
  */
@js.native
trait ISimplifier extends js.Object {
  /**
    * Simplification of a given mesh according to the given settings.
    * Since this requires computation, it is assumed that the function runs async.
    * @param settings The settings of the simplification, including quality and distance
    * @param successCallback A callback that will be called after the mesh was simplified.
    * @param errorCallback in case of an error, this callback will be called. optional.
    */
  def simplify(
    settings: ISimplificationSettings,
    successCallback: js.Function1[/* simplifiedMeshes */ Mesh, scala.Unit]
  ): scala.Unit = js.native
  def simplify(
    settings: ISimplificationSettings,
    successCallback: js.Function1[/* simplifiedMeshes */ Mesh, scala.Unit],
    errorCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

