package typings
package axiosDashMockDashAdapterLib.axiosDashMockDashAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockAdapter extends js.Object {
  var history: org.scalablytyped.runtime.StringDictionary[js.Array[axiosLib.axiosMod.AxiosRequestConfig]] = js.native
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
  def adapter(): axiosLib.axiosMod.AxiosAdapter = js.native
  def onAny(): RequestHandler = js.native
  def onAny(matcher: java.lang.String): RequestHandler = js.native
  def onAny(matcher: java.lang.String, body: RequestDataMatcher): RequestHandler = js.native
  def onAny(matcher: java.lang.String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onAny(matcher: java.lang.String, body: java.lang.String): RequestHandler = js.native
  def onAny(matcher: java.lang.String, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onAny(matcher: stdLib.RegExp): RequestHandler = js.native
  def onAny(matcher: stdLib.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onAny(matcher: stdLib.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onAny(matcher: stdLib.RegExp, body: java.lang.String): RequestHandler = js.native
  def onAny(matcher: stdLib.RegExp, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onDelete(): RequestHandler = js.native
  def onDelete(matcher: java.lang.String): RequestHandler = js.native
  def onDelete(matcher: java.lang.String, body: RequestDataMatcher): RequestHandler = js.native
  def onDelete(matcher: java.lang.String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: java.lang.String, body: java.lang.String): RequestHandler = js.native
  def onDelete(matcher: java.lang.String, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: stdLib.RegExp): RequestHandler = js.native
  def onDelete(matcher: stdLib.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onDelete(matcher: stdLib.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: stdLib.RegExp, body: java.lang.String): RequestHandler = js.native
  def onDelete(matcher: stdLib.RegExp, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onGet(): RequestHandler = js.native
  def onGet(matcher: java.lang.String): RequestHandler = js.native
  def onGet(matcher: java.lang.String, body: RequestDataMatcher): RequestHandler = js.native
  def onGet(matcher: java.lang.String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onGet(matcher: java.lang.String, body: java.lang.String): RequestHandler = js.native
  def onGet(matcher: java.lang.String, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onGet(matcher: stdLib.RegExp): RequestHandler = js.native
  def onGet(matcher: stdLib.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onGet(matcher: stdLib.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onGet(matcher: stdLib.RegExp, body: java.lang.String): RequestHandler = js.native
  def onGet(matcher: stdLib.RegExp, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onHead(): RequestHandler = js.native
  def onHead(matcher: java.lang.String): RequestHandler = js.native
  def onHead(matcher: java.lang.String, body: RequestDataMatcher): RequestHandler = js.native
  def onHead(matcher: java.lang.String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onHead(matcher: java.lang.String, body: java.lang.String): RequestHandler = js.native
  def onHead(matcher: java.lang.String, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onHead(matcher: stdLib.RegExp): RequestHandler = js.native
  def onHead(matcher: stdLib.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onHead(matcher: stdLib.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onHead(matcher: stdLib.RegExp, body: java.lang.String): RequestHandler = js.native
  def onHead(matcher: stdLib.RegExp, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onList(): RequestHandler = js.native
  def onList(matcher: java.lang.String): RequestHandler = js.native
  def onList(matcher: java.lang.String, body: RequestDataMatcher): RequestHandler = js.native
  def onList(matcher: java.lang.String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onList(matcher: java.lang.String, body: java.lang.String): RequestHandler = js.native
  def onList(matcher: java.lang.String, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onList(matcher: stdLib.RegExp): RequestHandler = js.native
  def onList(matcher: stdLib.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onList(matcher: stdLib.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onList(matcher: stdLib.RegExp, body: java.lang.String): RequestHandler = js.native
  def onList(matcher: stdLib.RegExp, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onPatch(): RequestHandler = js.native
  def onPatch(matcher: java.lang.String): RequestHandler = js.native
  def onPatch(matcher: java.lang.String, body: RequestDataMatcher): RequestHandler = js.native
  def onPatch(matcher: java.lang.String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: java.lang.String, body: java.lang.String): RequestHandler = js.native
  def onPatch(matcher: java.lang.String, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: stdLib.RegExp): RequestHandler = js.native
  def onPatch(matcher: stdLib.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onPatch(matcher: stdLib.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: stdLib.RegExp, body: java.lang.String): RequestHandler = js.native
  def onPatch(matcher: stdLib.RegExp, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onPost(): RequestHandler = js.native
  def onPost(matcher: java.lang.String): RequestHandler = js.native
  def onPost(matcher: java.lang.String, body: RequestDataMatcher): RequestHandler = js.native
  def onPost(matcher: java.lang.String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPost(matcher: java.lang.String, body: java.lang.String): RequestHandler = js.native
  def onPost(matcher: java.lang.String, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onPost(matcher: stdLib.RegExp): RequestHandler = js.native
  def onPost(matcher: stdLib.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onPost(matcher: stdLib.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPost(matcher: stdLib.RegExp, body: java.lang.String): RequestHandler = js.native
  def onPost(matcher: stdLib.RegExp, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onPut(): RequestHandler = js.native
  def onPut(matcher: java.lang.String): RequestHandler = js.native
  def onPut(matcher: java.lang.String, body: RequestDataMatcher): RequestHandler = js.native
  def onPut(matcher: java.lang.String, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPut(matcher: java.lang.String, body: java.lang.String): RequestHandler = js.native
  def onPut(matcher: java.lang.String, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def onPut(matcher: stdLib.RegExp): RequestHandler = js.native
  def onPut(matcher: stdLib.RegExp, body: RequestDataMatcher): RequestHandler = js.native
  def onPut(matcher: stdLib.RegExp, body: RequestDataMatcher, headers: HeadersMatcher): RequestHandler = js.native
  def onPut(matcher: stdLib.RegExp, body: java.lang.String): RequestHandler = js.native
  def onPut(matcher: stdLib.RegExp, body: java.lang.String, headers: HeadersMatcher): RequestHandler = js.native
  def reset(): scala.Unit = js.native
  def resetHandlers(): scala.Unit = js.native
  def resetHistory(): scala.Unit = js.native
  def restore(): scala.Unit = js.native
}

