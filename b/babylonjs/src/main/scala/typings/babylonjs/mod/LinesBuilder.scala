package typings.babylonjs.mod

import typings.babylonjs.anon.DashSize
import typings.babylonjs.anon.Instance
import typings.babylonjs.anon.Points
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "LinesBuilder")
@js.native
class LinesBuilder ()
  extends typings.babylonjs.legacyMod.LinesBuilder
/* static members */
@JSImport("babylonjs", "LinesBuilder")
@js.native
object LinesBuilder extends js.Object {
  
  /**
    * Creates a dashed line mesh
    * * A dashed line mesh is considered as a parametric shape since it has no predefined original shape. Its shape is determined by the passed array of points as an input parameter
    * * Like every other parametric shape, it is dynamically updatable by passing an existing instance of LineMesh to this static function
    * * The parameter `points` is an array successive Vector3
    * * The parameter `dashNb` is the intended total number of dashes (positive integer, default 200)
    * * The parameter `dashSize` is the size of the dashes relatively the dash number (positive float, default 3)
    * * The parameter `gapSize` is the size of the gap between two successive dashes relatively the dash number (positive float, default 1)
    * * The optional parameter `instance` is an instance of an existing LineMesh object to be updated with the passed `points` parameter : https://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh#lines-and-dashedlines
    * * The optional parameter `useVertexAlpha` is to be set to `false` (default `true`) when you don't need the alpha blending (faster)
    * * When updating an instance, remember that only point positions can change, not the number of points
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the dashed line mesh
    * @see https://doc.babylonjs.com/how_to/parametric_shapes#dashed-lines
    */
  def CreateDashedLines(name: String, options: DashSize): typings.babylonjs.linesMeshMod.LinesMesh = js.native
  def CreateDashedLines(name: String, options: DashSize, scene: Nullable[typings.babylonjs.sceneMod.Scene]): typings.babylonjs.linesMeshMod.LinesMesh = js.native
  
  /**
    * Creates a line system mesh. A line system is a pool of many lines gathered in a single mesh
    * * A line system mesh is considered as a parametric shape since it has no predefined original shape. Its shape is determined by the passed array of lines as an input parameter
    * * Like every other parametric shape, it is dynamically updatable by passing an existing instance of LineSystem to this static function
    * * The parameter `lines` is an array of lines, each line being an array of successive Vector3
    * * The optional parameter `instance` is an instance of an existing LineSystem object to be updated with the passed `lines` parameter
    * * The optional parameter `colors` is an array of line colors, each line colors being an array of successive Color4, one per line point
    * * The optional parameter `useVertexAlpha` is to be set to `false` (default `true`) when you don't need the alpha blending (faster)
    * * Updating a simple Line mesh, you just need to update every line in the `lines` array : https://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh#lines-and-dashedlines
    * * When updating an instance, remember that only line point positions can change, not the number of points, neither the number of lines
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @see https://doc.babylonjs.com/how_to/parametric_shapes#line-system
    * @param name defines the name of the new line system
    * @param options defines the options used to create the line system
    * @param scene defines the hosting scene
    * @returns a new line system mesh
    */
  def CreateLineSystem(name: String, options: Instance, scene: Nullable[typings.babylonjs.sceneMod.Scene]): typings.babylonjs.linesMeshMod.LinesMesh = js.native
  
  /**
    * Creates a line mesh
    * A line mesh is considered as a parametric shape since it has no predefined original shape. Its shape is determined by the passed array of points as an input parameter
    * * Like every other parametric shape, it is dynamically updatable by passing an existing instance of LineMesh to this static function
    * * The parameter `points` is an array successive Vector3
    * * The optional parameter `instance` is an instance of an existing LineMesh object to be updated with the passed `points` parameter : https://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh#lines-and-dashedlines
    * * The optional parameter `colors` is an array of successive Color4, one per line point
    * * The optional parameter `useVertexAlpha` is to be set to `false` (default `true`) when you don't need alpha blending (faster)
    * * When updating an instance, remember that only point positions can change, not the number of points
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @see https://doc.babylonjs.com/how_to/parametric_shapes#lines
    * @param name defines the name of the new line system
    * @param options defines the options used to create the line system
    * @param scene defines the hosting scene
    * @returns a new line mesh
    */
  def CreateLines(name: String, options: Points): typings.babylonjs.linesMeshMod.LinesMesh = js.native
  def CreateLines(name: String, options: Points, scene: Nullable[typings.babylonjs.sceneMod.Scene]): typings.babylonjs.linesMeshMod.LinesMesh = js.native
}
