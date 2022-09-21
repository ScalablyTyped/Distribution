package typings.cesium.mod

import typings.cesium.anon.AboveGround
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidSurfaceAppearance")
@js.native
open class EllipsoidSurfaceAppearance () extends StObject {
  def this(options: AboveGround) = this()
  
  /**
    * When <code>true</code>, the geometry is expected to be on the ellipsoid's
    * surface - not at a constant height above it - so {@link EllipsoidSurfaceAppearance#renderState}
    * has backface culling enabled.
    */
  val aboveGround: Boolean = js.native
  
  /**
    * When <code>true</code>, the geometry is expected to be closed so
    * {@link EllipsoidSurfaceAppearance#renderState} has backface culling enabled.
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
    * The GLSL source code for the fragment shader.  The full fragment shader
    * source is built procedurally taking into account {@link EllipsoidSurfaceAppearance#material},
    * {@link EllipsoidSurfaceAppearance#flat}, and {@link EllipsoidSurfaceAppearance#faceForward}.
    * Use {@link EllipsoidSurfaceAppearance#getFragmentShaderSource} to get the full source.
    */
  val fragmentShaderSource: String = js.native
  
  /**
    * Procedurally creates the full GLSL fragment shader source.  For {@link EllipsoidSurfaceAppearance},
    * this is derived from {@link EllipsoidSurfaceAppearance#fragmentShaderSource}, {@link EllipsoidSurfaceAppearance#flat},
    * and {@link EllipsoidSurfaceAppearance#faceForward}.
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
    * Determines if the geometry is translucent based on {@link EllipsoidSurfaceAppearance#translucent} and {@link Material#isTranslucent}.
    * @returns <code>true</code> if the appearance is translucent.
    */
  def isTranslucent(): Boolean = js.native
  
  /**
    * The material used to determine the fragment color.  Unlike other {@link EllipsoidSurfaceAppearance}
    * properties, this is not read-only, so an appearance's material can change on the fly.
    */
  var material: Material = js.native
  
  /**
    * The WebGL fixed-function state to use when rendering the geometry.
    * <p>
    * The render state can be explicitly defined when constructing a {@link EllipsoidSurfaceAppearance}
    * instance, or it is set implicitly via {@link EllipsoidSurfaceAppearance#translucent}
    * and {@link EllipsoidSurfaceAppearance#aboveGround}.
    * </p>
    */
  val renderState: Any = js.native
  
  /**
    * When <code>true</code>, the geometry is expected to appear translucent.
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
object EllipsoidSurfaceAppearance {
  
  /**
    * The {@link VertexFormat} that all {@link EllipsoidSurfaceAppearance} instances
    * are compatible with, which requires only <code>position</code> and <code>st</code>
    * attributes.  Other attributes are procedurally computed in the fragment shader.
    */
  @JSImport("cesium", "EllipsoidSurfaceAppearance.VERTEX_FORMAT")
  @js.native
  val VERTEX_FORMAT: VertexFormat = js.native
}
