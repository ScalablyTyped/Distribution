package typings.c3.anon

import typings.c3.mod.FormatFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  def format(v: Double, id: String, i: Double, j: Double): String
  def format(v: ValueOf, id: String, i: Double, j: Double): String
  @JSName("format")
  var format_Original: FormatFunction
}
object Format {
  
  inline def apply(format: (/* v */ Double | ValueOf, /* id */ String, /* i */ Double, /* j */ Double) => String): Format = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction4(format))
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: (/* v */ Double | ValueOf, /* id */ String, /* i */ Double, /* j */ Double) => String): Self = StObject.set(x, "format", js.Any.fromFunction4(value))
  }
}
