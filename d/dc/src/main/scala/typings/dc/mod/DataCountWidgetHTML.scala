package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCountWidgetHTML extends StObject {
  
  var all: String = js.native
  
  var some: String = js.native
}
object DataCountWidgetHTML {
  
  @scala.inline
  def apply(all: String, some: String): DataCountWidgetHTML = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCountWidgetHTML]
  }
  
  @scala.inline
  implicit class DataCountWidgetHTMLMutableBuilder[Self <: DataCountWidgetHTML] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSome(value: String): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
  }
}
