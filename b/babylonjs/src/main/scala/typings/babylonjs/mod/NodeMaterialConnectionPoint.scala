package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "NodeMaterialConnectionPoint")
@js.native
class NodeMaterialConnectionPoint protected ()
  extends typings.babylonjs.legacyMod.NodeMaterialConnectionPoint {
  /**
    * Creates a new connection point
    * @param name defines the connection point name
    * @param ownerBlock defines the block hosting this connection point
    * @param direction defines the direction of the connection point
    */
  def this(
    name: String,
    ownerBlock: typings.babylonjs.nodeMaterialBlockMod.NodeMaterialBlock,
    direction: typings.babylonjs.nodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointDirection
  ) = this()
}

