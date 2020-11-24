package typings.axiosMockAdapter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.axios.mod.AxiosAdapter
import typings.axios.mod.AxiosRequestConfig
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockAdapter extends js.Object {
  
  def adapter(): AxiosAdapter = js.native
  
  var history: StringDictionary[js.Array[AxiosRequestConfig]] = js.native
  
  def onAny(): RequestHandler = js.native
  def onAny(
    matcher: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onAny(matcher: js.UndefOr[scala.Nothing], body: String): RequestHandler = js.native
  def onAny(matcher: js.UndefOr[scala.Nothing], body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onAny(matcher: js.UndefOr[scala.Nothing], body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onAny(
    matcher: js.UndefOr[scala.Nothing],
    body: AsymmetricRequestDataMatcher,
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onAny(matcher: String): RequestHandler = js.native
  def onAny(matcher: String, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onAny(matcher: String, body: String): RequestHandler = js.native
  def onAny(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onAny(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onAny(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onAny(matcher: RegExp): RequestHandler = js.native
  def onAny(matcher: RegExp, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onAny(matcher: RegExp, body: String): RequestHandler = js.native
  def onAny(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onAny(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onAny(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  @JSName("onAny")
  var onAny_Original: RequestMatcherFunc = js.native
  
  def onDelete(): RequestHandler = js.native
  def onDelete(
    matcher: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onDelete(matcher: js.UndefOr[scala.Nothing], body: String): RequestHandler = js.native
  def onDelete(matcher: js.UndefOr[scala.Nothing], body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: js.UndefOr[scala.Nothing], body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onDelete(
    matcher: js.UndefOr[scala.Nothing],
    body: AsymmetricRequestDataMatcher,
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onDelete(matcher: String): RequestHandler = js.native
  def onDelete(matcher: String, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: String, body: String): RequestHandler = js.native
  def onDelete(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onDelete(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: RegExp): RequestHandler = js.native
  def onDelete(matcher: RegExp, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: RegExp, body: String): RequestHandler = js.native
  def onDelete(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onDelete(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onDelete(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  @JSName("onDelete")
  var onDelete_Original: RequestMatcherFunc = js.native
  
  def onGet(): RequestHandler = js.native
  def onGet(
    matcher: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onGet(matcher: js.UndefOr[scala.Nothing], body: String): RequestHandler = js.native
  def onGet(matcher: js.UndefOr[scala.Nothing], body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onGet(matcher: js.UndefOr[scala.Nothing], body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onGet(
    matcher: js.UndefOr[scala.Nothing],
    body: AsymmetricRequestDataMatcher,
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onGet(matcher: String): RequestHandler = js.native
  def onGet(matcher: String, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onGet(matcher: String, body: String): RequestHandler = js.native
  def onGet(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onGet(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onGet(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onGet(matcher: RegExp): RequestHandler = js.native
  def onGet(matcher: RegExp, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onGet(matcher: RegExp, body: String): RequestHandler = js.native
  def onGet(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onGet(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onGet(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  @JSName("onGet")
  var onGet_Original: RequestMatcherFunc = js.native
  
  def onHead(): RequestHandler = js.native
  def onHead(
    matcher: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onHead(matcher: js.UndefOr[scala.Nothing], body: String): RequestHandler = js.native
  def onHead(matcher: js.UndefOr[scala.Nothing], body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onHead(matcher: js.UndefOr[scala.Nothing], body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onHead(
    matcher: js.UndefOr[scala.Nothing],
    body: AsymmetricRequestDataMatcher,
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onHead(matcher: String): RequestHandler = js.native
  def onHead(matcher: String, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onHead(matcher: String, body: String): RequestHandler = js.native
  def onHead(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onHead(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onHead(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onHead(matcher: RegExp): RequestHandler = js.native
  def onHead(matcher: RegExp, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onHead(matcher: RegExp, body: String): RequestHandler = js.native
  def onHead(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onHead(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onHead(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  @JSName("onHead")
  var onHead_Original: RequestMatcherFunc = js.native
  
  def onList(): RequestHandler = js.native
  def onList(
    matcher: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onList(matcher: js.UndefOr[scala.Nothing], body: String): RequestHandler = js.native
  def onList(matcher: js.UndefOr[scala.Nothing], body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onList(matcher: js.UndefOr[scala.Nothing], body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onList(
    matcher: js.UndefOr[scala.Nothing],
    body: AsymmetricRequestDataMatcher,
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onList(matcher: String): RequestHandler = js.native
  def onList(matcher: String, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onList(matcher: String, body: String): RequestHandler = js.native
  def onList(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onList(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onList(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onList(matcher: RegExp): RequestHandler = js.native
  def onList(matcher: RegExp, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onList(matcher: RegExp, body: String): RequestHandler = js.native
  def onList(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onList(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onList(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  @JSName("onList")
  var onList_Original: RequestMatcherFunc = js.native
  
  def onOptions(): RequestHandler = js.native
  def onOptions(
    matcher: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onOptions(matcher: js.UndefOr[scala.Nothing], body: String): RequestHandler = js.native
  def onOptions(matcher: js.UndefOr[scala.Nothing], body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onOptions(matcher: js.UndefOr[scala.Nothing], body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onOptions(
    matcher: js.UndefOr[scala.Nothing],
    body: AsymmetricRequestDataMatcher,
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onOptions(matcher: String): RequestHandler = js.native
  def onOptions(matcher: String, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onOptions(matcher: String, body: String): RequestHandler = js.native
  def onOptions(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onOptions(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onOptions(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onOptions(matcher: RegExp): RequestHandler = js.native
  def onOptions(matcher: RegExp, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onOptions(matcher: RegExp, body: String): RequestHandler = js.native
  def onOptions(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onOptions(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onOptions(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  @JSName("onOptions")
  var onOptions_Original: RequestMatcherFunc = js.native
  
  def onPatch(): RequestHandler = js.native
  def onPatch(
    matcher: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onPatch(matcher: js.UndefOr[scala.Nothing], body: String): RequestHandler = js.native
  def onPatch(matcher: js.UndefOr[scala.Nothing], body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: js.UndefOr[scala.Nothing], body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onPatch(
    matcher: js.UndefOr[scala.Nothing],
    body: AsymmetricRequestDataMatcher,
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onPatch(matcher: String): RequestHandler = js.native
  def onPatch(matcher: String, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: String, body: String): RequestHandler = js.native
  def onPatch(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onPatch(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: RegExp): RequestHandler = js.native
  def onPatch(matcher: RegExp, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: RegExp, body: String): RequestHandler = js.native
  def onPatch(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPatch(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onPatch(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  @JSName("onPatch")
  var onPatch_Original: RequestMatcherFunc = js.native
  
  def onPost(): RequestHandler = js.native
  def onPost(
    matcher: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onPost(matcher: js.UndefOr[scala.Nothing], body: String): RequestHandler = js.native
  def onPost(matcher: js.UndefOr[scala.Nothing], body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPost(matcher: js.UndefOr[scala.Nothing], body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onPost(
    matcher: js.UndefOr[scala.Nothing],
    body: AsymmetricRequestDataMatcher,
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onPost(matcher: String): RequestHandler = js.native
  def onPost(matcher: String, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPost(matcher: String, body: String): RequestHandler = js.native
  def onPost(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPost(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onPost(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPost(matcher: RegExp): RequestHandler = js.native
  def onPost(matcher: RegExp, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPost(matcher: RegExp, body: String): RequestHandler = js.native
  def onPost(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPost(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onPost(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  @JSName("onPost")
  var onPost_Original: RequestMatcherFunc = js.native
  
  def onPut(): RequestHandler = js.native
  def onPut(
    matcher: js.UndefOr[scala.Nothing],
    body: js.UndefOr[scala.Nothing],
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onPut(matcher: js.UndefOr[scala.Nothing], body: String): RequestHandler = js.native
  def onPut(matcher: js.UndefOr[scala.Nothing], body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPut(matcher: js.UndefOr[scala.Nothing], body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onPut(
    matcher: js.UndefOr[scala.Nothing],
    body: AsymmetricRequestDataMatcher,
    headers: AsymmetricHeadersMatcher
  ): RequestHandler = js.native
  def onPut(matcher: String): RequestHandler = js.native
  def onPut(matcher: String, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPut(matcher: String, body: String): RequestHandler = js.native
  def onPut(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPut(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onPut(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPut(matcher: RegExp): RequestHandler = js.native
  def onPut(matcher: RegExp, body: js.UndefOr[scala.Nothing], headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPut(matcher: RegExp, body: String): RequestHandler = js.native
  def onPut(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  def onPut(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
  def onPut(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
  @JSName("onPut")
  var onPut_Original: RequestMatcherFunc = js.native
  
  def reset(): Unit = js.native
  
  def resetHandlers(): Unit = js.native
  
  def resetHistory(): Unit = js.native
  
  def restore(): Unit = js.native
}
