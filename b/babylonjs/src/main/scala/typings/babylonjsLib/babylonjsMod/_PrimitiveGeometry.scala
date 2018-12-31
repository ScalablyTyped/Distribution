package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Abstract class used to provide common services for all typed geometries
  * @hidden
  */
@JSImport("babylonjs", "_PrimitiveGeometry")
@js.native
class _PrimitiveGeometry protected ()
  extends babylonjsLib.BABYLONNs._PrimitiveGeometry {
  /**
    * Creates a new typed geometry
    * @param id defines the unique ID of the geometry
    * @param scene defines the hosting scene
    * @param _canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
    * @param mesh defines the hosting mesh (can be null)
    */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, _canBeRegenerated: scala.Boolean) = this()
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, _canBeRegenerated: scala.Boolean, mesh: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh]) = this()
}

