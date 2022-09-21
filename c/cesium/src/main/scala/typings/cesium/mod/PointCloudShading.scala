package typings.cesium.mod

import typings.cesium.anon.Attenuation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PointCloudShading")
@js.native
open class PointCloudShading () extends StObject {
  def this(options: Attenuation) = this()
  
  /**
    * Perform point attenuation based on geometric error.
    */
  var attenuation: Boolean = js.native
  
  /**
    * Determines whether back-facing points are hidden.
    * This option works only if data has normals included.
    */
  var backFaceCulling: Boolean = js.native
  
  /**
    * Average base resolution for the dataset in meters.
    * Used in place of geometric error when geometric error is 0.
    * If undefined, an approximation will be computed for each tile that has geometric error of 0.
    */
  var baseResolution: Double = js.native
  
  /**
    * Use eye dome lighting when drawing with point attenuation
    * Requires support for EXT_frag_depth, OES_texture_float, and WEBGL_draw_buffers extensions in WebGL 1.0,
    * otherwise eye dome lighting is ignored.
    */
  var eyeDomeLighting: Boolean = js.native
  
  /**
    * Thickness of contours from eye dome lighting
    */
  var eyeDomeLightingRadius: Double = js.native
  
  /**
    * Eye dome lighting strength (apparent contrast)
    */
  var eyeDomeLightingStrength: Double = js.native
  
  /**
    * Scale to be applied to the geometric error before computing attenuation.
    */
  var geometricErrorScale: Double = js.native
  
  /**
    * Maximum point attenuation in pixels. If undefined, the Cesium3DTileset's maximumScreenSpaceError will be used.
    */
  var maximumAttenuation: Double = js.native
  
  /**
    * Determines whether a point cloud that contains normals is shaded by the scene's light source.
    */
  var normalShading: Boolean = js.native
}
/* static members */
object PointCloudShading {
  
  @JSImport("cesium", "PointCloudShading")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Determines if point cloud shading is supported.
    * @param scene - The scene.
    * @returns <code>true</code> if point cloud shading is supported; otherwise, returns <code>false</code>
    */
  inline def isSupported(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
