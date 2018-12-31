package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Abstract class used to provide common services for all typed geometries
  * @hidden
  */
@JSGlobal("BABYLON._PrimitiveGeometry")
@js.native
class _PrimitiveGeometry protected () extends Geometry {
  /**
    * Creates a new typed geometry
    * @param id defines the unique ID of the geometry
    * @param scene defines the hosting scene
    * @param _canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
    * @param mesh defines the hosting mesh (can be null)
    */
  def this(id: java.lang.String, scene: Scene) = this()
  def this(id: java.lang.String, scene: Scene, _canBeRegenerated: scala.Boolean) = this()
  def this(id: java.lang.String, scene: Scene, _canBeRegenerated: scala.Boolean, mesh: Nullable[Mesh]) = this()
  var _beingRegenerated: js.Any = js.native
  var _canBeRegenerated: js.Any = js.native
  /** @hidden */
  def _regenerateVertexData(): VertexData = js.native
  /**
    * Clone the geometry
    * @param id defines the unique ID of the new geometry
    * @returns the new geometry
    */
  def asNewGeometry(id: java.lang.String): Geometry = js.native
  /**
    * Gets a value indicating if the geometry supports being regenerated with new parameters (false by default)
    * @returns true if the geometry can be regenerated
    */
  def canBeRegenerated(): scala.Boolean = js.native
  /**
    * If the geometry supports regeneration, the function will recreates the geometry with updated parameter values
    */
  def regenerate(): scala.Unit = js.native
}

