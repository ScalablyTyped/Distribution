package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gutter extends StObject {
  
  var colors: js.UndefOr[js.Object] = js.undefined
  
  var gutter: js.UndefOr[Double] = js.undefined
}
object Gutter {
  
  inline def apply(): Gutter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gutter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gutter] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.Object): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
    
    inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
  }
}
