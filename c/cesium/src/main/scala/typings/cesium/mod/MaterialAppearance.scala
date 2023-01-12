package typings.cesium.mod

import typings.cesium.anon.FaceForward
import typings.cesium.mod.MaterialAppearance.MaterialSupportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "MaterialAppearance")
@js.native
open class MaterialAppearance () extends StObject {
  def this(options: FaceForward) = this()
  
  /**
    * When <code>true</code>, the geometry is expected to be closed so
    * {@link MaterialAppearance#renderState} has backface culling enabled.
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
    * source is built procedurally taking into account {@link MaterialAppearance#material},
    * {@link MaterialAppearance#flat}, and {@link MaterialAppearance#faceForward}.
    * Use {@link MaterialAppearance#getFragmentShaderSource} to get the full source.
    */
  val fragmentShaderSource: String = js.native
  
  /**
    * Procedurally creates the full GLSL fragment shader source.  For {@link MaterialAppearance},
    * this is derived from {@link MaterialAppearance#fragmentShaderSource}, {@link MaterialAppearance#material},
    * {@link MaterialAppearance#flat}, and {@link MaterialAppearance#faceForward}.
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
    * Determines if the geometry is translucent based on {@link MaterialAppearance#translucent} and {@link Material#isTranslucent}.
    * @returns <code>true</code> if the appearance is translucent.
    */
  def isTranslucent(): Boolean = js.native
  
  /**
    * The material used to determine the fragment color.  Unlike other {@link MaterialAppearance}
    * properties, this is not read-only, so an appearance's material can change on the fly.
    */
  var material: Material = js.native
  
  /**
    * The type of materials supported by this instance.  This impacts the required
    * {@link VertexFormat} and the complexity of the vertex and fragment shaders.
    */
  val materialSupport: MaterialSupportType = js.native
  
  /**
    * The WebGL fixed-function state to use when rendering the geometry.
    * <p>
    * The render state can be explicitly defined when constructing a {@link MaterialAppearance}
    * instance, or it is set implicitly via {@link MaterialAppearance#translucent}
    * and {@link MaterialAppearance#closed}.
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
object MaterialAppearance {
  
  /**
    * Determines the type of {@link Material} that is supported by a
    * {@link MaterialAppearance} instance.  This is a trade-off between
    * flexibility (a wide array of materials) and memory/performance
    * (required vertex format and GLSL shader complexity.
    */
  object MaterialSupport {
    
    /**
      * All materials, including those that work in tangent space, are supported.
      * This requires <code>position</code>, <code>normal</code>, <code>st</code>,
      * <code>tangent</code>, and <code>bitangent</code> vertex attributes.
      */
    @JSImport("cesium", "MaterialAppearance.MaterialSupport.ALL")
    @js.native
    val ALL: MaterialSupportType = js.native
    
    /**
      * Only basic materials, which require just <code>position</code> and
      * <code>normal</code> vertex attributes, are supported.
      */
    @JSImport("cesium", "MaterialAppearance.MaterialSupport.BASIC")
    @js.native
    val BASIC: MaterialSupportType = js.native
    
    /**
      * Materials with textures, which require <code>position</code>,
      * <code>normal</code>, and <code>st</code> vertex attributes,
      * are supported.  The vast majority of materials fall into this category.
      */
    @JSImport("cesium", "MaterialAppearance.MaterialSupport.TEXTURED")
    @js.native
    val TEXTURED: MaterialSupportType = js.native
  }
  
  trait MaterialSupportType extends StObject {
    
    var fragmentShaderSource: String
    
    var vertexFormat: VertexFormat
    
    var vertexShaderSource: String
  }
  object MaterialSupportType {
    
    inline def apply(fragmentShaderSource: String, vertexFormat: VertexFormat, vertexShaderSource: String): MaterialSupportType = {
      val __obj = js.Dynamic.literal(fragmentShaderSource = fragmentShaderSource.asInstanceOf[js.Any], vertexFormat = vertexFormat.asInstanceOf[js.Any], vertexShaderSource = vertexShaderSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaterialSupportType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaterialSupportType] (val x: Self) extends AnyVal {
      
      inline def setFragmentShaderSource(value: String): Self = StObject.set(x, "fragmentShaderSource", value.asInstanceOf[js.Any])
      
      inline def setVertexFormat(value: VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
      
      inline def setVertexShaderSource(value: String): Self = StObject.set(x, "vertexShaderSource", value.asInstanceOf[js.Any])
    }
  }
}
