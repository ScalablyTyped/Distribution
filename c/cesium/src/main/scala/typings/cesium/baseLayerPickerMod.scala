package typings.cesium

import typings.cesium.anon.Globe
import typings.cesium.mod.BaseLayerPicker
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseLayerPickerMod {
  
  @JSImport("cesium/Source/Widgets/BaseLayerPicker/BaseLayerPicker", JSImport.Default)
  @js.native
  open class default protected () extends BaseLayerPicker {
    def this(container: String, options: Globe) = this()
    def this(container: Element, options: Globe) = this()
  }
}
