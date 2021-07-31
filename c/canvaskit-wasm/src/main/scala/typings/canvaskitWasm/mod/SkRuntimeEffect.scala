package typings.canvaskitWasm.mod

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkRuntimeEffect
  extends StObject
     with EmbindObject[SkRuntimeEffect] {
  
  def makeShader(uniforms: js.Array[Double]): SkShader = js.native
  def makeShader(uniforms: js.Array[Double], isOpaque: Boolean): SkShader = js.native
  def makeShader(uniforms: js.Array[Double], isOpaque: Boolean, localMatrix: InputMatrix): SkShader = js.native
  def makeShader(uniforms: js.Array[Double], isOpaque: Unit, localMatrix: InputMatrix): SkShader = js.native
  /**
    * Returns a shader executed using the given uniform data.
    * @param uniforms
    * @param isOpaque
    * @param localMatrix
    */
  def makeShader(uniforms: Float32Array): SkShader = js.native
  def makeShader(uniforms: Float32Array, isOpaque: Boolean): SkShader = js.native
  def makeShader(uniforms: Float32Array, isOpaque: Boolean, localMatrix: InputMatrix): SkShader = js.native
  def makeShader(uniforms: Float32Array, isOpaque: Unit, localMatrix: InputMatrix): SkShader = js.native
  
  def makeShaderWithChildren(uniforms: js.Array[Double]): SkShader = js.native
  def makeShaderWithChildren(uniforms: js.Array[Double], isOpaque: Boolean): SkShader = js.native
  def makeShaderWithChildren(uniforms: js.Array[Double], isOpaque: Boolean, children: js.Array[SkShader]): SkShader = js.native
  def makeShaderWithChildren(
    uniforms: js.Array[Double],
    isOpaque: Boolean,
    children: js.Array[SkShader],
    localMatrix: InputMatrix
  ): SkShader = js.native
  def makeShaderWithChildren(uniforms: js.Array[Double], isOpaque: Boolean, children: Unit, localMatrix: InputMatrix): SkShader = js.native
  def makeShaderWithChildren(uniforms: js.Array[Double], isOpaque: Unit, children: js.Array[SkShader]): SkShader = js.native
  def makeShaderWithChildren(uniforms: js.Array[Double], isOpaque: Unit, children: js.Array[SkShader], localMatrix: InputMatrix): SkShader = js.native
  def makeShaderWithChildren(uniforms: js.Array[Double], isOpaque: Unit, children: Unit, localMatrix: InputMatrix): SkShader = js.native
  /**
    * Returns a shader executed using the given uniform data and the children as inputs.
    * @param uniforms
    * @param isOpaque
    * @param children
    * @param localMatrix
    */
  def makeShaderWithChildren(uniforms: Float32Array): SkShader = js.native
  def makeShaderWithChildren(uniforms: Float32Array, isOpaque: Boolean): SkShader = js.native
  def makeShaderWithChildren(uniforms: Float32Array, isOpaque: Boolean, children: js.Array[SkShader]): SkShader = js.native
  def makeShaderWithChildren(uniforms: Float32Array, isOpaque: Boolean, children: js.Array[SkShader], localMatrix: InputMatrix): SkShader = js.native
  def makeShaderWithChildren(uniforms: Float32Array, isOpaque: Boolean, children: Unit, localMatrix: InputMatrix): SkShader = js.native
  def makeShaderWithChildren(uniforms: Float32Array, isOpaque: Unit, children: js.Array[SkShader]): SkShader = js.native
  def makeShaderWithChildren(uniforms: Float32Array, isOpaque: Unit, children: js.Array[SkShader], localMatrix: InputMatrix): SkShader = js.native
  def makeShaderWithChildren(uniforms: Float32Array, isOpaque: Unit, children: Unit, localMatrix: InputMatrix): SkShader = js.native
}
