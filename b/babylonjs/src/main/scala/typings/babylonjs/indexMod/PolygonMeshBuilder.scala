package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PolygonMeshBuilder")
@js.native
open class PolygonMeshBuilder protected ()
  extends typings.babylonjs.babylonjsIndexMod.PolygonMeshBuilder {
  def this(name: String, contours: js.Array[typings.babylonjs.mathVectorMod.Vector2]) = this()
  def this(name: String, contours: Any) = this()
  /**
    * Creates a PolygonMeshBuilder
    * @param name name of the builder
    * @param contours Path of the polygon
    * @param scene scene to add to when creating the mesh
    * @param earcutInjection can be used to inject your own earcut reference
    */
  def this(name: String, contours: typings.babylonjs.mathPathMod.Path2) = this()
  def this(
    name: String,
    contours: js.Array[typings.babylonjs.mathVectorMod.Vector2],
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(name: String, contours: Any, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(
    name: String,
    contours: typings.babylonjs.mathPathMod.Path2,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    contours: js.Array[typings.babylonjs.mathVectorMod.Vector2],
    scene: Unit,
    earcutInjection: Any
  ) = this()
  def this(
    name: String,
    contours: js.Array[typings.babylonjs.mathVectorMod.Vector2],
    scene: typings.babylonjs.sceneMod.Scene,
    earcutInjection: Any
  ) = this()
  def this(name: String, contours: Any, scene: Unit, earcutInjection: Any) = this()
  def this(name: String, contours: Any, scene: typings.babylonjs.sceneMod.Scene, earcutInjection: Any) = this()
  def this(name: String, contours: typings.babylonjs.mathPathMod.Path2, scene: Unit, earcutInjection: Any) = this()
  def this(
    name: String,
    contours: typings.babylonjs.mathPathMod.Path2,
    scene: typings.babylonjs.sceneMod.Scene,
    earcutInjection: Any
  ) = this()
}
