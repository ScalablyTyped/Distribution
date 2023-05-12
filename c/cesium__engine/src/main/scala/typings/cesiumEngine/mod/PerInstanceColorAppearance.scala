package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.Flat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "PerInstanceColorAppearance")
@js.native
open class PerInstanceColorAppearance () extends StObject {
  def this(options: Flat) = this()
  
  /**
    * When <code>true</code>, the geometry is expected to be closed so
    * {@link PerInstanceColorAppearance#renderState} has backface culling enabled.
    * If the viewer enters the geometry, it will not be visible.
    */
  val closed: Boolean = js.native
  
  /**
    * When <code>true</code>, the fragment shader flips the surface normal
    * as needed to ensure that the normal faces the viewer to avoid
    * dark spots.  This is useful when both sides of a geometry should be
    * shaded like {@link WallGeometry}.
    */
  val faceForward: Boolean = js.native
  
  /**
    * When <code>true</code>, flat shading is used in the fragment shader,
    * which means lighting is not taking into account.
    */
  val flat: Boolean = js.native
  
  /**
    * The GLSL source code for the fragment shader.
    */
  val fragmentShaderSource: String = js.native
  
  /**
    * Procedurally creates the full GLSL fragment shader source.  For {@link PerInstanceColorAppearance},
    * this is derived from {@link PerInstanceColorAppearance#fragmentShaderSource}, {@link PerInstanceColorAppearance#flat},
    * and {@link PerInstanceColorAppearance#faceForward}.
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
    * Determines if the geometry is translucent based on {@link PerInstanceColorAppearance#translucent}.
    * @returns <code>true</code> if the appearance is translucent.
    */
  def isTranslucent(): Boolean = js.native
  
  /**
    * This property is part of the {@link Appearance} interface, but is not
    * used by {@link PerInstanceColorAppearance} since a fully custom fragment shader is used.
    */
  var material: Material = js.native
  
  /**
    * The WebGL fixed-function state to use when rendering the geometry.
    * <p>
    * The render state can be explicitly defined when constructing a {@link PerInstanceColorAppearance}
    * instance, or it is set implicitly via {@link PerInstanceColorAppearance#translucent}
    * and {@link PerInstanceColorAppearance#closed}.
    * </p>
    */
  val renderState: Any = js.native
  
  /**
    * When <code>true</code>, the geometry is expected to appear translucent so
    * {@link PerInstanceColorAppearance#renderState} has alpha blending enabled.
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
object PerInstanceColorAppearance {
  
  /**
    * The {@link VertexFormat} that all {@link PerInstanceColorAppearance} instances
    * are compatible with when {@link PerInstanceColorAppearance#flat} is <code>true</code>.
    * This requires only a <code>position</code> attribute.
    */
  @JSImport("@cesium/engine", "PerInstanceColorAppearance.FLAT_VERTEX_FORMAT")
  @js.native
  val FLAT_VERTEX_FORMAT: VertexFormat = js.native
  
  /**
    * The {@link VertexFormat} that all {@link PerInstanceColorAppearance} instances
    * are compatible with.  This requires only <code>position</code> and <code>normal</code>
    * attributes.
    */
  @JSImport("@cesium/engine", "PerInstanceColorAppearance.VERTEX_FORMAT")
  @js.native
  val VERTEX_FORMAT: VertexFormat = js.native
}
