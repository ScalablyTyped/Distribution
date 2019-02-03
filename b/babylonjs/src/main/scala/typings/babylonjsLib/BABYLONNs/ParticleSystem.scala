package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a particle system in Babylon.
  * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
  * Particles can take different shapes while emitted like box, sphere, cone or you can write your custom function.
  * @example https://doc.babylonjs.com/babylon101/particles
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- babylonjsLib.BABYLONNs.IParticleSystem because var conflicts: animations, beginAnimationFrom, beginAnimationLoop, beginAnimationOnStart, beginAnimationTo, billboardMode, blendMode, color1, color2, colorDead, disposeOnStop, emitRate, emitter, endSpriteCellID, gravity, id, isAnimationSheetEnabled, isBillboardBased, layerMask, limitVelocityDamping, maxAngularSpeed, maxEmitPower, maxInitialRotation, maxLifeTime, maxScaleX, maxScaleY, maxSize, minAngularSpeed, minEmitPower, minInitialRotation, minLifeTime, minScaleX, minScaleY, minSize, name, noiseStrength, noiseTexture, particleEmitterType, particleTexture, preWarmCycles, preWarmStepOffset, renderingGroupId, spriteCellChangeSpeed, spriteCellHeight, spriteCellWidth, spriteRandomStartCell, startDelay, startSpriteCellID, targetStopDuration, translationPivot, updateSpeed. Inlined getCapacity, isStarted, animate, render, dispose, dispose, clone, serialize, rebuild, start, start, stop, reset, isReady, addColorGradient, addColorGradient, removeColorGradient, addSizeGradient, addSizeGradient, removeSizeGradient, getColorGradients, getSizeGradients, getAngularSpeedGradients, addAngularSpeedGradient, addAngularSpeedGradient, removeAngularSpeedGradient, getVelocityGradients, addVelocityGradient, addVelocityGradient, removeVelocityGradient, getLimitVelocityGradients, addLimitVelocityGradient, addLimitVelocityGradient, removeLimitVelocityGradient, addDragGradient, addDragGradient, removeDragGradient, getDragGradients, addEmitRateGradient, addEmitRateGradient, removeEmitRateGradient, getEmitRateGradients, addStartSizeGradient, addStartSizeGradient, removeStartSizeGradient, getStartSizeGradients, addLifeTimeGradient, addLifeTimeGradient, removeLifeTimeGradient, getLifeTimeGradients, addRampGradient, getRampGradients, useRampGradients, addColorRemapGradient, getColorRemapGradients, addAlphaRemapGradient, getAlphaRemapGradients, createPointEmitter, createHemisphericEmitter, createSphereEmitter, createDirectedSphereEmitter, createCylinderEmitter, createDirectedCylinderEmitter, createConeEmitter, createBoxEmitter, getScene- babylonjsLib.BABYLONNs.IAnimatable because var conflicts: animations. Inlined  */ @JSGlobal("BABYLON.ParticleSystem")
@js.native
class ParticleSystem protected ()
  extends BaseParticleSystem
     with IDisposable {
  /**
    * Instantiates a particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    * @param capacity The max number of particles alive at the same time
    * @param scene The scene the particle system belongs to
    * @param customEffect a custom effect used to change the way particles are rendered by default
    * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
    * @param epsilon Offset used to render the particles
    */
  def this(name: java.lang.String, capacity: scala.Double, scene: Scene) = this()
  def this(name: java.lang.String, capacity: scala.Double, scene: Scene, customEffect: Nullable[Effect]) = this()
  def this(name: java.lang.String, capacity: scala.Double, scene: Scene, customEffect: Nullable[Effect], isAnimationSheetEnabled: scala.Boolean) = this()
  def this(name: java.lang.String, capacity: scala.Double, scene: Scene, customEffect: Nullable[Effect], isAnimationSheetEnabled: scala.Boolean, epsilon: scala.Double) = this()
  var _actualFrame: js.Any = js.native
  var _addFactorGradient: js.Any = js.native
  var _alive: js.Any = js.native
  var _appendParticleVertices: js.Any = js.native
  var _cachedDefines: js.Any = js.native
  var _capacity: js.Any = js.native
  var _colorDiff: js.Any = js.native
  var _createIndexBuffer: js.Any = js.native
  var _createParticle: js.Any = js.native
  var _createRampGradientTexture: js.Any = js.native
  var _createVertexBuffers: js.Any = js.native
  /** @hidden */
  var _currentEmitRate1: scala.Double = js.native
  /** @hidden */
  var _currentEmitRate2: scala.Double = js.native
  /** @hidden */
  var _currentEmitRateGradient: Nullable[FactorGradient] = js.native
  var _currentRenderId: js.Any = js.native
  /** @hidden */
  var _currentStartSize1: scala.Double = js.native
  /** @hidden */
  var _currentStartSize2: scala.Double = js.native
  /** @hidden */
  var _currentStartSizeGradient: Nullable[FactorGradient] = js.native
  var _customEffect: js.Any = js.native
  /**
    * @hidden
    * If the particle systems emitter should be disposed when the particle system is disposed
    */
  var _disposeEmitterOnDispose: scala.Boolean = js.native
  var _effect: js.Any = js.native
  var _emitFromParticle: js.Any = js.native
  var _emitterWorldMatrix: js.Any = js.native
  var _epsilon: js.Any = js.native
  var _fetchR: js.Any = js.native
  /** @hidden */
  var _getEffect: js.Any = js.native
  var _indexBuffer: js.Any = js.native
  /**
    * @hidden
    */
  var _inheritedVelocityOffset: Vector3 = js.native
  var _newPartsExcess: js.Any = js.native
  var _onDisposeObserver: js.Any = js.native
  var _particles: js.Any = js.native
  var _prepareSubEmitterInternalArray: js.Any = js.native
  var _rampGradientsTexture: js.Any = js.native
  val _rawTextureWidth: js.Any = js.native
  var _removeFactorGradient: js.Any = js.native
  var _removeFromRoot: js.Any = js.native
  var _render: js.Any = js.native
  var _resetEffect: js.Any = js.native
  var _rootParticleSystem: js.Any = js.native
  var _scaledColorStep: js.Any = js.native
  var _scaledDirection: js.Any = js.native
  var _scaledGravity: js.Any = js.native
  var _scaledUpdateSpeed: js.Any = js.native
  var _spriteBuffer: js.Any = js.native
  var _started: js.Any = js.native
  var _stockParticles: js.Any = js.native
  var _stopSubEmitters: js.Any = js.native
  var _stopped: js.Any = js.native
  var _subEmitters: js.Any = js.native
  var _update: js.Any = js.native
  var _useInstancing: js.Any = js.native
  var _useRampGradients: js.Any = js.native
  var _vertexBuffer: js.Any = js.native
  var _vertexBufferSize: js.Any = js.native
  var _vertexBuffers: js.Any = js.native
  var _vertexData: js.Any = js.native
  /**
    * The current active Sub-systems, this property is used by the root particle system only.
    */
  var activeSubSystems: js.Array[ParticleSystem] = js.native
  /**
    * An event triggered when the system is disposed
    */
  var onDisposeObservable: Observable[ParticleSystem] = js.native
  /**
    * Gets the current list of active particles
    */
  val particles: js.Array[Particle] = js.native
  /**
    * The Sub-emitters templates that will be used to generate the sub particle system to be associated with the system, this property is used by the root particle system only.
    * When a particle is spawned, an array will be chosen at random and all the emitters in that array will be attached to the particle.  (Default: [])
    */
  var subEmitters: js.Array[ParticleSystem | SubEmitter | js.Array[SubEmitter]] = js.native
  /** Gets or sets a boolean indicating that ramp gradients must be used
    * @see http://doc.babylonjs.com/babylon101/particles#ramp-gradients
    */
  var useRampGradients: scala.Boolean = js.native
  /**
    * @hidden (for internal use only)
    */
  def _appendParticleVertex(index: scala.Double, particle: Particle, offsetX: scala.Double, offsetY: scala.Double): scala.Unit = js.native
  /**
    * Adds a new alpha remap gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param min defines the alpha remap minimal range
    * @param max defines the alpha remap maximal range
    * @returns the current particle system
    */
  def addAlphaRemapGradient(gradient: scala.Double, min: scala.Double, max: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new angular speed gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the angular speed  to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  /**
    * Adds a new angular speed gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the angular speed to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addAngularSpeedGradient(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  def addAngularSpeedGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new color gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color1 defines the color to affect to the specified gradient
    * @param color2 defines an additional color used to define a range ([color, color2]) with main color to pick the final color from
    * @returns this particle system
    */
  /**
    * Adds a new color gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color1 defines the color to affect to the specified gradient
    * @param color2 defines an additional color used to define a range ([color, color2]) with main color to pick the final color from
    * @returns the current particle system
    */
  def addColorGradient(gradient: scala.Double, color1: Color4): IParticleSystem = js.native
  def addColorGradient(gradient: scala.Double, color1: Color4, color2: Color4): IParticleSystem = js.native
  /**
    * Adds a new color remap gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param min defines the color remap minimal range
    * @param max defines the color remap maximal range
    * @returns the current particle system
    */
  def addColorRemapGradient(gradient: scala.Double, min: scala.Double, max: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new drag gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the drag value to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  /**
    * Adds a new drag gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the drag to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addDragGradient(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  def addDragGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new emit rate gradient (please note that this will only work if you set the targetStopDuration property)
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the emit rate value to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  /**
    * Adds a new emit rate gradient (please note that this will only work if you set the targetStopDuration property)
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the emit rate to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addEmitRateGradient(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  def addEmitRateGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new life time gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the life time factor to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addLifeTimeGradient(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  def addLifeTimeGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new limit velocity gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the limit velocity value to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  /**
    * Adds a new limit velocity gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the limit velocity to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addLimitVelocityGradient(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  def addLimitVelocityGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new ramp gradient used to remap particle colors
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color defines the color to affect to the specified gradient
    * @returns the current particle system
    */
  def addRampGradient(gradient: scala.Double, color: Color3): ParticleSystem = js.native
  /**
    * Adds a new ramp gradient used to remap particle colors
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color defines the color to affect to the specified gradient
    * @returns the current particle system
    */
  @JSName("addRampGradient")
  def addRampGradient_IParticleSystem(gradient: scala.Double, color: Color3): IParticleSystem = js.native
  /**
    * Adds a new size gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the size factor to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addSizeGradient(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  def addSizeGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new start size gradient (please note that this will only work if you set the targetStopDuration property)
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the start size value to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  /**
    * Adds a new start size gradient (please note that this will only work if you set the targetStopDuration property)
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the start size to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addStartSizeGradient(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  def addStartSizeGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new velocity gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the velocity to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addVelocityGradient(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  def addVelocityGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
  /**
    * Animates the particle system for the current frame by emitting new particles and or animating the living ones.
    * @param preWarmOnly will prevent the system from updating the vertex buffer (default is false)
    */
  /**
    * Animates the particle system for this frame.
    */
  def animate(): scala.Unit = js.native
  def animate(preWarmOnly: scala.Boolean): scala.Unit = js.native
  /**
    * Clones the particle system.
    * @param name The name of the cloned object
    * @param newEmitter The new emitter to use
    * @returns the cloned particle system
    */
  def clone(name: java.lang.String, newEmitter: js.Any): ParticleSystem = js.native
  /**
    * Clones the particle system.
    * @param name The name of the cloned object
    * @param newEmitter The new emitter to use
    * @returns the cloned particle system
    */
  @JSName("clone")
  def clone_Nullable(name: java.lang.String, newEmitter: js.Any): Nullable[IParticleSystem] = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def dispose(disposeTexture: scala.Boolean): scala.Unit = js.native
  /**
    * Gets the maximum number of particles active at the same time.
    * @returns The max number of active particles.
    */
  def getCapacity(): scala.Double = js.native
  /**
    * Returns the string "ParticleSystem"
    * @returns a string containing the class name
    */
  def getClassName(): java.lang.String = js.native
  /**
    * Gets the current list of ramp gradients.
    * You must use addRampGradient and removeRampGradient to udpate this list
    * @returns the list of ramp gradients
    */
  def getRampGradients(): Nullable[js.Array[Color3Gradient]] = js.native
  /**
    * Gets whether there are still active particles in the system.
    * @returns True if it is alive, otherwise false.
    */
  def isAlive(): scala.Boolean = js.native
  /**
    * Is this system ready to be used/rendered
    * @return true if the system is ready
    */
  def isReady(): scala.Boolean = js.native
  /**
    * Gets if the system has been started. (Note: this will still be true after stop is called)
    * @returns True if it has been started, otherwise false.
    */
  def isStarted(): scala.Boolean = js.native
  /**
    * Sets a callback that will be triggered when the system is disposed
    */
  def onDispose(): scala.Unit = js.native
  /**
    * Rebuilds the particle system.
    */
  /**
    * Rebuild the particle system
    */
  def rebuild(): scala.Unit = js.native
  /**
    * "Recycles" one of the particle by copying it back to the "stock" of particles and removing it from the active list.
    * Its lifetime will start back at 0.
    */
  def recycleParticle(particle: Particle): scala.Unit = js.native
  /**
    * Remove a specific alpha remap gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeAlphaRemapGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific angular speed gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeAngularSpeedGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific color gradient
    * @param gradient defines the gradient to remove
    * @returns this particle system
    */
  /**
    * Remove a specific color gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeColorGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific color remap gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeColorRemapGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific drag gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeDragGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific emit rate gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeEmitRateGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific life time gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeLifeTimeGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific limit velocity gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeLimitVelocityGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific ramp gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeRampGradient(gradient: scala.Double): ParticleSystem = js.native
  /**
    * Remove a specific size gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeSizeGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific start size gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeStartSizeGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific velocity gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeVelocityGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Renders the particle system in its current state.
    * @returns the current number of particles
    */
  def render(): scala.Double = js.native
  /**
    * Remove all active particles
    */
  def reset(): scala.Unit = js.native
  /**
    * Serializes the particle system to a JSON object.
    * @returns the JSON object
    */
  def serialize(): js.Any = js.native
  /**
    * Starts the particle system and begins to emit
    * @param delay defines the delay in milliseconds before starting the system (this.startDelay by default)
    */
  /**
    * Starts the particle system and begins to emit
    * @param delay defines the delay in milliseconds before starting the system (0 by default)
    */
  def start(): scala.Unit = js.native
  def start(delay: scala.Double): scala.Unit = js.native
  /**
    * This function can be defined to specify initial direction for every new particle.
    * It by default use the emitterType defined function
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle): scala.Unit = js.native
  /**
    * This function can be defined to specify initial position for every new particle.
    * It by default use the emitterType defined function
    */
  def startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle): scala.Unit = js.native
  /**
    * Stops the particle system.
    * @param stopSubEmitters if true it will stop the current system and all created sub-Systems if false it will stop the current root system only, this param is used by the root particle system only. the default value is true.
    */
  /**
    * Stops the particle system.
    */
  def stop(): scala.Unit = js.native
  def stop(stopSubEmitters: scala.Boolean): scala.Unit = js.native
  /**
    * This function can be defined to provide custom update for active particles.
    * This function will be called instead of regular update (age, position, color, etc.).
    * Do not forget that this function will be called on every frame so try to keep it simple and fast :)
    */
  def updateFunction(particles: js.Array[Particle]): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.ParticleSystem")
@js.native
object ParticleSystem extends js.Object {
  /**
    * Billboard mode will apply to all axes
    */
  val BILLBOARDMODE_ALL: scala.Double = js.native
  /**
    * Special billboard mode where the particle will be biilboard to the camera but rotated to align with direction
    */
  val BILLBOARDMODE_STRETCHED: scala.Double = js.native
  /**
    * Billboard mode will only apply to Y axis
    */
  val BILLBOARDMODE_Y: scala.Double = js.native
  /**
    * Parses a JSON object to create a particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param scene The scene to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @returns the Parsed particle system
    */
  def Parse(parsedParticleSystem: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.ParticleSystem = js.native
  def Parse(
    parsedParticleSystem: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene,
    rootUrl: java.lang.String,
    doNotStart: scala.Boolean
  ): babylonjsLib.BABYLONNs.ParticleSystem = js.native
  /** @hidden */
  def _GetAttributeNamesOrOptions(): js.Array[java.lang.String] = js.native
  def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: scala.Boolean): js.Array[java.lang.String] = js.native
  def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: scala.Boolean, isBillboardBased: scala.Boolean): js.Array[java.lang.String] = js.native
  def _GetAttributeNamesOrOptions(
    isAnimationSheetEnabled: scala.Boolean,
    isBillboardBased: scala.Boolean,
    useRampGradients: scala.Boolean
  ): js.Array[java.lang.String] = js.native
  /** @hidden */
  def _GetEffectCreationOptions(): js.Array[java.lang.String] = js.native
  def _GetEffectCreationOptions(isAnimationSheetEnabled: scala.Boolean): js.Array[java.lang.String] = js.native
  /** @hidden */
  def _Parse(
    parsedParticleSystem: js.Any,
    particleSystem: babylonjsLib.BABYLONNs.IParticleSystem,
    scene: babylonjsLib.BABYLONNs.Scene,
    rootUrl: java.lang.String
  ): scala.Unit = js.native
  /** @hidden */
  def _Serialize(serializationObject: js.Any, particleSystem: babylonjsLib.BABYLONNs.IParticleSystem): scala.Unit = js.native
}

