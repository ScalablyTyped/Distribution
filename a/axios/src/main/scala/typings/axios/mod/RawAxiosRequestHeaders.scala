package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<axios.axios.RawAxiosHeaders & {[ Key in axios.axios.CommonRequestHeadersList ]: axios.axios.AxiosHeaderValue} & {  Content-Type :axios.axios.ContentType}> */
trait RawAxiosRequestHeaders extends StObject {
  
  var Accept: js.UndefOr[AxiosHeaderValue] = js.undefined
  
  var Authorization: js.UndefOr[AxiosHeaderValue] = js.undefined
  
  var `Content-Encoding`: js.UndefOr[AxiosHeaderValue] = js.undefined
  
  var `Content-Length`: js.UndefOr[AxiosHeaderValue] = js.undefined
  
  var `Content-Type`: js.UndefOr[ContentType] = js.undefined
  
  var `User-Agent`: js.UndefOr[AxiosHeaderValue] = js.undefined
}
object RawAxiosRequestHeaders {
  
  inline def apply(): RawAxiosRequestHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawAxiosRequestHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawAxiosRequestHeaders] (val x: Self) extends AnyVal {
    
    inline def setAccept(value: AxiosHeaderValue): Self = StObject.set(x, "Accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptNull: Self = StObject.set(x, "Accept", null)
    
    inline def setAcceptUndefined: Self = StObject.set(x, "Accept", js.undefined)
    
    inline def setAcceptVarargs(value: String*): Self = StObject.set(x, "Accept", js.Array(value*))
    
    inline def setAuthorization(value: AxiosHeaderValue): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationNull: Self = StObject.set(x, "Authorization", null)
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
    
    inline def setAuthorizationVarargs(value: String*): Self = StObject.set(x, "Authorization", js.Array(value*))
    
    inline def `setContent-Encoding`(value: AxiosHeaderValue): Self = StObject.set(x, "Content-Encoding", value.asInstanceOf[js.Any])
    
    inline def `setContent-EncodingNull`: Self = StObject.set(x, "Content-Encoding", null)
    
    inline def `setContent-EncodingUndefined`: Self = StObject.set(x, "Content-Encoding", js.undefined)
    
    inline def `setContent-EncodingVarargs`(value: String*): Self = StObject.set(x, "Content-Encoding", js.Array(value*))
    
    inline def `setContent-Length`(value: AxiosHeaderValue): Self = StObject.set(x, "Content-Length", value.asInstanceOf[js.Any])
    
    inline def `setContent-LengthNull`: Self = StObject.set(x, "Content-Length", null)
    
    inline def `setContent-LengthUndefined`: Self = StObject.set(x, "Content-Length", js.undefined)
    
    inline def `setContent-LengthVarargs`(value: String*): Self = StObject.set(x, "Content-Length", js.Array(value*))
    
    inline def `setContent-Type`(value: ContentType): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    
    inline def `setContent-TypeNull`: Self = StObject.set(x, "Content-Type", null)
    
    inline def `setContent-TypeUndefined`: Self = StObject.set(x, "Content-Type", js.undefined)
    
    inline def `setContent-TypeVarargs`(value: String*): Self = StObject.set(x, "Content-Type", js.Array(value*))
    
    inline def `setUser-Agent`(value: AxiosHeaderValue): Self = StObject.set(x, "User-Agent", value.asInstanceOf[js.Any])
    
    inline def `setUser-AgentNull`: Self = StObject.set(x, "User-Agent", null)
    
    inline def `setUser-AgentUndefined`: Self = StObject.set(x, "User-Agent", js.undefined)
    
    inline def `setUser-AgentVarargs`(value: String*): Self = StObject.set(x, "User-Agent", js.Array(value*))
  }
}
