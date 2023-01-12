package typings.blessed.mod.Widgets

import typings.blessed.mod.Widgets.Types.TAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextOptions
  extends StObject
     with ElementOptions {
  
  /**
    * Text alignment: left, center, or right.
    */
  @JSName("align")
  var align_TextOptions: js.UndefOr[TAlign] = js.undefined
  
  /**
    * Fill the entire line with chosen bg until parent bg ends, even if there
    * is not enough text to fill the entire width.
    */
  var fill: js.UndefOr[Boolean] = js.undefined
}
object TextOptions {
  
  inline def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextOptions] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: TAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
