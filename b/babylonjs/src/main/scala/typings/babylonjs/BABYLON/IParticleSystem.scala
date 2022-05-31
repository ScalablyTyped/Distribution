package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParticleSystem extends StObject {
  
  /**
    * Adds a new alpha remap gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param min defines the alpha remap minimal range
    * @param max defines the alpha remap maximal range
    * @returns the current particle system
    */
  def addAlphaRemapGradient(gradient: Double, min: Double, max: Double): IParticleSystem = js.native
  
  /**
    * Adds a new angular speed gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the angular speed to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addAngularSpeedGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addAngularSpeedGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  
  /**
    * Adds a new color gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color1 defines the color to affect to the specified gradient
    * @param color2 defines an additional color used to define a range ([color, color2]) with main color to pick the final color from
    * @returns the current particle system
    */
  def addColorGradient(gradient: Double, color1: Color4): IParticleSystem = js.native
  def addColorGradient(gradient: Double, color1: Color4, color2: Color4): IParticleSystem = js.native
  
  /**
    * Adds a new color remap gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param min defines the color remap minimal range
    * @param max defines the color remap maximal range
    * @returns the current particle system
    */
  def addColorRemapGradient(gradient: Double, min: Double, max: Double): IParticleSystem = js.native
  
  /**
    * Adds a new drag gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the drag to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addDragGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addDragGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  
  /**
    * Adds a new emit rate gradient (please note that this will only work if you set the targetStopDuration property)
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the emit rate to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addEmitRateGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addEmitRateGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  
  /**
    * Adds a new life time gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the life time factor to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addLifeTimeGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addLifeTimeGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  
  /**
    * Adds a new limit velocity gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the limit velocity to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addLimitVelocityGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addLimitVelocityGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  
  /**
    * Adds a new ramp gradient used to remap particle colors
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param color defines the color to affect to the specified gradient
    * @returns the current particle system
    */
  def addRampGradient(gradient: Double, color: Color3): IParticleSystem = js.native
  
  /**
    * Adds a new size gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the size factor to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addSizeGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addSizeGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  
  /**
    * Adds a new start size gradient (please note that this will only work if you set the targetStopDuration property)
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the start size to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addStartSizeGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addStartSizeGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  
  /**
    * Adds a new velocity gradient
    * @param gradient defines the gradient to use (between 0 and 1)
    * @param factor defines the velocity to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addVelocityGradient(gradient: Double, factor: Double): IParticleSystem = js.native
  def addVelocityGradient(gradient: Double, factor: Double, factor2: Double): IParticleSystem = js.native
  
  /**
    * Animates the particle system for this frame.
    */
  def animate(): Unit = js.native
  
  /**
    * List of animations used by the particle system.
    */
  var animations: js.Array[Animation] = js.native
  
  /**
    * Gets or sets the frame to start the animation from when beginAnimationOnStart is true
    */
  var beginAnimationFrom: Double = js.native
  
  /**
    * Gets or sets a boolean indicating if animations must loop when beginAnimationOnStart is true
    */
  var beginAnimationLoop: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating that hosted animations (in the system.animations array) must be started when system.start() is called
    */
  var beginAnimationOnStart: Boolean = js.native
  
  /**
    * Gets or sets the frame to end the animation on when beginAnimationOnStart is true
    */
  var beginAnimationTo: Double = js.native
  
  /**
    * Gets or sets the billboard mode to use when isBillboardBased = true.
    * Value can be: ParticleSystem.BILLBOARDMODE_ALL, ParticleSystem.BILLBOARDMODE_Y, ParticleSystem.BILLBOARDMODE_STRETCHED
    */
  var billboardMode: Double = js.native
  
  /**
    * Blend mode use to render the particle, it can be either ParticleSystem.BLENDMODE_ONEONE, ParticleSystem.BLENDMODE_STANDARD or ParticleSystem.BLENDMODE_ADD.
    */
  var blendMode: Double = js.native
  
  /**
    * Clones the particle system.
    * @param name The name of the cloned object
    * @param newEmitter The new emitter to use
    * @returns the cloned particle system
    */
  def clone(name: String, newEmitter: js.Any): Nullable[IParticleSystem] = js.native
  
  /**
    * Random color of each particle after it has been emitted, between color1 and color2 vectors.
    */
  var color1: Color4 = js.native
  
  /**
    * Random color of each particle after it has been emitted, between color1 and color2 vectors.
    */
  var color2: Color4 = js.native
  
  /**
    * Color the particle will have at the end of its lifetime.
    */
  var colorDead: Color4 = js.native
  
  /**
    * Creates a Box Emitter for the particle system. (emits between direction1 and direction2 from withing the box defined by minEmitBox and maxEmitBox)
    * @param direction1 Particles are emitted between the direction1 and direction2 from within the box
    * @param direction2 Particles are emitted between the direction1 and direction2 from within the box
    * @param minEmitBox Particles are emitted from the box between minEmitBox and maxEmitBox
    * @param maxEmitBox  Particles are emitted from the box between minEmitBox and maxEmitBox
    * @returns the emitter
    */
  def createBoxEmitter(direction1: Vector3, direction2: Vector3, minEmitBox: Vector3, maxEmitBox: Vector3): BoxParticleEmitter = js.native
  
  /**
    * Creates a Cone Emitter for the particle system (emits from the cone to the particle position)
    * @param radius The radius of the cone to emit from
    * @param angle The base angle of the cone
    * @returns the emitter
    */
  def createConeEmitter(radius: Double, angle: Double): ConeParticleEmitter = js.native
  
  /**
    * Creates a Cylinder Emitter for the particle system (emits from the cylinder to the particle position)
    * @param radius The radius of the emission cylinder
    * @param height The height of the emission cylinder
    * @param radiusRange The range of emission [0-1] 0 Surface only, 1 Entire Radius
    * @param directionRandomizer How much to randomize the particle direction [0-1]
    * @returns the emitter
    */
  def createCylinderEmitter(radius: Double, height: Double, radiusRange: Double, directionRandomizer: Double): CylinderParticleEmitter = js.native
  
  /**
    * Creates a Directed Cylinder Emitter for the particle system (emits between direction1 and direction2)
    * @param radius The radius of the cylinder to emit from
    * @param height The height of the emission cylinder
    * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param direction1 Particles are emitted between the direction1 and direction2 from within the cylinder
    * @param direction2 Particles are emitted between the direction1 and direction2 from within the cylinder
    * @returns the emitter
    */
  def createDirectedCylinderEmitter(radius: Double, height: Double, radiusRange: Double, direction1: Vector3, direction2: Vector3): SphereDirectedParticleEmitter = js.native
  
  /**
    * Creates a Directed Sphere Emitter for the particle system (emits between direction1 and direction2)
    * @param radius The radius of the sphere to emit from
    * @param direction1 Particles are emitted between the direction1 and direction2 from within the sphere
    * @param direction2 Particles are emitted between the direction1 and direction2 from within the sphere
    * @returns the emitter
    */
  def createDirectedSphereEmitter(radius: Double, direction1: Vector3, direction2: Vector3): SphereDirectedParticleEmitter = js.native
  
  /**
    * Creates a Hemisphere Emitter for the particle system (emits along the hemisphere radius)
    * @param radius The radius of the hemisphere to emit from
    * @param radiusRange The range of the hemisphere to emit from [0-1] 0 Surface Only, 1 Entire Radius
    * @returns the emitter
    */
  def createHemisphericEmitter(radius: Double, radiusRange: Double): HemisphericParticleEmitter = js.native
  
  /**
    * Creates a Point Emitter for the particle system (emits directly from the emitter position)
    * @param direction1 Particles are emitted between the direction1 and direction2 from within the box
    * @param direction2 Particles are emitted between the direction1 and direction2 from within the box
    * @returns the emitter
    */
  def createPointEmitter(direction1: Vector3, direction2: Vector3): PointParticleEmitter = js.native
  
  /**
    * Creates a Sphere Emitter for the particle system (emits along the sphere radius)
    * @param radius The radius of the sphere to emit from
    * @param radiusRange The range of the sphere to emit from [0-1] 0 Surface Only, 1 Entire Radius
    * @returns the emitter
    */
  def createSphereEmitter(radius: Double, radiusRange: Double): SphereParticleEmitter = js.native
  
  /** Gets or sets a matrix to use to compute projection */
  var defaultProjectionMatrix: Matrix = js.native
  
  /**
    * Dispose the particle system and frees its associated resources.
    * @param disposeTexture defines if the particule texture must be disposed as well (true by default)
    */
  def dispose(): Unit = js.native
  def dispose(disposeTexture: Boolean): Unit = js.native
  
  /**
    * Specifies whether the particle system will be disposed once it reaches the end of the animation.
    */
  var disposeOnStop: Boolean = js.native
  
  /**
    * The maximum number of particles to emit per frame until we reach the activeParticleCount value
    */
  var emitRate: Double = js.native
  
  /**
    * The emitter represents the Mesh or position we are attaching the particle system to.
    */
  var emitter: Nullable[AbstractMesh | Vector3] = js.native
  
  /**
    * If using a spritesheet (isAnimationSheetEnabled) defines the last sprite cell to display
    */
  var endSpriteCellID: Double = js.native
  
  /**
    * Fill the defines array according to the current settings of the particle system
    * @param defines Array to be updated
    * @param blendMode blend mode to take into account when updating the array
    */
  def fillDefines(defines: js.Array[String], blendMode: Double): Unit = js.native
  
  /**
    * Fill the uniforms, attributes and samplers arrays according to the current settings of the particle system
    * @param uniforms Uniforms array to fill
    * @param attributes Attributes array to fill
    * @param samplers Samplers array to fill
    */
  def fillUniformsAttributesAndSamplerNames(uniforms: js.Array[String], attributes: js.Array[String], samplers: js.Array[String]): Unit = js.native
  
  /** Force the system to rebuild all gradients that need to be resync */
  def forceRefreshGradients(): Unit = js.native
  
  /**
    * Gets the number of particles active at the same time.
    * @returns The number of active particles.
    */
  def getActiveCount(): Double = js.native
  
  /**
    * Gets the current list of alpha remap gradients.
    * You must use addAlphaRemapGradient and removeAlphaRemapGradient to udpate this list
    * @returns the list of alpha remap gradients
    */
  def getAlphaRemapGradients(): Nullable[js.Array[FactorGradient]] = js.native
  
  /**
    * Gets the current list of angular speed gradients.
    * You must use addAngularSpeedGradient and removeAngularSpeedGradient to udpate this list
    * @returns the list of angular speed gradients
    */
  def getAngularSpeedGradients(): Nullable[js.Array[FactorGradient]] = js.native
  
  /**
    * Gets the maximum number of particles active at the same time.
    * @returns The max number of active particles.
    */
  def getCapacity(): Double = js.native
  
  /**
    * Returns the string "ParticleSystem"
    * @returns a string containing the class name
    */
  def getClassName(): String = js.native
  
  /**
    * Gets the current list of color gradients.
    * You must use addColorGradient and removeColorGradient to udpate this list
    * @returns the list of color gradients
    */
  def getColorGradients(): Nullable[js.Array[ColorGradient]] = js.native
  
  /**
    * Gets the current list of color remap gradients.
    * You must use addColorRemapGradient and removeColorRemapGradient to udpate this list
    * @returns the list of color remap gradients
    */
  def getColorRemapGradients(): Nullable[js.Array[FactorGradient]] = js.native
  
  /**
    * Gets the custom effect used to render the particles
    * @param blendMode Blend mode for which the effect should be retrieved
    * @returns The effect
    */
  def getCustomEffect(blendMode: Double): Nullable[Effect] = js.native
  
  /**
    * Gets the current list of drag gradients.
    * You must use addDragGradient and removeDragGradient to udpate this list
    * @returns the list of drag gradients
    */
  def getDragGradients(): Nullable[js.Array[FactorGradient]] = js.native
  
  /**
    * Gets the current list of emit rate gradients.
    * You must use addEmitRateGradient and removeEmitRateGradient to udpate this list
    * @returns the list of emit rate gradients
    */
  def getEmitRateGradients(): Nullable[js.Array[FactorGradient]] = js.native
  
  /**
    * Gets the current list of life time gradients.
    * You must use addLifeTimeGradient and removeLifeTimeGradient to udpate this list
    * @returns the list of life time gradients
    */
  def getLifeTimeGradients(): Nullable[js.Array[FactorGradient]] = js.native
  
  /**
    * Gets the current list of limit velocity gradients.
    * You must use addLimitVelocityGradient and removeLimitVelocityGradient to udpate this list
    * @returns the list of limit velocity gradients
    */
  def getLimitVelocityGradients(): Nullable[js.Array[FactorGradient]] = js.native
  
  /**
    * Gets the current list of ramp gradients.
    * You must use addRampGradient and removeRampGradient to udpate this list
    * @returns the list of ramp gradients
    */
  def getRampGradients(): Nullable[js.Array[Color3Gradient]] = js.native
  
  /**
    * Get hosting scene
    * @returns the scene
    */
  def getScene(): Nullable[Scene] = js.native
  
  /**
    * Gets the current list of size gradients.
    * You must use addSizeGradient and removeSizeGradient to udpate this list
    * @returns the list of size gradients
    */
  def getSizeGradients(): Nullable[js.Array[FactorGradient]] = js.native
  
  /**
    * Gets the current list of start size gradients.
    * You must use addStartSizeGradient and removeStartSizeGradient to udpate this list
    * @returns the list of start size gradients
    */
  def getStartSizeGradients(): Nullable[js.Array[FactorGradient]] = js.native
  
  /**
    * Gets the current list of velocity gradients.
    * You must use addVelocityGradient and removeVelocityGradient to udpate this list
    * @returns the list of velocity gradients
    */
  def getVelocityGradients(): Nullable[js.Array[FactorGradient]] = js.native
  
  /**
    * You can use gravity if you want to give an orientation to your particles.
    */
  var gravity: Vector3 = js.native
  
  /**
    * The id of the Particle system.
    */
  var id: String = js.native
  
  /**
    * Gets or sets a boolean indicating if a spritesheet is used to animate the particles texture
    */
  var isAnimationSheetEnabled: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if the particles must be rendered as billboard or aligned with the direction
    */
  var isBillboardBased: Boolean = js.native
  
  /**
    * Specifies if the particles are updated in emitter local space or world space
    */
  var isLocal: Boolean = js.native
  
  /**
    * Is this system ready to be used/rendered
    * @return true if the system is ready
    */
  def isReady(): Boolean = js.native
  
  /**
    * Gets if the system has been started. (Note: this will still be true after stop is called)
    * @returns True if it has been started, otherwise false.
    */
  def isStarted(): Boolean = js.native
  
  /**
    * Gets a boolean indicating that the system is stopping
    * @returns true if the system is currently stopping
    */
  def isStopping(): Boolean = js.native
  
  /**
    * The layer mask we are rendering the particles through.
    */
  var layerMask: Double = js.native
  
  /** Gets or sets a value indicating the damping to apply if the limit velocity factor is reached */
  var limitVelocityDamping: Double = js.native
  
  /**
    * Maximum angular speed of emitting particles (Z-axis rotation for each particle).
    */
  var maxAngularSpeed: Double = js.native
  
  /**
    * Maximum power of emitting particles.
    */
  var maxEmitPower: Double = js.native
  
  /**
    * Gets or sets the maximal initial rotation in radians.
    */
  var maxInitialRotation: Double = js.native
  
  /**
    * Maximum life time of emitting particles.
    */
  var maxLifeTime: Double = js.native
  
  /**
    * Maximum scale of emitting particles on X axis.
    */
  var maxScaleX: Double = js.native
  
  /**
    * Maximum scale of emitting particles on Y axis.
    */
  var maxScaleY: Double = js.native
  
  /**
    * Maximum Size of emitting particles.
    */
  var maxSize: Double = js.native
  
  /**
    * Minimum angular speed of emitting particles (Z-axis rotation for each particle).
    */
  var minAngularSpeed: Double = js.native
  
  /**
    * Minimum power of emitting particles.
    */
  var minEmitPower: Double = js.native
  
  /**
    * Gets or sets the minimal initial rotation in radians.
    */
  var minInitialRotation: Double = js.native
  
  /**
    * Minimum life time of emitting particles.
    */
  var minLifeTime: Double = js.native
  
  /**
    * Minimum scale of emitting particles on X axis.
    */
  var minScaleX: Double = js.native
  
  /**
    * Minimum scale of emitting particles on Y axis.
    */
  var minScaleY: Double = js.native
  
  /**
    * Minimum Size of emitting particles.
    */
  var minSize: Double = js.native
  
  /**
    * The name of the Particle system.
    */
  var name: String = js.native
  
  /** Gets or sets the strength to apply to the noise value (default is (10, 10, 10)) */
  var noiseStrength: Vector3 = js.native
  
  /**
    * Gets or sets a texture used to add random noise to particle positions
    */
  var noiseTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Observable that will be called just before the particles are drawn
    */
  var onBeforeDrawParticlesObservable: Observable[Nullable[Effect]] = js.native
  
  /**
    * An event triggered when the system is disposed
    */
  var onDisposeObservable: Observable[IParticleSystem] = js.native
  
  /**
    * An event triggered when the system is stopped
    */
  var onStoppedObservable: Observable[IParticleSystem] = js.native
  
  /**
    * The particle emitter type defines the emitter used by the particle system.
    * It can be for example box, sphere, or cone...
    */
  var particleEmitterType: Nullable[IParticleEmitterType] = js.native
  
  /**
    * The texture used to render each particle. (this can be a spritesheet)
    */
  var particleTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Gets or sets a value indicating how many cycles (or frames) must be executed before first rendering (this value has to be set before starting the system). Default is 0
    */
  var preWarmCycles: Double = js.native
  
  /**
    * Gets or sets a value indicating the time step multiplier to use in pre-warm mode (default is 1)
    */
  var preWarmStepOffset: Double = js.native
  
  /**
    * Rebuild the particle system
    */
  def rebuild(): Unit = js.native
  
  /**
    * Remove a specific angular speed gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeAngularSpeedGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific color gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeColorGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific drag gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeDragGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific emit rate gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeEmitRateGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific life time gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeLifeTimeGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific limit velocity gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeLimitVelocityGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific size gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeSizeGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific start size gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeStartSizeGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Remove a specific velocity gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeVelocityGradient(gradient: Double): IParticleSystem = js.native
  
  /**
    * Renders the particle system in its current state.
    * @returns the current number of particles
    */
  def render(): Double = js.native
  
  /**
    * The rendering group used by the Particle system to chose when to render.
    */
  var renderingGroupId: Double = js.native
  
  /**
    * Remove all active particles
    */
  def reset(): Unit = js.native
  
  /**
    * Serializes the particle system to a JSON object
    * @param serializeTexture defines if the texture must be serialized as well
    * @returns the JSON object
    */
  def serialize(serializeTexture: Boolean): js.Any = js.native
  
  /**
    * Sets the custom effect used to render the particles
    * @param effect The effect to set
    * @param blendMode Blend mode for which the effect should be set
    */
  def setCustomEffect(effect: Nullable[Effect], blendMode: Double): Unit = js.native
  
  /** Snippet ID if the particle system was created from the snippet server */
  var snippetId: String = js.native
  
  /**
    * If using a spritesheet (isAnimationSheetEnabled) defines the speed of the sprite loop (default is 1 meaning the animation will play once during the entire particle lifetime)
    */
  var spriteCellChangeSpeed: Double = js.native
  
  /**
    * If using a spritesheet (isAnimationSheetEnabled), defines the sprite cell height to use
    */
  var spriteCellHeight: Double = js.native
  
  /**
    * If using a spritesheet (isAnimationSheetEnabled), defines the sprite cell width to use
    */
  var spriteCellWidth: Double = js.native
  
  /**
    * This allows the system to random pick the start cell ID between startSpriteCellID and endSpriteCellID
    */
  var spriteRandomStartCell: Boolean = js.native
  
  /**
    * Starts the particle system and begins to emit
    * @param delay defines the delay in milliseconds before starting the system (0 by default)
    */
  def start(): Unit = js.native
  def start(delay: Double): Unit = js.native
  
  /**
    * Defines the delay in milliseconds before starting the system (0 by default)
    */
  var startDelay: Double = js.native
  
  /**
    * If using a spritesheet (isAnimationSheetEnabled) defines the first sprite cell to display
    */
  var startSpriteCellID: Double = js.native
  
  /**
    * Stops the particle system.
    */
  def stop(): Unit = js.native
  
  /**
    * The amount of time the particle system is running (depends of the overall update speed).
    */
  var targetStopDuration: Double = js.native
  
  /** Gets or sets a Vector2 used to move the pivot (by default (0,0)) */
  var translationPivot: Vector2 = js.native
  
  /**
    * The overall motion speed (0.01 is default update speed, faster updates = faster animation)
    */
  var updateSpeed: Double = js.native
  
  /** Gets or sets a boolean indicating that ramp gradients must be used
    * @see https://doc.babylonjs.com/babylon101/particles#ramp-gradients
    */
  var useRampGradients: Boolean = js.native
  
  /**
    * Gets the name of the particle vertex shader
    */
  var vertexShaderName: String = js.native
}
