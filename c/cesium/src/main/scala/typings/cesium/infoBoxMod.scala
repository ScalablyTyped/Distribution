package typings.cesium

import typings.cesium.mod.InfoBox
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoBoxMod {
  
  @JSImport("cesium/Source/Widgets/InfoBox/InfoBox", JSImport.Default)
  @js.native
  open class default protected () extends InfoBox {
    def this(container: String) = this()
    def this(container: Element) = this()
  }
}
