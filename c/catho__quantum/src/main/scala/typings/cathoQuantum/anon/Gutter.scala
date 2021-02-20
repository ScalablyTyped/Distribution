package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gutter extends StObject {
  
  var colors: js.UndefOr[js.Object] = js.native
  
  var gutter: js.UndefOr[Double] = js.native
}
object Gutter {
  
  @scala.inline
  def apply(): Gutter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gutter]
  }
  
  @scala.inline
  implicit class GutterMutableBuilder[Self <: Gutter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Object): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
  }
}
