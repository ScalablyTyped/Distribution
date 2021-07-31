package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  def format(datum: js.Any): String
  def format(datum: js.Any, index: Double): String
  @JSName("format")
  var format_Original: Accessor[js.Any, String]
  
  var label: String
}
object Columns {
  
  @scala.inline
  def apply(format: (js.Any, /* index */ js.UndefOr[Double]) => String, label: String): Columns = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: (js.Any, /* index */ js.UndefOr[Double]) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
