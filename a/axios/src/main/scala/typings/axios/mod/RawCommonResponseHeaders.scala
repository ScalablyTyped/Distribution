package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ Key in axios.axios.CommonResponseHeadersList ]: axios.axios.AxiosHeaderValue} & {  set-cookie :std.Array<string>} */
trait RawCommonResponseHeaders extends StObject {
  
  var `Cache-Control`: AxiosHeaderValue
  
  var `Content-Encoding`: AxiosHeaderValue
  
  var `Content-Length`: AxiosHeaderValue
  
  var `Content-Type`: AxiosHeaderValue
  
  var Server: AxiosHeaderValue
  
  var `set-cookie`: js.Array[String]
}
object RawCommonResponseHeaders {
  
  inline def apply(`set-cookie`: js.Array[String]): RawCommonResponseHeaders = {
    val __obj = js.Dynamic.literal(Server = null)
    __obj.updateDynamic("set-cookie")(`set-cookie`.asInstanceOf[js.Any])
    __obj.updateDynamic("Cache-Control")(null)
    __obj.updateDynamic("Content-Encoding")(null)
    __obj.updateDynamic("Content-Length")(null)
    __obj.updateDynamic("Content-Type")(null)
    __obj.asInstanceOf[RawCommonResponseHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawCommonResponseHeaders] (val x: Self) extends AnyVal {
    
    inline def `setCache-Control`(value: AxiosHeaderValue): Self = StObject.set(x, "Cache-Control", value.asInstanceOf[js.Any])
    
    inline def `setCache-ControlNull`: Self = StObject.set(x, "Cache-Control", null)
    
    inline def `setCache-ControlVarargs`(value: String*): Self = StObject.set(x, "Cache-Control", js.Array(value*))
    
    inline def `setContent-Encoding`(value: AxiosHeaderValue): Self = StObject.set(x, "Content-Encoding", value.asInstanceOf[js.Any])
    
    inline def `setContent-EncodingNull`: Self = StObject.set(x, "Content-Encoding", null)
    
    inline def `setContent-EncodingVarargs`(value: String*): Self = StObject.set(x, "Content-Encoding", js.Array(value*))
    
    inline def `setContent-Length`(value: AxiosHeaderValue): Self = StObject.set(x, "Content-Length", value.asInstanceOf[js.Any])
    
    inline def `setContent-LengthNull`: Self = StObject.set(x, "Content-Length", null)
    
    inline def `setContent-LengthVarargs`(value: String*): Self = StObject.set(x, "Content-Length", js.Array(value*))
    
    inline def `setContent-Type`(value: AxiosHeaderValue): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    
    inline def `setContent-TypeNull`: Self = StObject.set(x, "Content-Type", null)
    
    inline def `setContent-TypeVarargs`(value: String*): Self = StObject.set(x, "Content-Type", js.Array(value*))
    
    inline def setServer(value: AxiosHeaderValue): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    inline def setServerNull: Self = StObject.set(x, "Server", null)
    
    inline def setServerVarargs(value: String*): Self = StObject.set(x, "Server", js.Array(value*))
    
    inline def `setSet-cookie`(value: js.Array[String]): Self = StObject.set(x, "set-cookie", value.asInstanceOf[js.Any])
    
    inline def `setSet-cookieVarargs`(value: String*): Self = StObject.set(x, "set-cookie", js.Array(value*))
  }
}
