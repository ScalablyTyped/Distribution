package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Creates a ribbon geometry
     * @description See http://doc.babylonjs.com/how_to/ribbon_tutorial, http://doc.babylonjs.com/resources/maths_make_ribbons
     */
@JSImport("babylonjs", "RibbonGeometry")
@js.native
class RibbonGeometry protected ()
  extends babylonjsLib.BABYLONNs.RibbonGeometry {
  /**
           * Creates a ribbon geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param pathArray defines the array of paths to use
           * @param closeArray defines if the last path and the first path must be  joined
           * @param closePath defines if the last and first points of each path in your pathArray must be joined
           * @param offset defines the offset between points
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
           * Defines the array of paths to use
           */
  pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]], /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  closeArray: scala.Boolean, /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  closePath: scala.Boolean, /**
           * Defines the offset between points
           */
  offset: scala.Double) = this()
  /**
           * Creates a ribbon geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param pathArray defines the array of paths to use
           * @param closeArray defines if the last path and the first path must be  joined
           * @param closePath defines if the last and first points of each path in your pathArray must be joined
           * @param offset defines the offset between points
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
           * Defines the array of paths to use
           */
  pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]], /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  closeArray: scala.Boolean, /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  closePath: scala.Boolean, /**
           * Defines the offset between points
           */
  offset: scala.Double, canBeRegenerated: scala.Boolean) = this()
  /**
           * Creates a ribbon geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param pathArray defines the array of paths to use
           * @param closeArray defines if the last path and the first path must be  joined
           * @param closePath defines if the last and first points of each path in your pathArray must be joined
           * @param offset defines the offset between points
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
           * Defines the array of paths to use
           */
  pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]], /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  closeArray: scala.Boolean, /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  closePath: scala.Boolean, /**
           * Defines the offset between points
           */
  offset: scala.Double, canBeRegenerated: scala.Boolean, mesh: babylonjsLib.BABYLONNs.Mesh) = this()
  /**
           * Creates a ribbon geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param pathArray defines the array of paths to use
           * @param closeArray defines if the last path and the first path must be  joined
           * @param closePath defines if the last and first points of each path in your pathArray must be joined
           * @param offset defines the offset between points
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  def this(id: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, /**
           * Defines the array of paths to use
           */
  pathArray: js.Array[js.Array[babylonjsLib.BABYLONNs.Vector3]], /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  closeArray: scala.Boolean, /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  closePath: scala.Boolean, /**
           * Defines the offset between points
           */
  offset: scala.Double, canBeRegenerated: scala.Boolean, mesh: babylonjsLib.BABYLONNs.Mesh, /**
           * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  side: scala.Double) = this()
}

