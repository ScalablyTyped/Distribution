package typings.axiosMockAdapter

import org.scalablytyped.runtime.StringDictionary
import typings.axios.mod.AxiosAdapter
import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosRequestConfig
import typings.axiosMockAdapter.axiosMockAdapterStrings.passthrough
import typings.axiosMockAdapter.axiosMockAdapterStrings.throwException
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("axios-mock-adapter", JSImport.Default)
  @js.native
  class default protected () extends MockAdapter {
    def this(axiosInstance: AxiosInstance) = this()
    def this(axiosInstance: AxiosInstance, options: MockAdapterOptions) = this()
  }
  
  type AsymmetricHeadersMatcher = AsymmetricMatcher | HeadersMatcher
  
  @js.native
  trait AsymmetricMatcher extends AsymmetricRequestDataMatcher {
    
    var asymmetricMatch: js.Function = js.native
  }
  object AsymmetricMatcher {
    
    @scala.inline
    def apply(asymmetricMatch: js.Function): AsymmetricMatcher = {
      val __obj = js.Dynamic.literal(asymmetricMatch = asymmetricMatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsymmetricMatcher]
    }
    
    @scala.inline
    implicit class AsymmetricMatcherMutableBuilder[Self <: AsymmetricMatcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsymmetricMatch(value: js.Function): Self = StObject.set(x, "asymmetricMatch", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.axiosMockAdapter.mod.AsymmetricMatcher
    - typings.axiosMockAdapter.mod.RequestDataMatcher
  */
  trait AsymmetricRequestDataMatcher extends StObject
  object AsymmetricRequestDataMatcher {
    
    @scala.inline
    def AsymmetricMatcher(asymmetricMatch: js.Function): typings.axiosMockAdapter.mod.AsymmetricMatcher = {
      val __obj = js.Dynamic.literal(asymmetricMatch = asymmetricMatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.axiosMockAdapter.mod.AsymmetricMatcher]
    }
    
    @scala.inline
    def RequestDataMatcher(): typings.axiosMockAdapter.mod.RequestDataMatcher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.axiosMockAdapter.mod.RequestDataMatcher]
    }
  }
  
  type CallbackResponseSpecFunc = js.Function1[/* config */ AxiosRequestConfig, js.Array[js.Any] | js.Promise[js.Array[js.Any]]]
  
  type HeadersMatcher = StringDictionary[String]
  
  @js.native
  trait MockAdapter extends StObject {
    
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
  
  @js.native
  trait MockAdapterOptions extends StObject {
    
    var delayResponse: js.UndefOr[Double] = js.native
    
    var onNoMatch: js.UndefOr[passthrough | throwException] = js.native
  }
  object MockAdapterOptions {
    
    @scala.inline
    def apply(): MockAdapterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockAdapterOptions]
    }
    
    @scala.inline
    implicit class MockAdapterOptionsMutableBuilder[Self <: MockAdapterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelayResponse(value: Double): Self = StObject.set(x, "delayResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayResponseUndefined: Self = StObject.set(x, "delayResponse", js.undefined)
      
      @scala.inline
      def setOnNoMatch(value: passthrough | throwException): Self = StObject.set(x, "onNoMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnNoMatchUndefined: Self = StObject.set(x, "onNoMatch", js.undefined)
    }
  }
  
  @js.native
  trait RequestDataMatcher
    extends /* index */ StringDictionary[js.Any]
       with AsymmetricRequestDataMatcher {
    
    var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object RequestDataMatcher {
    
    @scala.inline
    def apply(): RequestDataMatcher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestDataMatcher]
    }
    
    @scala.inline
    implicit class RequestDataMatcherMutableBuilder[Self <: RequestDataMatcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  @js.native
  trait RequestHandler extends StObject {
    
    def abortRequest(): MockAdapter = js.native
    
    def abortRequestOnce(): MockAdapter = js.native
    
    def networkError(): MockAdapter = js.native
    
    def networkErrorOnce(): MockAdapter = js.native
    
    def passThrough(): MockAdapter = js.native
    
    def reply[T](statusOrCallback: Double): MockAdapter = js.native
    def reply[T](statusOrCallback: Double, data: T): MockAdapter = js.native
    def reply[T](statusOrCallback: Double, data: T, headers: js.Any): MockAdapter = js.native
    def reply[T](statusOrCallback: Double, data: js.UndefOr[scala.Nothing], headers: js.Any): MockAdapter = js.native
    def reply[T](statusOrCallback: CallbackResponseSpecFunc): MockAdapter = js.native
    def reply[T](statusOrCallback: CallbackResponseSpecFunc, data: T): MockAdapter = js.native
    def reply[T](statusOrCallback: CallbackResponseSpecFunc, data: T, headers: js.Any): MockAdapter = js.native
    def reply[T](statusOrCallback: CallbackResponseSpecFunc, data: js.UndefOr[scala.Nothing], headers: js.Any): MockAdapter = js.native
    
    def replyOnce[T](statusOrCallback: Double): MockAdapter = js.native
    def replyOnce[T](statusOrCallback: Double, data: T): MockAdapter = js.native
    def replyOnce[T](statusOrCallback: Double, data: T, headers: js.Any): MockAdapter = js.native
    def replyOnce[T](statusOrCallback: Double, data: js.UndefOr[scala.Nothing], headers: js.Any): MockAdapter = js.native
    def replyOnce[T](statusOrCallback: CallbackResponseSpecFunc): MockAdapter = js.native
    def replyOnce[T](statusOrCallback: CallbackResponseSpecFunc, data: T): MockAdapter = js.native
    def replyOnce[T](statusOrCallback: CallbackResponseSpecFunc, data: T, headers: js.Any): MockAdapter = js.native
    def replyOnce[T](statusOrCallback: CallbackResponseSpecFunc, data: js.UndefOr[scala.Nothing], headers: js.Any): MockAdapter = js.native
    @JSName("replyOnce")
    var replyOnce_Original: ResponseSpecFunc = js.native
    
    @JSName("reply")
    var reply_Original: ResponseSpecFunc = js.native
    
    def timeout(): MockAdapter = js.native
    
    def timeoutOnce(): MockAdapter = js.native
  }
  
  type RequestMatcherFunc = js.Function3[
    /* matcher */ js.UndefOr[String | RegExp], 
    /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], 
    /* headers */ js.UndefOr[AsymmetricHeadersMatcher], 
    RequestHandler
  ]
  
  type ResponseSpecFunc = js.Function3[
    /* statusOrCallback */ Double | CallbackResponseSpecFunc, 
    /* data */ js.UndefOr[js.Any], 
    /* headers */ js.UndefOr[js.Any], 
    MockAdapter
  ]
}
