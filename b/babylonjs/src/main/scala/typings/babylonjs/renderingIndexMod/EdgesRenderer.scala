package typings.babylonjs.renderingIndexMod

import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.renderingEdgesRendererMod.IEdgesRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/index", "EdgesRenderer")
@js.native
open class EdgesRenderer protected ()
  extends typings.babylonjs.renderingEdgesRendererMod.EdgesRenderer {
  /**
    * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
    * Beware when you use this class with complex objects as the adjacencies computation can be really long
    * @param  source Mesh used to create edges
    * @param  epsilon sum of angles in adjacency to check for edge
    * @param  checkVerticesInsteadOfIndices bases the edges detection on vertices vs indices. Note that this parameter is not used if options.useAlternateEdgeFinder = true
    * @param  generateEdgesLines - should generate Lines or only prepare resources.
    * @param  options The options to apply when generating the edges
    */
  def this(source: AbstractMesh) = this()
  def this(source: AbstractMesh, epsilon: Double) = this()
  def this(source: AbstractMesh, epsilon: Double, checkVerticesInsteadOfIndices: Boolean) = this()
  def this(source: AbstractMesh, epsilon: Unit, checkVerticesInsteadOfIndices: Boolean) = this()
  def this(
    source: AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Unit,
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Unit,
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Unit,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Unit,
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Unit,
    generateEdgesLines: Unit,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Unit,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Unit,
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Unit,
    generateEdgesLines: Unit,
    options: IEdgesRendererOptions
  ) = this()
}
/* static members */
object EdgesRenderer {
  
  @JSImport("babylonjs/Rendering/index", "EdgesRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Rendering/index", "EdgesRenderer._GetShader")
  @js.native
  def _GetShader: Any = js.native
  inline def _GetShader_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetShader")(x.asInstanceOf[js.Any])
}
