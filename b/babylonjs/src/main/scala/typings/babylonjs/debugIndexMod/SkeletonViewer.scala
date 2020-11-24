package typings.babylonjs.debugIndexMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.PartialISkeletonViewerOpt
import typings.babylonjs.iskeletonviewerMod.IBoneWeightShaderOptions
import typings.babylonjs.iskeletonviewerMod.ISkeletonMapShaderOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shaderMaterialMod.ShaderMaterial
import typings.babylonjs.skeletonMod.Skeleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Debug/index", "SkeletonViewer")
@js.native
class SkeletonViewer protected ()
  extends typings.babylonjs.skeletonViewerMod.SkeletonViewer {
  /**
    * Creates a new SkeletonViewer
    * @param skeleton defines the skeleton to render
    * @param mesh defines the mesh attached to the skeleton
    * @param scene defines the hosting scene
    * @param autoUpdateBonesMatrices defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)
    * @param renderingGroupId defines the rendering group id to use with the viewer
    * @param options All of the extra constructor options for the SkeletonViewer
    */
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    /** The Scene scope*/
  scene: Scene
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    /** The Scene scope*/
  scene: Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    /** The Scene scope*/
  scene: Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: Double
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    /** The Scene scope*/
  scene: Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean,
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: Double
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    /** The Scene scope*/
  scene: Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: js.UndefOr[scala.Nothing],
    /** is the options for the viewer */
  options: PartialISkeletonViewerOpt
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    /** The Scene scope*/
  scene: Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: js.UndefOr[scala.Nothing],
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: Double,
    /** is the options for the viewer */
  options: PartialISkeletonViewerOpt
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    /** The Scene scope*/
  scene: Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean,
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: js.UndefOr[scala.Nothing],
    /** is the options for the viewer */
  options: PartialISkeletonViewerOpt
  ) = this()
  def this(
    /** defines the skeleton to render */
  skeleton: Skeleton,
    /** defines the mesh attached to the skeleton */
  mesh: AbstractMesh,
    /** The Scene scope*/
  scene: Scene,
    /** defines a boolean indicating if bones matrices must be forced to update before rendering (true by default)  */
  autoUpdateBonesMatrices: Boolean,
    /** defines the rendering group id to use with the viewer */
  renderingGroupId: Double,
    /** is the options for the viewer */
  options: PartialISkeletonViewerOpt
  ) = this()
}
/* static members */
@JSImport("babylonjs/Debug/index", "SkeletonViewer")
@js.native
object SkeletonViewer extends js.Object {
  
  /** public static method to create a BoneWeight Shader
    * @param options The constructor options
    * @param scene The scene that the shader is scoped to
    * @returns The created ShaderMaterial
    * @see http://www.babylonjs-playground.com/#1BZJVJ#395
    */
  def CreateBoneWeightShader(options: IBoneWeightShaderOptions, scene: Scene): ShaderMaterial = js.native
  
  /** public static method to create a BoneWeight Shader
    * @param options The constructor options
    * @param scene The scene that the shader is scoped to
    * @returns The created ShaderMaterial
    */
  def CreateSkeletonMapShader(options: ISkeletonMapShaderOptions, scene: Scene): ShaderMaterial = js.native
  
  /** public Display constants BABYLON.SkeletonViewer.DISPLAY_LINES */
  val DISPLAY_LINES: Double = js.native
  
  /** public Display constants BABYLON.SkeletonViewer.DISPLAY_SPHERES */
  val DISPLAY_SPHERES: Double = js.native
  
  /** public Display constants BABYLON.SkeletonViewer.DISPLAY_SPHERE_AND_SPURS */
  val DISPLAY_SPHERE_AND_SPURS: Double = js.native
  
  /** private static method to create a BoneWeight Shader
    * @param size The size of the buffer to create (usually the bone count)
    * @param colorMap The gradient data to generate
    * @param scene The scene that the shader is scoped to
    * @returns an Array of floats from the color gradient values
    */
  var _CreateBoneMapColorBuffer: js.Any = js.native
}
