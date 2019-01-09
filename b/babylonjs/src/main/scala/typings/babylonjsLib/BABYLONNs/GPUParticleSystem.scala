package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a GPU particle system in Babylon
  * This is the fastest particle system in Babylon as it uses the GPU to update the individual particle data
  * @see https://www.babylonjs-playground.com/#PU4WYI#4
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- babylonjsLib.BABYLONNs.IAnimatable because var conflicts: animations. Inlined - babylonjsLib.BABYLONNs.IParticleSystem because var conflicts: animations, beginAnimationFrom, beginAnimationLoop, beginAnimationOnStart, beginAnimationTo, billboardMode, blendMode, color1, color2, colorDead, disposeOnStop, emitRate, emitter, endSpriteCellID, gravity, id, isAnimationSheetEnabled, isBillboardBased, layerMask, limitVelocityDamping, maxAngularSpeed, maxEmitPower, maxInitialRotation, maxLifeTime, maxScaleX, maxScaleY, maxSize, minAngularSpeed, minEmitPower, minInitialRotation, minLifeTime, minScaleX, minScaleY, minSize, name, noiseStrength, noiseTexture, particleEmitterType, particleTexture, preWarmCycles, preWarmStepOffset, renderingGroupId, spriteCellChangeSpeed, spriteCellHeight, spriteCellWidth, spriteRandomStartCell, startDelay, startSpriteCellID, targetStopDuration, translationPivot, updateSpeed. Inlined getCapacity, isStarted, animate, render, dispose, dispose, clone, serialize, rebuild, start, start, stop, reset, isReady, addColorGradient, addColorGradient, removeColorGradient, addSizeGradient, addSizeGradient, removeSizeGradient, getColorGradients, getSizeGradients, getAngularSpeedGradients, addAngularSpeedGradient, addAngularSpeedGradient, removeAngularSpeedGradient, getVelocityGradients, addVelocityGradient, addVelocityGradient, removeVelocityGradient, getLimitVelocityGradients, addLimitVelocityGradient, addLimitVelocityGradient, removeLimitVelocityGradient, addDragGradient, addDragGradient, removeDragGradient, getDragGradients, addEmitRateGradient, addEmitRateGradient, removeEmitRateGradient, getEmitRateGradients, addStartSizeGradient, addStartSizeGradient, removeStartSizeGradient, getStartSizeGradients, addLifeTimeGradient, addLifeTimeGradient, removeLifeTimeGradient, getLifeTimeGradients, addRampGradient, getRampGradients, useRampGradients, addColorRemapGradient, getColorRemapGradients, addAlphaRemapGradient, getAlphaRemapGradients, createPointEmitter, createHemisphericEmitter, createSphereEmitter, createDirectedSphereEmitter, createCylinderEmitter, createDirectedCylinderEmitter, createConeEmitter, createBoxEmitter, getScene */ @JSGlobal("BABYLON.GPUParticleSystem")
@js.native
class GPUParticleSystem protected ()
  extends BaseParticleSystem
     with IDisposable {
  /**
    * Instantiates a GPU particle system.
    * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
    * @param name The name of the particle system
    * @param options The options used to create the system
    * @param scene The scene the particle system belongs to
    * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
    */
  def this(name: java.lang.String, options: stdLib.Partial[babylonjsLib.Anon_Capacity], scene: Scene) = this()
  def this(name: java.lang.String, options: stdLib.Partial[babylonjsLib.Anon_Capacity], scene: Scene, isAnimationSheetEnabled: scala.Boolean) = this()
  var _accumulatedCount: js.Any = js.native
  var _activeCount: js.Any = js.native
  var _actualFrame: js.Any = js.native
  var _addFactorGradient: js.Any = js.native
  var _angularSpeedGradientsTexture: js.Any = js.native
  var _attributesStrideSize: js.Any = js.native
  var _buffer0: js.Any = js.native
  var _buffer1: js.Any = js.native
  var _capacity: js.Any = js.native
  var _colorGradientsTexture: js.Any = js.native
  var _createAngularSpeedGradientTexture: js.Any = js.native
  var _createColorGradientTexture: js.Any = js.native
  var _createDragGradientTexture: js.Any = js.native
  var _createFactorGradientTexture: js.Any = js.native
  var _createLimitVelocityGradientTexture: js.Any = js.native
  var _createRenderVAO: js.Any = js.native
  var _createSizeGradientTexture: js.Any = js.native
  var _createUpdateVAO: js.Any = js.native
  var _createVelocityGradientTexture: js.Any = js.native
  var _currentActiveCount: js.Any = js.native
  var _currentRenderId: js.Any = js.native
  var _dragGradientsTexture: js.Any = js.native
  var _engine: js.Any = js.native
  var _initialize: js.Any = js.native
  var _limitVelocityGradientsTexture: js.Any = js.native
  var _preWarmDone: js.Any = js.native
  var _randomTexture: js.Any = js.native
  var _randomTexture2: js.Any = js.native
  var _randomTextureSize: js.Any = js.native
  val _rawTextureWidth: js.Any = js.native
  var _releaseBuffers: js.Any = js.native
  var _releaseVAOs: js.Any = js.native
  var _renderEffect: js.Any = js.native
  var _renderVAO: js.Any = js.native
  var _sizeGradientsTexture: js.Any = js.native
  var _sourceBuffer: js.Any = js.native
  var _spriteBuffer: js.Any = js.native
  var _started: js.Any = js.native
  var _stopped: js.Any = js.native
  var _targetBuffer: js.Any = js.native
  var _targetIndex: js.Any = js.native
  var _timeDelta: js.Any = js.native
  var _updateEffect: js.Any = js.native
  var _updateEffectOptions: js.Any = js.native
  var _updateVAO: js.Any = js.native
  var _velocityGradientsTexture: js.Any = js.native
  /**
    * Gets or set the number of active particles
    */
  var activeParticleCount: scala.Double = js.native
  /**
    * An event triggered when the system is disposed.
    */
  var onDisposeObservable: Observable[GPUParticleSystem] = js.native
  /**
    * Not supported by GPUParticleSystem
    * Gets or sets a boolean indicating that ramp gradients must be used
    * @see http://doc.babylonjs.com/babylon101/particles#ramp-gradients
    */
  var useRampGradients: scala.Boolean = js.native
  /** @hidden */
  def _recreateRenderEffect(): scala.Unit = js.native
  /** @hidden */
  def _recreateUpdateEffect(): scala.Unit = js.native
  /* protected */ def _removeGradientAndTexture(gradient: scala.Double, gradients: Nullable[js.Array[IValueGradient]], texture: RawTexture): BaseParticleSystem = js.native
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param min defines the alpha remap minimal range
    * @param max defines the alpha remap maximal range
    * @returns the current particle system
    */
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
    * @param factor defines the angular speed to affect to the specified gradient
    * @returns the current particle system
    */
  def addAngularSpeedGradient(gradient: scala.Double, factor: scala.Double): GPUParticleSystem = js.native
  def addAngularSpeedGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new angular speed gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the angular speed to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  @JSName("addAngularSpeedGradient")
  def addAngularSpeedGradient_IParticleSystem(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new color gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color1 defines the color to affect to the specified gradient
    * @param color2 defines an additional color used to define a range ([color, color2]) with main color to pick the final color from
    * @returns the current particle system
    */
  def addColorGradient(gradient: scala.Double, color1: Color4): GPUParticleSystem = js.native
  def addColorGradient(gradient: scala.Double, color1: Color4, color2: Color4): GPUParticleSystem = js.native
  /**
    * Adds a new color gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color1 defines the color to affect to the specified gradient
    * @param color2 defines an additional color used to define a range ([color, color2]) with main color to pick the final color from
    * @returns the current particle system
    */
  @JSName("addColorGradient")
  def addColorGradient_IParticleSystem(gradient: scala.Double, color1: Color4): IParticleSystem = js.native
  @JSName("addColorGradient")
  def addColorGradient_IParticleSystem(gradient: scala.Double, color1: Color4, color2: Color4): IParticleSystem = js.native
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param min defines the color remap minimal range
    * @param max defines the color remap maximal range
    * @returns the current particle system
    */
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
    * @returns the current particle system
    */
  def addDragGradient(gradient: scala.Double, factor: scala.Double): GPUParticleSystem = js.native
  def addDragGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new drag gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the drag to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  @JSName("addDragGradient")
  def addDragGradient_IParticleSystem(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  /**
    * Not supported by GPUParticleSystem
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
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the life time factor to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
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
    * @returns the current particle system
    */
  def addLimitVelocityGradient(gradient: scala.Double, factor: scala.Double): GPUParticleSystem = js.native
  def addLimitVelocityGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new limit velocity gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the limit velocity to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  @JSName("addLimitVelocityGradient")
  def addLimitVelocityGradient_IParticleSystem(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color defines the color to affect to the specified gradient
    * @returns the current particle system
    */
  /**
    * Adds a new ramp gradient used to remap particle colors
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color defines the color to affect to the specified gradient
    * @returns the current particle system
    */
  def addRampGradient(gradient: scala.Double, color: Color3): IParticleSystem = js.native
  /**
    * Adds a new size gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the size factor to affect to the specified gradient
    * @returns the current particle system
    */
  def addSizeGradient(gradient: scala.Double, factor: scala.Double): GPUParticleSystem = js.native
  def addSizeGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new size gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the size factor to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  @JSName("addSizeGradient")
  def addSizeGradient_IParticleSystem(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  /**
    * Not supported by GPUParticleSystem
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
    * @returns the current particle system
    */
  def addVelocityGradient(gradient: scala.Double, factor: scala.Double): GPUParticleSystem = js.native
  def addVelocityGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
  /**
    * Adds a new velocity gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the velocity to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  @JSName("addVelocityGradient")
  def addVelocityGradient_IParticleSystem(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  /**
    * Animates the particle system for the current frame by emitting new particles and or animating the living ones.
    * @param preWarm defines if we are in the pre-warmimg phase
    */
  /**
    * Animates the particle system for this frame.
    */
  def animate(): scala.Unit = js.native
  def animate(preWarm: scala.Boolean): scala.Unit = js.native
  /**
    * Clones the particle system.
    * @param name The name of the cloned object
    * @param newEmitter The new emitter to use
    * @returns the cloned particle system
    */
  def clone(name: java.lang.String, newEmitter: js.Any): GPUParticleSystem = js.native
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
    * Returns the string "GPUParticleSystem"
    * @returns a string containing the class name
    */
  def getClassName(): java.lang.String = js.native
  /**
    * Not supported by GPUParticleSystem
    * @returns the list of ramp gradients
    */
  /**
    * Gets the current list of ramp gradients.
    * You must use addRampGradient and removeRampGradient to udpate this list
    * @returns the list of ramp gradients
    */
  def getRampGradients(): Nullable[js.Array[Color3Gradient]] = js.native
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
    * Rebuilds the particle system
    */
  /**
    * Rebuild the particle system
    */
  def rebuild(): scala.Unit = js.native
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeAlphaRemapGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific angular speed gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeAngularSpeedGradient(gradient: scala.Double): GPUParticleSystem = js.native
  /**
    * Remove a specific angular speed gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  @JSName("removeAngularSpeedGradient")
  def removeAngularSpeedGradient_IParticleSystem(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific color gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeColorGradient(gradient: scala.Double): GPUParticleSystem = js.native
  /**
    * Remove a specific color gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  @JSName("removeColorGradient")
  def removeColorGradient_IParticleSystem(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeColorRemapGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific drag gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeDragGradient(gradient: scala.Double): GPUParticleSystem = js.native
  /**
    * Remove a specific drag gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  @JSName("removeDragGradient")
  def removeDragGradient_IParticleSystem(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  /**
    * Remove a specific emit rate gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeEmitRateGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
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
  def removeLimitVelocityGradient(gradient: scala.Double): GPUParticleSystem = js.native
  /**
    * Remove a specific limit velocity gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  @JSName("removeLimitVelocityGradient")
  def removeLimitVelocityGradient_IParticleSystem(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeRampGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific size gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeSizeGradient(gradient: scala.Double): GPUParticleSystem = js.native
  /**
    * Remove a specific size gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  @JSName("removeSizeGradient")
  def removeSizeGradient_IParticleSystem(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Not supported by GPUParticleSystem
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
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
  def removeVelocityGradient(gradient: scala.Double): GPUParticleSystem = js.native
  /**
    * Remove a specific velocity gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  @JSName("removeVelocityGradient")
  def removeVelocityGradient_IParticleSystem(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Renders the particle system in its current state
    * @param preWarm defines if the system should only update the particles but not render them
    * @returns the current number of particles
    */
  /**
    * Renders the particle system in its current state.
    * @returns the current number of particles
    */
  def render(): scala.Double = js.native
  def render(preWarm: scala.Boolean): scala.Double = js.native
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
    * Stops the particle system.
    */
  def stop(): scala.Unit = js.native
}

/**
  * This represents a GPU particle system in Babylon
  * This is the fastest particle system in Babylon as it uses the GPU to update the individual particle data
  * @see https://www.babylonjs-playground.com/#PU4WYI#4
  */
@JSGlobal("BABYLON.GPUParticleSystem")
@js.native
object GPUParticleSystem extends js.Object {
  /**
    * Gets a boolean indicating if the GPU particles can be rendered on current browser
    */
  val IsSupported: scala.Boolean = js.native
  /**
    * Parses a JSON object to create a GPU particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param scene The scene to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @returns the parsed GPU particle system
    */
  def Parse(parsedParticleSystem: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.GPUParticleSystem = js.native
  def Parse(
    parsedParticleSystem: js.Any,
    scene: babylonjsLib.BABYLONNs.Scene,
    rootUrl: java.lang.String,
    doNotStart: scala.Boolean
  ): babylonjsLib.BABYLONNs.GPUParticleSystem = js.native
}

