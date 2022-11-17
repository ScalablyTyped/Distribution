package typings.axios.mod

import typings.axios.anon.Setcookie
import typings.std.Partial
import typings.std.Record
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AxiosAdapter = js.Function1[/* config */ AxiosRequestConfig[Any], js.Promise[AxiosResponse[Any, Any]]]

type AxiosHeaderGetter = js.Function1[
js.UndefOr[AxiosHeaderMatcher | js.RegExp], 
AxiosHeaderValue | Null | RegExpExecArray]

type AxiosHeaderMatcher = js.ThisFunction3[
/* this */ AxiosHeaders, 
/* value */ String, 
/* name */ String, 
/* headers */ RawAxiosHeaders, 
Boolean]

type AxiosHeaderSetter = js.Function2[
/* value */ AxiosHeaderValue, 
/* rewrite */ js.UndefOr[Boolean | AxiosHeaderMatcher], 
AxiosHeaders]

type AxiosHeaderTester = js.Function1[/* matcher */ js.UndefOr[AxiosHeaderMatcher], Boolean]

type AxiosHeaderValue = AxiosHeaders | String | js.Array[String] | Double | Boolean | Null

type AxiosPromise[T] = js.Promise[AxiosResponse[T, Any]]

type AxiosRequestHeaders = (Partial[RawAxiosHeaders & MethodsHeaders & CommonHeaders]) & AxiosHeaders

type AxiosRequestTransformer = js.ThisFunction2[
/* this */ AxiosRequestConfig[Any], 
/* data */ Any, 
/* headers */ AxiosRequestHeaders, 
Any]

type AxiosResponseHeaders = RawAxiosResponseHeaders & AxiosHeaders

type AxiosResponseTransformer = js.ThisFunction3[
/* this */ AxiosRequestConfig[Any], 
/* data */ Any, 
/* headers */ AxiosResponseHeaders, 
/* status */ js.UndefOr[Double], 
Any]

type Canceler = js.Function3[
/* message */ js.UndefOr[String], 
/* config */ js.UndefOr[AxiosRequestConfig[Any]], 
/* request */ js.UndefOr[Any], 
Unit]

type CustomParamsSerializer = js.Function2[
/* params */ Record[String, Any], 
/* options */ js.UndefOr[ParamsSerializerOptions], 
String]

type FormSerializerOptions = SerializerOptions

type MaxDownloadRate = Double

type MaxUploadRate = Double

type Method = "get" | "GET" | "delete" | "DELETE" | "head" | "HEAD" | "options" | "OPTIONS" | "post" | "POST" | "put" | "PUT" | "patch" | "PATCH" | "purge" | "PURGE" | "link" | "LINK" | "unlink" | "UNLINK"

type Milliseconds = Double

type ParamEncoder = js.Function2[/* value */ Any, /* defaultEncoder */ js.Function1[/* value */ Any, Any], Any]

type RawAxiosHeaders = Record[String, AxiosHeaderValue]

type RawAxiosRequestHeaders = Partial[RawAxiosHeaders & MethodsHeaders & CommonHeaders]

type RawAxiosResponseHeaders = Partial[(Record[String, String]) & Setcookie]

type ResponseType = "arraybuffer" | "blob" | "document" | "json" | "text" | "stream"

type SerializerVisitor = js.ThisFunction4[
/* this */ GenericFormData, 
/* value */ Any, 
/* key */ String | Double, 
/* path */ Null | (js.Array[String | Double]), 
/* helpers */ FormDataVisitorHelpers, 
Boolean]

type responseEncoding = "ascii" | "ASCII" | "ansi" | "ANSI" | "binary" | "BINARY" | "base64" | "BASE64" | "base64url" | "BASE64URL" | "hex" | "HEX" | "latin1" | "LATIN1" | "ucs-2" | "UCS-2" | "ucs2" | "UCS2" | "utf-8" | "UTF-8" | "utf8" | "UTF8" | "utf16le" | "UTF16LE"
