package typings.connectDatadog

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.hotShots.mod.StatsD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def apply(options: Options): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("connect-datadog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var base_url: js.UndefOr[Boolean] = js.undefined
    
    var dogstatsd: js.UndefOr[StatsD] = js.undefined
    
    var method: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[Boolean] = js.undefined
    
    var protocol: js.UndefOr[Boolean] = js.undefined
    
    var response_code: js.UndefOr[Boolean] = js.undefined
    
    var stat: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase_url(value: Boolean): Self = StObject.set(x, "base_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase_urlUndefined: Self = StObject.set(x, "base_url", js.undefined)
      
      @scala.inline
      def setDogstatsd(value: StatsD): Self = StObject.set(x, "dogstatsd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDogstatsdUndefined: Self = StObject.set(x, "dogstatsd", js.undefined)
      
      @scala.inline
      def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPath(value: Boolean): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setProtocol(value: Boolean): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setResponse_code(value: Boolean): Self = StObject.set(x, "response_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse_codeUndefined: Self = StObject.set(x, "response_code", js.undefined)
      
      @scala.inline
      def setStat(value: String): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
}
