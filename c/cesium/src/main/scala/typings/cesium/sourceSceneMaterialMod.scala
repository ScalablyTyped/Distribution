package typings.cesium

import typings.cesium.anon.Fabric
import typings.cesium.mod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneMaterialMod {
  
  @JSImport("cesium/Source/Scene/Material", JSImport.Default)
  @js.native
  open class default () extends Material {
    def this(options: Fabric) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Scene/Material", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the name of the alpha map material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.AlphaMapType")
    @js.native
    val AlphaMapType: String = js.native
    
    /**
      * Gets the name of the aspect ramp material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.AspectRampMaterialType")
    @js.native
    val AspectRampMaterialType: String = js.native
    
    /**
      * Gets the name of the bump map material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.BumpMapType")
    @js.native
    val BumpMapType: String = js.native
    
    /**
      * Gets the name of the checkerboard material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.CheckerboardType")
    @js.native
    val CheckerboardType: String = js.native
    
    /**
      * Gets the name of the color material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.ColorType")
    @js.native
    val ColorType: String = js.native
    
    /**
      * Gets or sets the default cube map texture uniform value.
      */
    @JSImport("cesium/Source/Scene/Material", "default.DefaultCubeMapId")
    @js.native
    def DefaultCubeMapId: String = js.native
    inline def DefaultCubeMapId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultCubeMapId")(x.asInstanceOf[js.Any])
    
    /**
      * Gets or sets the default texture uniform value.
      */
    @JSImport("cesium/Source/Scene/Material", "default.DefaultImageId")
    @js.native
    def DefaultImageId: String = js.native
    inline def DefaultImageId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultImageId")(x.asInstanceOf[js.Any])
    
    /**
      * Gets the name of the diffuce map material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.DiffuseMapType")
    @js.native
    val DiffuseMapType: String = js.native
    
    /**
      * Gets the name of the dot material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.DotType")
    @js.native
    val DotType: String = js.native
    
    /**
      * Gets the name of the elevation band material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.ElevationBandType")
    @js.native
    val ElevationBandType: String = js.native
    
    /**
      * Gets the name of the elevation contour material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.ElevationContourType")
    @js.native
    val ElevationContourType: String = js.native
    
    /**
      * Gets the name of the elevation contour material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.ElevationRampType")
    @js.native
    val ElevationRampType: String = js.native
    
    /**
      * Gets the name of the emmision map material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.EmissionMapType")
    @js.native
    val EmissionMapType: String = js.native
    
    /**
      * Gets the name of the fade material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.FadeType")
    @js.native
    val FadeType: String = js.native
    
    /**
      * Gets the name of the grid material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.GridType")
    @js.native
    val GridType: String = js.native
    
    /**
      * Gets the name of the image material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.ImageType")
    @js.native
    val ImageType: String = js.native
    
    /**
      * Gets the name of the normal map material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.NormalMapType")
    @js.native
    val NormalMapType: String = js.native
    
    /**
      * Gets the name of the polyline arrow material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.PolylineArrowType")
    @js.native
    val PolylineArrowType: String = js.native
    
    /**
      * Gets the name of the polyline glow material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.PolylineDashType")
    @js.native
    val PolylineDashType: String = js.native
    
    /**
      * Gets the name of the polyline glow material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.PolylineGlowType")
    @js.native
    val PolylineGlowType: String = js.native
    
    /**
      * Gets the name of the polyline outline material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.PolylineOutlineType")
    @js.native
    val PolylineOutlineType: String = js.native
    
    /**
      * Gets the name of the rim lighting material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.RimLightingType")
    @js.native
    val RimLightingType: String = js.native
    
    /**
      * Gets the name of the slope ramp material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.SlopeRampMaterialType")
    @js.native
    val SlopeRampMaterialType: String = js.native
    
    /**
      * Gets the name of the specular map material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.SpecularMapType")
    @js.native
    val SpecularMapType: String = js.native
    
    /**
      * Gets the name of the stripe material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.StripeType")
    @js.native
    val StripeType: String = js.native
    
    /**
      * Gets the name of the water material.
      */
    @JSImport("cesium/Source/Scene/Material", "default.WaterType")
    @js.native
    val WaterType: String = js.native
    
    /**
      * Creates a new material using an existing material type.
      * <br /><br />
      * Shorthand for: new Material({fabric : {type : type}});
      * @example
      * const material = Cesium.Material.fromType('Color', {
      *     color : new Cesium.Color(1.0, 0.0, 0.0, 1.0)
      * });
      * @param type - The base material type.
      * @param [uniforms] - Overrides for the default uniforms.
      * @returns New material object.
      */
    inline def fromType(`type`: String): Material = ^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Material]
    inline def fromType(`type`: String, uniforms: Any): Material = (^.asInstanceOf[js.Dynamic].applyDynamic("fromType")(`type`.asInstanceOf[js.Any], uniforms.asInstanceOf[js.Any])).asInstanceOf[Material]
  }
}
