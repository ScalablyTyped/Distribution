package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cesiumEngine.anon.FragmentShaderText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "CustomShader")
@js.native
open class CustomShader protected () extends StObject {
  def this(options: FragmentShaderText) = this()
  
  /**
    * The user-defined GLSL code for the fragment shader
    */
  val fragmentShaderText: String = js.native
  
  /**
    * The lighting model to use when using the custom shader.
    * This is used by {@link CustomShaderPipelineStage}
    */
  val lightingModel: LightingModel = js.native
  
  /**
    * A value determining how the custom shader interacts with the overall
    * fragment shader. This is used by {@link CustomShaderPipelineStage}
    */
  val mode: CustomShaderMode = js.native
  
  def setUniform(uniformName: String, value: String): Unit = js.native
  /**
    * Update the value of a uniform declared in the shader
    * @param uniformName - The GLSL name of the uniform. This must match one of the uniforms declared in the constructor
    * @param value - The new value of the uniform.
    */
  def setUniform(uniformName: String, value: Boolean): Unit = js.native
  def setUniform(uniformName: String, value: Double): Unit = js.native
  def setUniform(uniformName: String, value: Cartesian2): Unit = js.native
  def setUniform(uniformName: String, value: Cartesian3): Unit = js.native
  def setUniform(uniformName: String, value: Cartesian4): Unit = js.native
  def setUniform(uniformName: String, value: Matrix2): Unit = js.native
  def setUniform(uniformName: String, value: Matrix3): Unit = js.native
  def setUniform(uniformName: String, value: Matrix4): Unit = js.native
  def setUniform(uniformName: String, value: Resource): Unit = js.native
  
  /**
    * The translucency mode, which determines how the custom shader will be applied. If the value is
    * CustomShaderTransulcencyMode.OPAQUE or CustomShaderTransulcencyMode.TRANSLUCENT, the custom shader
    * will override settings from the model's material. If the value isCustomShaderTransulcencyMode.INHERIT,
    * the custom shader will render as either opaque or translucent depending on the primitive's material settings.
    */
  val translucencyMode: CustomShaderTranslucencyMode = js.native
  
  /**
    * Additional uniforms as declared by the user.
    */
  val uniforms: StringDictionary[UniformSpecifier] = js.native
  
  /**
    * Additional varyings as declared by the user.
    * This is used by {@link CustomShaderPipelineStage}
    */
  val varyings: StringDictionary[VaryingType] = js.native
  
  /**
    * The user-defined GLSL code for the vertex shader
    */
  val vertexShaderText: String = js.native
}
