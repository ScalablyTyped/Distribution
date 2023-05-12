package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.FragmentShaderSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "PolylineColorAppearance")
@js.native
open class PolylineColorAppearance () extends StObject {
  def this(options: FragmentShaderSource) = this()
  
  /**
    * When <code>true</code>, the geometry is expected to be closed so
    * {@link PolylineColorAppearance#renderState} has backface culling enabled.
    * This is always <code>false</code> for <code>PolylineColorAppearance</code>.
    */
  val closed: Boolean = js.native
  
  /**
    * The GLSL source code for the fragment shader.
    */
  val fragmentShaderSource: String = js.native
  
  /**
    * Procedurally creates the full GLSL fragment shader source.
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
    * Determines if the geometry is translucent based on {@link PolylineColorAppearance#translucent}.
    * @returns <code>true</code> if the appearance is translucent.
    */
  def isTranslucent(): Boolean = js.native
  
  /**
    * This property is part of the {@link Appearance} interface, but is not
    * used by {@link PolylineColorAppearance} since a fully custom fragment shader is used.
    */
  var material: Material = js.native
  
  /**
    * The WebGL fixed-function state to use when rendering the geometry.
    * <p>
    * The render state can be explicitly defined when constructing a {@link PolylineColorAppearance}
    * instance, or it is set implicitly via {@link PolylineColorAppearance#translucent}.
    * </p>
    */
  val renderState: Any = js.native
  
  /**
    * When <code>true</code>, the geometry is expected to appear translucent so
    * {@link PolylineColorAppearance#renderState} has alpha blending enabled.
    */
  var translucent: Boolean = js.native
  
  /**
    * The {@link VertexFormat} that this appearance instance is compatible with.
    * A geometry can have more vertex attributes and still be compatible - at a
    * potential performance cost - but it can't have less.
    */
  val vertexFormat: VertexFormat = js.native
  
  /**
    * The GLSL source code for the vertex shader.
    */
  val vertexShaderSource: String = js.native
}
/* static members */
object PolylineColorAppearance {
  
  /**
    * The {@link VertexFormat} that all {@link PolylineColorAppearance} instances
    * are compatible with. This requires only a <code>position</code> attribute.
    */
  @JSImport("@cesium/engine", "PolylineColorAppearance.VERTEX_FORMAT")
  @js.native
  val VERTEX_FORMAT: VertexFormat = js.native
}
