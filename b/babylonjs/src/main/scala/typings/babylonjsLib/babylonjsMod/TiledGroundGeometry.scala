package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Creates a tiled ground geometry
     * @description see http://doc.babylonjs.com/how_to/set_shapes#tiled-ground
     */
@JSImport("babylonjs", "TiledGroundGeometry")
@js.native
class TiledGroundGeometry protected ()
  extends babylonjsLib.BABYLONNs.TiledGroundGeometry {
  /**
           * Creates a tiled ground geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param xmin defines the minimum value on X axis
           * @param zmin defines the minimum value on Z axis
           * @param xmax defines the maximum value on X axis
           * @param zmax defines the maximum value on Z axis
           * @param subdivisions defines the subdivisions to apply to the ground (number of subdivisions (tiles) on the height and the width of the map)
           * @param precision defines the precision to use when computing the tiles
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
           * Defines the minimum value on X axis
           */
  xmin: scala.Double, /**
           * Defines the minimum value on Z axis
           */
  zmin: scala.Double, /**
           * Defines the maximum value on X axis
           */
  xmax: scala.Double, /**
           * Defines the maximum value on Z axis
           */
  zmax: scala.Double, /**
           * Defines the subdivisions to apply to the ground
           */
  subdivisions: babylonjsLib.Anon_W, /**
           * Defines the precision to use when computing the tiles
           */
  precision: babylonjsLib.Anon_W) = this()
  /**
           * Creates a tiled ground geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param xmin defines the minimum value on X axis
           * @param zmin defines the minimum value on Z axis
           * @param xmax defines the maximum value on X axis
           * @param zmax defines the maximum value on Z axis
           * @param subdivisions defines the subdivisions to apply to the ground (number of subdivisions (tiles) on the height and the width of the map)
           * @param precision defines the precision to use when computing the tiles
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
           * Defines the minimum value on X axis
           */
  xmin: scala.Double, /**
           * Defines the minimum value on Z axis
           */
  zmin: scala.Double, /**
           * Defines the maximum value on X axis
           */
  xmax: scala.Double, /**
           * Defines the maximum value on Z axis
           */
  zmax: scala.Double, /**
           * Defines the subdivisions to apply to the ground
           */
  subdivisions: babylonjsLib.Anon_W, /**
           * Defines the precision to use when computing the tiles
           */
  precision: babylonjsLib.Anon_W, canBeRegenerated: scala.Boolean) = this()
  /**
           * Creates a tiled ground geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param xmin defines the minimum value on X axis
           * @param zmin defines the minimum value on Z axis
           * @param xmax defines the maximum value on X axis
           * @param zmax defines the maximum value on Z axis
           * @param subdivisions defines the subdivisions to apply to the ground (number of subdivisions (tiles) on the height and the width of the map)
           * @param precision defines the precision to use when computing the tiles
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
           * Defines the minimum value on X axis
           */
  xmin: scala.Double, /**
           * Defines the minimum value on Z axis
           */
  zmin: scala.Double, /**
           * Defines the maximum value on X axis
           */
  xmax: scala.Double, /**
           * Defines the maximum value on Z axis
           */
  zmax: scala.Double, /**
           * Defines the subdivisions to apply to the ground
           */
  subdivisions: babylonjsLib.Anon_W, /**
           * Defines the precision to use when computing the tiles
           */
  precision: babylonjsLib.Anon_W, canBeRegenerated: scala.Boolean, mesh: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Mesh]) = this()
}

