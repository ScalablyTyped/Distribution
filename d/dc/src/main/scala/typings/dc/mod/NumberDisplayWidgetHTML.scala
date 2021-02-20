package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberDisplayWidgetHTML extends StObject {
  
  var none: String = js.native
  
  var one: String = js.native
  
  var some: String = js.native
}
object NumberDisplayWidgetHTML {
  
  @scala.inline
  def apply(none: String, one: String, some: String): NumberDisplayWidgetHTML = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], one = one.asInstanceOf[js.Any], some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberDisplayWidgetHTML]
  }
  
  @scala.inline
  implicit class NumberDisplayWidgetHTMLMutableBuilder[Self <: NumberDisplayWidgetHTML] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOne(value: String): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSome(value: String): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
  }
}
