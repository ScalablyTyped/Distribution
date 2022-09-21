package typings.babylonjs.anon

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable6
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.indexMod.SkeletonViewer
import typings.babylonjs.iskeletonviewerMod.IBoneWeightShaderOptions
import typings.babylonjs.iskeletonviewerMod.ISkeletonMapShaderOptions
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shaderMaterialMod.ShaderMaterial
import typings.babylonjs.skeletonMod.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSkeletonViewer
  extends StObject
     with Instantiable3[/* skeleton */ Skeleton, /* mesh */ AbstractMesh, /* scene */ Scene, SkeletonViewer]
     with Instantiable4[
      /* skeleton */ Skeleton, 
      /* mesh */ AbstractMesh, 
      /* scene */ Scene, 
      /* autoUpdateBonesMatrices */ Boolean, 
      SkeletonViewer
    ]
     with Instantiable5[
      /* skeleton */ Skeleton, 
      /* mesh */ AbstractMesh, 
      /* scene */ Scene, 
      (/* autoUpdateBonesMatrices */ Boolean) | (/* autoUpdateBonesMatrices */ Unit), 
      /* renderingGroupId */ Double, 
      SkeletonViewer
    ]
     with Instantiable6[
      /* skeleton */ Skeleton, 
      /* mesh */ AbstractMesh, 
      /* scene */ Scene, 
      (/* autoUpdateBonesMatrices */ Boolean) | (/* autoUpdateBonesMatrices */ Unit), 
      (/* renderingGroupId */ Double) | (/* renderingGroupId */ Unit), 
      /* options */ PartialISkeletonViewerOpt, 
      SkeletonViewer
    ] {
  
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
  /* private */ var _CreateBoneMapColorBuffer: Any = js.native
}
