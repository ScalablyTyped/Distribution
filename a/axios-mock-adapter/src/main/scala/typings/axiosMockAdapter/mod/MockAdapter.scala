package typings.axiosMockAdapter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.axios.mod.AxiosAdapter
import typings.axios.mod.AxiosRequestConfig
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockAdapter extends js.Object {
  var history: StringDictionary[js.Array[AxiosRequestConfig]] = js.native
  @JSName("onAny")
  var onAny_Original: RequestMatcherFunc = js.native
  @JSName("onDelete")
  var onDelete_Original: RequestMatcherFunc = js.native
  @JSName("onGet")
  var onGet_Original: RequestMatcherFunc = js.native
  @JSName("onHead")
  var onHead_Original: RequestMatcherFunc = js.native
  @JSName("onList")
  var onList_Original: RequestMatcherFunc = js.native
  @JSName("onPatch")
  var onPatch_Original: RequestMatcherFunc = js.native
  @JSName("onPost")
  var onPost_Original: RequestMatcherFunc = js.native
  @JSName("onPut")
  var onPut_Original: RequestMatcherFunc = js.native
  def adapter(): AxiosAdapter = js.native
  def onAny(): RequestHandler = js.native
  def onAny(matcher: String): RequestHandler = js.native
  def onAny(matcher: String, body: String): RequestHandler = js.native
  def onAny(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onAny(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onAny(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onAny(matcher: RegExp): RequestHandler = js.native
  def onAny(matcher: RegExp, body: String): RequestHandler = js.native
  def onAny(matcher: RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onAny(matcher: RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onAny(matcher: RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onDelete(): RequestHandler = js.native
  def onDelete(matcher: String): RequestHandler = js.native
  def onDelete(matcher: String, body: String): RequestHandler = js.native
  def onDelete(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onDelete(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: RegExp): RequestHandler = js.native
  def onDelete(matcher: RegExp, body: String): RequestHandler = js.native
  def onDelete(matcher: RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onDelete(matcher: RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onGet(): RequestHandler = js.native
  def onGet(matcher: String): RequestHandler = js.native
  def onGet(matcher: String, body: String): RequestHandler = js.native
  def onGet(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onGet(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onGet(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onGet(matcher: RegExp): RequestHandler = js.native
  def onGet(matcher: RegExp, body: String): RequestHandler = js.native
  def onGet(matcher: RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onGet(matcher: RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onGet(matcher: RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onHead(): RequestHandler = js.native
  def onHead(matcher: String): RequestHandler = js.native
  def onHead(matcher: String, body: String): RequestHandler = js.native
  def onHead(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onHead(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onHead(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onHead(matcher: RegExp): RequestHandler = js.native
  def onHead(matcher: RegExp, body: String): RequestHandler = js.native
  def onHead(matcher: RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onHead(matcher: RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onHead(matcher: RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onList(): RequestHandler = js.native
  def onList(matcher: String): RequestHandler = js.native
  def onList(matcher: String, body: String): RequestHandler = js.native
  def onList(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onList(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onList(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onList(matcher: RegExp): RequestHandler = js.native
  def onList(matcher: RegExp, body: String): RequestHandler = js.native
  def onList(matcher: RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onList(matcher: RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onList(matcher: RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPatch(): RequestHandler = js.native
  def onPatch(matcher: String): RequestHandler = js.native
  def onPatch(matcher: String, body: String): RequestHandler = js.native
  def onPatch(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onPatch(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: RegExp): RequestHandler = js.native
  def onPatch(matcher: RegExp, body: String): RequestHandler = js.native
  def onPatch(matcher: RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onPatch(matcher: RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPost(): RequestHandler = js.native
  def onPost(matcher: String): RequestHandler = js.native
  def onPost(matcher: String, body: String): RequestHandler = js.native
  def onPost(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onPost(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onPost(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPost(matcher: RegExp): RequestHandler = js.native
  def onPost(matcher: RegExp, body: String): RequestHandler = js.native
  def onPost(matcher: RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onPost(matcher: RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onPost(matcher: RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPut(): RequestHandler = js.native
  def onPut(matcher: String): RequestHandler = js.native
  def onPut(matcher: String, body: String): RequestHandler = js.native
  def onPut(matcher: String, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onPut(matcher: String, body: RequestDataMatcher): RequestHandler = js.native
  def onPut(matcher: String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPut(matcher: RegExp): RequestHandler = js.native
  def onPut(matcher: RegExp, body: String): RequestHandler = js.native
  def onPut(matcher: RegExp, body: String, headers: HeadersMatcher): RequestHandler = js.native
  def onPut(matcher: RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onPut(matcher: RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def reset(): Unit = js.native
  def resetHandlers(): Unit = js.native
  def resetHistory(): Unit = js.native
  def restore(): Unit = js.native
}

