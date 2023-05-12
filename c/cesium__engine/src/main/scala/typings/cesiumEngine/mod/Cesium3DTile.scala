package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Cesium3DTile")
@js.native
open class Cesium3DTile protected () extends StObject {
  def this(tileset: Cesium3DTileset, baseResource: Resource, header: Any, parent: Cesium3DTile) = this()
  
  /**
    * Get the bounding sphere derived from the tile's bounding volume.
    */
  val boundingSphere: BoundingSphere = js.native
  
  /**
    * Gets the tile's children.
    */
  val children: js.Array[Cesium3DTile] = js.native
  
  /**
    * The final computed transform of this tile.
    */
  val computedTransform: Matrix4 = js.native
  
  /**
    * The tile's content.  This represents the actual tile's payload,
    * not the content's metadata in the tileset JSON file.
    */
  val content: Cesium3DTileContent = js.native
  
  /**
    * The date when the content expires and new content is requested.
    */
  var expireDate: JulianDate = js.native
  
  /**
    * The time in seconds after the tile's content is ready when the content expires and new content is requested.
    */
  var expireDuration: Double = js.native
  
  /**
    * Returns the <code>extras</code> property in the tileset JSON for this tile, which contains application specific metadata.
    * Returns <code>undefined</code> if <code>extras</code> does not exist.
    */
  val extras: Any = js.native
  
  /**
    * The error, in meters, introduced if this tile is rendered and its children are not.
    * This is used to compute screen space error, i.e., the error measured in pixels.
    */
  val geometricError: Double = js.native
  
  /**
    * Gets the I3S Node for the tile.
    */
  var i3sNode: String = js.native
  
  /**
    * This tile's parent or <code>undefined</code> if this tile is the root.
    * <p>
    * When a tile's content points to an external tileset JSON file, the external tileset's
    * root tile's parent is not <code>undefined</code>; instead, the parent references
    * the tile (with its content pointing to an external tileset JSON file) as if the two tilesets were merged.
    * </p>
    */
  val parent: Cesium3DTile = js.native
  
  /**
    * The tileset containing this tile.
    */
  val tileset: Cesium3DTileset = js.native
  
  /**
    * The local transform of this tile.
    */
  var transform: Matrix4 = js.native
}
