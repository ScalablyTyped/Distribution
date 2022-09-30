package typings.axios.mod

import typings.axios.anon.Setcookie
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AxiosAdapter = js.Function1[/* config */ AxiosRequestConfig[Any], js.Promise[AxiosResponse[Any, Any]]]

type AxiosPromise[T] = js.Promise[AxiosResponse[T, Any]]

type AxiosRequestHeaders = Record[String, String | Double | Boolean]

type AxiosRequestTransformer = js.Function2[/* data */ Any, /* headers */ js.UndefOr[AxiosRequestHeaders], Any]

type AxiosResponseHeaders = (Record[String, String]) & Setcookie

type AxiosResponseTransformer = js.Function2[/* data */ Any, /* headers */ js.UndefOr[AxiosResponseHeaders], Any]

type Canceler = js.Function1[/* message */ js.UndefOr[String], Unit]
