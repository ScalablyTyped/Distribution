package typings.cesium.mod

import typings.cesium.anon.Closed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Appearance")
@js.native
open class Appearance () extends StObject {
  def this(options: Closed) = this()
  
  /**
    * When <code>true</code>, the geometry is expected to be closed.
    */
  val closed: Boolean = js.native
  
  /**
    * The GLSL source code for the fragment shader.  The full fragment shader
    * source is built procedurally taking into account the {@link Appearance#material}.
    * Use {@link Appearance#getFragmentShaderSource} to get the full source.
    */
  val fragmentShaderSource: String = js.native
  
  /**
    * Procedurally creates the full GLSL fragment shader source for this appearance
    * taking into account {@link Appearance#fragmentShaderSource} and {@link Appearance#material}.
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
    * Determines if the geometry is translucent based on {@link Appearance#translucent} and {@link Material#isTranslucent}.
    * @returns <code>true</code> if the appearance is translucent.
    */
  def isTranslucent(): Boolean = js.native
  
  /**
    * The material used to determine the fragment color.  Unlike other {@link Appearance}
    * properties, this is not read-only, so an appearance's material can change on the fly.
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
