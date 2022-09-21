package typings.canvaskitWasm.mod

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
  def draw(canvas: Canvas): Unit
  
  /**
    * Returns the nth uniform from the effect.
    * @param index
    */
  def getUniform(index: Double): SkSLUniform
  
  /**
    * Returns the number of uniforms on the effect.
    */
  def getUniformCount(): Double
  
  /**
    * Returns the total number of floats across all uniforms on the effect. This is the length
    * of the array returned by `uniforms()`. For example, an effect with a single float3 uniform,
    * would return 1 from `getUniformCount()`, but 3 from `getUniformFloatCount()`.
    */
  def getUniformFloatCount(): Double
  
  /**
    * Returns the name of the nth effect uniform.
    * @param index
    */
  def getUniformName(index: Double): String
  
  /**
    * Sets the base position of the effect.
    * @param point
    */
  def setPosition(point: InputPoint): Unit
  
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
    * Returns a Float32Array bound to the WASM memory of these uniforms. Changing these
    * floats will change the corresponding uniforms instantly.
    */
  def uniforms(): js.typedarray.Float32Array
  
  /**
    * Updates the effect using the new time.
    * @param now
    */
  def update(now: Double): Unit
}
object Particles {
  
  inline def apply(
    delete: () => Unit,
    deleteLater: () => Unit,
    draw: Canvas => Unit,
    getUniform: Double => SkSLUniform,
    getUniformCount: () => Double,
    getUniformFloatCount: () => Double,
    getUniformName: Double => String,
    isAliasOf: Any => Boolean,
    isDeleted: () => Boolean,
    setPosition: InputPoint => Unit,
    setRate: Double => Unit,
    start: (Double, Boolean) => Unit,
    uniforms: () => js.typedarray.Float32Array,
    update: Double => Unit
  ): Particles = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteLater = js.Any.fromFunction0(deleteLater), draw = js.Any.fromFunction1(draw), getUniform = js.Any.fromFunction1(getUniform), getUniformCount = js.Any.fromFunction0(getUniformCount), getUniformFloatCount = js.Any.fromFunction0(getUniformFloatCount), getUniformName = js.Any.fromFunction1(getUniformName), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), setPosition = js.Any.fromFunction1(setPosition), setRate = js.Any.fromFunction1(setRate), start = js.Any.fromFunction2(start), uniforms = js.Any.fromFunction0(uniforms), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Particles]
  }
  
  extension [Self <: Particles](x: Self) {
    
    inline def setDraw(value: Canvas => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction1(value))
    
    inline def setGetUniform(value: Double => SkSLUniform): Self = StObject.set(x, "getUniform", js.Any.fromFunction1(value))
    
    inline def setGetUniformCount(value: () => Double): Self = StObject.set(x, "getUniformCount", js.Any.fromFunction0(value))
    
    inline def setGetUniformFloatCount(value: () => Double): Self = StObject.set(x, "getUniformFloatCount", js.Any.fromFunction0(value))
    
    inline def setGetUniformName(value: Double => String): Self = StObject.set(x, "getUniformName", js.Any.fromFunction1(value))
    
    inline def setSetPosition(value: InputPoint => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    inline def setSetRate(value: Double => Unit): Self = StObject.set(x, "setRate", js.Any.fromFunction1(value))
    
    inline def setStart(value: (Double, Boolean) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setUniforms(value: () => js.typedarray.Float32Array): Self = StObject.set(x, "uniforms", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
