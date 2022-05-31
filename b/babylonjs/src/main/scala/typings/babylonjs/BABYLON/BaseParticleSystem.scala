package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseParticleSystem extends StObject {
  
  /* protected */ var _alphaRemapGradients: Nullable[js.Array[FactorGradient]] = js.native
  
  /* protected */ var _angularSpeedGradients: Nullable[js.Array[FactorGradient]] = js.native
  
  /**
    * Attaches a new image processing configuration to the Standard Material.
    * @param configuration
    */
  /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): Unit = js.native
  
  /* protected */ var _colorGradients: Nullable[js.Array[ColorGradient]] = js.native
  
  /* protected */ var _colorRemapGradients: Nullable[js.Array[FactorGradient]] = js.native
  
  /* protected */ var _dragGradients: Nullable[js.Array[FactorGradient]] = js.native
  
  /* protected */ var _emitRateGradients: Nullable[js.Array[FactorGradient]] = js.native
  
  /**
    * The engine the particle system belongs to.
    */
  /* protected */ var _engine: ThinEngine = js.native
  
  /* protected */ def _hasTargetStopDurationDependantGradient(): Boolean | Null = js.native
  
  /**
    * Default configuration related to image processing available in the standard Material.
    */
  /* protected */ var _imageProcessingConfiguration: Nullable[ImageProcessingConfiguration] = js.native
  
  /**
    * Local cache of defines for image processing.
    */
  /* protected */ var _imageProcessingConfigurationDefines: ImageProcessingConfigurationDefines = js.native
  
  /** @hidden */
  /* protected */ var _isAnimationSheetEnabled: Boolean = js.native
  
  /* protected */ var _isBillboardBased: Boolean = js.native
  
  /** @hidden */
  var _isSubEmitter: Boolean = js.native
  
  /* protected */ var _lifeTimeGradients: Nullable[js.Array[FactorGradient]] = js.native
  
  /* protected */ var _limitVelocityGradients: Nullable[js.Array[FactorGradient]] = js.native
  
  /* private */ var _noiseTexture: js.Any = js.native
  
  /* protected */ var _rampGradients: Nullable[js.Array[Color3Gradient]] = js.native
  
  /** @hidden */
  /* protected */ def _removeGradientAndTexture(gradient: Double, gradients: Nullable[js.Array[IValueGradient]], texture: Nullable[RawTexture]): BaseParticleSystem = js.native
  
  /** @hidden */
  /* protected */ def _reset(): Unit = js.native
  
  /**
    * The scene the particle system belongs to.
    */
  /* protected */ var _scene: Nullable[Scene] = js.native
  
  /* protected */ var _sizeGradients: Nullable[js.Array[FactorGradient]] = js.native
  
  /* protected */ var _startSizeGradients: Nullable[js.Array[FactorGradient]] = js.native
  
  /* protected */ var _velocityGradients: Nullable[js.Array[FactorGradient]] = js.native
  
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
    * Blend mode use to render the particle, it can be either ParticleSystem.BLENDMODE_ONEONE or ParticleSystem.BLENDMODE_STANDARD.
    */
  var blendMode: Double = js.native
  
  /**
    * Random color of each particle after it has been emitted, between color1 and color2 vectors
    */
  var color1: Color4 = js.native
  
  /**
    * Random color of each particle after it has been emitted, between color1 and color2 vectors
    */
  var color2: Color4 = js.native
  
  /**
    * Color the particle will have at the end of its lifetime
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
  def createConeEmitter(): ConeParticleEmitter = js.native
  def createConeEmitter(radius: Double): ConeParticleEmitter = js.native
  def createConeEmitter(radius: Double, angle: Double): ConeParticleEmitter = js.native
  def createConeEmitter(radius: Unit, angle: Double): ConeParticleEmitter = js.native
  
  /**
    * Creates a Cylinder Emitter for the particle system (emits from the cylinder to the particle position)
    * @param radius The radius of the emission cylinder
    * @param height The height of the emission cylinder
    * @param radiusRange The range of emission [0-1] 0 Surface only, 1 Entire Radius
    * @param directionRandomizer How much to randomize the particle direction [0-1]
    * @returns the emitter
    */
  def createCylinderEmitter(): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Double, height: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Double, height: Double, radiusRange: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Double, height: Double, radiusRange: Double, directionRandomizer: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Double, height: Double, radiusRange: Unit, directionRandomizer: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Double, height: Unit, radiusRange: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Double, height: Unit, radiusRange: Double, directionRandomizer: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Double, height: Unit, radiusRange: Unit, directionRandomizer: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Unit, height: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Unit, height: Double, radiusRange: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Unit, height: Double, radiusRange: Double, directionRandomizer: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Unit, height: Double, radiusRange: Unit, directionRandomizer: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Unit, height: Unit, radiusRange: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Unit, height: Unit, radiusRange: Double, directionRandomizer: Double): CylinderParticleEmitter = js.native
  def createCylinderEmitter(radius: Unit, height: Unit, radiusRange: Unit, directionRandomizer: Double): CylinderParticleEmitter = js.native
  
  /**
    * Creates a Directed Cylinder Emitter for the particle system (emits between direction1 and direction2)
    * @param radius The radius of the cylinder to emit from
    * @param height The height of the emission cylinder
    * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param direction1 Particles are emitted between the direction1 and direction2 from within the cylinder
    * @param direction2 Particles are emitted between the direction1 and direction2 from within the cylinder
    * @returns the emitter
    */
  def createDirectedCylinderEmitter(): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Double): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Double, radiusRange: Double): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Double, radiusRange: Double, direction1: Unit, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Double, radiusRange: Double, direction1: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Double, radiusRange: Double, direction1: Vector3, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Double, radiusRange: Unit, direction1: Unit, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Double, radiusRange: Unit, direction1: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Double, radiusRange: Unit, direction1: Vector3, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Unit, radiusRange: Double): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Unit, radiusRange: Double, direction1: Unit, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Unit, radiusRange: Double, direction1: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Unit, radiusRange: Double, direction1: Vector3, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Unit, radiusRange: Unit, direction1: Unit, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Unit, radiusRange: Unit, direction1: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Double, height: Unit, radiusRange: Unit, direction1: Vector3, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Double): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Double, radiusRange: Double): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Double, radiusRange: Double, direction1: Unit, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Double, radiusRange: Double, direction1: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Double, radiusRange: Double, direction1: Vector3, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Double, radiusRange: Unit, direction1: Unit, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Double, radiusRange: Unit, direction1: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Double, radiusRange: Unit, direction1: Vector3, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Unit, radiusRange: Double): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Unit, radiusRange: Double, direction1: Unit, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Unit, radiusRange: Double, direction1: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Unit, radiusRange: Double, direction1: Vector3, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Unit, radiusRange: Unit, direction1: Unit, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Unit, radiusRange: Unit, direction1: Vector3): CylinderDirectedParticleEmitter = js.native
  def createDirectedCylinderEmitter(radius: Unit, height: Unit, radiusRange: Unit, direction1: Vector3, direction2: Vector3): CylinderDirectedParticleEmitter = js.native
  
  /**
    * Creates a Directed Sphere Emitter for the particle system (emits between direction1 and direction2)
    * @param radius The radius of the sphere to emit from
    * @param direction1 Particles are emitted between the direction1 and direction2 from within the sphere
    * @param direction2 Particles are emitted between the direction1 and direction2 from within the sphere
    * @returns the emitter
    */
  def createDirectedSphereEmitter(): SphereDirectedParticleEmitter = js.native
  def createDirectedSphereEmitter(radius: Double): SphereDirectedParticleEmitter = js.native
  def createDirectedSphereEmitter(radius: Double, direction1: Unit, direction2: Vector3): SphereDirectedParticleEmitter = js.native
  def createDirectedSphereEmitter(radius: Double, direction1: Vector3): SphereDirectedParticleEmitter = js.native
  def createDirectedSphereEmitter(radius: Double, direction1: Vector3, direction2: Vector3): SphereDirectedParticleEmitter = js.native
  def createDirectedSphereEmitter(radius: Unit, direction1: Unit, direction2: Vector3): SphereDirectedParticleEmitter = js.native
  def createDirectedSphereEmitter(radius: Unit, direction1: Vector3): SphereDirectedParticleEmitter = js.native
  def createDirectedSphereEmitter(radius: Unit, direction1: Vector3, direction2: Vector3): SphereDirectedParticleEmitter = js.native
  
  /**
    * Creates a Hemisphere Emitter for the particle system (emits along the hemisphere radius)
    * @param radius The radius of the hemisphere to emit from
    * @param radiusRange The range of the hemisphere to emit from [0-1] 0 Surface Only, 1 Entire Radius
    * @returns the emitter
    */
  def createHemisphericEmitter(): HemisphericParticleEmitter = js.native
  def createHemisphericEmitter(radius: Double): HemisphericParticleEmitter = js.native
  def createHemisphericEmitter(radius: Double, radiusRange: Double): HemisphericParticleEmitter = js.native
  def createHemisphericEmitter(radius: Unit, radiusRange: Double): HemisphericParticleEmitter = js.native
  
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
  def createSphereEmitter(): SphereParticleEmitter = js.native
  def createSphereEmitter(radius: Double): SphereParticleEmitter = js.native
  def createSphereEmitter(radius: Double, radiusRange: Double): SphereParticleEmitter = js.native
  def createSphereEmitter(radius: Unit, radiusRange: Double): SphereParticleEmitter = js.native
  
  /**
    * This can help using your own shader to render the particle system.
    * The according effect will be created
    */
  var customShader: js.Any = js.native
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    * This only works when particleEmitterTyps is a BoxParticleEmitter
    */
  def direction1: Vector3 = js.native
  def direction1_=(value: Vector3): Unit = js.native
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    * This only works when particleEmitterTyps is a BoxParticleEmitter
    */
  def direction2: Vector3 = js.native
  def direction2_=(value: Vector3): Unit = js.native
  
  /**
    * Specifies whether the particle system will be disposed once it reaches the end of the animation.
    */
  var disposeOnStop: Boolean = js.native
  
  /**
    * The maximum number of particles to emit per frame
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
    * Forces the particle to write their depth information to the depth buffer. This can help preventing other draw calls
    * to override the particles.
    */
  var forceDepthWrite: Boolean = js.native
  
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
    * Gets the image processing configuration used either in this material.
    */
  def imageProcessingConfiguration: Nullable[ImageProcessingConfiguration] = js.native
  /**
    * Sets the Default image processing configuration used either in the this material.
    *
    * If sets to null, the scene one is in use.
    */
  def imageProcessingConfiguration_=(value: Nullable[ImageProcessingConfiguration]): Unit = js.native
  
  /**
    * Gets or sets whether an animation sprite sheet is enabled or not on the particle system
    */
  def isAnimationSheetEnabled: Boolean = js.native
  def isAnimationSheetEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if the particles must be rendered as billboard or aligned with the direction
    */
  def isBillboardBased: Boolean = js.native
  def isBillboardBased_=(value: Boolean): Unit = js.native
  
  /**
    * The layer mask we are rendering the particles through.
    */
  var layerMask: Double = js.native
  
  /** Gets or sets a value indicating the damping to apply if the limit velocity factor is reached */
  var limitVelocityDamping: Double = js.native
  
  /**
    * If you want to launch only a few particles at once, that can be done, as well.
    */
  var manualEmitCount: Double = js.native
  
  /**
    * Maximum angular speed of emitting particles (Z-axis rotation for each particle).
    */
  var maxAngularSpeed: Double = js.native
  
  /**
    * Maximum box point around our emitter. Our emitter is the center of particles source, but if you want your particles to emit from more than one point, then you can tell it to do so.
    * This only works when particleEmitterTyps is a BoxParticleEmitter
    */
  def maxEmitBox: Vector3 = js.native
  def maxEmitBox_=(value: Vector3): Unit = js.native
  
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
    * Minimum box point around our emitter. Our emitter is the center of particles source, but if you want your particles to emit from more than one point, then you can tell it to do so.
    * This only works when particleEmitterTyps is a BoxParticleEmitter
    */
  def minEmitBox: Vector3 = js.native
  def minEmitBox_=(value: Vector3): Unit = js.native
  
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
    * The friendly name of the Particle system.
    */
  var name: String = js.native
  
  /** Gets or sets the strength to apply to the noise value (default is (10, 10, 10)) */
  var noiseStrength: Vector3 = js.native
  
  /**
    * Gets or sets a texture used to add random noise to particle positions
    */
  def noiseTexture: Nullable[ProceduralTexture] = js.native
  def noiseTexture_=(value: Nullable[ProceduralTexture]): Unit = js.native
  
  /**
    * Callback triggered when the particle animation is ending.
    */
  var onAnimationEnd: Nullable[js.Function0[Unit]] = js.native
  
  /**
    * The particle emitter type defines the emitter used by the particle system.
    * It can be for example box, sphere, or cone...
    */
  var particleEmitterType: IParticleEmitterType = js.native
  
  /**
    * The texture used to render each particle. (this can be a spritesheet)
    */
  var particleTexture: Nullable[BaseTexture] = js.native
  
  /** Gets or sets a value indicating how many cycles (or frames) must be executed before first rendering (this value has to be set before starting the system). Default is 0 */
  var preWarmCycles: Double = js.native
  
  /** Gets or sets a value indicating the time step multiplier to use in pre-warm mode (default is 1) */
  var preWarmStepOffset: Double = js.native
  
  /**
    * By default particle system starts as soon as they are created. This prevents the
    * automatic start to happen and let you decide when to start emitting particles.
    */
  var preventAutoStart: Boolean = js.native
  
  /**
    * The rendering group used by the Particle system to chose when to render.
    */
  var renderingGroupId: Double = js.native
  
  /**
    * Snippet ID if the particle system was created from the snippet server
    */
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
    * Defines the delay in milliseconds before starting the system (0 by default)
    */
  var startDelay: Double = js.native
  
  /**
    * If using a spritesheet (isAnimationSheetEnabled) defines the first sprite cell to display
    */
  var startSpriteCellID: Double = js.native
  
  /**
    * The amount of time the particle system is running (depends of the overall update speed).
    */
  var targetStopDuration: Double = js.native
  
  /**
    * An optional mask to filter some colors out of the texture, or filter a part of the alpha channel
    */
  var textureMask: Color4 = js.native
  
  /** Gets or sets a Vector2 used to move the pivot (by default (0,0)) */
  var translationPivot: Vector2 = js.native
  
  /**
    * Gets or sets the unique id of the particle system
    */
  var uniqueId: Double = js.native
  
  /**
    * The overall motion speed (0.01 is default update speed, faster updates = faster animation)
    */
  var updateSpeed: Double = js.native
  
  /**
    * Gets or sets a world offset applied to all particles
    */
  var worldOffset: Vector3 = js.native
}
