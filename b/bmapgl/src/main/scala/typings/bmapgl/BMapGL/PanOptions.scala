package typings.bmapgl.BMapGL

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PanOptions] (val x: Self) extends AnyVal {
    
    inline def setNoAnimation(value: Boolean): Self = StObject.set(x, "noAnimation", value.asInstanceOf[js.Any])
    
    inline def setNoAnimationUndefined: Self = StObject.set(x, "noAnimation", js.undefined)
  }
}
