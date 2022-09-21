package typings.cesium

import typings.cesium.mod.GetFeatureInfoFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFeatureInfoFormatMod {
  
  @JSImport("cesium/Source/Scene/GetFeatureInfoFormat", JSImport.Default)
  @js.native
  open class default protected () extends GetFeatureInfoFormat {
    def this(`type`: String) = this()
    def this(`type`: String, format: String) = this()
    def this(`type`: String, format: String, callback: js.Function1[/* repeated */ Any, Any]) = this()
    def this(`type`: String, format: Unit, callback: js.Function1[/* repeated */ Any, Any]) = this()
  }
}
