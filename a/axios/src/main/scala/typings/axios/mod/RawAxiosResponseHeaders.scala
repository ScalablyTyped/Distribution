package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<axios.axios.RawAxiosHeaders & axios.axios.RawCommonResponseHeaders> */
trait RawAxiosResponseHeaders extends StObject {
  
  var `Cache-Control`: js.UndefOr[AxiosHeaderValue] = js.undefined
  
  var `Content-Encoding`: js.UndefOr[AxiosHeaderValue] = js.undefined
  
  var `Content-Length`: js.UndefOr[AxiosHeaderValue] = js.undefined
  
  var `Content-Type`: js.UndefOr[AxiosHeaderValue] = js.undefined
  
  var Server: js.UndefOr[AxiosHeaderValue] = js.undefined
  
  var `set-cookie`: js.UndefOr[js.Array[String]] = js.undefined
}
object RawAxiosResponseHeaders {
  
  inline def apply(): RawAxiosResponseHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawAxiosResponseHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawAxiosResponseHeaders] (val x: Self) extends AnyVal {
    
    inline def `setCache-Control`(value: AxiosHeaderValue): Self = StObject.set(x, "Cache-Control", value.asInstanceOf[js.Any])
    
    inline def `setCache-ControlNull`: Self = StObject.set(x, "Cache-Control", null)
    
    inline def `setCache-ControlUndefined`: Self = StObject.set(x, "Cache-Control", js.undefined)
    
    inline def `setCache-ControlVarargs`(value: String*): Self = StObject.set(x, "Cache-Control", js.Array(value*))
    
    inline def `setContent-Encoding`(value: AxiosHeaderValue): Self = StObject.set(x, "Content-Encoding", value.asInstanceOf[js.Any])
    
    inline def `setContent-EncodingNull`: Self = StObject.set(x, "Content-Encoding", null)
    
    inline def `setContent-EncodingUndefined`: Self = StObject.set(x, "Content-Encoding", js.undefined)
    
    inline def `setContent-EncodingVarargs`(value: String*): Self = StObject.set(x, "Content-Encoding", js.Array(value*))
    
    inline def `setContent-Length`(value: AxiosHeaderValue): Self = StObject.set(x, "Content-Length", value.asInstanceOf[js.Any])
    
    inline def `setContent-LengthNull`: Self = StObject.set(x, "Content-Length", null)
    
    inline def `setContent-LengthUndefined`: Self = StObject.set(x, "Content-Length", js.undefined)
    
    inline def `setContent-LengthVarargs`(value: String*): Self = StObject.set(x, "Content-Length", js.Array(value*))
    
    inline def `setContent-Type`(value: AxiosHeaderValue): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    
    inline def `setContent-TypeNull`: Self = StObject.set(x, "Content-Type", null)
    
    inline def `setContent-TypeUndefined`: Self = StObject.set(x, "Content-Type", js.undefined)
    
    inline def `setContent-TypeVarargs`(value: String*): Self = StObject.set(x, "Content-Type", js.Array(value*))
    
    inline def setServer(value: AxiosHeaderValue): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    inline def setServerNull: Self = StObject.set(x, "Server", null)
    
    inline def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
    
    inline def setServerVarargs(value: String*): Self = StObject.set(x, "Server", js.Array(value*))
    
    inline def `setSet-cookie`(value: js.Array[String]): Self = StObject.set(x, "set-cookie", value.asInstanceOf[js.Any])
    
    inline def `setSet-cookieUndefined`: Self = StObject.set(x, "set-cookie", js.undefined)
    
    inline def `setSet-cookieVarargs`(value: String*): Self = StObject.set(x, "set-cookie", js.Array(value*))
  }
}
