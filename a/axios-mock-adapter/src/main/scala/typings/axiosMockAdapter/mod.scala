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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("axios-mock-adapter", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with MockAdapter {
    def this(axiosInstance: AxiosInstance) = this()
    def this(axiosInstance: AxiosInstance, options: MockAdapterOptions) = this()
    
    /* CompleteClass */
    override def adapter(): AxiosAdapter = js.native
    
    /* CompleteClass */
    var history: StringDictionary[js.Array[AxiosRequestConfig]] = js.native
    
    /* CompleteClass */
    override def onAny(): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: String): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: String, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: Unit, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: RegExp): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: RegExp, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onAny(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    @JSName("onAny")
    var onAny_Original: RequestMatcherFunc = js.native
    
    /* CompleteClass */
    override def onDelete(): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: String): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: String, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: Unit, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: RegExp): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: RegExp, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onDelete(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    @JSName("onDelete")
    var onDelete_Original: RequestMatcherFunc = js.native
    
    /* CompleteClass */
    override def onGet(): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: String): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: String, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: Unit, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: RegExp): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: RegExp, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onGet(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    @JSName("onGet")
    var onGet_Original: RequestMatcherFunc = js.native
    
    /* CompleteClass */
    override def onHead(): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: String): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: String, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: Unit, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: RegExp): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: RegExp, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onHead(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    @JSName("onHead")
    var onHead_Original: RequestMatcherFunc = js.native
    
    /* CompleteClass */
    override def onList(): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: String): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: String, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: Unit, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: RegExp): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: RegExp, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onList(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    @JSName("onList")
    var onList_Original: RequestMatcherFunc = js.native
    
    /* CompleteClass */
    override def onOptions(): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: String): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: String, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: Unit, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: RegExp): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: RegExp, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onOptions(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    @JSName("onOptions")
    var onOptions_Original: RequestMatcherFunc = js.native
    
    /* CompleteClass */
    override def onPatch(): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: String): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: String, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: Unit, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: RegExp): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: RegExp, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPatch(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    @JSName("onPatch")
    var onPatch_Original: RequestMatcherFunc = js.native
    
    /* CompleteClass */
    override def onPost(): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: String): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: String, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: Unit, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: RegExp): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: RegExp, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPost(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    @JSName("onPost")
    var onPost_Original: RequestMatcherFunc = js.native
    
    /* CompleteClass */
    override def onPut(): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: String): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: String, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: Unit, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: RegExp): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: RegExp, body: String): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler = js.native
    /* CompleteClass */
    override def onPut(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler = js.native
    /* CompleteClass */
    @JSName("onPut")
    var onPut_Original: RequestMatcherFunc = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def resetHandlers(): Unit = js.native
    
    /* CompleteClass */
    override def resetHistory(): Unit = js.native
    
    /* CompleteClass */
    override def restore(): Unit = js.native
  }
  
  type AsymmetricHeadersMatcher = AsymmetricMatcher | HeadersMatcher
  
  trait AsymmetricMatcher
    extends StObject
       with AsymmetricRequestDataMatcher {
    
    var asymmetricMatch: js.Function
  }
  object AsymmetricMatcher {
    
    inline def apply(asymmetricMatch: js.Function): AsymmetricMatcher = {
      val __obj = js.Dynamic.literal(asymmetricMatch = asymmetricMatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsymmetricMatcher]
    }
    
    extension [Self <: AsymmetricMatcher](x: Self) {
      
      inline def setAsymmetricMatch(value: js.Function): Self = StObject.set(x, "asymmetricMatch", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.axiosMockAdapter.mod.AsymmetricMatcher
    - typings.axiosMockAdapter.mod.RequestDataMatcher
  */
  trait AsymmetricRequestDataMatcher extends StObject
  object AsymmetricRequestDataMatcher {
    
    inline def AsymmetricMatcher(asymmetricMatch: js.Function): typings.axiosMockAdapter.mod.AsymmetricMatcher = {
      val __obj = js.Dynamic.literal(asymmetricMatch = asymmetricMatch.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.axiosMockAdapter.mod.AsymmetricMatcher]
    }
    
    inline def RequestDataMatcher(): typings.axiosMockAdapter.mod.RequestDataMatcher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.axiosMockAdapter.mod.RequestDataMatcher]
    }
  }
  
  type CallbackResponseSpecFunc = js.Function1[/* config */ AxiosRequestConfig, js.Array[js.Any] | js.Promise[js.Array[js.Any]]]
  
  type HeadersMatcher = StringDictionary[String]
  
  trait MockAdapter extends StObject {
    
    def adapter(): AxiosAdapter
    
    var history: StringDictionary[js.Array[AxiosRequestConfig]]
    
    def onAny(): RequestHandler
    def onAny(matcher: String): RequestHandler
    def onAny(matcher: String, body: String): RequestHandler
    def onAny(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onAny(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onAny(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler
    def onAny(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onAny(matcher: Unit, body: String): RequestHandler
    def onAny(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onAny(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onAny(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler
    def onAny(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onAny(matcher: RegExp): RequestHandler
    def onAny(matcher: RegExp, body: String): RequestHandler
    def onAny(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onAny(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onAny(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler
    def onAny(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    @JSName("onAny")
    var onAny_Original: RequestMatcherFunc
    
    def onDelete(): RequestHandler
    def onDelete(matcher: String): RequestHandler
    def onDelete(matcher: String, body: String): RequestHandler
    def onDelete(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onDelete(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onDelete(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler
    def onDelete(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onDelete(matcher: Unit, body: String): RequestHandler
    def onDelete(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onDelete(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onDelete(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler
    def onDelete(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onDelete(matcher: RegExp): RequestHandler
    def onDelete(matcher: RegExp, body: String): RequestHandler
    def onDelete(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onDelete(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onDelete(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler
    def onDelete(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    @JSName("onDelete")
    var onDelete_Original: RequestMatcherFunc
    
    def onGet(): RequestHandler
    def onGet(matcher: String): RequestHandler
    def onGet(matcher: String, body: String): RequestHandler
    def onGet(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onGet(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onGet(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler
    def onGet(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onGet(matcher: Unit, body: String): RequestHandler
    def onGet(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onGet(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onGet(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler
    def onGet(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onGet(matcher: RegExp): RequestHandler
    def onGet(matcher: RegExp, body: String): RequestHandler
    def onGet(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onGet(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onGet(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler
    def onGet(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    @JSName("onGet")
    var onGet_Original: RequestMatcherFunc
    
    def onHead(): RequestHandler
    def onHead(matcher: String): RequestHandler
    def onHead(matcher: String, body: String): RequestHandler
    def onHead(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onHead(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onHead(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler
    def onHead(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onHead(matcher: Unit, body: String): RequestHandler
    def onHead(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onHead(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onHead(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler
    def onHead(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onHead(matcher: RegExp): RequestHandler
    def onHead(matcher: RegExp, body: String): RequestHandler
    def onHead(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onHead(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onHead(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler
    def onHead(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    @JSName("onHead")
    var onHead_Original: RequestMatcherFunc
    
    def onList(): RequestHandler
    def onList(matcher: String): RequestHandler
    def onList(matcher: String, body: String): RequestHandler
    def onList(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onList(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onList(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler
    def onList(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onList(matcher: Unit, body: String): RequestHandler
    def onList(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onList(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onList(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler
    def onList(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onList(matcher: RegExp): RequestHandler
    def onList(matcher: RegExp, body: String): RequestHandler
    def onList(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onList(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onList(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler
    def onList(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    @JSName("onList")
    var onList_Original: RequestMatcherFunc
    
    def onOptions(): RequestHandler
    def onOptions(matcher: String): RequestHandler
    def onOptions(matcher: String, body: String): RequestHandler
    def onOptions(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onOptions(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onOptions(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler
    def onOptions(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onOptions(matcher: Unit, body: String): RequestHandler
    def onOptions(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onOptions(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onOptions(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler
    def onOptions(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onOptions(matcher: RegExp): RequestHandler
    def onOptions(matcher: RegExp, body: String): RequestHandler
    def onOptions(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onOptions(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onOptions(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler
    def onOptions(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    @JSName("onOptions")
    var onOptions_Original: RequestMatcherFunc
    
    def onPatch(): RequestHandler
    def onPatch(matcher: String): RequestHandler
    def onPatch(matcher: String, body: String): RequestHandler
    def onPatch(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPatch(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPatch(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler
    def onPatch(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPatch(matcher: Unit, body: String): RequestHandler
    def onPatch(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPatch(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPatch(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler
    def onPatch(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPatch(matcher: RegExp): RequestHandler
    def onPatch(matcher: RegExp, body: String): RequestHandler
    def onPatch(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPatch(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPatch(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler
    def onPatch(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    @JSName("onPatch")
    var onPatch_Original: RequestMatcherFunc
    
    def onPost(): RequestHandler
    def onPost(matcher: String): RequestHandler
    def onPost(matcher: String, body: String): RequestHandler
    def onPost(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPost(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPost(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler
    def onPost(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPost(matcher: Unit, body: String): RequestHandler
    def onPost(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPost(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPost(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler
    def onPost(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPost(matcher: RegExp): RequestHandler
    def onPost(matcher: RegExp, body: String): RequestHandler
    def onPost(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPost(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPost(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler
    def onPost(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    @JSName("onPost")
    var onPost_Original: RequestMatcherFunc
    
    def onPut(): RequestHandler
    def onPut(matcher: String): RequestHandler
    def onPut(matcher: String, body: String): RequestHandler
    def onPut(matcher: String, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPut(matcher: String, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPut(matcher: String, body: AsymmetricRequestDataMatcher): RequestHandler
    def onPut(matcher: String, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPut(matcher: Unit, body: String): RequestHandler
    def onPut(matcher: Unit, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPut(matcher: Unit, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPut(matcher: Unit, body: AsymmetricRequestDataMatcher): RequestHandler
    def onPut(matcher: Unit, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPut(matcher: RegExp): RequestHandler
    def onPut(matcher: RegExp, body: String): RequestHandler
    def onPut(matcher: RegExp, body: String, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPut(matcher: RegExp, body: Unit, headers: AsymmetricHeadersMatcher): RequestHandler
    def onPut(matcher: RegExp, body: AsymmetricRequestDataMatcher): RequestHandler
    def onPut(matcher: RegExp, body: AsymmetricRequestDataMatcher, headers: AsymmetricHeadersMatcher): RequestHandler
    @JSName("onPut")
    var onPut_Original: RequestMatcherFunc
    
    def reset(): Unit
    
    def resetHandlers(): Unit
    
    def resetHistory(): Unit
    
    def restore(): Unit
  }
  object MockAdapter {
    
    inline def apply(
      adapter: () => AxiosAdapter,
      history: StringDictionary[js.Array[AxiosRequestConfig]],
      onAny: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler,
      onDelete: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler,
      onGet: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler,
      onHead: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler,
      onList: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler,
      onOptions: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler,
      onPatch: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler,
      onPost: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler,
      onPut: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler,
      reset: () => Unit,
      resetHandlers: () => Unit,
      resetHistory: () => Unit,
      restore: () => Unit
    ): MockAdapter = {
      val __obj = js.Dynamic.literal(adapter = js.Any.fromFunction0(adapter), history = history.asInstanceOf[js.Any], onAny = js.Any.fromFunction3(onAny), onDelete = js.Any.fromFunction3(onDelete), onGet = js.Any.fromFunction3(onGet), onHead = js.Any.fromFunction3(onHead), onList = js.Any.fromFunction3(onList), onOptions = js.Any.fromFunction3(onOptions), onPatch = js.Any.fromFunction3(onPatch), onPost = js.Any.fromFunction3(onPost), onPut = js.Any.fromFunction3(onPut), reset = js.Any.fromFunction0(reset), resetHandlers = js.Any.fromFunction0(resetHandlers), resetHistory = js.Any.fromFunction0(resetHistory), restore = js.Any.fromFunction0(restore))
      __obj.asInstanceOf[MockAdapter]
    }
    
    extension [Self <: MockAdapter](x: Self) {
      
      inline def setAdapter(value: () => AxiosAdapter): Self = StObject.set(x, "adapter", js.Any.fromFunction0(value))
      
      inline def setHistory(value: StringDictionary[js.Array[AxiosRequestConfig]]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setOnAny(
        value: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler
      ): Self = StObject.set(x, "onAny", js.Any.fromFunction3(value))
      
      inline def setOnDelete(
        value: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler
      ): Self = StObject.set(x, "onDelete", js.Any.fromFunction3(value))
      
      inline def setOnGet(
        value: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler
      ): Self = StObject.set(x, "onGet", js.Any.fromFunction3(value))
      
      inline def setOnHead(
        value: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler
      ): Self = StObject.set(x, "onHead", js.Any.fromFunction3(value))
      
      inline def setOnList(
        value: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler
      ): Self = StObject.set(x, "onList", js.Any.fromFunction3(value))
      
      inline def setOnOptions(
        value: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler
      ): Self = StObject.set(x, "onOptions", js.Any.fromFunction3(value))
      
      inline def setOnPatch(
        value: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler
      ): Self = StObject.set(x, "onPatch", js.Any.fromFunction3(value))
      
      inline def setOnPost(
        value: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler
      ): Self = StObject.set(x, "onPost", js.Any.fromFunction3(value))
      
      inline def setOnPut(
        value: (/* matcher */ js.UndefOr[String | RegExp], /* body */ js.UndefOr[String | AsymmetricRequestDataMatcher], /* headers */ js.UndefOr[AsymmetricHeadersMatcher]) => RequestHandler
      ): Self = StObject.set(x, "onPut", js.Any.fromFunction3(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setResetHandlers(value: () => Unit): Self = StObject.set(x, "resetHandlers", js.Any.fromFunction0(value))
      
      inline def setResetHistory(value: () => Unit): Self = StObject.set(x, "resetHistory", js.Any.fromFunction0(value))
      
      inline def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
    }
  }
  
  trait MockAdapterOptions extends StObject {
    
    var delayResponse: js.UndefOr[Double] = js.undefined
    
    var onNoMatch: js.UndefOr[passthrough | throwException] = js.undefined
  }
  object MockAdapterOptions {
    
    inline def apply(): MockAdapterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockAdapterOptions]
    }
    
    extension [Self <: MockAdapterOptions](x: Self) {
      
      inline def setDelayResponse(value: Double): Self = StObject.set(x, "delayResponse", value.asInstanceOf[js.Any])
      
      inline def setDelayResponseUndefined: Self = StObject.set(x, "delayResponse", js.undefined)
      
      inline def setOnNoMatch(value: passthrough | throwException): Self = StObject.set(x, "onNoMatch", value.asInstanceOf[js.Any])
      
      inline def setOnNoMatchUndefined: Self = StObject.set(x, "onNoMatch", js.undefined)
    }
  }
  
  trait RequestDataMatcher
    extends StObject
       with /* index */ StringDictionary[js.Any]
       with AsymmetricRequestDataMatcher {
    
    var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object RequestDataMatcher {
    
    inline def apply(): RequestDataMatcher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestDataMatcher]
    }
    
    extension [Self <: RequestDataMatcher](x: Self) {
      
      inline def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait RequestHandler extends StObject {
    
    def abortRequest(): MockAdapter
    
    def abortRequestOnce(): MockAdapter
    
    def networkError(): MockAdapter
    
    def networkErrorOnce(): MockAdapter
    
    def passThrough(): MockAdapter
    
    def reply[T](statusOrCallback: Double): MockAdapter
    def reply[T](statusOrCallback: Double, data: T): MockAdapter
    def reply[T](statusOrCallback: Double, data: T, headers: js.Any): MockAdapter
    def reply[T](statusOrCallback: Double, data: Unit, headers: js.Any): MockAdapter
    def reply[T](statusOrCallback: CallbackResponseSpecFunc): MockAdapter
    def reply[T](statusOrCallback: CallbackResponseSpecFunc, data: T): MockAdapter
    def reply[T](statusOrCallback: CallbackResponseSpecFunc, data: T, headers: js.Any): MockAdapter
    def reply[T](statusOrCallback: CallbackResponseSpecFunc, data: Unit, headers: js.Any): MockAdapter
    
    def replyOnce[T](statusOrCallback: Double): MockAdapter
    def replyOnce[T](statusOrCallback: Double, data: T): MockAdapter
    def replyOnce[T](statusOrCallback: Double, data: T, headers: js.Any): MockAdapter
    def replyOnce[T](statusOrCallback: Double, data: Unit, headers: js.Any): MockAdapter
    def replyOnce[T](statusOrCallback: CallbackResponseSpecFunc): MockAdapter
    def replyOnce[T](statusOrCallback: CallbackResponseSpecFunc, data: T): MockAdapter
    def replyOnce[T](statusOrCallback: CallbackResponseSpecFunc, data: T, headers: js.Any): MockAdapter
    def replyOnce[T](statusOrCallback: CallbackResponseSpecFunc, data: Unit, headers: js.Any): MockAdapter
    @JSName("replyOnce")
    var replyOnce_Original: ResponseSpecFunc
    
    @JSName("reply")
    var reply_Original: ResponseSpecFunc
    
    def timeout(): MockAdapter
    
    def timeoutOnce(): MockAdapter
  }
  object RequestHandler {
    
    inline def apply(
      abortRequest: () => MockAdapter,
      abortRequestOnce: () => MockAdapter,
      networkError: () => MockAdapter,
      networkErrorOnce: () => MockAdapter,
      passThrough: () => MockAdapter,
      reply: (/* statusOrCallback */ Double | CallbackResponseSpecFunc, /* data */ js.UndefOr[js.Any], /* headers */ js.UndefOr[js.Any]) => MockAdapter,
      replyOnce: (/* statusOrCallback */ Double | CallbackResponseSpecFunc, /* data */ js.UndefOr[js.Any], /* headers */ js.UndefOr[js.Any]) => MockAdapter,
      timeout: () => MockAdapter,
      timeoutOnce: () => MockAdapter
    ): RequestHandler = {
      val __obj = js.Dynamic.literal(abortRequest = js.Any.fromFunction0(abortRequest), abortRequestOnce = js.Any.fromFunction0(abortRequestOnce), networkError = js.Any.fromFunction0(networkError), networkErrorOnce = js.Any.fromFunction0(networkErrorOnce), passThrough = js.Any.fromFunction0(passThrough), reply = js.Any.fromFunction3(reply), replyOnce = js.Any.fromFunction3(replyOnce), timeout = js.Any.fromFunction0(timeout), timeoutOnce = js.Any.fromFunction0(timeoutOnce))
      __obj.asInstanceOf[RequestHandler]
    }
    
    extension [Self <: RequestHandler](x: Self) {
      
      inline def setAbortRequest(value: () => MockAdapter): Self = StObject.set(x, "abortRequest", js.Any.fromFunction0(value))
      
      inline def setAbortRequestOnce(value: () => MockAdapter): Self = StObject.set(x, "abortRequestOnce", js.Any.fromFunction0(value))
      
      inline def setNetworkError(value: () => MockAdapter): Self = StObject.set(x, "networkError", js.Any.fromFunction0(value))
      
      inline def setNetworkErrorOnce(value: () => MockAdapter): Self = StObject.set(x, "networkErrorOnce", js.Any.fromFunction0(value))
      
      inline def setPassThrough(value: () => MockAdapter): Self = StObject.set(x, "passThrough", js.Any.fromFunction0(value))
      
      inline def setReply(
        value: (/* statusOrCallback */ Double | CallbackResponseSpecFunc, /* data */ js.UndefOr[js.Any], /* headers */ js.UndefOr[js.Any]) => MockAdapter
      ): Self = StObject.set(x, "reply", js.Any.fromFunction3(value))
      
      inline def setReplyOnce(
        value: (/* statusOrCallback */ Double | CallbackResponseSpecFunc, /* data */ js.UndefOr[js.Any], /* headers */ js.UndefOr[js.Any]) => MockAdapter
      ): Self = StObject.set(x, "replyOnce", js.Any.fromFunction3(value))
      
      inline def setTimeout(value: () => MockAdapter): Self = StObject.set(x, "timeout", js.Any.fromFunction0(value))
      
      inline def setTimeoutOnce(value: () => MockAdapter): Self = StObject.set(x, "timeoutOnce", js.Any.fromFunction0(value))
    }
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
