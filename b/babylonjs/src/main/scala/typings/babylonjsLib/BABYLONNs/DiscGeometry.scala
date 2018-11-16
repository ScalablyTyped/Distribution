package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Creates a disc geometry
     * @description see http://doc.babylonjs.com/how_to/set_shapes#disc-or-regular-polygon
     */
@JSGlobal("BABYLON.DiscGeometry")
@js.native
class DiscGeometry protected () extends _PrimitiveGeometry {
  /**
           * Creates a new disc geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param radius defines the radius of the disc
           * @param tessellation defines the tesselation factor to apply to the disc
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  def this(id: java.lang.String, scene: Scene, /**
           * Defines the radius of the disc
           */
  radius: scala.Double, /**
           * Defines the tesselation factor to apply to the disc
           */
  tessellation: scala.Double) = this()
  /**
           * Creates a new disc geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param radius defines the radius of the disc
           * @param tessellation defines the tesselation factor to apply to the disc
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  def this(id: java.lang.String, scene: Scene, /**
           * Defines the radius of the disc
           */
  radius: scala.Double, /**
           * Defines the tesselation factor to apply to the disc
           */
  tessellation: scala.Double, canBeRegenerated: scala.Boolean) = this()
  /**
           * Creates a new disc geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param radius defines the radius of the disc
           * @param tessellation defines the tesselation factor to apply to the disc
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  def this(id: java.lang.String, scene: Scene, /**
           * Defines the radius of the disc
           */
  radius: scala.Double, /**
           * Defines the tesselation factor to apply to the disc
           */
  tessellation: scala.Double, canBeRegenerated: scala.Boolean, mesh: Nullable[Mesh]) = this()
  /**
           * Creates a new disc geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param radius defines the radius of the disc
           * @param tessellation defines the tesselation factor to apply to the disc
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  def this(id: java.lang.String, scene: Scene, /**
           * Defines the radius of the disc
           */
  radius: scala.Double, /**
           * Defines the tesselation factor to apply to the disc
           */
  tessellation: scala.Double, canBeRegenerated: scala.Boolean, mesh: Nullable[Mesh], /**
           * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  side: scala.Double) = this()
  /**
           * Defines the radius of the disc
           */
  var radius: scala.Double = js.native
  /**
           * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  var side: scala.Double = js.native
  /**
           * Defines the tesselation factor to apply to the disc
           */
  var tessellation: scala.Double = js.native
}

