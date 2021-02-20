package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFontFeatures extends StObject {
  
  var name: String = js.native
  
  var value: Double = js.native
}
object TextFontFeatures {
  
  @scala.inline
  def apply(name: String, value: Double): TextFontFeatures = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFontFeatures]
  }
  
  @scala.inline
  implicit class TextFontFeaturesMutableBuilder[Self <: TextFontFeatures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
