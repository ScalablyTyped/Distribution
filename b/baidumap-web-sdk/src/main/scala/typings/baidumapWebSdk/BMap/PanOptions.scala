package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanOptions extends StObject {
  
  var noAnimation: js.UndefOr[Boolean] = js.undefined
}
object PanOptions {
  
  inline def apply(): PanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanOptions]
  }
  
  extension [Self <: PanOptions](x: Self) {
    
    inline def setNoAnimation(value: Boolean): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
    
    inline def setNoAnimationUndefined: Self = StObject.set(x, "noAnimation", js.undefined)
  }
}
