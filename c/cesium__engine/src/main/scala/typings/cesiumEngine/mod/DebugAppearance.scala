package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.AttributeName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "DebugAppearance")
@js.native
open class DebugAppearance protected () extends StObject {
  def this(options: AttributeName) = this()
  
  /**
    * The name of the attribute being visualized.
    */
  val attributeName: String = js.native
  
  /**
    * When <code>true</code>, the geometry is expected to be closed.
    */
  val closed: Boolean = js.native
  
  /**
    * The GLSL source code for the fragment shader.  The full fragment shader
    * source is built procedurally taking into account the {@link DebugAppearance#material}.
    * Use {@link DebugAppearance#getFragmentShaderSource} to get the full source.
    */
  val fragmentShaderSource: String = js.native
  
  /**
    * Returns the full GLSL fragment shader source, which for {@link DebugAppearance} is just
    * {@link DebugAppearance#fragmentShaderSource}.
    * @returns The full GLSL fragment shader source.
    */
  def getFragmentShaderSource(): String = js.native
  
  /**
    * Creates a render state.  This is not the final render state instance; instead,
    * it can contain a subset of render state properties identical to the render state
    * created in the context.
    * @returns The render state.
    */
  def getRenderState(): Any = js.native
  
  /**
    * The GLSL datatype of the attribute being visualized.
    */
  val glslDatatype: String = js.native
  
  /**
    * Determines if the geometry is translucent based on {@link DebugAppearance#translucent}.
    * @returns <code>true</code> if the appearance is translucent.
    */
  def isTranslucent(): Boolean = js.native
  
  /**
    * This property is part of the {@link Appearance} interface, but is not
    * used by {@link DebugAppearance} since a fully custom fragment shader is used.
    */
  var material: Material = js.native
  
  /**
    * The WebGL fixed-function state to use when rendering the geometry.
    */
  val renderState: Any = js.native
  
  /**
    * When <code>true</code>, the geometry is expected to appear translucent.
    */
  var translucent: Boolean = js.native
  
  /**
    * The GLSL source code for the vertex shader.
    */
  val vertexShaderSource: String = js.native
}
