package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlowLayer
  extends StObject
     with EffectLayer {
  
  /* private */ var _blurTexture1: js.Any = js.native
  
  /* private */ var _blurTexture2: js.Any = js.native
  
  /* private */ var _excludedMeshes: js.Any = js.native
  
  /* private */ var _horizontalBlurPostprocess1: js.Any = js.native
  
  /* private */ var _horizontalBlurPostprocess2: js.Any = js.native
  
  /* private */ var _includedOnlyMeshes: js.Any = js.native
  
  /* private */ var _intensity: js.Any = js.native
  
  /* private */ var _meshesUsingTheirOwnMaterials: js.Any = js.native
  
  /* private */ var _options: js.Any = js.native
  
  /* private */ var _postProcesses1: js.Any = js.native
  
  /* private */ var _postProcesses2: js.Any = js.native
  
  /**
    * Returns true if the mesh should render, otherwise false.
    * @param mesh The mesh to render
    * @returns true if it should render otherwise false
    */
  /* protected */ def _shouldRenderMesh(mesh: Mesh): Boolean = js.native
  
  /* private */ var _verticalBlurPostprocess1: js.Any = js.native
  
  /* private */ var _verticalBlurPostprocess2: js.Any = js.native
  
  /**
    * Add a mesh in the exclusion list to prevent it to impact or being impacted by the glow layer.
    * @param mesh The mesh to exclude from the glow layer
    */
  def addExcludedMesh(mesh: Mesh): Unit = js.native
  
  /**
    * Add a mesh in the inclusion list to impact or being impacted by the glow layer.
    * @param mesh The mesh to include in the glow layer
    */
  def addIncludedOnlyMesh(mesh: Mesh): Unit = js.native
  
  /**
    * Gets the kernel size of the blur.
    */
  def blurKernelSize: Double = js.native
  /**
    * Sets the kernel size of the blur.
    */
  def blurKernelSize_=(value: Double): Unit = js.native
  
  /**
    * Callback used to let the user override the color selection on a per mesh basis
    */
  def customEmissiveColorSelector(mesh: Mesh, subMesh: SubMesh, material: Material, result: Color4): Unit = js.native
  
  /**
    * Callback used to let the user override the texture selection on a per mesh basis
    */
  def customEmissiveTextureSelector(mesh: Mesh, subMesh: SubMesh, material: Material): Texture = js.native
  
  /**
    * Gets the glow intensity.
    */
  def intensity: Double = js.native
  /**
    * Sets the glow intensity.
    */
  def intensity_=(value: Double): Unit = js.native
  
  /**
    * Add a mesh to be rendered through its own material and not with emissive only.
    * @param mesh The mesh for which we need to use its material
    */
  def referenceMeshToUseItsOwnMaterial(mesh: AbstractMesh): Unit = js.native
  
  /**
    * Remove a mesh from the exclusion list to let it impact or being impacted by the glow layer.
    * @param mesh The mesh to remove
    */
  def removeExcludedMesh(mesh: Mesh): Unit = js.native
  
  /**
    * Remove a mesh from the Inclusion list to prevent it to impact or being impacted by the glow layer.
    * @param mesh The mesh to remove
    */
  def removeIncludedOnlyMesh(mesh: Mesh): Unit = js.native
  
  /**
    * Serializes this glow layer
    * @returns a serialized glow layer object
    */
  @JSName("serialize")
  def serialize_MGlowLayer(): js.Any = js.native
  
  /**
    * Remove a mesh from being rendered through its own material and not with emissive only.
    * @param mesh The mesh for which we need to not use its material
    */
  def unReferenceMeshFromUsingItsOwnMaterial(mesh: AbstractMesh): Unit = js.native
}
