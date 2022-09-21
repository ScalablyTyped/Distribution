package typings.blackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilingInfoMod {
  
  @JSImport("black-engine/display/TilingInfo", "TilingInfo")
  @js.native
  open class TilingInfo protected () extends StObject {
    def this(
      width: js.UndefOr[Double],
      height: js.UndefOr[Double],
      scaleX: js.UndefOr[Double],
      scaleY: js.UndefOr[Double],
      wrapX: js.UndefOr[Double],
      wrapY: js.UndefOr[Double]
    ) = this()
    
    var height: Double = js.native
    
    var scaleX: Double = js.native
    
    var scaleY: Double = js.native
    
    var width: Double = js.native
    
    var wrapX: Double = js.native
    
    var wrapY: Double = js.native
  }
}
