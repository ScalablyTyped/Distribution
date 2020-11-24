package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkShaderFactory extends js.Object {
  
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
  implicit class SkShaderFactoryOps[Self <: SkShaderFactory] (val x: Self) extends AnyVal {
    
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
    def setBlend(value: (BlendMode, SkShader, SkShader) => SkShader): Self = this.set("Blend", js.Any.fromFunction3(value))
    
    @scala.inline
    def setColor(value: (InputColor, ColorSpace) => SkShader): Self = this.set("Color", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLerp(value: (Double, SkShader, SkShader) => SkShader): Self = this.set("Lerp", js.Any.fromFunction3(value))
  }
}
