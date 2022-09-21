package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeEffect
  extends StObject
     with EmbindObject[RuntimeEffect] {
  
  /**
    * Returns the nth uniform from the effect.
    * @param index
    */
  def getUniform(index: Double): SkSLUniform = js.native
  
  /**
    * Returns the number of uniforms on the effect.
    */
  def getUniformCount(): Double = js.native
  
  /**
    * Returns the total number of floats across all uniforms on the effect. This is the length
    * of the uniforms array expected by makeShader. For example, an effect with a single float3
    * uniform, would return 1 from `getUniformCount()`, but 3 from `getUniformFloatCount()`.
    */
  def getUniformFloatCount(): Double = js.native
  
  /**
    * Returns the name of the nth effect uniform.
    * @param index
    */
  def getUniformName(index: Double): String = js.native
  
  def makeShader(uniforms: js.Array[Double]): Shader = js.native
  def makeShader(uniforms: js.Array[Double], localMatrix: InputMatrix): Shader = js.native
  /**
    * Returns a shader executed using the given uniform data.
    * @param uniforms
    * @param localMatrix
    */
  def makeShader(uniforms: js.typedarray.Float32Array): Shader = js.native
  def makeShader(uniforms: js.typedarray.Float32Array, localMatrix: InputMatrix): Shader = js.native
  def makeShader(uniforms: MallocObj): Shader = js.native
  def makeShader(uniforms: MallocObj, localMatrix: InputMatrix): Shader = js.native
  
  def makeShaderWithChildren(uniforms: js.Array[Double]): Shader = js.native
  def makeShaderWithChildren(uniforms: js.Array[Double], children: js.Array[Shader]): Shader = js.native
  def makeShaderWithChildren(uniforms: js.Array[Double], children: js.Array[Shader], localMatrix: InputMatrix): Shader = js.native
  def makeShaderWithChildren(uniforms: js.Array[Double], children: Unit, localMatrix: InputMatrix): Shader = js.native
  /**
    * Returns a shader executed using the given uniform data and the children as inputs.
    * @param uniforms
    * @param children
    * @param localMatrix
    */
  def makeShaderWithChildren(uniforms: js.typedarray.Float32Array): Shader = js.native
  def makeShaderWithChildren(uniforms: js.typedarray.Float32Array, children: js.Array[Shader]): Shader = js.native
  def makeShaderWithChildren(uniforms: js.typedarray.Float32Array, children: js.Array[Shader], localMatrix: InputMatrix): Shader = js.native
  def makeShaderWithChildren(uniforms: js.typedarray.Float32Array, children: Unit, localMatrix: InputMatrix): Shader = js.native
  def makeShaderWithChildren(uniforms: MallocObj): Shader = js.native
  def makeShaderWithChildren(uniforms: MallocObj, children: js.Array[Shader]): Shader = js.native
  def makeShaderWithChildren(uniforms: MallocObj, children: js.Array[Shader], localMatrix: InputMatrix): Shader = js.native
  def makeShaderWithChildren(uniforms: MallocObj, children: Unit, localMatrix: InputMatrix): Shader = js.native
}
