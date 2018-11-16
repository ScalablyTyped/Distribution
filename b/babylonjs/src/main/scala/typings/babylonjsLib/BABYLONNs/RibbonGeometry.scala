package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Creates a ribbon geometry
     * @description See http://doc.babylonjs.com/how_to/ribbon_tutorial, http://doc.babylonjs.com/resources/maths_make_ribbons
     */
@JSGlobal("BABYLON.RibbonGeometry")
@js.native
class RibbonGeometry protected () extends _PrimitiveGeometry {
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
  def this(id: java.lang.String, scene: Scene, /**
           * Defines the array of paths to use
           */
  pathArray: js.Array[js.Array[Vector3]], /**
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
  def this(id: java.lang.String, scene: Scene, /**
           * Defines the array of paths to use
           */
  pathArray: js.Array[js.Array[Vector3]], /**
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
  def this(id: java.lang.String, scene: Scene, /**
           * Defines the array of paths to use
           */
  pathArray: js.Array[js.Array[Vector3]], /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  closeArray: scala.Boolean, /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  closePath: scala.Boolean, /**
           * Defines the offset between points
           */
  offset: scala.Double, canBeRegenerated: scala.Boolean, mesh: Mesh) = this()
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
  def this(id: java.lang.String, scene: Scene, /**
           * Defines the array of paths to use
           */
  pathArray: js.Array[js.Array[Vector3]], /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  closeArray: scala.Boolean, /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  closePath: scala.Boolean, /**
           * Defines the offset between points
           */
  offset: scala.Double, canBeRegenerated: scala.Boolean, mesh: Mesh, /**
           * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  side: scala.Double) = this()
  /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  var closeArray: scala.Boolean = js.native
  /**
           * Defines if the last and first points of each path in your pathArray must be joined
           */
  var closePath: scala.Boolean = js.native
  /**
           * Defines the offset between points
           */
  var offset: scala.Double = js.native
  /**
           * Defines the array of paths to use
           */
  var pathArray: js.Array[js.Array[Vector3]] = js.native
  /**
           * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  var side: scala.Double = js.native
}

