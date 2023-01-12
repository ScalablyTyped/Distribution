package typings.braftEditor.anon

import typings.braftEditor.mod.ImageControlType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick
  extends StObject
     with ImageControlType {
  
  var onClick: js.UndefOr[js.Function1[/* block */ Any, Unit]] = js.undefined
  
  var render: js.UndefOr[js.Function1[/* mediaData */ Any, Unit]] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object OnClick {
  
  inline def apply(): OnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnClick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnClick] (val x: Self) extends AnyVal {
    
    inline def setOnClick(value: /* block */ Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setRender(value: /* mediaData */ Any => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
