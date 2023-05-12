package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FluidRenderer extends StObject {
  
  /* private */ var _cameras: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
  /* private */ var _getParticleSystemIndex: Any = js.native
  
  /* private */ var _initialize: Any = js.native
  
  /* private */ var _onEngineResizeObserver: Any = js.native
  
  /** @internal */
  def _prepareRendering(): Unit = js.native
  
  /* private */ var _removeUnusedTargetRenderers: Any = js.native
  
  /** @internal */
  def _render(): Unit = js.native
  def _render(forCamera: Camera): Unit = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _setParticleSizeForRenderTargets: Any = js.native
  
  /* private */ var _setUseVelocityForRenderObject: Any = js.native
  
  /* private */ var _sortRenderingObjects: Any = js.native
  
  /**
    * Adds a custom particle set to the fluid renderer.
    * @param buffers The list of buffers (should contain at least a "position" buffer!)
    * @param numParticles Number of particles in each buffer
    * @param generateDiffuseTexture True if you want to generate a diffuse texture from buffers and use it as part of the fluid rendering (default: false). For the texture to be generated correctly, you need a "color" buffer in the set!
    * @param targetRenderer The target renderer used to display the particle system as a fluid. If not provided, the method will create a new one
    * @param camera The camera used by the target renderer (if the target renderer is created by the method)
    * @returns the render object corresponding to the custom particle set
    */
  def addCustomParticles(buffers: org.scalablytyped.runtime.StringDictionary[FloatArray], numParticles: Double): IFluidRenderingRenderObject = js.native
  def addCustomParticles(
    buffers: org.scalablytyped.runtime.StringDictionary[FloatArray],
    numParticles: Double,
    generateDiffuseTexture: Boolean
  ): IFluidRenderingRenderObject = js.native
  def addCustomParticles(
    buffers: org.scalablytyped.runtime.StringDictionary[FloatArray],
    numParticles: Double,
    generateDiffuseTexture: Boolean,
    targetRenderer: Unit,
    camera: Camera
  ): IFluidRenderingRenderObject = js.native
  def addCustomParticles(
    buffers: org.scalablytyped.runtime.StringDictionary[FloatArray],
    numParticles: Double,
    generateDiffuseTexture: Boolean,
    targetRenderer: FluidRenderingTargetRenderer
  ): IFluidRenderingRenderObject = js.native
  def addCustomParticles(
    buffers: org.scalablytyped.runtime.StringDictionary[FloatArray],
    numParticles: Double,
    generateDiffuseTexture: Boolean,
    targetRenderer: FluidRenderingTargetRenderer,
    camera: Camera
  ): IFluidRenderingRenderObject = js.native
  def addCustomParticles(
    buffers: org.scalablytyped.runtime.StringDictionary[FloatArray],
    numParticles: Double,
    generateDiffuseTexture: Unit,
    targetRenderer: Unit,
    camera: Camera
  ): IFluidRenderingRenderObject = js.native
  def addCustomParticles(
    buffers: org.scalablytyped.runtime.StringDictionary[FloatArray],
    numParticles: Double,
    generateDiffuseTexture: Unit,
    targetRenderer: FluidRenderingTargetRenderer
  ): IFluidRenderingRenderObject = js.native
  def addCustomParticles(
    buffers: org.scalablytyped.runtime.StringDictionary[FloatArray],
    numParticles: Double,
    generateDiffuseTexture: Unit,
    targetRenderer: FluidRenderingTargetRenderer,
    camera: Camera
  ): IFluidRenderingRenderObject = js.native
  
  /**
    * Adds a particle system to the fluid renderer.
    * Note that you should not normally call this method directly, as you can simply use the renderAsFluid property of the ParticleSystem/GPUParticleSystem class
    * @param ps particle system
    * @param generateDiffuseTexture True if you want to generate a diffuse texture from the particle system and use it as part of the fluid rendering (default: false)
    * @param targetRenderer The target renderer used to display the particle system as a fluid. If not provided, the method will create a new one
    * @param camera The camera used by the target renderer (if the target renderer is created by the method)
    * @returns the render object corresponding to the particle system
    */
  def addParticleSystem(ps: IParticleSystem): IFluidRenderingRenderObject = js.native
  def addParticleSystem(ps: IParticleSystem, generateDiffuseTexture: Boolean): IFluidRenderingRenderObject = js.native
  def addParticleSystem(ps: IParticleSystem, generateDiffuseTexture: Boolean, targetRenderer: Unit, camera: Camera): IFluidRenderingRenderObject = js.native
  def addParticleSystem(ps: IParticleSystem, generateDiffuseTexture: Boolean, targetRenderer: FluidRenderingTargetRenderer): IFluidRenderingRenderObject = js.native
  def addParticleSystem(
    ps: IParticleSystem,
    generateDiffuseTexture: Boolean,
    targetRenderer: FluidRenderingTargetRenderer,
    camera: Camera
  ): IFluidRenderingRenderObject = js.native
  def addParticleSystem(ps: IParticleSystem, generateDiffuseTexture: Unit, targetRenderer: Unit, camera: Camera): IFluidRenderingRenderObject = js.native
  def addParticleSystem(ps: IParticleSystem, generateDiffuseTexture: Unit, targetRenderer: FluidRenderingTargetRenderer): IFluidRenderingRenderObject = js.native
  def addParticleSystem(
    ps: IParticleSystem,
    generateDiffuseTexture: Unit,
    targetRenderer: FluidRenderingTargetRenderer,
    camera: Camera
  ): IFluidRenderingRenderObject = js.native
  
  /**
    * Disposes of all the ressources used by the class
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets the render object corresponding to a particle system (null if the particle system is not rendered as a fluid)
    * @param ps The particle system
    * @returns the render object corresponding to this particle system if any, otherwise null
    */
  def getRenderObjectFromParticleSystem(ps: IParticleSystem): Nullable[IFluidRenderingRenderObject] = js.native
  
  /**
    * Reinitializes the class
    * Can be used if you change the object priority (FluidRenderingObject.priority), to make sure the objects are rendered in the right order
    */
  def recreate(): Unit = js.native
  
  /**
    * Removes a render object from the fluid renderer
    * @param renderObject the render object to remove
    * @param removeUnusedTargetRenderer True to remove/dispose of the target renderer if it's not used anymore (default: true)
    * @returns True if the render object has been found and released, else false
    */
  def removeRenderObject(renderObject: IFluidRenderingRenderObject): Boolean = js.native
  def removeRenderObject(renderObject: IFluidRenderingRenderObject, removeUnusedTargetRenderer: Boolean): Boolean = js.native
  
  /** Retrieves all the render objects managed by the class */
  val renderObjects: js.Array[IFluidRenderingRenderObject] = js.native
  
  /** Retrieves all the render target renderers managed by the class */
  val targetRenderers: js.Array[FluidRenderingTargetRenderer] = js.native
}
