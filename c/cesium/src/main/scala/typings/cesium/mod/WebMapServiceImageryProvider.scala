package typings.cesium.mod

import typings.cesium.anon.Crs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "WebMapServiceImageryProvider")
@js.native
class WebMapServiceImageryProvider protected () extends ImageryProvider {
  def this(options: Crs) = this()
  
  val url: String = js.native
}
object WebMapServiceImageryProvider {
  
  /* static member */
  object DefaultParameters {
    
    @JSImport("cesium", "WebMapServiceImageryProvider.DefaultParameters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cesium", "WebMapServiceImageryProvider.DefaultParameters.format")
    @js.native
    def format: String = js.native
    @scala.inline
    def format_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("cesium", "WebMapServiceImageryProvider.DefaultParameters.request")
    @js.native
    def request: String = js.native
    @scala.inline
    def request_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
    
    @JSImport("cesium", "WebMapServiceImageryProvider.DefaultParameters.service")
    @js.native
    def service: String = js.native
    @scala.inline
    def service_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("service")(x.asInstanceOf[js.Any])
    
    @JSImport("cesium", "WebMapServiceImageryProvider.DefaultParameters.styles")
    @js.native
    def styles: String = js.native
    @scala.inline
    def styles_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styles")(x.asInstanceOf[js.Any])
    
    @JSImport("cesium", "WebMapServiceImageryProvider.DefaultParameters.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object GetFeatureInfoDefaultParameters {
    
    @JSImport("cesium", "WebMapServiceImageryProvider.GetFeatureInfoDefaultParameters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cesium", "WebMapServiceImageryProvider.GetFeatureInfoDefaultParameters.request")
    @js.native
    def request: String = js.native
    @scala.inline
    def request_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
    
    @JSImport("cesium", "WebMapServiceImageryProvider.GetFeatureInfoDefaultParameters.service")
    @js.native
    def service: String = js.native
    @scala.inline
    def service_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("service")(x.asInstanceOf[js.Any])
    
    @JSImport("cesium", "WebMapServiceImageryProvider.GetFeatureInfoDefaultParameters.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
