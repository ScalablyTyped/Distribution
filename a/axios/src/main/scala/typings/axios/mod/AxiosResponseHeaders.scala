package typings.axios.mod

import org.scalablytyped.runtime.StringDictionary
import typings.axios.axiosBooleans.`true`
import typings.std.IterableIterator
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined axios.axios.RawAxiosResponseHeaders & axios.axios.AxiosHeaders */
@js.native
trait AxiosResponseHeaders
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var `Cache-Control`: js.UndefOr[AxiosHeaderValue] = js.native
  
  var `Content-Encoding`: js.UndefOr[AxiosHeaderValue] = js.native
  
  var `Content-Length`: js.UndefOr[AxiosHeaderValue] = js.native
  
  var `Content-Type`: js.UndefOr[AxiosHeaderValue] = js.native
  
  var Server: js.UndefOr[AxiosHeaderValue] = js.native
  
  def clear(): Boolean = js.native
  def clear(matcher: AxiosHeaderMatcher): Boolean = js.native
  
  def concat(targets: (js.UndefOr[AxiosHeaders | RawAxiosHeaders | String | Null])*): AxiosHeaders = js.native
  
  def delete(header: String): Boolean = js.native
  def delete(header: String, matcher: AxiosHeaderMatcher): Boolean = js.native
  def delete(header: js.Array[String]): Boolean = js.native
  def delete(header: js.Array[String], matcher: AxiosHeaderMatcher): Boolean = js.native
  
  def get(headerName: String): AxiosHeaderValue = js.native
  def get(headerName: String, matcher: AxiosHeaderMatcher): AxiosHeaderValue = js.native
  def get(headerName: String, parser: js.RegExp): RegExpExecArray | Null = js.native
  
  def getAccept(): RegExpExecArray | Null = js.native
  def getAccept(matcher: AxiosHeaderMatcher): AxiosHeaderValue = js.native
  def getAccept(parser: js.RegExp): RegExpExecArray | Null = js.native
  @JSName("getAccept")
  def getAccept_AxiosHeaderValue(): AxiosHeaderValue = js.native
  
  def getAuthorization(): RegExpExecArray | Null = js.native
  def getAuthorization(matcher: AxiosHeaderMatcher): AxiosHeaderValue = js.native
  def getAuthorization(parser: js.RegExp): RegExpExecArray | Null = js.native
  @JSName("getAuthorization")
  def getAuthorization_AxiosHeaderValue(): AxiosHeaderValue = js.native
  
  def getContentEncoding(): RegExpExecArray | Null = js.native
  def getContentEncoding(matcher: AxiosHeaderMatcher): AxiosHeaderValue = js.native
  def getContentEncoding(parser: js.RegExp): RegExpExecArray | Null = js.native
  @JSName("getContentEncoding")
  def getContentEncoding_AxiosHeaderValue(): AxiosHeaderValue = js.native
  
  def getContentLength(): RegExpExecArray | Null = js.native
  def getContentLength(matcher: AxiosHeaderMatcher): AxiosHeaderValue = js.native
  def getContentLength(parser: js.RegExp): RegExpExecArray | Null = js.native
  @JSName("getContentLength")
  def getContentLength_AxiosHeaderValue(): AxiosHeaderValue = js.native
  
  def getContentType(): RegExpExecArray | Null = js.native
  def getContentType(matcher: AxiosHeaderMatcher): AxiosHeaderValue = js.native
  def getContentType(parser: js.RegExp): RegExpExecArray | Null = js.native
  @JSName("getContentType")
  def getContentType_AxiosHeaderValue(): AxiosHeaderValue = js.native
  
  def getUserAgent(): RegExpExecArray | Null = js.native
  def getUserAgent(matcher: AxiosHeaderMatcher): AxiosHeaderValue = js.native
  def getUserAgent(parser: js.RegExp): RegExpExecArray | Null = js.native
  @JSName("getUserAgent")
  def getUserAgent_AxiosHeaderValue(): AxiosHeaderValue = js.native
  
  @JSName("get")
  def get_true(headerName: String, matcher: `true`): AxiosHeaderValue = js.native
  
  def has(header: String): Boolean = js.native
  def has(header: String, matcher: AxiosHeaderMatcher): Boolean = js.native
  
  def hasAccept(): Boolean = js.native
  def hasAccept(matcher: AxiosHeaderMatcher): Boolean = js.native
  
  def hasAuthorization(): Boolean = js.native
  def hasAuthorization(matcher: AxiosHeaderMatcher): Boolean = js.native
  
  def hasContentEncoding(): Boolean = js.native
  def hasContentEncoding(matcher: AxiosHeaderMatcher): Boolean = js.native
  
  def hasContentLength(): Boolean = js.native
  def hasContentLength(matcher: AxiosHeaderMatcher): Boolean = js.native
  
  def hasContentType(): Boolean = js.native
  def hasContentType(matcher: AxiosHeaderMatcher): Boolean = js.native
  
  def hasUserAgent(): Boolean = js.native
  def hasUserAgent(matcher: AxiosHeaderMatcher): Boolean = js.native
  
  @JSName("has")
  def has_true(header: String, matcher: `true`): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[String, AxiosHeaderValue]]] = js.native
  
  def normalize(format: Boolean): AxiosHeaders = js.native
  
  def set(): AxiosHeaders = js.native
  def set(headerName: String): AxiosHeaders = js.native
  def set(headerName: String, value: Unit, rewrite: Boolean): AxiosHeaders = js.native
  def set(headerName: String, value: Unit, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  def set(headerName: String, value: AxiosHeaderValue): AxiosHeaders = js.native
  def set(headerName: String, value: AxiosHeaderValue, rewrite: Boolean): AxiosHeaders = js.native
  def set(headerName: String, value: AxiosHeaderValue, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  def set(headerName: Unit, value: Unit, rewrite: Boolean): AxiosHeaders = js.native
  def set(headerName: Unit, value: Unit, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  def set(headerName: Unit, value: AxiosHeaderValue): AxiosHeaders = js.native
  def set(headerName: Unit, value: AxiosHeaderValue, rewrite: Boolean): AxiosHeaders = js.native
  def set(headerName: Unit, value: AxiosHeaderValue, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  def set(headers: Unit, rewrite: Boolean): AxiosHeaders = js.native
  def set(headers: AxiosHeaders): AxiosHeaders = js.native
  def set(headers: AxiosHeaders, rewrite: Boolean): AxiosHeaders = js.native
  def set(headers: RawAxiosHeaders): AxiosHeaders = js.native
  def set(headers: RawAxiosHeaders, rewrite: Boolean): AxiosHeaders = js.native
  
  var `set-cookie`: js.UndefOr[js.Array[String]] = js.native
  
  def setAccept(value: AxiosHeaderValue): AxiosHeaders = js.native
  def setAccept(value: AxiosHeaderValue, rewrite: Boolean): AxiosHeaders = js.native
  def setAccept(value: AxiosHeaderValue, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  
  def setAuthorization(value: AxiosHeaderValue): AxiosHeaders = js.native
  def setAuthorization(value: AxiosHeaderValue, rewrite: Boolean): AxiosHeaders = js.native
  def setAuthorization(value: AxiosHeaderValue, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  
  def setContentEncoding(value: AxiosHeaderValue): AxiosHeaders = js.native
  def setContentEncoding(value: AxiosHeaderValue, rewrite: Boolean): AxiosHeaders = js.native
  def setContentEncoding(value: AxiosHeaderValue, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  
  def setContentLength(value: AxiosHeaderValue): AxiosHeaders = js.native
  def setContentLength(value: AxiosHeaderValue, rewrite: Boolean): AxiosHeaders = js.native
  def setContentLength(value: AxiosHeaderValue, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  
  def setContentType(value: ContentType): AxiosHeaders = js.native
  def setContentType(value: ContentType, rewrite: Boolean): AxiosHeaders = js.native
  def setContentType(value: ContentType, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  
  def setUserAgent(value: AxiosHeaderValue): AxiosHeaders = js.native
  def setUserAgent(value: AxiosHeaderValue, rewrite: Boolean): AxiosHeaders = js.native
  def setUserAgent(value: AxiosHeaderValue, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  
  def toJSON(): RawAxiosHeaders = js.native
  def toJSON(asStrings: Boolean): RawAxiosHeaders = js.native
}
