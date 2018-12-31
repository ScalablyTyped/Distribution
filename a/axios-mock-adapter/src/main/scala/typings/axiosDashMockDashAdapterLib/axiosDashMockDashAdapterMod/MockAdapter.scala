package typings
package axiosDashMockDashAdapterLib.axiosDashMockDashAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockAdapter extends js.Object {
  @JSName("onAny")
  var onAny_Original: axiosDashMockDashAdapterLib.RequestMatcherFunc = js.native
  @JSName("onDelete")
  var onDelete_Original: axiosDashMockDashAdapterLib.RequestMatcherFunc = js.native
  @JSName("onGet")
  var onGet_Original: axiosDashMockDashAdapterLib.RequestMatcherFunc = js.native
  @JSName("onHead")
  var onHead_Original: axiosDashMockDashAdapterLib.RequestMatcherFunc = js.native
  @JSName("onPatch")
  var onPatch_Original: axiosDashMockDashAdapterLib.RequestMatcherFunc = js.native
  @JSName("onPost")
  var onPost_Original: axiosDashMockDashAdapterLib.RequestMatcherFunc = js.native
  @JSName("onPut")
  var onPut_Original: axiosDashMockDashAdapterLib.RequestMatcherFunc = js.native
  def adapter(): axiosLib.axiosMod.AxiosAdapter = js.native
  def onAny(): js.Any = js.native
  def onAny(matcher: java.lang.String): js.Any = js.native
  def onAny(matcher: java.lang.String, body: java.lang.String): js.Any = js.native
  def onAny(
    matcher: java.lang.String,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def onAny(matcher: stdLib.RegExp): js.Any = js.native
  def onAny(matcher: stdLib.RegExp, body: java.lang.String): js.Any = js.native
  def onAny(
    matcher: stdLib.RegExp,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def onDelete(): js.Any = js.native
  def onDelete(matcher: java.lang.String): js.Any = js.native
  def onDelete(matcher: java.lang.String, body: java.lang.String): js.Any = js.native
  def onDelete(
    matcher: java.lang.String,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def onDelete(matcher: stdLib.RegExp): js.Any = js.native
  def onDelete(matcher: stdLib.RegExp, body: java.lang.String): js.Any = js.native
  def onDelete(
    matcher: stdLib.RegExp,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def onGet(): js.Any = js.native
  def onGet(matcher: java.lang.String): js.Any = js.native
  def onGet(matcher: java.lang.String, body: java.lang.String): js.Any = js.native
  def onGet(
    matcher: java.lang.String,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def onGet(matcher: stdLib.RegExp): js.Any = js.native
  def onGet(matcher: stdLib.RegExp, body: java.lang.String): js.Any = js.native
  def onGet(
    matcher: stdLib.RegExp,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def onHead(): js.Any = js.native
  def onHead(matcher: java.lang.String): js.Any = js.native
  def onHead(matcher: java.lang.String, body: java.lang.String): js.Any = js.native
  def onHead(
    matcher: java.lang.String,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def onHead(matcher: stdLib.RegExp): js.Any = js.native
  def onHead(matcher: stdLib.RegExp, body: java.lang.String): js.Any = js.native
  def onHead(
    matcher: stdLib.RegExp,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def onPatch(): js.Any = js.native
  def onPatch(matcher: java.lang.String): js.Any = js.native
  def onPatch(matcher: java.lang.String, body: java.lang.String): js.Any = js.native
  def onPatch(
    matcher: java.lang.String,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def onPatch(matcher: stdLib.RegExp): js.Any = js.native
  def onPatch(matcher: stdLib.RegExp, body: java.lang.String): js.Any = js.native
  def onPatch(
    matcher: stdLib.RegExp,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def onPost(): js.Any = js.native
  def onPost(matcher: java.lang.String): js.Any = js.native
  def onPost(matcher: java.lang.String, body: java.lang.String): js.Any = js.native
  def onPost(
    matcher: java.lang.String,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def onPost(matcher: stdLib.RegExp): js.Any = js.native
  def onPost(matcher: stdLib.RegExp, body: java.lang.String): js.Any = js.native
  def onPost(
    matcher: stdLib.RegExp,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def onPut(): js.Any = js.native
  def onPut(matcher: java.lang.String): js.Any = js.native
  def onPut(matcher: java.lang.String, body: java.lang.String): js.Any = js.native
  def onPut(
    matcher: java.lang.String,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def onPut(matcher: stdLib.RegExp): js.Any = js.native
  def onPut(matcher: stdLib.RegExp, body: java.lang.String): js.Any = js.native
  def onPut(
    matcher: stdLib.RegExp,
    body: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify RequestDataMatcher */ js.Any
  ): js.Any = js.native
  def reset(): scala.Unit = js.native
  def restore(): scala.Unit = js.native
}

