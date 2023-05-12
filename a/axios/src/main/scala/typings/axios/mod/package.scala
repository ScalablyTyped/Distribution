package typings.axios.mod

import org.scalablytyped.runtime.StringDictionary
import typings.axios.mod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def all[T](values: js.Array[T | js.Promise[T]]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]

inline def formToJSON(form: GenericFormData): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("formToJSON")(form.asInstanceOf[js.Any]).asInstanceOf[js.Object]
inline def formToJSON(form: GenericHTMLFormElement): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("formToJSON")(form.asInstanceOf[js.Any]).asInstanceOf[js.Object]

inline def isAxiosError[T, D](payload: Any): /* is axios.axios.AxiosError<T, D> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAxiosError")(payload.asInstanceOf[js.Any]).asInstanceOf[/* is axios.axios.AxiosError<T, D> */ Boolean]

inline def isCancel(value: Any): /* is axios.axios.Cancel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancel")(value.asInstanceOf[js.Any]).asInstanceOf[/* is axios.axios.Cancel */ Boolean]

inline def spread[T, R](callback: js.Function1[/* repeated */ T, R]): js.Function1[/* array */ js.Array[T], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("spread")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* array */ js.Array[T], R]]

inline def toFormData(sourceObj: js.Object): GenericFormData = ^.asInstanceOf[js.Dynamic].applyDynamic("toFormData")(sourceObj.asInstanceOf[js.Any]).asInstanceOf[GenericFormData]
inline def toFormData(sourceObj: js.Object, targetFormData: Unit, options: FormSerializerOptions): GenericFormData = (^.asInstanceOf[js.Dynamic].applyDynamic("toFormData")(sourceObj.asInstanceOf[js.Any], targetFormData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GenericFormData]
inline def toFormData(sourceObj: js.Object, targetFormData: GenericFormData): GenericFormData = (^.asInstanceOf[js.Dynamic].applyDynamic("toFormData")(sourceObj.asInstanceOf[js.Any], targetFormData.asInstanceOf[js.Any])).asInstanceOf[GenericFormData]
inline def toFormData(sourceObj: js.Object, targetFormData: GenericFormData, options: FormSerializerOptions): GenericFormData = (^.asInstanceOf[js.Dynamic].applyDynamic("toFormData")(sourceObj.asInstanceOf[js.Any], targetFormData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GenericFormData]

type AxiosAdapter = js.Function1[/* config */ InternalAxiosRequestConfig[Any], js.Promise[AxiosResponse[Any, Any]]]

type AxiosAdapterConfig = AxiosAdapter | AxiosAdapterName

/* Rewritten from type alias, can be one of: 
  - typings.axios.axiosStrings.xhr
  - typings.axios.axiosStrings.http
  - java.lang.String
*/
type AxiosAdapterName = _AxiosAdapterName | String

type AxiosHeaderMatcher = js.ThisFunction3[
/* this */ AxiosHeaders, 
/* value */ String, 
/* name */ String, 
/* headers */ RawAxiosHeaders, 
Boolean]

type AxiosHeaderValue = AxiosHeaders | String | js.Array[String] | Double | Boolean | Null

type AxiosPromise[T] = js.Promise[AxiosResponse[T, Any]]

type AxiosRequestTransformer = js.ThisFunction2[
/* this */ InternalAxiosRequestConfig[Any], 
/* data */ Any, 
/* headers */ AxiosRequestHeaders, 
Any]

type AxiosResponseTransformer = js.ThisFunction3[
/* this */ InternalAxiosRequestConfig[Any], 
/* data */ Any, 
/* headers */ AxiosResponseHeaders, 
/* status */ js.UndefOr[Double], 
Any]

type BrowserProgressEvent = Any

type Canceler = js.Function3[
/* message */ js.UndefOr[String], 
/* config */ js.UndefOr[AxiosRequestConfig[Any]], 
/* request */ js.UndefOr[Any], 
Unit]

/* Rewritten from type alias, can be one of: 
  - typings.axios.mod.AxiosHeaderValue
  - typings.axios.axiosStrings.textSlashhtml
  - typings.axios.axiosStrings.textSlashplain
  - typings.axios.axiosStrings.`multipartSlashform-data`
  - typings.axios.axiosStrings.applicationSlashjson
  - typings.axios.axiosStrings.`applicationSlashx-www-form-urlencoded`
  - typings.axios.axiosStrings.`applicationSlashoctet-stream`
*/
type ContentType = _ContentType | AxiosHeaderValue

type CustomParamsSerializer = js.Function2[
/* params */ Record[String, Any], 
/* options */ js.UndefOr[ParamsSerializerOptions], 
String]

type FormSerializerOptions = SerializerOptions

type MaxDownloadRate = Double

type MaxUploadRate = Double

type Milliseconds = Double

type ParamEncoder = js.Function2[/* value */ Any, /* defaultEncoder */ js.Function1[/* value */ Any, Any], Any]

type RawAxiosHeaders = StringDictionary[AxiosHeaderValue]

type RawAxiosRequestConfig[D] = AxiosRequestConfig[D]

type SerializerVisitor = js.ThisFunction4[
/* this */ GenericFormData, 
/* value */ Any, 
/* key */ String | Double, 
/* path */ Null | (js.Array[String | Double]), 
/* helpers */ FormDataVisitorHelpers, 
Boolean]
