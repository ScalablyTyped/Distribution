package typings.canvaskitWasm.mod

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Particles extends EmbindObject[Particles] {
  
  /**
    * Draws the current state of the particles on the given canvas.
    * @param canvas
    */
  def draw(canvas: SkCanvas): Unit = js.native
  
  /**
    * Returns a Float32Array bound to the WASM memory of these uniforms. Changing these
    * floats will change the corresponding uniforms instantly.
    */
  def effectUniforms(): Float32Array = js.native
  
  /**
    * Returns the nth uniform from the effect.
    * @param index
    */
  def getEffectUniform(index: Double): ParticlesUniform = js.native
  
  /**
    * Returns the number of uniforms on the effect.
    */
  def getEffectUniformCount(): Double = js.native
  
  /**
    * Returns the number of float uniforms on the effect.
    */
  def getEffectUniformFloatCount(): Double = js.native
  
  /**
    * Returns the name of the nth effect uniform.
    * @param index
    */
  def getEffectUniformName(index: Double): String = js.native
  
  /**
    * Returns the nth uniform on the particles.
    * @param index
    */
  def getParticleUniform(index: Double): ParticlesUniform = js.native
  
  /**
    * Returns the count of uniforms on the particles.
    */
  def getParticleUniformCount(): Double = js.native
  
  /**
    * Returns the number of float uniforms on the particles.
    */
  def getParticleUniformFloatCount(): Double = js.native
  
  /**
    * Returns the name of the nth particle uniform.
    * @param index
    */
  def getParticleUniformName(index: Double): String = js.native
  
  /**
    * Returns a Float32Array bound to the WASM memory of these uniforms. Changing these
    * floats will change the corresponding uniforms instantly.
    */
  def particleUniforms(): Float32Array = js.native
  
  /**
    * Sets the base position of the effect.
    * @param point
    */
  def setPosition(point: SkPoint): Unit = js.native
  
  /**
    * Sets the base rate of the effect.
    * @param rate
    */
  def setRate(rate: Double): Unit = js.native
  
  /**
    * Starts playing the effect.
    * @param now
    * @param looping
    */
  def start(now: Double, looping: Boolean): Unit = js.native
  
  /**
    * Updates the effect using the new time.
    * @param now
    */
  def update(now: Double): Unit = js.native
}
object Particles {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ParticlesOps[Self <: Particles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDraw(value: SkCanvas => Unit): Self = this.set("draw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEffectUniforms(value: () => Float32Array): Self = this.set("effectUniforms", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEffectUniform(value: Double => ParticlesUniform): Self = this.set("getEffectUniform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEffectUniformCount(value: () => Double): Self = this.set("getEffectUniformCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEffectUniformFloatCount(value: () => Double): Self = this.set("getEffectUniformFloatCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEffectUniformName(value: Double => String): Self = this.set("getEffectUniformName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParticleUniform(value: Double => ParticlesUniform): Self = this.set("getParticleUniform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParticleUniformCount(value: () => Double): Self = this.set("getParticleUniformCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParticleUniformFloatCount(value: () => Double): Self = this.set("getParticleUniformFloatCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParticleUniformName(value: Double => String): Self = this.set("getParticleUniformName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParticleUniforms(value: () => Float32Array): Self = this.set("particleUniforms", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPosition(value: SkPoint => Unit): Self = this.set("setPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRate(value: Double => Unit): Self = this.set("setRate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: (Double, Boolean) => Unit): Self = this.set("start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(value: Double => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
