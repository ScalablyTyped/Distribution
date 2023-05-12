package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "PolylineMaterialAppearance")
@js.native
open class PolylineMaterialAppearance () extends StObject {
  def this(options: typings.cesiumEngine.anon.Material) = this()
  
  /**
    * When <code>true</code>, the geometry is expected to be closed so
    * {@link PolylineMaterialAppearance#renderState} has backface culling enabled.
    * This is always <code>false</code> for <code>PolylineMaterialAppearance</code>.
    */
  val closed: Boolean = js.native
  
  /**
    * The GLSL source code for the fragment shader.
    */
  val fragmentShaderSource: String = js.native
  
  /**
    * Procedurally creates the full GLSL fragment shader source.  For {@link PolylineMaterialAppearance},
    * this is derived from {@link PolylineMaterialAppearance#fragmentShaderSource} and {@link PolylineMaterialAppearance#material}.
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
    * Determines if the geometry is translucent based on {@link PolylineMaterialAppearance#translucent} and {@link Material#isTranslucent}.
    * @returns <code>true</code> if the appearance is translucent.
    */
  def isTranslucent(): Boolean = js.native
  
  /**
    * The material used to determine the fragment color.  Unlike other {@link PolylineMaterialAppearance}
    * properties, this is not read-only, so an appearance's material can change on the fly.
    */
  var material: Material = js.native
  
  /**
    * The WebGL fixed-function state to use when rendering the geometry.
    * <p>
    * The render state can be explicitly defined when constructing a {@link PolylineMaterialAppearance}
    * instance, or it is set implicitly via {@link PolylineMaterialAppearance#translucent}
    * and {@link PolylineMaterialAppearance#closed}.
    * </p>
    */
  val renderState: Any = js.native
  
  /**
    * When <code>true</code>, the geometry is expected to appear translucent so
    * {@link PolylineMaterialAppearance#renderState} has alpha blending enabled.
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
object PolylineMaterialAppearance {
  
  /**
    * The {@link VertexFormat} that all {@link PolylineMaterialAppearance} instances
    * are compatible with. This requires <code>position</code> and <code>st</code> attributes.
    */
  @JSImport("@cesium/engine", "PolylineMaterialAppearance.VERTEX_FORMAT")
  @js.native
  val VERTEX_FORMAT: VertexFormat = js.native
}
