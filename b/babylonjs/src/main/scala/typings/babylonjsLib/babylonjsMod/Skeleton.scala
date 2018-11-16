package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to handle skinning animations
     * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
     */
@JSImport("babylonjs", "Skeleton")
@js.native
class Skeleton protected ()
  extends babylonjsLib.BABYLONNs.Skeleton {
  /**
           * Creates a new skeleton
           * @param name defines the skeleton name
           * @param id defines the skeleton Id
           * @param scene defines the hosting scene
           */
  def this(/** defines the skeleton name */
  name: java.lang.String, /** defines the skeleton Id */
  id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/**
     * Class used to handle skinning animations
     * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
     */
@JSImport("babylonjs", "Skeleton")
@js.native
object Skeleton extends js.Object {
  /**
           * Creates a new skeleton from serialized data
           * @param parsedSkeleton defines the serialized data
           * @param scene defines the hosting scene
           * @returns a new skeleton
           */
  def Parse(parsedSkeleton: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Skeleton = js.native
}

