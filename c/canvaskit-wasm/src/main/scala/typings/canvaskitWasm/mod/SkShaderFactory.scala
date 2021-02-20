package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkShaderFactory extends StObject {
  
  /**
    * Returns a shader that combines the given shaders with a BlendMode.
    * @param mode
    * @param one
    * @param two
    */
  def Blend(mode: BlendMode, one: SkShader, two: SkShader): SkShader = js.native
  
  /**
    * Returns a shader with a given color and colorspace.
    * @param color
    * @param space
    */
  def Color(color: InputColor, space: ColorSpace): SkShader = js.native
  
  /**
    * Returns a shader is a linear interpolation combines the given shaders with a BlendMode.
    * @param t - range of [0.0, 1.0], indicating how far we should be between one and two.
    * @param one
    * @param two
    */
  def Lerp(t: Double, one: SkShader, two: SkShader): SkShader = js.native
}
object SkShaderFactory {
  
  @scala.inline
  def apply(
    Blend: (BlendMode, SkShader, SkShader) => SkShader,
    Color: (InputColor, ColorSpace) => SkShader,
    Lerp: (Double, SkShader, SkShader) => SkShader
  ): SkShaderFactory = {
    val __obj = js.Dynamic.literal(Blend = js.Any.fromFunction3(Blend), Color = js.Any.fromFunction2(Color), Lerp = js.Any.fromFunction3(Lerp))
    __obj.asInstanceOf[SkShaderFactory]
  }
  
  @scala.inline
  implicit class SkShaderFactoryMutableBuilder[Self <: SkShaderFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlend(value: (BlendMode, SkShader, SkShader) => SkShader): Self = StObject.set(x, "Blend", js.Any.fromFunction3(value))
    
    @scala.inline
    def setColor(value: (InputColor, ColorSpace) => SkShader): Self = StObject.set(x, "Color", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLerp(value: (Double, SkShader, SkShader) => SkShader): Self = StObject.set(x, "Lerp", js.Any.fromFunction3(value))
  }
}
