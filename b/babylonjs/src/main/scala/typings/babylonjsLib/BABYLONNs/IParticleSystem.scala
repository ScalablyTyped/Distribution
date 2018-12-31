package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a particle system in Babylon.js.
  * This groups the common functionalities that needs to be implemented in order to create a particle system.
  * A particle system represents a way to manage particles from their emission to their animation and rendering.
  */
@js.native
trait IParticleSystem extends js.Object {
  /**
    * List of animations used by the particle system.
    */
  var animations: js.Array[Animation] = js.native
  /**
    * Gets or sets the frame to start the animation from when beginAnimationOnStart is true
    */
  var beginAnimationFrom: scala.Double = js.native
  /**
    * Gets or sets a boolean indicating if animations must loop when beginAnimationOnStart is true
    */
  var beginAnimationLoop: scala.Boolean = js.native
  /**
    * Gets or sets a boolean indicating that hosted animations (in the system.animations array) must be started when system.start() is called
    */
  var beginAnimationOnStart: scala.Boolean = js.native
  /**
    * Gets or sets the frame to end the animation on when beginAnimationOnStart is true
    */
  var beginAnimationTo: scala.Double = js.native
  /**
    * Gets or sets the billboard mode to use when isBillboardBased = true.
    * Value can be: ParticleSystem.BILLBOARDMODE_ALL, ParticleSystem.BILLBOARDMODE_Y, ParticleSystem.BILLBOARDMODE_STRETCHED
    */
  var billboardMode: scala.Double = js.native
  /**
    * Blend mode use to render the particle, it can be either ParticleSystem.BLENDMODE_ONEONE, ParticleSystem.BLENDMODE_STANDARD or ParticleSystem.BLENDMODE_ADD.
    */
  var blendMode: scala.Double = js.native
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
    * Specifies whether the particle system will be disposed once it reaches the end of the animation.
    */
  var disposeOnStop: scala.Boolean = js.native
  /**
    * The maximum number of particles to emit per frame until we reach the activeParticleCount value
    */
  var emitRate: scala.Double = js.native
  /**
    * The emitter represents the Mesh or position we are attaching the particle system to.
    */
  var emitter: Nullable[AbstractMesh | Vector3] = js.native
  /**
    * If using a spritesheet (isAnimationSheetEnabled) defines the last sprite cell to display
    */
  var endSpriteCellID: scala.Double = js.native
  /**
    * You can use gravity if you want to give an orientation to your particles.
    */
  var gravity: Vector3 = js.native
  /**
    * The id of the Particle system.
    */
  var id: java.lang.String = js.native
  /**
    * Gets or sets a boolean indicating if a spritesheet is used to animate the particles texture
    */
  var isAnimationSheetEnabled: scala.Boolean = js.native
  /**
    * Gets or sets a boolean indicating if the particles must be rendered as billboard or aligned with the direction
    */
  var isBillboardBased: scala.Boolean = js.native
  /**
    * The layer mask we are rendering the particles through.
    */
  var layerMask: scala.Double = js.native
  /** Gets or sets a value indicating the damping to apply if the limit velocity factor is reached */
  var limitVelocityDamping: scala.Double = js.native
  /**
    * Maximum angular speed of emitting particles (Z-axis rotation for each particle).
    */
  var maxAngularSpeed: scala.Double = js.native
  /**
    * Maximum power of emitting particles.
    */
  var maxEmitPower: scala.Double = js.native
  /**
    * Gets or sets the maximal initial rotation in radians.
    */
  var maxInitialRotation: scala.Double = js.native
  /**
    * Maximum life time of emitting particles.
    */
  var maxLifeTime: scala.Double = js.native
  /**
    * Maximum scale of emitting particles on X axis.
    */
  var maxScaleX: scala.Double = js.native
  /**
    * Maximum scale of emitting particles on Y axis.
    */
  var maxScaleY: scala.Double = js.native
  /**
    * Maximum Size of emitting particles.
    */
  var maxSize: scala.Double = js.native
  /**
    * Minimum angular speed of emitting particles (Z-axis rotation for each particle).
    */
  var minAngularSpeed: scala.Double = js.native
  /**
    * Minimum power of emitting particles.
    */
  var minEmitPower: scala.Double = js.native
  /**
    * Gets or sets the minimal initial rotation in radians.
    */
  var minInitialRotation: scala.Double = js.native
  /**
    * Minimum life time of emitting particles.
    */
  var minLifeTime: scala.Double = js.native
  /**
    * Minimum scale of emitting particles on X axis.
    */
  var minScaleX: scala.Double = js.native
  /**
    * Minimum scale of emitting particles on Y axis.
    */
  var minScaleY: scala.Double = js.native
  /**
    * Minimum Size of emitting particles.
    */
  var minSize: scala.Double = js.native
  /**
    * The name of the Particle system.
    */
  var name: java.lang.String = js.native
  /** Gets or sets the strength to apply to the noise value (default is (10, 10, 10)) */
  var noiseStrength: Vector3 = js.native
  /**
    * Gets or sets a texture used to add random noise to particle positions
    */
  var noiseTexture: Nullable[BaseTexture] = js.native
  /**
    * The particle emitter type defines the emitter used by the particle system.
    * It can be for example box, sphere, or cone...
    */
  var particleEmitterType: Nullable[IParticleEmitterType] = js.native
  /**
    * The texture used to render each particle. (this can be a spritesheet)
    */
  var particleTexture: Nullable[Texture] = js.native
  /**
    * Gets or sets a value indicating how many cycles (or frames) must be executed before first rendering (this value has to be set before starting the system). Default is 0
    */
  var preWarmCycles: scala.Double = js.native
  /**
    * Gets or sets a value indicating the time step multiplier to use in pre-warm mode (default is 1)
    */
  var preWarmStepOffset: scala.Double = js.native
  /**
    * The rendering group used by the Particle system to chose when to render.
    */
  var renderingGroupId: scala.Double = js.native
  /**
    * If using a spritesheet (isAnimationSheetEnabled) defines the speed of the sprite loop (default is 1 meaning the animation will play once during the entire particle lifetime)
    */
  var spriteCellChangeSpeed: scala.Double = js.native
  /**
    * If using a spritesheet (isAnimationSheetEnabled), defines the sprite cell height to use
    */
  var spriteCellHeight: scala.Double = js.native
  /**
    * If using a spritesheet (isAnimationSheetEnabled), defines the sprite cell width to use
    */
  var spriteCellWidth: scala.Double = js.native
  /**
    * This allows the system to random pick the start cell ID between startSpriteCellID and endSpriteCellID
    */
  var spriteRandomStartCell: scala.Boolean = js.native
  /**
    * Defines the delay in milliseconds before starting the system (0 by default)
    */
  var startDelay: scala.Double = js.native
  /**
    * If using a spritesheet (isAnimationSheetEnabled) defines the first sprite cell to display
    */
  var startSpriteCellID: scala.Double = js.native
  /**
    * The amount of time the particle system is running (depends of the overall update speed).
    */
  var targetStopDuration: scala.Double = js.native
  /** Gets or sets a Vector2 used to move the pivot (by default (0,0)) */
  var translationPivot: Vector2 = js.native
  /**
    * The overall motion speed (0.01 is default update speed, faster updates = faster animation)
    */
  var updateSpeed: scala.Double = js.native
  /** Gets or sets a boolean indicating that ramp gradients must be used
    * @see http://doc.babylonjs.com/babylon101/particles#ramp-gradients
    */
  var useRampGradients: scala.Boolean = js.native
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
    * @param factor defines the drag to affect to the specified gradient
    * @param factor2 defines an additional factor used to define a range ([factor, factor2]) with main value to pick the final value from
    * @returns the current particle system
    */
  def addDragGradient(gradient: scala.Double, factor: scala.Double): IParticleSystem = js.native
  def addDragGradient(gradient: scala.Double, factor: scala.Double, factor2: scala.Double): IParticleSystem = js.native
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
  def addRampGradient(gradient: scala.Double, color: Color3): IParticleSystem = js.native
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
    * Animates the particle system for this frame.
    */
  def animate(): scala.Unit = js.native
  /**
    * Clones the particle system.
    * @param name The name of the cloned object
    * @param newEmitter The new emitter to use
    * @returns the cloned particle system
    */
  def clone(name: java.lang.String, newEmitter: js.Any): Nullable[IParticleSystem] = js.native
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
  def createConeEmitter(radius: scala.Double, angle: scala.Double): ConeParticleEmitter = js.native
  /**
    * Creates a Cylinder Emitter for the particle system (emits from the cylinder to the particle position)
    * @param radius The radius of the emission cylinder
    * @param height The height of the emission cylinder
    * @param radiusRange The range of emission [0-1] 0 Surface only, 1 Entire Radius
    * @param directionRandomizer How much to randomize the particle direction [0-1]
    * @returns the emitter
    */
  def createCylinderEmitter(
    radius: scala.Double,
    height: scala.Double,
    radiusRange: scala.Double,
    directionRandomizer: scala.Double
  ): CylinderParticleEmitter = js.native
  /**
    * Creates a Directed Cylinder Emitter for the particle system (emits between direction1 and direction2)
    * @param radius The radius of the cylinder to emit from
    * @param height The height of the emission cylinder
    * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param direction1 Particles are emitted between the direction1 and direction2 from within the cylinder
    * @param direction2 Particles are emitted between the direction1 and direction2 from within the cylinder
    * @returns the emitter
    */
  def createDirectedCylinderEmitter(
    radius: scala.Double,
    height: scala.Double,
    radiusRange: scala.Double,
    direction1: Vector3,
    direction2: Vector3
  ): SphereDirectedParticleEmitter = js.native
  /**
    * Creates a Directed Sphere Emitter for the particle system (emits between direction1 and direction2)
    * @param radius The radius of the sphere to emit from
    * @param direction1 Particles are emitted between the direction1 and direction2 from within the sphere
    * @param direction2 Particles are emitted between the direction1 and direction2 from within the sphere
    * @returns the emitter
    */
  def createDirectedSphereEmitter(radius: scala.Double, direction1: Vector3, direction2: Vector3): SphereDirectedParticleEmitter = js.native
  /**
    * Creates a Hemisphere Emitter for the particle system (emits along the hemisphere radius)
    * @param radius The radius of the hemisphere to emit from
    * @param radiusRange The range of the hemisphere to emit from [0-1] 0 Surface Only, 1 Entire Radius
    * @returns the emitter
    */
  def createHemisphericEmitter(radius: scala.Double, radiusRange: scala.Double): HemisphericParticleEmitter = js.native
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
  def createSphereEmitter(radius: scala.Double, radiusRange: scala.Double): SphereParticleEmitter = js.native
  /**
    * Dispose the particle system and frees its associated resources.
    * @param disposeTexture defines if the particule texture must be disposed as well (true by default)
    */
  def dispose(): scala.Unit = js.native
  def dispose(disposeTexture: scala.Boolean): scala.Unit = js.native
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
  def getCapacity(): scala.Double = js.native
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
  def getScene(): Scene = js.native
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
    * Rebuild the particle system
    */
  def rebuild(): scala.Unit = js.native
  /**
    * Remove a specific angular speed gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeAngularSpeedGradient(gradient: scala.Double): IParticleSystem = js.native
  /**
    * Remove a specific color gradient
    * @param gradient defines the gradient to remove
    * @returns the current particle system
    */
  def removeColorGradient(gradient: scala.Double): IParticleSystem = js.native
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
    * @param delay defines the delay in milliseconds before starting the system (0 by default)
    */
  def start(): scala.Unit = js.native
  def start(delay: scala.Double): scala.Unit = js.native
  /**
    * Stops the particle system.
    */
  def stop(): scala.Unit = js.native
}

