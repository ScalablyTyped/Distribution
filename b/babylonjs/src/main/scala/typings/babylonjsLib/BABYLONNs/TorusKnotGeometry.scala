package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a torus knot geometry
  * @description see http://doc.babylonjs.com/how_to/set_shapes#torus-knot
  */
@JSGlobal("BABYLON.TorusKnotGeometry")
@js.native
class TorusKnotGeometry protected () extends _PrimitiveGeometry {
  /**
    * Creates a torus knot geometry
    * @param id defines the unique ID of the geometry
    * @param scene defines the hosting scene
    * @param radius defines the radius of the torus knot
    * @param tube defines the thickness of the torus knot tube
    * @param radialSegments defines the number of radial segments
    * @param tubularSegments defines the number of tubular segments
    * @param p defines the first number of windings
    * @param q defines the second number of windings
    * @param canBeRegenerated defines if the geometry supports being regenerated with new parameters (false by default)
    * @param mesh defines the hosting mesh (can be null)
    * @param side defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
    */
  def this(id: java.lang.String, scene: Scene, /**
    * Defines the radius of the torus knot
    */
  radius: scala.Double, /**
    * Defines the thickness of the torus knot tube
    */
  tube: scala.Double, /**
    * Defines the number of radial segments
    */
  radialSegments: scala.Double, /**
    * Defines the number of tubular segments
    */
  tubularSegments: scala.Double, /**
    * Defines the first number of windings
    */
  p: scala.Double, /**
    * Defines the second number of windings
    */
  q: scala.Double) = this()
  def this(id: java.lang.String, scene: Scene, /**
    * Defines the radius of the torus knot
    */
  radius: scala.Double, /**
    * Defines the thickness of the torus knot tube
    */
  tube: scala.Double, /**
    * Defines the number of radial segments
    */
  radialSegments: scala.Double, /**
    * Defines the number of tubular segments
    */
  tubularSegments: scala.Double, /**
    * Defines the first number of windings
    */
  p: scala.Double, /**
    * Defines the second number of windings
    */
  q: scala.Double, canBeRegenerated: scala.Boolean) = this()
  def this(id: java.lang.String, scene: Scene, /**
    * Defines the radius of the torus knot
    */
  radius: scala.Double, /**
    * Defines the thickness of the torus knot tube
    */
  tube: scala.Double, /**
    * Defines the number of radial segments
    */
  radialSegments: scala.Double, /**
    * Defines the number of tubular segments
    */
  tubularSegments: scala.Double, /**
    * Defines the first number of windings
    */
  p: scala.Double, /**
    * Defines the second number of windings
    */
  q: scala.Double, canBeRegenerated: scala.Boolean, mesh: Nullable[Mesh]) = this()
  def this(id: java.lang.String, scene: Scene, /**
    * Defines the radius of the torus knot
    */
  radius: scala.Double, /**
    * Defines the thickness of the torus knot tube
    */
  tube: scala.Double, /**
    * Defines the number of radial segments
    */
  radialSegments: scala.Double, /**
    * Defines the number of tubular segments
    */
  tubularSegments: scala.Double, /**
    * Defines the first number of windings
    */
  p: scala.Double, /**
    * Defines the second number of windings
    */
  q: scala.Double, canBeRegenerated: scala.Boolean, mesh: Nullable[Mesh], /**
    * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
    */
  side: scala.Double) = this()
  /**
    * Defines the first number of windings
    */
  var p: scala.Double = js.native
  /**
    * Defines the second number of windings
    */
  var q: scala.Double = js.native
  /**
    * Defines the number of radial segments
    */
  var radialSegments: scala.Double = js.native
  /**
    * Defines the radius of the torus knot
    */
  var radius: scala.Double = js.native
  /**
    * Defines if the created geometry is double sided or not (default is BABYLON.Mesh.DEFAULTSIDE)
    */
  var side: scala.Double = js.native
  /**
    * Defines the thickness of the torus knot tube
    */
  var tube: scala.Double = js.native
  /**
    * Defines the number of tubular segments
    */
  var tubularSegments: scala.Double = js.native
}

/**
  * Creates a torus knot geometry
  * @description see http://doc.babylonjs.com/how_to/set_shapes#torus-knot
  */
@JSGlobal("BABYLON.TorusKnotGeometry")
@js.native
object TorusKnotGeometry extends js.Object {
  def Parse(parsedTorusKnot: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.TorusKnotGeometry] = js.native
}

