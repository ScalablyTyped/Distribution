package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FluidRenderingObject extends StObject {
  
  /* protected */ def _createEffects(): Unit = js.native
  
  /* protected */ var _depthEffectWrapper: Nullable[EffectWrapper] = js.native
  
  /* protected */ var _effectsAreDirty: Boolean = js.native
  
  /* protected */ var _engine: Engine = js.native
  
  /* private */ var _hasVelocity: Any = js.native
  
  /* protected */ var _particleSize: Double = js.native
  
  /* protected */ var _scene: Scene = js.native
  
  /* protected */ var _thicknessEffectWrapper: Nullable[EffectWrapper] = js.native
  
  /* private */ var _useVelocity: Any = js.native
  
  /**
    * Releases the ressources used by the class
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets the name of the class
    */
  def getClassName(): String = js.native
  
  /**
    * Gets the index buffer (or null if the object is using instancing)
    */
  def indexBuffer: Nullable[DataBuffer] = js.native
  
  /**
    * Indicates if the object is ready to be rendered
    * @returns True if everything is ready for the object to be rendered, otherwise false
    */
  def isReady(): Boolean = js.native
  
  /**
    * Gets the number of particles (vertices) of this object
    * @returns The number of particles
    */
  def numParticles: Double = js.native
  
  /** Observable triggered when the size of the particle is changed */
  var onParticleSizeChanged: Observable[FluidRenderingObject] = js.native
  
  /** Gets or sets the size of the particle */
  def particleSize: Double = js.native
  def particleSize_=(size: Double): Unit = js.native
  
  /** Defines the alpha value of a particle */
  var particleThicknessAlpha: Double = js.native
  
  /** Defines the priority of the object. Objects will be rendered in ascending order of priority */
  var priority: Double = js.native
  
  /**
    * Render the depth texture for this object
    */
  def renderDepthTexture(): Unit = js.native
  
  /**
    * Render the diffuse texture for this object
    */
  def renderDiffuseTexture(): Unit = js.native
  
  /**
    * Render the thickness texture for this object
    */
  def renderThicknessTexture(): Unit = js.native
  
  /** Indicates if the object uses instancing or not */
  def useInstancing: Boolean = js.native
  
  /** Indicates if velocity of particles should be used when rendering the object. The vertex buffer set must contain a "velocity" buffer for this to work! */
  def useVelocity: Boolean = js.native
  def useVelocity_=(use: Boolean): Unit = js.native
  
  /**
    * Gets the vertex buffers
    */
  def vertexBuffers: org.scalablytyped.runtime.StringDictionary[VertexBuffer] = js.native
}
