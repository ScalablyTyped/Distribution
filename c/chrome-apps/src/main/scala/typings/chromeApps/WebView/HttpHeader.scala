package typings.chromeApps.WebView

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An HTTP Header, represented as an object containing a key and either a value or a binaryValue. */
trait HttpHeader extends StObject {
  
  var binaryValue: js.UndefOr[ArrayBuffer] = js.undefined
  
  var name: String
  
  var value: js.UndefOr[String] = js.undefined
}
object HttpHeader {
  
  @scala.inline
  def apply(name: String): HttpHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpHeader]
  }
  
  @scala.inline
  implicit class HttpHeaderMutableBuilder[Self <: HttpHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryValue(value: ArrayBuffer): Self = StObject.set(x, "binaryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryValueUndefined: Self = StObject.set(x, "binaryValue", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
