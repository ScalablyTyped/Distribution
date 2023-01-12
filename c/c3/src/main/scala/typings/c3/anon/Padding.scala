package typings.c3.anon

import typings.c3.c3Strings.center
import typings.c3.c3Strings.left
import typings.c3.c3Strings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Padding extends StObject {
  
  /**
    * Spacing around the title.
    */
  var padding: js.UndefOr[typings.c3.mod.Padding] = js.undefined
  
  /**
    * Chart title text.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Position the title relative to the chart.
    */
  var title_position: js.UndefOr[right | center | left] = js.undefined
}
object Padding {
  
  inline def apply(): Padding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Padding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Padding] (val x: Self) extends AnyVal {
    
    inline def setPadding(value: typings.c3.mod.Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle_position(value: right | center | left): Self = StObject.set(x, "title_position", value.asInstanceOf[js.Any])
    
    inline def setTitle_positionUndefined: Self = StObject.set(x, "title_position", js.undefined)
  }
}
