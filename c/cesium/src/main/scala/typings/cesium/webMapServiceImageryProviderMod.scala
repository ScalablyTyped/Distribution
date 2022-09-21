package typings.cesium

import typings.cesium.mod.WebMapServiceImageryProvider
import typings.cesium.mod.WebMapServiceImageryProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webMapServiceImageryProviderMod {
  
  @JSImport("cesium/Source/Scene/WebMapServiceImageryProvider", JSImport.Default)
  @js.native
  open class default protected () extends WebMapServiceImageryProvider {
    def this(options: ConstructorOptions) = this()
  }
  /* static members */
  object default {
    
    /**
      * The default parameters to include in the WMS URL to obtain images.  The values are as follows:
      *    service=WMS
      *    version=1.1.1
      *    request=GetMap
      *    styles=
      *    format=image/jpeg
      */
    @JSImport("cesium/Source/Scene/WebMapServiceImageryProvider", "default.DefaultParameters")
    @js.native
    val DefaultParameters: Any = js.native
    
    /**
      * The default parameters to include in the WMS URL to get feature information.  The values are as follows:
      *     service=WMS
      *     version=1.1.1
      *     request=GetFeatureInfo
      */
    @JSImport("cesium/Source/Scene/WebMapServiceImageryProvider", "default.GetFeatureInfoDefaultParameters")
    @js.native
    val GetFeatureInfoDefaultParameters: Any = js.native
  }
}
