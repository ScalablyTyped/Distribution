package typings.canvaskitWasm.mod

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Particles
  extends StObject
     with EmbindObject[Particles] {
  
  /**
    * Draws the current state of the particles on the given canvas.
    * @param canvas
    */
  def draw(canvas: SkCanvas): Unit
  
  /**
    * Returns a Float32Array bound to the WASM memory of these uniforms. Changing these
    * floats will change the corresponding uniforms instantly.
    */
  def effectUniforms(): Float32Array
  
  /**
    * Returns the nth uniform from the effect.
    * @param index
    */
  def getEffectUniform(index: Double): ParticlesUniform
  
  /**
    * Returns the number of uniforms on the effect.
    */
  def getEffectUniformCount(): Double
  
  /**
    * Returns the number of float uniforms on the effect.
    */
  def getEffectUniformFloatCount(): Double
  
  /**
    * Returns the name of the nth effect uniform.
    * @param index
    */
  def getEffectUniformName(index: Double): String
  
  /**
    * Returns the nth uniform on the particles.
    * @param index
    */
  def getParticleUniform(index: Double): ParticlesUniform
  
  /**
    * Returns the count of uniforms on the particles.
    */
  def getParticleUniformCount(): Double
  
  /**
    * Returns the number of float uniforms on the particles.
    */
  def getParticleUniformFloatCount(): Double
  
  /**
    * Returns the name of the nth particle uniform.
    * @param index
    */
  def getParticleUniformName(index: Double): String
  
  /**
    * Returns a Float32Array bound to the WASM memory of these uniforms. Changing these
    * floats will change the corresponding uniforms instantly.
    */
  def particleUniforms(): Float32Array
  
  /**
    * Sets the base position of the effect.
    * @param point
    */
  def setPosition(point: SkPoint): Unit
  
  /**
    * Sets the base rate of the effect.
    * @param rate
    */
  def setRate(rate: Double): Unit
  
  /**
    * Starts playing the effect.
    * @param now
    * @param looping
    */
  def start(now: Double, looping: Boolean): Unit
  
  /**
    * Updates the effect using the new time.
    * @param now
    */
  def update(now: Double): Unit
}
object Particles {
  
  inline def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    draw: SkCanvas => Unit,
    effectUniforms: () => Float32Array,
    getEffectUniform: Double => ParticlesUniform,
    getEffectUniformCount: () => Double,
    getEffectUniformFloatCount: () => Double,
    getEffectUniformName: Double => String,
    getParticleUniform: Double => ParticlesUniform,
    getParticleUniformCount: () => Double,
    getParticleUniformFloatCount: () => Double,
    getParticleUniformName: Double => String,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    particleUniforms: () => Float32Array,
    setPosition: SkPoint => Unit,
    setRate: Double => Unit,
    start: (Double, Boolean) => Unit,
    update: Double => Unit
  ): Particles = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), draw = js.Any.fromFunction1(draw), effectUniforms = js.Any.fromFunction0(effectUniforms), getEffectUniform = js.Any.fromFunction1(getEffectUniform), getEffectUniformCount = js.Any.fromFunction0(getEffectUniformCount), getEffectUniformFloatCount = js.Any.fromFunction0(getEffectUniformFloatCount), getEffectUniformName = js.Any.fromFunction1(getEffectUniformName), getParticleUniform = js.Any.fromFunction1(getParticleUniform), getParticleUniformCount = js.Any.fromFunction0(getParticleUniformCount), getParticleUniformFloatCount = js.Any.fromFunction0(getParticleUniformFloatCount), getParticleUniformName = js.Any.fromFunction1(getParticleUniformName), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), particleUniforms = js.Any.fromFunction0(particleUniforms), setPosition = js.Any.fromFunction1(setPosition), setRate = js.Any.fromFunction1(setRate), start = js.Any.fromFunction2(start), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Particles]
  }
  
  extension [Self <: Particles](x: Self) {
    
    inline def setDraw(value: SkCanvas => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction1(value))
    
    inline def setEffectUniforms(value: () => Float32Array): Self = StObject.set(x, "effectUniforms", js.Any.fromFunction0(value))
    
    inline def setGetEffectUniform(value: Double => ParticlesUniform): Self = StObject.set(x, "getEffectUniform", js.Any.fromFunction1(value))
    
    inline def setGetEffectUniformCount(value: () => Double): Self = StObject.set(x, "getEffectUniformCount", js.Any.fromFunction0(value))
    
    inline def setGetEffectUniformFloatCount(value: () => Double): Self = StObject.set(x, "getEffectUniformFloatCount", js.Any.fromFunction0(value))
    
    inline def setGetEffectUniformName(value: Double => String): Self = StObject.set(x, "getEffectUniformName", js.Any.fromFunction1(value))
    
    inline def setGetParticleUniform(value: Double => ParticlesUniform): Self = StObject.set(x, "getParticleUniform", js.Any.fromFunction1(value))
    
    inline def setGetParticleUniformCount(value: () => Double): Self = StObject.set(x, "getParticleUniformCount", js.Any.fromFunction0(value))
    
    inline def setGetParticleUniformFloatCount(value: () => Double): Self = StObject.set(x, "getParticleUniformFloatCount", js.Any.fromFunction0(value))
    
    inline def setGetParticleUniformName(value: Double => String): Self = StObject.set(x, "getParticleUniformName", js.Any.fromFunction1(value))
    
    inline def setParticleUniforms(value: () => Float32Array): Self = StObject.set(x, "particleUniforms", js.Any.fromFunction0(value))
    
    inline def setSetPosition(value: SkPoint => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    inline def setSetRate(value: Double => Unit): Self = StObject.set(x, "setRate", js.Any.fromFunction1(value))
    
    inline def setStart(value: (Double, Boolean) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
