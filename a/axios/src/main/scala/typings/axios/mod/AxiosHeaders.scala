package typings.axios.mod

import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("axios", "AxiosHeaders")
@js.native
open class AxiosHeaders () extends StObject {
  def this(headers: AxiosHeaders) = this()
  def this(headers: RawAxiosHeaders) = this()
  def this(headers: Unit, defaultHeaders: AxiosHeaders) = this()
  def this(headers: Unit, defaultHeaders: RawAxiosHeaders) = this()
  def this(headers: AxiosHeaders, defaultHeaders: AxiosHeaders) = this()
  def this(headers: AxiosHeaders, defaultHeaders: RawAxiosHeaders) = this()
  def this(headers: RawAxiosHeaders, defaultHeaders: AxiosHeaders) = this()
  def this(headers: RawAxiosHeaders, defaultHeaders: RawAxiosHeaders) = this()
  
  def clear(): Boolean = js.native
  
  def delete(header: String): Boolean = js.native
  def delete(header: String, matcher: AxiosHeaderMatcher): Boolean = js.native
  def delete(header: js.Array[String]): Boolean = js.native
  def delete(header: js.Array[String], matcher: AxiosHeaderMatcher): Boolean = js.native
  
  def get(headerName: String): AxiosHeaderValue = js.native
  @JSName("get")
  @scala.annotation.targetName("get_true")
  def get(headerName: String, matcher: true): AxiosHeaderValue = js.native
  def get(headerName: String, matcher: AxiosHeaderMatcher): AxiosHeaderValue = js.native
  def get(headerName: String, parser: js.RegExp): RegExpExecArray | Null = js.native
  
  var getAccept: AxiosHeaderGetter = js.native
  
  var getContentEncoding: AxiosHeaderGetter = js.native
  
  var getContentLength: AxiosHeaderGetter = js.native
  
  var getContentType: AxiosHeaderGetter = js.native
  
  var getUserAgent: AxiosHeaderGetter = js.native
  
  def has(header: String): Boolean = js.native
  @JSName("has")
  @scala.annotation.targetName("has_true")
  def has(header: String, matcher: true): Boolean = js.native
  def has(header: String, matcher: AxiosHeaderMatcher): Boolean = js.native
  
  def hasAccept(): Boolean = js.native
  def hasAccept(matcher: AxiosHeaderMatcher): Boolean = js.native
  @JSName("hasAccept")
  var hasAccept_Original: AxiosHeaderTester = js.native
  
  def hasContentEncoding(): Boolean = js.native
  def hasContentEncoding(matcher: AxiosHeaderMatcher): Boolean = js.native
  @JSName("hasContentEncoding")
  var hasContentEncoding_Original: AxiosHeaderTester = js.native
  
  def hasContentLength(): Boolean = js.native
  def hasContentLength(matcher: AxiosHeaderMatcher): Boolean = js.native
  @JSName("hasContentLength")
  var hasContentLength_Original: AxiosHeaderTester = js.native
  
  def hasContentType(): Boolean = js.native
  def hasContentType(matcher: AxiosHeaderMatcher): Boolean = js.native
  @JSName("hasContentType")
  var hasContentType_Original: AxiosHeaderTester = js.native
  
  def hasUserAgent(): Boolean = js.native
  def hasUserAgent(matcher: AxiosHeaderMatcher): Boolean = js.native
  @JSName("hasUserAgent")
  var hasUserAgent_Original: AxiosHeaderTester = js.native
  
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
  
  def setAccept(value: AxiosHeaderValue): AxiosHeaders = js.native
  def setAccept(value: AxiosHeaderValue, rewrite: Boolean): AxiosHeaders = js.native
  def setAccept(value: AxiosHeaderValue, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  @JSName("setAccept")
  var setAccept_Original: AxiosHeaderSetter = js.native
  
  def setContentEncoding(value: AxiosHeaderValue): AxiosHeaders = js.native
  def setContentEncoding(value: AxiosHeaderValue, rewrite: Boolean): AxiosHeaders = js.native
  def setContentEncoding(value: AxiosHeaderValue, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  @JSName("setContentEncoding")
  var setContentEncoding_Original: AxiosHeaderSetter = js.native
  
  def setContentLength(value: AxiosHeaderValue): AxiosHeaders = js.native
  def setContentLength(value: AxiosHeaderValue, rewrite: Boolean): AxiosHeaders = js.native
  def setContentLength(value: AxiosHeaderValue, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  @JSName("setContentLength")
  var setContentLength_Original: AxiosHeaderSetter = js.native
  
  def setContentType(value: AxiosHeaderValue): AxiosHeaders = js.native
  def setContentType(value: AxiosHeaderValue, rewrite: Boolean): AxiosHeaders = js.native
  def setContentType(value: AxiosHeaderValue, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  @JSName("setContentType")
  var setContentType_Original: AxiosHeaderSetter = js.native
  
  def setUserAgent(value: AxiosHeaderValue): AxiosHeaders = js.native
  def setUserAgent(value: AxiosHeaderValue, rewrite: Boolean): AxiosHeaders = js.native
  def setUserAgent(value: AxiosHeaderValue, rewrite: AxiosHeaderMatcher): AxiosHeaders = js.native
  @JSName("setUserAgent")
  var setUserAgent_Original: AxiosHeaderSetter = js.native
  
  def toJSON(): RawAxiosHeaders = js.native
  def toJSON(asStrings: Boolean): RawAxiosHeaders = js.native
}
/* static members */
object AxiosHeaders {
  
  @JSImport("axios", "AxiosHeaders")
  @js.native
  val ^ : js.Any = js.native
  
  inline def accessor(header: String): AxiosHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(header.asInstanceOf[js.Any]).asInstanceOf[AxiosHeaders]
  inline def accessor(header: js.Array[String]): AxiosHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(header.asInstanceOf[js.Any]).asInstanceOf[AxiosHeaders]
  
  inline def from(): AxiosHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("from")().asInstanceOf[AxiosHeaders]
  inline def from(thing: String): AxiosHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(thing.asInstanceOf[js.Any]).asInstanceOf[AxiosHeaders]
  inline def from(thing: AxiosHeaders): AxiosHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(thing.asInstanceOf[js.Any]).asInstanceOf[AxiosHeaders]
  inline def from(thing: RawAxiosHeaders): AxiosHeaders = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(thing.asInstanceOf[js.Any]).asInstanceOf[AxiosHeaders]
}
