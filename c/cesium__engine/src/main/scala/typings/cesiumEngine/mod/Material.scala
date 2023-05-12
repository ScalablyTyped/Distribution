package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.Fabric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Material")
@js.native
open class Material () extends StObject {
  def this(options: Fabric) = this()
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * material = material && material.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets whether or not this material is translucent.
    * @returns <code>true</code> if this material is translucent, <code>false</code> otherwise.
    */
  def isTranslucent(): Boolean = js.native
  
  /**
    * Maps sub-material names to Material objects.
    */
  var materials: Any = js.native
  
  /**
    * The glsl shader source for this material.
    */
  var shaderSource: String = js.native
  
  /**
    * When <code>true</code> or a function that returns <code>true</code>,
    * the geometry is expected to appear translucent.
    */
  var translucent: Boolean | (js.Function1[/* repeated */ Any, Any]) = js.native
  
  /**
    * The material type. Can be an existing type or a new type. If no type is specified in fabric, type is a GUID.
    */
  var `type`: String = js.native
  
  /**
    * Maps uniform names to their values.
    */
  var uniforms: Any = js.native
}
/* static members */
object Material {
  
  @JSImport("@cesium/engine", "Material")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the name of the alpha map material.
    */
  @JSImport("@cesium/engine", "Material.AlphaMapType")
  @js.native
  val AlphaMapType: String = js.native
  
  /**
    * Gets the name of the aspect ramp material.
    */
  @JSImport("@cesium/engine", "Material.AspectRampMaterialType")
  @js.native
  val AspectRampMaterialType: String = js.native
  
  /**
    * Gets the name of the bump map material.
    */
  @JSImport("@cesium/engine", "Material.BumpMapType")
  @js.native
  val BumpMapType: String = js.native
  
  /**
    * Gets the name of the checkerboard material.
    */
  @JSImport("@cesium/engine", "Material.CheckerboardType")
  @js.native
  val CheckerboardType: String = js.native
  
  /**
    * Gets the name of the color material.
    */
  @JSImport("@cesium/engine", "Material.ColorType")
  @js.native
  val ColorType: String = js.native
  
  /**
    * Gets or sets the default cube map texture uniform value.
    */
  @JSImport("@cesium/engine", "Material.DefaultCubeMapId")
  @js.native
  def DefaultCubeMapId: String = js.native
  inline def DefaultCubeMapId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultCubeMapId")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets the default texture uniform value.
    */
  @JSImport("@cesium/engine", "Material.DefaultImageId")
  @js.native
  def DefaultImageId: String = js.native
  inline def DefaultImageId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultImageId")(x.asInstanceOf[js.Any])
  
  /**
    * Gets the name of the diffuce map material.
    */
  @JSImport("@cesium/engine", "Material.DiffuseMapType")
  @js.native
  val DiffuseMapType: String = js.native
  
  /**
    * Gets the name of the dot material.
    */
  @JSImport("@cesium/engine", "Material.DotType")
  @js.native
  val DotType: String = js.native
  
  /**
    * Gets the name of the elevation band material.
    */
  @JSImport("@cesium/engine", "Material.ElevationBandType")
  @js.native
  val ElevationBandType: String = js.native
  
  /**
    * Gets the name of the elevation contour material.
    */
  @JSImport("@cesium/engine", "Material.ElevationContourType")
  @js.native
  val ElevationContourType: String = js.native
  
  /**
    * Gets the name of the elevation contour material.
    */
  @JSImport("@cesium/engine", "Material.ElevationRampType")
  @js.native
  val ElevationRampType: String = js.native
  
  /**
    * Gets the name of the emmision map material.
    */
  @JSImport("@cesium/engine", "Material.EmissionMapType")
  @js.native
  val EmissionMapType: String = js.native
  
  /**
    * Gets the name of the fade material.
    */
  @JSImport("@cesium/engine", "Material.FadeType")
  @js.native
  val FadeType: String = js.native
  
  /**
    * Gets the name of the grid material.
    */
  @JSImport("@cesium/engine", "Material.GridType")
  @js.native
  val GridType: String = js.native
  
  /**
    * Gets the name of the image material.
    */
  @JSImport("@cesium/engine", "Material.ImageType")
  @js.native
  val ImageType: String = js.native
  
  /**
    * Gets the name of the normal map material.
    */
  @JSImport("@cesium/engine", "Material.NormalMapType")
  @js.native
  val NormalMapType: String = js.native
  
  /**
    * Gets the name of the polyline arrow material.
    */
  @JSImport("@cesium/engine", "Material.PolylineArrowType")
  @js.native
  val PolylineArrowType: String = js.native
  
  /**
    * Gets the name of the polyline glow material.
    */
  @JSImport("@cesium/engine", "Material.PolylineDashType")
  @js.native
  val PolylineDashType: String = js.native
  
  /**
    * Gets the name of the polyline glow material.
    */
  @JSImport("@cesium/engine", "Material.PolylineGlowType")
  @js.native
  val PolylineGlowType: String = js.native
  
  /**
    * Gets the name of the polyline outline material.
    */
  @JSImport("@cesium/engine", "Material.PolylineOutlineType")
  @js.native
  val PolylineOutlineType: String = js.native
  
  /**
    * Gets the name of the rim lighting material.
    */
  @JSImport("@cesium/engine", "Material.RimLightingType")
  @js.native
  val RimLightingType: String = js.native
  
  /**
    * Gets the name of the slope ramp material.
    */
  @JSImport("@cesium/engine", "Material.SlopeRampMaterialType")
  @js.native
  val SlopeRampMaterialType: String = js.native
  
  /**
    * Gets the name of the specular map material.
    */
  @JSImport("@cesium/engine", "Material.SpecularMapType")
  @js.native
  val SpecularMapType: String = js.native
  
  /**
    * Gets the name of the stripe material.
    */
  @JSImport("@cesium/engine", "Material.StripeType")
  @js.native
  val StripeType: String = js.native
  
  /**
    * Gets the name of the water material.
    */
  @JSImport("@cesium/engine", "Material.WaterType")
  @js.native
  val WaterType: String = js.native
  
  /**
    * Creates a new material using an existing material type.
    * <br /><br />
    * Shorthand for: new Material({fabric : {type : type}});
    * @example
    * const material = Cesium.Material.fromType('Color', {
    *   color: new Cesium.Color(1.0, 0.0, 0.0, 1.0)
    * });
    * @param type - The base material type.
    * @param [uniforms] - Overrides for the default uniforms.
    * @returns New material object.
    */
  inline def fromType(`type`: String): Material = ^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Material]
  inline def fromType(`type`: String, uniforms: Any): Material = (^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(`type`.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[Material]
}
