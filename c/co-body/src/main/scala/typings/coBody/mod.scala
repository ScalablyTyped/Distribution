package typings.coBody

import org.scalablytyped.runtime.Shortcut
import typings.coBody.anon.Req
import typings.node.httpMod.IncomingMessage
import typings.qs.mod.IParseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("co-body", JSImport.Namespace)
  @js.native
  val ^ : Parse = js.native
  
  type Context = IncomingMessage | Req
  
  trait Options extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var formTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var jsonTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var limit: js.UndefOr[Double | String] = js.undefined
    
    var queryString: js.UndefOr[IParseOptions] = js.undefined
    
    var returnRawBody: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var textTypes: js.UndefOr[js.Array[String]] = js.undefined
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
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFormTypes(value: js.Array[String]): Self = StObject.set(x, "formTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormTypesUndefined: Self = StObject.set(x, "formTypes", js.undefined)
      
      @scala.inline
      def setFormTypesVarargs(value: String*): Self = StObject.set(x, "formTypes", js.Array(value :_*))
      
      @scala.inline
      def setJsonTypes(value: js.Array[String]): Self = StObject.set(x, "jsonTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonTypesUndefined: Self = StObject.set(x, "jsonTypes", js.undefined)
      
      @scala.inline
      def setJsonTypesVarargs(value: String*): Self = StObject.set(x, "jsonTypes", js.Array(value :_*))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setLimit(value: Double | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setQueryString(value: IParseOptions): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
      
      @scala.inline
      def setReturnRawBody(value: Boolean): Self = StObject.set(x, "returnRawBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnRawBodyUndefined: Self = StObject.set(x, "returnRawBody", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setTextTypes(value: js.Array[String]): Self = StObject.set(x, "textTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTypesUndefined: Self = StObject.set(x, "textTypes", js.undefined)
      
      @scala.inline
      def setTextTypesVarargs(value: String*): Self = StObject.set(x, "textTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Parse extends StObject {
    
    def apply(context: Context): js.Promise[js.Any] = js.native
    def apply(context: Context, options: Options): js.Promise[js.Any] = js.native
    
    def form(context: Context): js.Promise[js.Any] = js.native
    def form(context: Context, options: Options): js.Promise[js.Any] = js.native
    
    def json(context: Context): js.Promise[js.Any] = js.native
    def json(context: Context, options: Options): js.Promise[js.Any] = js.native
    
    def text(context: Context): js.Promise[js.Any] = js.native
    def text(context: Context, options: Options): js.Promise[js.Any] = js.native
  }
  
  type _To = Parse
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Parse = ^
}
