package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Creates a sphere geometry
     * @description see http://doc.babylonjs.com/how_to/set_shapes#sphere
     */
@JSGlobal("BABYLON.SphereGeometry")
@js.native
class SphereGeometry protected () extends _PrimitiveGeometry {
  /**
           * Create a new sphere geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param segments defines the number of segments to use to create the sphere
           * @param diameter defines the diameter of the sphere
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  def this(id: java.lang.String, scene: Scene, /**
           * Defines the number of segments to use to create the sphere
           */
  segments: scala.Double, /**
           * Defines the diameter of the sphere
           */
  diameter: scala.Double) = this()
  /**
           * Create a new sphere geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param segments defines the number of segments to use to create the sphere
           * @param diameter defines the diameter of the sphere
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  def this(id: java.lang.String, scene: Scene, /**
           * Defines the number of segments to use to create the sphere
           */
  segments: scala.Double, /**
           * Defines the diameter of the sphere
           */
  diameter: scala.Double, canBeRegenerated: scala.Boolean) = this()
  /**
           * Create a new sphere geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param segments defines the number of segments to use to create the sphere
           * @param diameter defines the diameter of the sphere
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  def this(id: java.lang.String, scene: Scene, /**
           * Defines the number of segments to use to create the sphere
           */
  segments: scala.Double, /**
           * Defines the diameter of the sphere
           */
  diameter: scala.Double, canBeRegenerated: scala.Boolean, mesh: Nullable[Mesh]) = this()
  /**
           * Create a new sphere geometry
           * @param id defines the unique ID of the geometry
           * @param scene defines the hosting scene
           * @param segments defines the number of segments to use to create the sphere
           * @param diameter defines the diameter of the sphere
           * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
           * @param mesh defines the hosting mesh (can be null)
           * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  def this(id: java.lang.String, scene: Scene, /**
           * Defines the number of segments to use to create the sphere
           */
  segments: scala.Double, /**
           * Defines the diameter of the sphere
           */
  diameter: scala.Double, canBeRegenerated: scala.Boolean, mesh: Nullable[Mesh], /**
           * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  side: scala.Double) = this()
  /**
           * Defines the diameter of the sphere
           */
  var diameter: scala.Double = js.native
  /**
           * Defines the number of segments to use to create the sphere
           */
  var segments: scala.Double = js.native
  /**
           * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
           */
  var side: scala.Double = js.native
}

/**
     * Creates a sphere geometry
     * @description see http://doc.babylonjs.com/how_to/set_shapes#sphere
     */
@JSGlobal("BABYLON.SphereGeometry")
@js.native
object SphereGeometry extends js.Object {
  def Parse(parsedSphere: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.SphereGeometry] = js.native
}

