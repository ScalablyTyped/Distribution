package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CloudPoint")
@js.native
class CloudPoint protected ()
  extends StObject
     with typings.babylonjs.BABYLON.CloudPoint {
  /**
    * Creates a Point Cloud object.
    * Don't create particles manually, use instead the PCS internal tools like _addParticle()
    * @param particleIndex (integer) is the particle index in the PCS pool. It's also the particle identifier.
    * @param group (PointsGroup) is the group the particle belongs to
    * @param groupId (integer) is the group identifier in the PCS.
    * @param idxInGroup (integer) is the index of the particle in the current point group (ex: the 10th point of addPoints(30))
    * @param pcs defines the PCS it is associated to
    */
  def this(
    particleIndex: Double,
    group: typings.babylonjs.BABYLON.PointsGroup,
    groupId: Double,
    idxInGroup: Double,
    pcs: typings.babylonjs.BABYLON.PointsCloudSystem
  ) = this()
}
