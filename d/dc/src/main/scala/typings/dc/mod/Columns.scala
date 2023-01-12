package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  def format(datum: Any): String
  def format(datum: Any, index: Double): String
  @JSName("format")
  var format_Original: Accessor[Any, String]
  
  var label: String
}
object Columns {
  
  inline def apply(format: (Any, /* index */ js.UndefOr[Double]) => String, label: String): Columns = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: (Any, /* index */ js.UndefOr[Double]) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
