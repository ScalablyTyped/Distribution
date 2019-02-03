package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class for the main features of a material in Babylon.js
  */
@JSImport("babylonjs", "Material")
@js.native
class Material protected ()
  extends babylonjsLib.BABYLONNs.Material {
  /**
    * Creates a material instance
    * @param name defines the name of the material
    * @param scene defines the scene to reference
    * @param doNotAdd specifies if the material should be added to the scene
    */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, doNotAdd: scala.Boolean) = this()
}

/* static members */
@JSImport("babylonjs", "Material")
@js.native
object Material extends js.Object {
  /**
    * The all dirty flag value
    */
  val AllDirtyFlag: scala.Double = js.native
  /**
    * The dirty attribute flag value
    */
  val AttributesDirtyFlag: scala.Double = js.native
  /**
    * Returns the clock-wise side orientation
    */
  val ClockWiseSideOrientation: scala.Double = js.native
  /**
    * Returns the counter clock-wise side orientation
    */
  val CounterClockWiseSideOrientation: scala.Double = js.native
  /**
    * The dirty fresnel flag value
    */
  val FresnelDirtyFlag: scala.Double = js.native
  /**
    * The dirty light flag value
    */
  val LightDirtyFlag: scala.Double = js.native
  /**
    * Returns the line list draw mode
    */
  val LineListDrawMode: scala.Double = js.native
  /**
    * Returns the line loop draw mode
    */
  val LineLoopDrawMode: scala.Double = js.native
  /**
    * Returns the line strip draw mode
    */
  val LineStripDrawMode: scala.Double = js.native
  /**
    * The dirty misc flag value
    */
  val MiscDirtyFlag: scala.Double = js.native
  /**
    * Returns the point fill mode
    */
  val PointFillMode: scala.Double = js.native
  /**
    * Returns the point list draw mode
    */
  val PointListDrawMode: scala.Double = js.native
  /**
    * The dirty texture flag value
    */
  val TextureDirtyFlag: scala.Double = js.native
  /**
    * Returns the triangle fan draw mode
    */
  val TriangleFanDrawMode: scala.Double = js.native
  /**
    * Returns the triangle fill mode
    */
  val TriangleFillMode: scala.Double = js.native
  /**
    * Returns the triangle strip draw mode
    */
  val TriangleStripDrawMode: scala.Double = js.native
  /**
    * Returns the wireframe mode
    */
  val WireFrameFillMode: scala.Double = js.native
  /**
    * Stores the clock-wise side orientation
    */
  var _ClockWiseSideOrientation: js.Any = js.native
  /**
    * Stores the counter clock-wise side orientation
    */
  var _CounterClockWiseSideOrientation: js.Any = js.native
  var _LineListDrawMode: js.Any = js.native
  var _LineLoopDrawMode: js.Any = js.native
  var _LineStripDrawMode: js.Any = js.native
  var _PointFillMode: js.Any = js.native
  var _PointListDrawMode: js.Any = js.native
  var _TriangleFanDrawMode: js.Any = js.native
  var _TriangleFillMode: js.Any = js.native
  var _TriangleStripDrawMode: js.Any = js.native
  var _WireFrameFillMode: js.Any = js.native
  /**
    * Creates a material from parsed material data
    * @param parsedMaterial defines parsed material data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures
    * @returns a new material
    */
  def Parse(parsedMaterial: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): js.Any = js.native
  /**
    * Creates a MultiMaterial from parsed MultiMaterial data.
    * @param parsedMultiMaterial defines parsed MultiMaterial data.
    * @param scene defines the hosting scene
    * @returns a new MultiMaterial
    */
  def ParseMultiMaterial(parsedMultiMaterial: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.MultiMaterial = js.native
}

