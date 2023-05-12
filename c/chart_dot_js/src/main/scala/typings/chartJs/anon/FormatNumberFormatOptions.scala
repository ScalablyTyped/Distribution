package typings.chartJs.anon

import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatNumberFormatOptions extends StObject {
  
  /**
    * The Intl.NumberFormat options used by the default label formatter
    */
  var format: NumberFormatOptions
}
object FormatNumberFormatOptions {
  
  inline def apply(format: NumberFormatOptions): FormatNumberFormatOptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatNumberFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatNumberFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: NumberFormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
