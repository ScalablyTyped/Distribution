package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Zero extends StObject {
  
  var delimiter: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[js.Array[String]] = js.native
  
  var locale: js.UndefOr[typings.dateFns.Locale] = js.native
  
  var zero: js.UndefOr[Boolean] = js.native
}
object Zero {
  
  @scala.inline
  def apply(): Zero = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zero]
  }
  
  @scala.inline
  implicit class ZeroMutableBuilder[Self <: Zero] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setFormat(value: js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value :_*))
    
    @scala.inline
    def setLocale(value: typings.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setZero(value: Boolean): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
