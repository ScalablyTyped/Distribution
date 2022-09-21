package typings.azureCoreHttp.serializerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlParameterValue extends StObject {
  
  /**
    * Whether to keep or skip URL encoding.
    */
  var skipUrlEncoding: Boolean
  
  /**
    * The URL value.
    */
  var value: String
}
object UrlParameterValue {
  
  inline def apply(skipUrlEncoding: Boolean, value: String): UrlParameterValue = {
    val __obj = js.Dynamic.literal(skipUrlEncoding = skipUrlEncoding.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlParameterValue]
  }
  
  extension [Self <: UrlParameterValue](x: Self) {
    
    inline def setSkipUrlEncoding(value: Boolean): Self = StObject.set(x, "skipUrlEncoding", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
