package typings.cesium.global.Cesium

import typings.cesium.anon.Crs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.WebMapServiceImageryProvider")
@js.native
class WebMapServiceImageryProvider protected ()
  extends typings.cesium.mod.WebMapServiceImageryProvider {
  def this(options: Crs) = this()
}
object WebMapServiceImageryProvider {
  
  /* static member */
  object DefaultParameters {
    
    @JSGlobal("Cesium.WebMapServiceImageryProvider.DefaultParameters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Cesium.WebMapServiceImageryProvider.DefaultParameters.format")
    @js.native
    def format: String = js.native
    inline def format_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Cesium.WebMapServiceImageryProvider.DefaultParameters.request")
    @js.native
    def request: String = js.native
    inline def request_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Cesium.WebMapServiceImageryProvider.DefaultParameters.service")
    @js.native
    def service: String = js.native
    inline def service_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("service")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Cesium.WebMapServiceImageryProvider.DefaultParameters.styles")
    @js.native
    def styles: String = js.native
    inline def styles_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styles")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Cesium.WebMapServiceImageryProvider.DefaultParameters.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object GetFeatureInfoDefaultParameters {
    
    @JSGlobal("Cesium.WebMapServiceImageryProvider.GetFeatureInfoDefaultParameters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Cesium.WebMapServiceImageryProvider.GetFeatureInfoDefaultParameters.request")
    @js.native
    def request: String = js.native
    inline def request_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Cesium.WebMapServiceImageryProvider.GetFeatureInfoDefaultParameters.service")
    @js.native
    def service: String = js.native
    inline def service_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("service")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Cesium.WebMapServiceImageryProvider.GetFeatureInfoDefaultParameters.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
