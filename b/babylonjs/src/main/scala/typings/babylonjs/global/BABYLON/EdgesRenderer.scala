package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IEdgesRendererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.EdgesRenderer")
@js.native
class EdgesRenderer protected ()
  extends StObject
     with typings.babylonjs.BABYLON.EdgesRenderer {
  /**
    * Creates an instance of the EdgesRenderer. It is primarily use to display edges of a mesh.
    * Beware when you use this class with complex objects as the adjacencies computation can be really long
    * @param  source Mesh used to create edges
    * @param  epsilon sum of angles in adjacency to check for edge
    * @param  checkVerticesInsteadOfIndices bases the edges detection on vertices vs indices. Note that this parameter is not used if options.useAlternateEdgeFinder = true
    * @param  generateEdgesLines - should generate Lines or only prepare resources.
    * @param  options The options to apply when generating the edges
    */
  def this(source: typings.babylonjs.BABYLON.AbstractMesh) = this()
  def this(source: typings.babylonjs.BABYLON.AbstractMesh, epsilon: Double) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Boolean
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Unit,
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Unit,
    generateEdgesLines: Boolean
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Unit,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Unit,
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Unit,
    generateEdgesLines: Unit,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Boolean,
    generateEdgesLines: Unit,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Unit,
    generateEdgesLines: Boolean,
    options: IEdgesRendererOptions
  ) = this()
  def this(
    source: typings.babylonjs.BABYLON.AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Unit,
    generateEdgesLines: Unit,
    options: IEdgesRendererOptions
  ) = this()
  
  /**
    * List of instances to render in case the source mesh has instances
    */
  /* CompleteClass */
  var customInstances: typings.babylonjs.BABYLON.SmartArray[typings.babylonjs.BABYLON.Matrix] = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if the edgesRenderer is active
    */
  /* CompleteClass */
  var isEnabled: Boolean = js.native
  
  /**
    * Checks wether or not the edges renderer is ready to render.
    * @return true if ready, otherwise false.
    */
  /* CompleteClass */
  override def isReady(): Boolean = js.native
  
  /**
    * Renders the edges of the attached mesh,
    */
  /* CompleteClass */
  override def render(): Unit = js.native
}
/* static members */
object EdgesRenderer {
  
  @JSGlobal("BABYLON.EdgesRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.EdgesRenderer.GetShader")
  @js.native
  def GetShader: js.Any = js.native
  inline def GetShader_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetShader")(x.asInstanceOf[js.Any])
}
